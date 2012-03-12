/*
 * Copyright 2007 The Fornax Project Team, including the original
 * author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fornax.cartridges.sculptor.generator.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.Set;

/**
 * Technical properties to customize the code generation is defined in
 * default-sculptor-generator.properties and may be overridden in
 * sculptor-generator.properties, or in System.properties. These properties are
 * available via this class.
 * 
 */
public class GeneratorProperties {
    private static final String CHANGED_MODULE = "changed.module";
    private static final String M2_PLUGIN_CHANGED_FILES = "fornax-oaw-m2-plugin.changedFiles";
    private static final String PROPERTIES_RESOURCE = "generator/sculptor-generator.properties";
    private static final String PROPERTIES_GUI_RESOURCE = "generator/sculptor-gui-generator.properties";
    private static final String DEFAULT_PROPERTIES_RESOURCE = "default-sculptor-generator.properties";
    private static Properties properties;

    /**
     * Normally, this class is not instantiated, but to be able to reload
     * configuration from the workflow an instance can be created, i.e. this
     * constructor will load properties files (again)
     */
    public GeneratorProperties() {
        GeneratorProperties.initProperties(true);
    }

    /**
     * Dependency injection, to avoid loading from files.
     */
    public static void setProperties(Properties p) {
        properties = p;
    }

    private static Properties getProperties() {
        initProperties(false);
        return properties;
    }

    public static void initProperties(boolean reload) {
        if (!reload && properties != null) {
            // already initialized
            return;
        }
        Properties defaultProperties = new Properties();
        loadProperties(defaultProperties, DEFAULT_PROPERTIES_RESOURCE);

        Properties p1 = new Properties(defaultProperties);
        try {
            loadProperties(p1, PROPERTIES_RESOURCE);
        } catch (MissingResourceException e) {
            // ignore, it is not mandatory
        }

        Properties p2 = new Properties(p1);
        try {
            loadProperties(p2, PROPERTIES_GUI_RESOURCE);
        } catch (MissingResourceException e) {
            // ignore, it is not mandatory
        }

        Properties p3 = new Properties(p2);
        copySystemProperties(p3);

        properties = p3;

        initDerivedDefaults(defaultProperties);
    }

    private static void copySystemProperties(Properties p) {
        Properties sysProperties = System.getProperties();
        for (Object key : sysProperties.keySet()) {
            p.put(key, sysProperties.get(key));
        }
    }

