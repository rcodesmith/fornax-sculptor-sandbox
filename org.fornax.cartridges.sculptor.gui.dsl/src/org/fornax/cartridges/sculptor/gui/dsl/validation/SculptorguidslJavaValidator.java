package org.fornax.cartridges.sculptor.gui.dsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslSimpleDomainObject;
import org.fornax.cartridges.sculptor.gui.dsl.GuidslHelper;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslAutocompleteWidget;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslGuiApplication;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslGuiModule;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslListBoxWidget;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslPanelWidget;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslTableWidget;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslView;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslWidget;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.SculptorguidslPackage;
 

public class SculptorguidslJavaValidator extends AbstractSculptorguidslJavaValidator {

//	@Check
//	public void checkTypeNameStartsWithCapital(Type type) {
//		if (!Character.isUpperCase(type.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
//		}
//	}

	@Check
	public void checkFor(DslView view) {
		
		int featureCode = SculptorguidslPackage.DSL_VIEW__FOR;
		
		DslSimpleDomainObject forObj = view.getFor();
		if(forObj != null) {
			DslGuiModule guiModule = (DslGuiModule)view.eContainer();
			DslGuiApplication guiApp = (DslGuiApplication)guiModule.eContainer();
			if(GuidslHelper.skipGuiDto(guiApp, forObj) == true) {
	            error("View " + view.getName() + " has 'for' object that is GUI-skipped : " + forObj.getName(), featureCode);
			}
		}
	}
	
	public DslGuiApplication findContainingGuiApp(DslWidget widget) {
		EObject currentObj = widget;
		while( !(currentObj instanceof DslGuiApplication) ) {
			currentObj = currentObj.eContainer();
		}
		return (DslGuiApplication)currentObj;
	}
	
	private void checkForReference(DslWidget widget, DslSimpleDomainObject forObj, int featureCode) {
		if(forObj != null) {
			DslGuiApplication guiApp = findContainingGuiApp(widget);
			if(GuidslHelper.skipGuiDto(guiApp, forObj) == true) {
	            error("Widget " + widget.getName() + " has 'for' object that is GUI-skipped : " + forObj.getName(), featureCode);
			}			
		}
	}
	
	@Check
	public void checkFor(DslListBoxWidget widget) {
		checkForReference(widget, widget.getFor(), SculptorguidslPackage.DSL_LIST_BOX_WIDGET__FOR);
	}

	@Check
	public void checkFor(DslPanelWidget widget) {
		checkForReference(widget, widget.getFor(), SculptorguidslPackage.DSL_PANEL_WIDGET__FOR);
	}

	@Check
	public void checkFor(DslAutocompleteWidget widget) {
		checkForReference(widget, widget.getFor(), SculptorguidslPackage.DSL_AUTOCOMPLETE_WIDGET__FOR);
	}
	
	@Check
	public void checkFor(DslTableWidget widget) {
		checkForReference(widget, widget.getFor(), SculptorguidslPackage.DSL_TABLE_WIDGET__FOR);
	}

	
}
