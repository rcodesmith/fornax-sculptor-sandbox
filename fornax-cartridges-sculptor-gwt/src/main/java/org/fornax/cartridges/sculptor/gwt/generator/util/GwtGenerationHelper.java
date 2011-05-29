package org.fornax.cartridges.sculptor.gwt.generator.util;

import org.fornax.cartridges.sculptor.generator.util.GenerationHelper;
import org.fornax.cartridges.sculptor.generator.util.GeneratorProperties;

import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectTypedElement;
import sculptormetamodel.Reference;
import sculptormetamodel.TypedElement;

public class GwtGenerationHelper {

    // Copied from GenerationHelper
    private static String getJavaTypeOrVoid(String type) {
        if (type == null || type.equals("")) {
            return "void";
        }
        return getJavaType(type);
    }

    // Copied from GenerationHelper
    private static String getJavaType(String modelType) {
    	// Added by Ron.  Change to use something like GeneratorProperties
    	if("Date".equals(modelType)) {
    		return "java.util.Date";
    	} else if ("DateTime".equals(modelType)){
    		return "java.util.Date";
    	} else if ("Timestamp".equals(modelType)) {
    		return "java.util.Date";
    	}
    	
        String javaType = GeneratorProperties.getJavaType(modelType);
        if (javaType == null) {
            return modelType;
        } else {
            return javaType;
        }
    }


    // TODO: This is somewhat redundant with some functions in sofeauihelpers.ext
    // Copied from GenerationHelper
    public static String getDomainPackage(DomainObject domainObject) {
    	String basePkg = GenerationHelper.getBasePackage(domainObject.getModule());
    	
    	return basePkg + ".gwt.shared.domain";
    }
    
    
    public static String getTypeName(DomainObjectTypedElement element) {
        return getTypeName(element, true);
    }

    
    public static String getTypeName(Reference ref) {
        return getDomainPackage(ref.getTo()) + "." + ref.getTo().getName();
    }

    public static String getTypeName(DomainObjectTypedElement element, boolean surroundWithCollectionType) {
        String typeName = getJavaTypeOrVoid(element.getType());
        String type = typeName;
        String domainObjectTypeName = null;
        if (element.getDomainObjectType() != null) {
            domainObjectTypeName = getJavaTypeOrVoid(getDomainPackage(element.getDomainObjectType()) + "."
                    + element.getDomainObjectType().getName());
            type = domainObjectTypeName;
        }

        if (typeName != null && !typeName.equals("void") && domainObjectTypeName != null
                && !domainObjectTypeName.equals("void")) {
            type = typeName + "<" + domainObjectTypeName + ">";
        }

        return (surroundWithCollectionType ? surroundWithCollectionType(type, element, false) : type);
    }

    // Copied from GenerationHelper
    public static String getTypeName(TypedElement element) {
        String type = getJavaTypeOrVoid(element.getType());
        return surroundWithCollectionType(type, element, false);
    }

    
    // Copied from GenerationHelper
    private static String surroundWithCollectionType(String type, TypedElement typedElement, boolean collectionImpl) {
        if (typedElement.getCollectionType() == null || typedElement.getCollectionType().equals("") || type == null
                || type.equals("") || type.equals("void")) {
            return type;
        } else {
            String mappedCollectionType = (collectionImpl ? getJavaTypeImpl(typedElement.getCollectionType())
                    : getJavaType(typedElement.getCollectionType()));
            if (typedElement.getCollectionType().equals("Map")) {
                String keyType = ((typedElement.getMapKeyType() == null || typedElement.getMapKeyType().equals("")) ? "Object"
                        : typedElement.getMapKeyType());
                mappedCollectionType += "<" + keyType + ", " + type + ">";
            } else {
                mappedCollectionType += "<" + type + ">";
            }
            return mappedCollectionType;
        }
    }
    
    // Copied from GenerationHelper
    // For cases where the implementation type differs from the declared type.
    private static String getJavaTypeImpl(String modelType) {
    	// Added by Ron.  Change to use something like GeneratorProperties
    	if("Date".equals(modelType)) {
    		return "java.util.Date";
    	} else if ("DateTime".equals(modelType)){
    		return "java.util.Date";
    	} else if ("Timestamp".equals(modelType)) {
    		return "java.util.Date";
    	}
        String javaType = GeneratorProperties.getJavaTypeImpl(modelType);
        if (javaType == null) {
            return getJavaType(modelType);
        } else {
            return javaType;
        }
    }

    
    
    // Copied from GenerationHelper
    public static String getImplTypeName(TypedElement element) {
        String type = getJavaTypeImpl(element.getType());
        return surroundWithCollectionType(type, element, true);
    }

}
