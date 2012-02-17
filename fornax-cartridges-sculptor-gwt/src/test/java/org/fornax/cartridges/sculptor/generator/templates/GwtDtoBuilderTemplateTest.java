package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Assert;
import org.junit.Test;

import sculptorguimetamodel.GuiDto;
import sculptormetamodel.DomainObject;

public class GwtDtoBuilderTemplateTest extends LibraryGwtTemplateBaseTest {

	@Test
	public void assertMediaDtoBuilder() throws IOException {
		DomainObject mediaObj = (DomainObject) getNamedElement("Media",
				mediaModule().getStubModule().getDomainObjects());
		
		XpandUnit.xpand("templates::gwt::GwtDtoBuilder::builder", mediaObj,
				new HashMap<String, Object>(), getXpandTempDir());

//		String builderCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/MediaBuilder.java");
//		Assert.assertNotNull(builderCode);
	}
}
