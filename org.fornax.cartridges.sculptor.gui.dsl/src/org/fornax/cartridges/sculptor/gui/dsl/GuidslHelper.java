package org.fornax.cartridges.sculptor.gui.dsl;

import org.fornax.cartridges.sculptor.dsl.sculptordsl.DslSimpleDomainObject;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslGuiApplication;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslGuiModule;
import org.fornax.cartridges.sculptor.gui.dsl.sculptorguidsl.DslSkipDomainObject;

public class GuidslHelper {

	public static boolean skipGuiDto(DslGuiModule guiModule, DslSimpleDomainObject obj) {
		String hint = obj.getHint();
		
		// TODO: Get rid of this once I remove all the gwt=skip stuff.  This is imperfect at best
		if(hint.contains("gwt=skip")) {
			return true;
		}
		
		for (DslSkipDomainObject skipDO : guiModule.getSkipDomainObjects()) {
			// TODO: This isn't working when called from scope provider for some reason - "Cyclic resolution of lazy links"
			if(skipDO.getDo().equals(obj)) {
				return true;
			}
		}
		
		return false;

	}
	
	public static boolean skipGuiDto(DslGuiApplication guiApp, DslSimpleDomainObject obj) {
		if(obj.getHint() != null && obj.getHint().contains("gwt=skip")) {
			return true;
		}

		// TODO: Cache this homehow
		for (DslGuiModule guiModule : guiApp.getModules()) {
			for (DslSkipDomainObject skipDO : guiModule.getSkipDomainObjects()) {
				// TODO: This isn't working when called from scope provider for some reason - "Cyclic resolution of lazy links"
				if(skipDO.getDo().getName().equals(obj.getName())) {
					return true;
				}
			}
			
		}
		
		return false;
	}
}
