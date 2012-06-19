package org.fornax.cartridges.sculptor.gui.dsl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.validation.Check;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslSimpleDomainObject;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslListBoxWidget;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.SculptorguidslPackage;
 

public class SculptorguidslJavaValidator extends AbstractSculptorguidslJavaValidator {

//	@Check
//	public void checkTypeNameStartsWithCapital(Type type) {
//		if (!Character.isUpperCase(type.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
//		}
//	}

//	@Check
//	public void checkFor(DslView view) {
//		DslSimpleDomainObject forObj = view.getFor();
//		EList<Diagnostic> errors = view.eResource().getErrors();
//		
//        if (errors.size() > 0) {
//        	for (Diagnostic diagnostic : errors) {
//        		System.out.println("HERE:" + diagnostic.getMessage());
//	            error(diagnostic.getMessage(), SculptorguidslPackage.DSL_VIEW__FOR);
//			}
//        }
//	}
	
//	@Check
//	public void checkFor(DslListBoxWidget widget) {
//		DslSimpleDomainObject forObj = widget.getFor();
//		EList<Diagnostic> errors = widget.eResource().getErrors();
//		
//		System.out.println("HERE validating:" + widget.getName());
//		
//        if (errors.size() > 0) {
//        	for (Diagnostic diagnostic : errors) {
//        		System.out.println("HERE:" + diagnostic.getMessage());
//	            error(diagnostic.getMessage(), SculptorguidslPackage.DSL_LIST_BOX_WIDGET__FOR);
//			}
//        }
//	}

}
