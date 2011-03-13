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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Parameter;
import sculptormetamodel.Reference;
import sculptormetamodel.RepositoryOperation;
import sculptormetamodel.SculptormetamodelFactory;
import sculptormetamodel.impl.SculptormetamodelFactoryImpl;

@SuppressWarnings("unchecked")
public class GenericAccessObjectManager {
    private final Map<String, GenericAccessObjectStrategy> genericAccessObjectStrategies = new HashMap<String, GenericAccessObjectStrategy>();

    protected GenericAccessObjectManager() {
    }

    public static GenericAccessObjectManager createInstance() {
        GenericAccessObjectManager manager = new GenericAccessObjectManager();
        manager.initGenericAccessObjectStrategies();
        return manager;
    }

    protected void initGenericAccessObjectStrategies() {

        // By default the NullStrategy is used if only the access object class
        // is defined
        NullStrategy nullStrategy = new NullStrategy();
        for (String propertyName : GeneratorProperties.getPropertyNames()) {
            if (propertyName.startsWith("framework.accessapi.")) {
                String key = propertyName.split("\\.")[2]; // last part
                if (key.endsWith("Access")) {
                    key = key.substring(0, key.length() - "Access".length());
                    key = GenerationHelper.toFirstLower(key);
                    genericAccessObjectStrategies.put(key, nullStrategy);
                }
            }
            if (propertyName.startsWith("framework.accessimpl.")) {
                String key = propertyName.split("\\.")[2]; // last part
                if (key.endsWith("AccessImpl")) {
                    key = key.substring(0, key.length() - "AccessImpl".length());
                    key = GenerationHelper.toFirstLower(key);
                    genericAccessObjectStrategies.put(key, nullStrategy);
                }
            }
        }

        for (String propertyName : GeneratorProperties.getPropertyNames()) {
            if (propertyName.startsWith("genericAccessObjectStrategy.")) {
                String key = propertyName.split("\\.")[1]; // last part
                String propertyValue = GeneratorProperties.getProperty(propertyName);
                if (propertyValue == null || propertyValue.trim().equals("")) {
                    genericAccessObjectStrategies.put(key, nullStrategy);
                } else {
                    GenericAccessObjectStrategy strategy = (GenericAccessObjectStrategy) FactoryHelper
                            .newInstanceFromName(propertyValue);
                    genericAccessObjectStrategies.put(key, strategy);
                }
            }
        }
    }

    protected Map<String, GenericAccessObjectStrategy> getGenericAccessObjectStrategies() {
        return genericAccessObjectStrategies;
    }

    public boolean isGenericAccessObject(RepositoryOperation op) {
        return genericAccessObjectStrategies.containsKey(op.getName());
    }

    public boolean isPersistentClassConstructor(RepositoryOperation op) {
        GenericAccessObjectStrategy strategy = genericAccessObjectStrategies.get(op.getName());
        return strategy.isPersistentClassConstructor();
    }

    /**
     * Get the generic type declaration for generic access objects.
     */
    public String getGenericType(RepositoryOperation op) {
        GenericAccessObjectStrategy strategy = genericAccessObjectStrategies.get(op.getName());
        if (strategy == null) {
            return "";
        } else {
            return strategy.getGenericType(op);
        }
    }

    public GenericAccessObjectStrategy getStrategy(String operationName) {
        return genericAccessObjectStrategies.get(operationName);
    }

    public abstract static class AbstractGenericAccessObjectStrategy implements GenericAccessObjectStrategy {

        protected void addParameter(RepositoryOperation operation, String type, String name) {
            Parameter param = createParameter(type, name);
            operation.getParameters().add(param);
        }

        protected void addParameterFirst(RepositoryOperation operation, String type, String name) {
            Parameter param = createParameter(type, name);
            operation.getParameters().add(0, param);
        }

        protected Parameter createParameter(String type, String name) {
            SculptormetamodelFactory factory = SculptormetamodelFactoryImpl.eINSTANCE;
            Parameter param = factory.createParameter();
            param.setName(name);
            param.setType(type);
            return param;
        }

        protected void addDefaultCollectionType(RepositoryOperation operation) {
            if (operation.getCollectionType() == null || operation.getCollectionType().equals("")) {
                operation.setCollectionType("List");
            }
        }

        protected void addDefaultDomainObjectType(RepositoryOperation operation) {
            if (operation.getDomainObjectType() == null) {
                operation.setDomainObjectType(operation.getRepository().getAggregateRoot());
            }
        }

