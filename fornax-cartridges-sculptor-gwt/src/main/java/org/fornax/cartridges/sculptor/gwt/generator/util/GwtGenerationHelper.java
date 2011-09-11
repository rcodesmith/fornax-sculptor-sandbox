package org.fornax.cartridges.sculptor.gwt.generator.util;

import org.eclipse.emf.common.util.EList;
import org.fornax.cartridges.sculptor.generator.util.GenerationHelper;
import org.fornax.cartridges.sculptor.generator.util.GeneratorProperties;

import sculptormetamodel.Application;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectTypedElement;
import sculptormetamodel.Module;
import sculptormetamodel.Parameter;
import sculptormetamodel.Reference;
import sculptormetamodel.Service;
import sculptormetamodel.ServiceOperation;
import sculptormetamodel.TypedElement;

public class GwtGenerationHelper {

    private static final String GWT_DOMAIN_PKG = ".gwt.shared.domain";



    public static String getToDtoConversionExpression(TypedElement attribute, String domainAccessorExpr) {
    	if(isDateOrDateTime(attribute)) {
    		return "org.fornax.cartridges.sculptor.framework.gwt.server.ConversionUtils.convert("
    			+ domainAccessorExpr
    			+ ",(java.util.Date)null)";
    	}
    	else {
    		return domainAccessorExpr;
    	}    	
    }
    
    public static String getToDomainConversionExpression(TypedElement attribute, String dtoAccessorExpr, String domainAccessorExpr) {
    	if(isDateOrDateTime(attribute)) {
    		return "org.fornax.cartridges.sculptor.framework.gwt.server.ConversionUtils.convert("
    			+ dtoAccessorExpr
    			+ "," + domainAccessorExpr + ")";
    	}
    	else {
    		return dtoAccessorExpr;
    	}    	
    }
    
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
    	
    	return basePkg + GWT_DOMAIN_PKG;
    }
    
    
    public static String getTypeName(DomainObjectTypedElement element) {
        return getTypeName(element, true);
    }

    
    public static String getTypeName(Reference ref) {
        return getDomainPackage(ref.getTo()) + "." + ref.getTo().getName();
    }

    private static Module findModuleMatchingModuleBasePkg(Parameter parameter) {
    	String typeName = parameter.getType();
    	if(typeName == null || !typeName.contains(".")) {
    		return null;
    	}
    	ServiceOperation op = (ServiceOperation)parameter.eContainer();
    	Service service = (Service)op.eContainer();
    	Application app = service.getModule().getApplication();
    	EList<Module> modules = app.getModules();
    	
    	for (Module module : modules) {
    		String baseDomainPkg = GenerationHelper.getDomainPackage(module);
    		
    		if(typeName.startsWith(baseDomainPkg)) {
    			return module;
    		}
		}
    	return null;
    	
    }
    
    public static boolean isMappableType(Parameter parameter) {
        if(parameter.getDomainObjectType() != null)
        	return true;
        
        String typeName = parameter.getType();
        // TODO: Following is a hack
        if(typeName != null && typeName.contains(".domain.")) {
        	return true;
        }
        
        return false;
        
    }
    
    private static String translateBasicTypes(Parameter parameter) {
    	// TODO: Reuse other code that derives GWT domain package.  Must be used in GwtDto.xpt
    	String typeName = parameter.getType();
    	
    	Module module = findModuleMatchingModuleBasePkg(parameter);
    	if(module == null) {
    		return typeName;
    	}

    	String domainBasePkg = GenerationHelper.getDomainPackage(module);
    	String basePkg = GenerationHelper.getBasePackage(module);
    	String gwtBasePkg = basePkg + GWT_DOMAIN_PKG;

        if(!typeName.startsWith(gwtBasePkg)) {
        	String relName = typeName.substring(domainBasePkg.length() + 1);
        	return gwtBasePkg + "." + relName;
        }
        return typeName;
	
    }
    
    public static String toFirstUpper(String v) {
    	return v.substring(0, 1).toUpperCase() + v.substring(1);
    }
    
    public static boolean isDateOrDateTime(TypedElement attr) {
    	
    	final String[] dateTypes = {"Date", "DateTime", "Timestamp", "LocalDate", "Time", "java.util.Date"};
    	
    	String attrType = attr.getType();
    	if(attrType == null) {
    		return false;
    	}
    	
    	for (String typeName : dateTypes) {
			if(typeName.equals(attrType)) {
				return true;
			}
		}
    	return false;
    }
	
    public static String dtoMapper(Module module) {
    	return GenerationHelper.getDomainPackage(module) + "." + toFirstUpper(module.getName()) + "DtoMapper";
    }
    
    public static String getMapToDomainExpression(Parameter parameter) {
    	if(isMappableType(parameter)) {
    		DomainObject domainObject = parameter.getDomainObjectType();
    		Module module;
    		String typeRelName;
    		if(domainObject != null) {
    			module = domainObject.getModule();
    			typeRelName = domainObject.getName();
    		} else {
    			module = findModuleMatchingModuleBasePkg(parameter);
    			typeRelName = parameter.getType().substring(parameter.getType().lastIndexOf(".") + 1);
    		}
			return dtoMapper(module) + "." + "map" + typeRelName + "ToDomain(" + parameter.getName() + ")";
    	} else {
    		// One of the built-in types, but may still require conversion (e.g. JODA date to j.u.Date).
    		return getToDomainConversionExpression(parameter, parameter.getName(), parameter.getType());
    	}
    }
    /**
     * Special method to get GWT-translated type name of an operation parameter
     * @param parameter
     * @param module
     * @return
     */
    public static String getParamaterTypeName(Parameter parameter, Module module) {
    	GenerationHelper.debugTrace("GwtGenerationHelper.getParamaterTypeName(" + parameter.getType() + ")");
    	// TODO: Make this translation more efficient - would like to do it only if other type processing fails.
        String typeName = translateBasicTypes(parameter);
    	//GenerationHelper.debugTrace("GwtGenerationHelper.getParamaterTypeName() translated typeName=" + typeName);
        if(typeName != null && !typeName.equals(parameter.getType())) {
        	// Was translated
        	return typeName;
        }
        else {
        	return getTypeName(parameter, true);
        }
    	
    }
    
    public static String getTypeName(DomainObjectTypedElement element, boolean surroundWithCollectionType) {
    	//GenerationHelper.debugTrace("GwtGenerationHelper.getTypeName(" + element.getType() + ")");
    	//GenerationHelper.debugTrace("GwtGenerationHelper.getTypeName() domainObjectType = " + element.getDomainObjectType());
    	
        String typeName = getJavaTypeOrVoid(element.getType());
        
        String type = typeName;
        String domainObjectTypeName = null;
        if (element.getDomainObjectType() != null) {
            domainObjectTypeName = getJavaTypeOrVoid(getDomainPackage(element.getDomainObjectType()) + "."
                    + element.getDomainObjectType().getName());
            type = domainObjectTypeName;
        //	GenerationHelper.debugTrace("GwtGenerationHelper.getTypeName() trace 1.  type = " + type);
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