    private static void loadProperties(Properties properties, String resource) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = GeneratorProperties.class.getClassLoader();
        }
        InputStream resourceInputStream = classLoader.getResourceAsStream(resource);
        if (resourceInputStream == null) {
            throw new MissingResourceException("Properties resource not available: " + resource, "GeneratorProperties",
                    "");
        }
        try {
            properties.load(resourceInputStream);
        } catch (IOException e) {
            throw new MissingResourceException("Can't load properties from: " + resource, "GeneratorProperties", "");
        }
    }

    private static void initDerivedDefaults(Properties defaultProperties) {

        if (hasProperty("test.dbunit.dataSetFile")) {
            // don't generate data set file for each service/consumer
            defaultProperties.setProperty("generate.test.dbunitTestData", "false");
        }

        // check if user has entered old deprecated spring webflow crud gui
        // property, and if, throw exception
        if (hasProperty("generate.springWebflowCrudGui")) {
            throw new IllegalArgumentException(
                    "The spring webflow crud gui with jsp as rendering enginge isn't supported in Sculptor version 1.6 and above. Use version 1.5 if you want to stick to that implementation or use the jsf webflow variant.");
        }

        // deployment.type = war for Tomcat and Jetty
        if (getProperty("deployment.applicationServer").equalsIgnoreCase("tomcat")
                || getProperty("deployment.applicationServer").equalsIgnoreCase("jetty")) {
            defaultProperties.setProperty("deployment.type", "war");
        }

        if (getProperty("deployment.applicationServer").equalsIgnoreCase("appengine")) {
            initDerivedDefaultsForAppengine(defaultProperties);

        }

        // generate directives
        if (hasProjectNature("presentation-tier")) {
            initDerivedDefaultsForPresentationTier(defaultProperties);
        }
        if (!hasProjectNature("business-tier")) {
            initDerivedDefaultsForNonBusinessTier(defaultProperties);
        }

        if (hasProjectNature("rcp")) {
            defaultProperties.setProperty("scaffold.operations", getProperty("scaffold.operations")
                    + ",populateAssociations");
            defaultProperties.setProperty("generate.springRemoting", "true");
        }
        if (hasProjectNature("business-tier") && hasProjectNature("pure-ejb3")) {
            initDerivedDefaultsForPureEjb3(defaultProperties);
        }

        initDerivedDefaultsSystemAttributes(defaultProperties);

        // deployment.applicationServer = JBoss for ear
        if (getProperty("deployment.type").equals("ear")) {
            defaultProperties.setProperty("deployment.applicationServer", "JBoss");
        }

        if (getProperty("deployment.applicationServer").toLowerCase().equals("jboss")) {
            defaultProperties.setProperty("generate.datasource", "true");
        }

        // ejb.version N/A when deployment as war
        if (getProperty("deployment.type").equals("war")) {
            defaultProperties.setProperty("ejb.version", "N/A");
        }

        // joda-time
        if (getProperty("datetime.library").equals("joda")) {
            initDerivedDefaultsForJoda(defaultProperties);
        }

        if (!getProperty("nosql.provider").equals("none")) {
            initDerivedDefaultsForNosql(defaultProperties);
        } else if (!getProperty("jpa.provider").equals("none")) {
            initDerivedDefaultsForJpa(defaultProperties);
        } else {
            initDerivedDefaultsWithoutPersistence(defaultProperties);
        }

        initDerivedDefaultsForRest(defaultProperties);

        if (hasProperty(M2_PLUGIN_CHANGED_FILES) || hasProperty(CHANGED_MODULE)) {
            defaultProperties.setProperty("generate.quick", "true");
        }

        if (getBooleanProperty("generate.quick")) {
            initQuick(defaultProperties);
        }

    }

    private static void initDerivedDefaultsForRest(Properties defaultProperties) {
        if (!getBooleanProperty("generate.resource")) {
            defaultProperties.setProperty("generate.restWeb", "false");
        }
        if (!getBooleanProperty("generate.restWeb")) {
            String restScaffoldOperations = defaultProperties.getProperty("rest.scaffold.operations");
            restScaffoldOperations = restScaffoldOperations.replaceFirst(",createForm", "");
            restScaffoldOperations = restScaffoldOperations.replaceFirst(",updateForm", "");
            defaultProperties.setProperty("rest.scaffold.operations", restScaffoldOperations);
        }
    }

    private static void initQuick(Properties defaultProperties) {
        defaultProperties.setProperty("generate.ddl", "false");
        defaultProperties.setProperty("generate.umlgraph", "false");
        defaultProperties.setProperty("generate.modeldoc", "false");
    }

    private static void initDerivedDefaultsForNonBusinessTier(Properties defaultProperties) {
        defaultProperties.setProperty("generate.domainObject", "false");
        defaultProperties.setProperty("generate.exception", "false");
        defaultProperties.setProperty("generate.repository", "false");
        defaultProperties.setProperty("generate.service", "false");
        defaultProperties.setProperty("generate.consumer", "false");
        defaultProperties.setProperty("generate.spring", "false");
        defaultProperties.setProperty("generate.hibernate", "false");
        defaultProperties.setProperty("generate.ddl", "false");
        defaultProperties.setProperty("generate.umlgraph", "false");
        defaultProperties.setProperty("generate.modeldoc", "false");
    }

    private static void initDerivedDefaultsForPresentationTier(Properties defaultProperties) {
        if (hasProjectNature("rcp")) {
            defaultProperties.setProperty("generate.jsfCrudGui", "false");
            defaultProperties.setProperty("generate.rcpCrudGui", "true");
            defaultProperties.setProperty("generate.springRemoting", "true");
        } else {
            defaultProperties.setProperty("generate.jsfCrudGui", "true");
            defaultProperties.setProperty("generate.rcpCrudGui", "false");
        }
        defaultProperties.setProperty("generate.resource", "false");
        defaultProperties.setProperty("generate.restWeb", "false");
    }

    private static void initDerivedDefaultsForJpa(Properties defaultProperties) {
        if (getBooleanProperty("generate.jpa.annotation")) {
            if (!getProperty("jpa.provider").equals("hibernate")) {
                defaultProperties.setProperty("generate.hibernate", "false");
                defaultProperties.setProperty("datetime.library", "java");
                errorHandlingInterceptorWithoutHibernateDependency(defaultProperties);
            }
        }
    }

    private static void initDerivedDefaultsForNosql(Properties defaultProperties) {
        defaultProperties.setProperty("generate.jpa.annotation", "false");
        defaultProperties.setProperty("generate.hibernate", "false");
        defaultProperties.setProperty("generate.test.dbunitTestData", "false");
        defaultProperties.setProperty("generate.test.emptyDbunitTestData", "false");
        defaultProperties.setProperty("cache.provider", "none");
        defaultProperties.setProperty("framework.accessimpl.package", fw("accessimpl.mongodb"));
        defaultProperties.setProperty("framework.accessimpl.prefix", "MongoDb");
        defaultProperties.setProperty("javaType.IDTYPE", "String");
        defaultProperties.setProperty("generate.validation.annotation", "false");
        defaultProperties.setProperty("jpa.provider", "none");
        defaultProperties.setProperty("generate.ddl", "false");
        defaultProperties.setProperty("framework.accessimpl.AccessBase",
                "org.fornax.cartridges.sculptor.framework.accessimpl.mongodb.MongoDbAccessBase");
        defaultProperties.setProperty("framework.accessimpl.AccessBaseWithException",
                "org.fornax.cartridges.sculptor.framework.accessimpl.mongodb.MongoDbAccessBaseWithException");
        errorHandlingInterceptorWithoutHibernateDependency(defaultProperties);
    }

    private static void errorHandlingInterceptorWithoutHibernateDependency(Properties defaultProperties) {
        // for ejb3
        defaultProperties.setProperty("framework.errorhandling.ErrorHandlingInterceptor",
                "org.fornax.cartridges.sculptor.framework.errorhandling.ErrorHandlingInterceptor2");
    }

    private static void initDerivedDefaultsWithoutPersistence(Properties defaultProperties) {
        defaultProperties.setProperty("generate.jpa.annotation", "false");
        defaultProperties.setProperty("generate.hibernate", "false");
        defaultProperties.setProperty("generate.test.dbunitTestData", "false");
        defaultProperties.setProperty("generate.test.emptyDbunitTestData", "false");
        defaultProperties.setProperty("generate.datasource", "false");
        defaultProperties.setProperty("javaType.IDTYPE", "String");
        defaultProperties.setProperty("generate.validation.annotation", "false");
        defaultProperties.setProperty("generate.ddl", "false");
        defaultProperties.setProperty("cache.provider", "none");
        // customize by implementing the access obj yourself and define
        // framework.accessimpl.package
        defaultProperties.setProperty("framework.accessimpl.package", fw("accessimpl.todo"));
        defaultProperties.setProperty("framework.accessimpl.prefix", "");
        defaultProperties.setProperty("framework.accessimpl.AccessBase",
                "org.fornax.cartridges.sculptor.framework.accessimpl.todo.AccessBase");
        defaultProperties.setProperty("framework.accessimpl.AccessBaseWithException",
                "org.fornax.cartridges.sculptor.framework.accessimpl.todo.BaseWithException");
        errorHandlingInterceptorWithoutHibernateDependency(defaultProperties);
    }

    private static void initDerivedDefaultsForPureEjb3(Properties defaultProperties) {
        defaultProperties.setProperty("generate.spring", "false");
        defaultProperties.setProperty("generate.resource", "false");
        defaultProperties.setProperty("generate.restWeb", "false");
        defaultProperties.setProperty("deployment.type", "ear");
        defaultProperties.setProperty("naming.suffix.Impl", "Bean");
        defaultProperties.setProperty("deployment.type", "ear");
        defaultProperties.setProperty("generate.logbackConfig", "false");
        // TODO we probably need to do something to still be able to use
        // spring in presentation-tier
    }

    private static void initDerivedDefaultsForAppengine(Properties defaultProperties) {
        defaultProperties.setProperty("deployment.type", "war");
        defaultProperties.setProperty("jpa.provider", "appengine");
        defaultProperties.setProperty("generate.ddl", "false");
        defaultProperties.setProperty("generate.validation.annotation", "false");
        defaultProperties.setProperty("javaType.IDTYPE", "com.google.appengine.api.datastore.Key");
        defaultProperties.setProperty("cache.provider", "memcache");
        defaultProperties.setProperty("generate.test.dbunitTestData", "false");
        defaultProperties.setProperty("generate.test.emptyDbunitTestData", "false");
        defaultProperties.setProperty("generate.logbackConfig", "false");
    }

    private static void initDerivedDefaultsForJoda(Properties defaultProperties) {
        defaultProperties.setProperty("javaType.Date", "org.joda.time.LocalDate");
        defaultProperties.setProperty("javaType.DateTime", "org.joda.time.DateTime");
        defaultProperties.setProperty("javaType.Timestamp", "org.joda.time.DateTime");

        defaultProperties.setProperty("hibernateType.Date", "org.joda.time.contrib.hibernate.PersistentLocalDate");
        defaultProperties.setProperty("hibernateType.DateTime", "org.joda.time.contrib.hibernate.PersistentDateTime");
        defaultProperties.setProperty("hibernateType.Timestamp", "org.joda.time.contrib.hibernate.PersistentDateTime");

        defaultProperties
                .setProperty(
                        "propertyEditor.Date",
                        "org.fornax.cartridges.sculptor.framework.propertyeditor.LocalDateEditor(getMessagesAccessor().getMessage(\"format.DatePattern\", \"yyyy-MM-dd\"), true)");
        defaultProperties
                .setProperty(
                        "propertyEditor.DateTime",
                        "org.fornax.cartridges.sculptor.framework.propertyeditor.DateTimeEditor(getMessagesAccessor().getMessage(\"format.DateTimePattern\", \"yyyy-MM-dd HH:mm\"), true)");
        defaultProperties
                .setProperty(
                        "propertyEditor.Timestamp",
                        "org.fornax.cartridges.sculptor.framework.propertyeditor.DateTimeEditor(getMessagesAccessor().getMessage(\"format.DateTimePattern\", \"yyyy-MM-dd HH:mm\"), true)");

        defaultProperties.setProperty("framework.xml.DateHandler",
                "org.fornax.cartridges.sculptor.framework.xml.JodaLocalDateHandler");
        defaultProperties.setProperty("framework.xml.TimeStampHandler",
                "org.fornax.cartridges.sculptor.framework.xml.JodaDateTimeHandler");

        defaultProperties.setProperty("generate.auditable.joda", "true");
    }

    private static void initDerivedDefaultsSystemAttributes(Properties defaultProperties) {
        if (!getBooleanProperty("generate.auditable")) {
            String value = defaultProperties.getProperty("systemAttributes");
            value = value.replaceAll(",createdBy", "");
            value = value.replaceAll(",createdDate", "");
            value = value.replaceAll(",updatedBy", "");
            value = value.replaceAll(",updatedDate", "");
            value = value.replaceAll(",lastUpdated", "");
            value = value.replaceAll(",lastUpdatedBy", "");
            defaultProperties.setProperty("systemAttributes", value);
        }
    }

    public static String getProperty(String propertyName) {
        String value = getProperties().getProperty(propertyName);
        if (value == null) {
            throw new MissingResourceException("Property not found: " + propertyName, "GeneratorProperties",
                    propertyName);
        }
        return value;
    }

    public static boolean hasProperty(String propertyName) {
        try {
            getProperty(propertyName);
            return true;
        } catch (MissingResourceException e) {
            return false;
        }
    }

    public static boolean getBooleanProperty(String propertyName) {
        String value = getProperty(propertyName);
        return value.equalsIgnoreCase("true");
    }

    static Set<String> getPropertyNames() {
        return getPropertyNames(getProperties());
    }

    @SuppressWarnings("unchecked")
    static Set<String> getPropertyNames(Properties properties) {
        Set<String> result = new HashSet<String>();
        for (Enumeration<String> iter = (Enumeration<String>) properties.propertyNames(); iter.hasMoreElements();) {
            String propertyName = iter.nextElement();
            result.add(propertyName);
        }
        return result;
    }

    /**
     * Gets all properties with a key starting with a prefix.
     * 
     * @param prefix
     * @return properties starting with prefix
     */
    static Properties getProperties(String prefix) {
        return getProperties(prefix, false);
    }

    /**
     * Gets all properties with a key starting with prefix.
     * 
     * @param prefix
     * @param removePrefix
     *            remove prefix in the resulting properties or not
     * @return properties starting with prefix
     */
    static Properties getProperties(String prefix, boolean removePrefix) {
        Properties result = new Properties();
        for (String key : getPropertyNames()) {
            if (key.startsWith(prefix))
                result.put((removePrefix) ? key.substring(prefix.length()) : key, getProperty(key));
        }
        return result;
    }

    /**
     * Transforms the given properties to a map with key/value pairs.
     * 
     * @param properties
     *            to transform
     * @return map containing transformed properties
     */
    public static Map<String, String> getPropertiesAsMap(Properties properties) {
        Map<String, String> result = new HashMap<String, String>();
        for (String key : getPropertyNames(properties)) {
            result.put(key, properties.getProperty(key));
        }
        return result;
    }

    private static String fw(String className) {
        String propName = "framework." + className;
        if (hasProperty(propName)) {
            return getProperty(propName);
        } else {
            return "org.fornax.cartridges.sculptor." + propName;
        }
    }

    public static String getServiceContextClass() {
        return fw("errorhandling.ServiceContext");
    }

    public static String getDbProduct() {
        return getProperty("db.product");
    }

    public static String getHibernateDialect() {
        String key = "db." + getDbProduct() + ".hibernate.dialect";
        return getProperty(key);
    }

    public static String getDbType(String javaType) {
        String key = "db." + getDbProduct() + ".type." + javaType;
        return getProperty(key);
    }

    public static String getDbLength(String javaType) {
        String key = "db." + getDbProduct() + ".length." + javaType;
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return null;
        }
    }

    public static Integer getMaxDbName() {
        String key = "db." + getDbProduct() + ".maxNameLength";
        return new Integer(getProperty(key));
    }

    public static boolean isDbResponsibleForOnDeleteCascade() {
        String key = "db." + getDbProduct() + ".onDeleteCascade";
        return Boolean.valueOf(getProperty(key));
    }

    public static String getDefaultCascade(String referenceType) {
        String propertyName = "cascade." + referenceType;
        if (hasProperty(propertyName)) {
            String value = getProperty(propertyName);
            return ("".equals(value) ? null : value);
        } else {
            return null;
        }
    }

    public static String getJavaType(String modelType) {
        String key = "javaType." + modelType;
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return null;
        }
    }

    public static String getJavaTypeImpl(String modelType) {
        String key = "javaType.impl." + modelType;
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return null;
        }
    }

    public static String mapHibernateType(String modelType) {
        String key = "hibernateType." + modelType;
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return null;
        }
    }

    public static String getIdType() {
        return getProperty("id.type");
    }

    public static String mapPropertyEditor(String modelType) {
        String key = "propertyEditor." + modelType;
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return null;
        }
    }

    public static String getServiceInterfacePackage() {
        return getProperty("package.serviceInterface");
    }

    public static String getServiceImplementationPackage() {
        return getProperty("package.serviceImplementation");
    }

    public static String getControllerInterfacePackage() {
        return getProperty("package.controllerInterface");
    }

    public static String getRestPackage() {
        return getProperty("package.rest");
    }

    public static String getServiceProxyPackage() {
        return getProperty("package.serviceProxy");
    }

    public static String getServiceStubPackage() {
        return getProperty("package.serviceStub");
    }

    public static String getConsumerPackage() {
        return getProperty("package.consumer");
    }

    public static String getXmlMapperPackage() {
        return getProperty("package.xmlmapper");
    }

    public static String getDomainPackage() {
        return getProperty("package.domain");
    }

    public static String getBuilderPackage() {
        return getProperty("package.builder");
    }

    public static String getDtoPackage() {
        return getProperty("package.dto");
    }

    public static String getDomainEventPackage() {
        return getProperty("package.domainEvent");
    }

    public static String getCommandEventPackage() {
        return getProperty("package.commandEvent");
    }

    public static String getRepositoryInterfacePackage() {
        return getProperty("package.repositoryInterface");
    }

    public static String getExceptionPackage() {
        return getProperty("package.exception");
    }

    public static String getRepositoryImplementationPackage() {
        return getProperty("package.repositoryImplementation");
    }

    public static String getAccessInterfacePackage() {
        return getProperty("package.accessInterface");
    }

    public static String getAccessImplementationPackage() {
        return getProperty("package.accessImplementation");
    }

    public static String getMapperPackage() {
        return getProperty("package.mapper");
    }

    public static String getWebPackage() {
        return getProperty("package.web");
    }

    public static String getRichClientPackage() {
        return getProperty("package.richClient");
    }

    public static List<String> scaffoldOperations() {
        String value = getProperty("scaffold.operations");
        String[] operations = value.split(",");
        trim(operations);
        return new ArrayList<String>(Arrays.asList(operations));
    }

    public static List<String> restScaffoldOperations() {
        String value = getProperty("rest.scaffold.operations");
        String[] operations = value.split(",");
        trim(operations);
        return new ArrayList<String>(Arrays.asList(operations));
    }

    public static String restServiceDelegateOperation(String name) {
        String propName = "rest." + name + ".delegate";
        if (hasProperty(propName)) {
            return getProperty(propName);
        } else {
            return null;
        }
    }

    public static List<String> projectNature() {
        String value = getProperty("project.nature");
        String[] operations = value.split(",");
        trim(operations);
        return new ArrayList<String>(Arrays.asList(operations));
    }

    private static void trim(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
    }

    public static boolean hasProjectNature(String nature) {
        return projectNature().contains(nature);
    }

    static Map<String, String> singular2pluralDefinitions() {
        Map<String, String> result = new HashMap<String, String>();
        String prefix = "singular2plural.";
        Set<String> names = getPropertyNames();
        for (String key : names) {
            if (key.startsWith(prefix)) {
                result.put(key.substring(prefix.length()), getProperty(key));
            }
        }
        return result;
    }

    /**
     * Gets a single validation annotation from properties.
     * 
     * @param annotation
     *            shortcut for annotation
     * @return fully qualified Annotation Class (without leading @)
     */
    public static String mapValidationAnnotation(String annotation) {
        return mapValidationAnnotation(annotation, null);
    }

    /**
     * Gets a single validation annotation from properties.
     * 
     * @param annotation
     *            shortcut for annotation
     * @param defaultAnnotation
     *            default annotation in case annotation could not be found
     * @return fully qualified Annotation Class (without leading @)
     */
    public static String mapValidationAnnotation(String annotation, String defaultAnnotation) {
        String key = "validation.annotation." + GenerationHelper.toFirstUpper(annotation);
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return defaultAnnotation;
        }
    }

    /**
     * Gets all configured properties for validation annotations as map.
     * 
     * @return map with validation annotations
     */
    public static Map<String, String> validationAnnotationDefinitions() {
        return getPropertiesAsMap(getProperties("validation.annotation.", true));
    }

    public static void setProperty(String key, String value) {
        getProperties().setProperty(key, value);
    }

    public static List<String> getChangedModules() {
        if (hasProperty(CHANGED_MODULE)) {
            String s = getProperty(CHANGED_MODULE);
            String[] split = s.split(",");
            return Arrays.asList(split);
        } else if (hasProperty(M2_PLUGIN_CHANGED_FILES)) {
            String s = getProperty(M2_PLUGIN_CHANGED_FILES);
            String[] split = s.split(",");
            List<String> result = new ArrayList<String>();
            for (String each : split) {
                String module = moduleFromFileName(each);
                if (module != null) {
                    result.add(module);
                }
            }
            return result;
        } else {
            return Collections.emptyList();
        }
    }

    private static String moduleFromFileName(String fileName) {
        File file = new File(fileName);
        String name = file.getName();
        if (!name.endsWith(".btdesign")) {
            return null;
        }
        name = name.substring(0, name.length() - ".btdesign".length());
        if (name.startsWith("model-") || name.startsWith("model_")) {
            name = name.substring("model-".length());
        }
        return name;
    }
    
    
    public static String getWidgetType(String modelType) {
        String key = "widgetType.class." + modelType;
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return null;
        }
    }

    public static String getWidgetTag(String modelType) {
        String key = "widgetType.tag." + modelType;
        if (hasProperty(key)) {
            return getProperty(key);
        } else {
            return null;
        }
    }

}