        protected String aggregateRootClassName(RepositoryOperation operation) {
            DomainObject aggregateRoot = operation.getRepository().getAggregateRoot();
            String pkg = GenerationHelper.getDomainPackage(aggregateRoot);
            return pkg + "." + aggregateRoot.getName();
        }

        protected void addDefaultAggregateRootParameter(RepositoryOperation operation, String name) {
            if (operation.getParameters().isEmpty()) {
                SculptormetamodelFactory factory = SculptormetamodelFactoryImpl.eINSTANCE;
                Parameter param = factory.createParameter();
                param.setName(name);
                param.setDomainObjectType(operation.getRepository().getAggregateRoot());
                operation.getParameters().add(param);
            }
        }

        protected boolean hasParameter(RepositoryOperation operation, String name) {
            for (Parameter each : (Iterable<Parameter>) operation.getParameters()) {
                if (each.getName().equals(name)) {
                    return true;
                }
            }
            return false;
        }

        protected void addNotFoundException(RepositoryOperation operation) {
            if (GeneratorProperties.getBooleanProperty("generate.NotFoundException")
                    && (operation.getThrows() == null || operation.getThrows().equals(""))) {
                String objectNotFoundExc = operation.getRepository().getAggregateRoot().getName() + "NotFoundException";
                operation.setThrows(objectNotFoundExc);
            }
        }
    }

