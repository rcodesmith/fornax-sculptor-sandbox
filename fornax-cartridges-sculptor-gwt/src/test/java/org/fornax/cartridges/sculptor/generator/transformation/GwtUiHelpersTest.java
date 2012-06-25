package org.fornax.cartridges.sculptor.generator.transformation;

import java.util.Arrays;

import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.fornax.cartridges.sculptor.generator.templates.LibraryGwtTemplateBaseTest;
import org.fornax.utilities.xtendtools.xunit.XtendUnit;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.GuiEvent;
import sculptorguimetamodel.InformationalTextWidget;
import sculptorguimetamodel.View;
import sculptorguimetamodel.impl.SculptorguimetamodelFactoryImpl;
import sculptormetamodel.impl.SculptormetamodelFactoryImpl;

public class GwtUiHelpersTest  extends LibraryGwtTemplateBaseTest { //extends LibraryGwtTemplateBaseTest

	private final static String EXTENSION = "extensions::gwt::gwtuihelpers";

	@BeforeClass
	public static void setUpClass() {
		SculptorguimetamodelFactoryImpl.init();
		XtendUnit.initXtend(new EmfMetaModel(SculptorguimetamodelFactoryImpl.getPackage()),
				new EmfMetaModel(SculptormetamodelFactoryImpl.getPackage()));
	}
	
	@Test
	public void assertTestoid() {
		String res = (String)XtendUnit.xtend(EXTENSION, "testoid", Arrays.asList());
		Assert.assertEquals("test", res);
		
	}

	@Test
	public void assertFqnGwtEventBaseClass() {
		GuiEvent myEvent1 = (GuiEvent)getNamedElement("MyEvent1", personModule().getEvents());
		
		
		String res = (String)XtendUnit.xtend(EXTENSION, "gwtEventsPackage", Arrays.asList(myEvent1));
		Assert.assertEquals("org.fornax.cartridges.sculptor.examples.library.person.gwt.client.event", res);
		
	}
	
	@Test
	public void assertPropertyPathExpression() {
		View personForm = (View)getNamedElement("PersonForm", personModule().getViews());
		InformationalTextWidget info1 = (InformationalTextWidget)getNamedElement("info1", personForm.getWidgets());
		
		String res = (String)XtendUnit.xtend(EXTENSION, "getSourceRefExpression", Arrays.asList(info1, personForm.getFor(),
				"object"));
		Assert.assertEquals("object.getSsn().getNumber()", res);
	}

}