    public static class NullStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            DomainObject aggregateRoot = operation.getRepository().getAggregateRoot();
            String aggregateRootName = GenerationHelper.getDomainPackage(aggregateRoot) + "." + aggregateRoot.getName();
            return "<" + aggregateRootName + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return false;
        }

    }

    private static String findDslDeclaredIdType(DomainObject domainObject) {
        String dslDeclaredIdType = null;
        EList<?> attributes = domainObject.getAttributes();
        for (int i = 0; attributes != null && i < attributes.size(); i++) {
            Attribute attribute = (Attribute) attributes.get(i);
            if (attribute.getName().equals("id")) {
                dslDeclaredIdType = attribute.getType();
                break;
            }
        }
        return dslDeclaredIdType;
    }

    public static class FindByIdStrategy extends AbstractGenericAccessObjectStrategy {

        private final PrimitiveTypeMapper primitiveTypeMapper = new PrimitiveTypeMapper();

        @Override
        public void addDefaultValues(RepositoryOperation operation) {

            if (operation.getParameters().isEmpty()) {
                String dslDeclaredIdType = findDslDeclaredIdType(operation.getRepository().getAggregateRoot());
                String idType = GeneratorProperties.getIdType();
                String javaType = GeneratorProperties.getJavaType(idType);
                // id declared in dsl has precedence
                if (dslDeclaredIdType != null) {
                    javaType = dslDeclaredIdType;
                } else if (javaType == null) {
                    javaType = idType;
                }
                addParameter(operation, javaType, "id");
            }
            addDefaultDomainObjectType(operation);

            addNotFoundException(operation);
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            Parameter idParam = (Parameter) operation.getParameters().get(0);
            String idTypeName = idParam.getType();
            // use object types
            idTypeName = primitiveTypeMapper.mapPrimitiveType2ObjectTypeName(idTypeName);
            return "<" + GenerationHelper.getTypeName(operation, false) + ", " + idTypeName + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class PopulateAssociationsStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (operation.getParameters().isEmpty()) {
                addDefaultAggregateRootParameter(operation, "entity");
                addParameter(operation, GeneratorProperties.getJavaType("AssociationSpecification"),
                        "associationSpecification");
            }
            addDefaultDomainObjectType(operation);

            addNotFoundException(operation);
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            Parameter firstParam = (Parameter) operation.getParameters().get(0);
            return "<" + GenerationHelper.getTypeName(firstParam, false) + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindByKeysStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (operation.getParameters().isEmpty()) {
                addParameter(operation, "java.util.Set<?>", "keys");
            }

            addDefaultDomainObjectType(operation);
            if (operation.getCollectionType() == null || operation.getCollectionType().equals("")) {
                operation.setCollectionType("Map");
            }
            if (operation.getMapKeyType() == null || operation.getMapKeyType().equals("")) {
                operation.setMapKeyType("Object");
            }
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            return "<" + GenerationHelper.getTypeName(operation, false) + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindByKeyStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (operation.getParameters().isEmpty()) {
                DomainObject aggregateRoot = operation.getRepository().getAggregateRoot();

                EmfRegistryMetaModel metaModel = new EmfRegistryMetaModel();
                XtendFacade xtend = XtendFacade.create("extensions::helper");
                xtend.registerMetaModel(metaModel);

                List<Attribute> allNaturalKeyAttributes = (List<Attribute>) xtend.call("getAllNaturalKeyAttributes",
                        new Object[] { aggregateRoot });
                List<Reference> allNaturalKeyReferences = (List<Reference>) xtend.call("getAllNaturalKeyReferences",
                        new Object[] { aggregateRoot });
                if (allNaturalKeyAttributes.isEmpty() && allNaturalKeyReferences.isEmpty()) {
                    Attribute uuidAttribute = (Attribute) xtend.call("getUuid", new Object[] { aggregateRoot });
                    if (uuidAttribute != null) {
                        addParameter(operation, GenerationHelper.getTypeName(uuidAttribute), uuidAttribute.getName());
                    }
                } else {
                    for (Attribute each : allNaturalKeyAttributes) {
                        addParameter(operation, GenerationHelper.getTypeName(each), each.getName());
                    }
                    for (Reference each : allNaturalKeyReferences) {
                        addParameter(operation, GenerationHelper.getTypeName(each), each.getName());
                    }
                }
            }
            addDefaultDomainObjectType(operation);

            addNotFoundException(operation);
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            DomainObject aggregateRoot = operation.getRepository().getAggregateRoot();
            String aggregateRootName = GenerationHelper.getDomainPackage(aggregateRoot) + "." + aggregateRoot.getName();
            return "<" + aggregateRootName + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindAllStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (GeneratorProperties.getBooleanProperty("findAll.paging") && operation.getParameters().isEmpty()) {
                addParameter(operation, "PagingParameter", "pagingParameter");
            }
            if (operation.getType() == null && operation.getDomainObjectType() == null) {
                if (hasParameter(operation, "pagingParameter")) {
                    operation.setType("PagedResult");
                    addDefaultDomainObjectType(operation);
                } else {
                    addDefaultDomainObjectType(operation);
                    addDefaultCollectionType(operation);
                }
            }
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            if (operation.getDomainObjectType() == null || "PagedResult".equals(operation.getType())) {
                return "<" + aggregateRootClassName(operation) + ">";
            } else {
                return "<" + GenerationHelper.getTypeName(operation, false) + ">";
            }
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class CountAllStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            operation.setType("long");
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            return "<" + aggregateRootClassName(operation) + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindByExampleStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            addDefaultAggregateRootParameter(operation, "example");
            addDefaultDomainObjectType(operation);
            addDefaultCollectionType(operation);
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            return "<" + GenerationHelper.getTypeName(operation, false) + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindByQueryStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (operation.getParameters().isEmpty()
                    || (operation.getParameters().size() == 1 && hasParameter(operation, "useSingleResult"))
                    || (operation.getParameters().size() == 1 && hasParameter(operation, "pagingParameter"))) {
                addParameterFirst(operation, "java.util.Map<String, Object>", "parameters");
                addParameterFirst(operation, "String", "query");
            }

            if (operation.getCollectionType() == null
                    && (operation.getType() != null || operation.getDomainObjectType() != null)) {
                GenerationHelper.addHint(operation, "useSingleResult");
            }

            if (operation.getType() == null && operation.getDomainObjectType() == null) {
                if (hasParameter(operation, "pagingParameter")) {
                    operation.setType("PagedResult");
                    addDefaultDomainObjectType(operation);
                } else if (hasParameter(operation, "useSingleResult")
                        || GenerationHelper.hasHint(operation.getHint(), "useSingleResult")) {
                    operation.setType("Object");
                } else {
                    addDefaultDomainObjectType(operation);
                    addDefaultCollectionType(operation);
                }
            }
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            if (operation.getDomainObjectType() == null || "PagedResult".equals(operation.getType())) {
                return "<" + aggregateRootClassName(operation) + ">";
            } else {
                return "<" + GenerationHelper.getTypeName(operation, false) + ">";
            }
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindByCriteriaStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (operation.getParameters().isEmpty()
                    || (operation.getParameters().size() == 1 && hasParameter(operation, "pagingParameter"))) {
                addParameterFirst(operation, "java.util.Map<String, Object>", "restrictions");
            }

            if (operation.getType() == null && operation.getDomainObjectType() == null) {
                if (hasParameter(operation, "pagingParameter")) {
                    operation.setType("PagedResult");
                    addDefaultDomainObjectType(operation);
                } else {
                    addDefaultDomainObjectType(operation);
                    addDefaultCollectionType(operation);
                }
            }
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            if (operation.getDomainObjectType() == null || "PagedResult".equals(operation.getType())) {
                return "<" + aggregateRootClassName(operation) + ">";
            } else {
                return "<" + GenerationHelper.getTypeName(operation, false) + ">";
            }
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindByConditionStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (GeneratorProperties.getBooleanProperty("findByCondition.paging") && operation.getParameters().isEmpty()) {
                addParameter(operation, "PagingParameter", "pagingParameter");
            }
            if (operation.getParameters().isEmpty()
                    || (operation.getParameters().size() == 1 && hasParameter(operation, "pagingParameter"))) {

                String conditionalCriteriaClass;
                if (GeneratorProperties.hasProperty("framework.accessapi.ConditionalCriteria")) {
                    conditionalCriteriaClass = GeneratorProperties
                            .getProperty("framework.accessapi.ConditionalCriteria");
                } else {
                    conditionalCriteriaClass = "org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria";
                }
                addParameterFirst(operation, "java.util.List<" + conditionalCriteriaClass + ">", "condition");
            }

            if (operation.getType() == null && operation.getDomainObjectType() == null) {
                if (hasParameter(operation, "pagingParameter")) {
                    operation.setType("PagedResult");
                    addDefaultDomainObjectType(operation);
                } else {
                    addDefaultDomainObjectType(operation);
                    addDefaultCollectionType(operation);
                }
            }
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            if (operation.getDomainObjectType() == null || "PagedResult".equals(operation.getType())) {
                return "<" + aggregateRootClassName(operation) + ">";
            } else {
                return "<" + GenerationHelper.getTypeName(operation, false) + ">";
            }
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class FindByConditionStatStrategy extends AbstractGenericAccessObjectStrategy {
        private static final String COLUMN_STAT="org.fornax.cartridges.sculptor.framework.accessapi.ColumnStat";
        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            if (operation.getParameters().isEmpty()) {
                String conditionalCriteriaClass;
                if (GeneratorProperties.hasProperty("framework.accessapi.ConditionalCriteria")) {
                    conditionalCriteriaClass = GeneratorProperties
                            .getProperty("framework.accessapi.ConditionalCriteria");
                } else {
                    conditionalCriteriaClass = "org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria";
                }
                addParameterFirst(operation, "java.util.List<" + conditionalCriteriaClass + ">", "condition");
                String colStatParamType="java.util.List<"+COLUMN_STAT+"<"+ aggregateRootClassName(operation) + ">>";
                addParameter(operation, colStatParamType, "columnStat");
                GenerationHelper.addHint(operation, "useSingleResult");
                operation.setType(colStatParamType);
            }

            if (operation.getType() == null && operation.getDomainObjectType() == null) {
                addDefaultDomainObjectType(operation);
                addDefaultCollectionType(operation);
            }
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            if (operation.getDomainObjectType() == null || "PagedResult".equals(operation.getType())) {
                return "<" + aggregateRootClassName(operation) + ">";
            } else {
                return "<" + GenerationHelper.getTypeName(operation, false) + ">";
            }
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class MergeStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            addDefaultAggregateRootParameter(operation, "entity");
            addDefaultDomainObjectType(operation);
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            Parameter firstParam = (Parameter) operation.getParameters().get(0);
            return "<" + GenerationHelper.getTypeName(firstParam, false) + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return false;
        }

    }

    public static class SaveStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            addDefaultAggregateRootParameter(operation, "entity");
            addDefaultDomainObjectType(operation);
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            Parameter firstParam = (Parameter) operation.getParameters().get(0);
            return "<" + GenerationHelper.getTypeName(firstParam, false) + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

    public static class DeleteStrategy extends AbstractGenericAccessObjectStrategy {

        @Override
        public void addDefaultValues(RepositoryOperation operation) {
            addDefaultAggregateRootParameter(operation, "entity");
        }

        @Override
        public String getGenericType(RepositoryOperation operation) {
            Parameter firstParam = (Parameter) operation.getParameters().get(0);
            return "<" + GenerationHelper.getTypeName(firstParam, false) + ">";
        }

        @Override
        public boolean isPersistentClassConstructor() {
            return true;
        }

    }

}
