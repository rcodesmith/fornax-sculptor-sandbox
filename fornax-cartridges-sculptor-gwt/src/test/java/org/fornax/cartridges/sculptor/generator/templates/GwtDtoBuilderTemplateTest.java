package org.fornax.cartridges.sculptor.generator.templates;

import java.io.IOException;
import java.util.HashMap;

import junit.framework.Assert;

import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.Test;

import sculptormetamodel.DomainObject;

public class GwtDtoBuilderTemplateTest extends LibraryGwtTemplateBaseTest {

	@Test
	public void assertMediaDtoBuilder() throws IOException {
		DomainObject mediaObj = (DomainObject) getNamedElement("Media",
				mediaModule().getStubModule().getDomainObjects());
		
		XpandUnit.xpand("templates::gwt::GwtDtoBuilder::builder", mediaObj,
				new HashMap<String, Object>(), getXpandTempDir());

		String builderCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/MediaBuilder.java");
		Assert.assertNotNull(builderCode);
	}

	@Test
	public void assertBookDtoBuilder() throws IOException {
		DomainObject bookObj = (DomainObject) getNamedElement("Book",
				mediaModule().getStubModule().getDomainObjects());
		
		XpandUnit.xpand("templates::gwt::GwtDtoBuilder::builder", bookObj,
				new HashMap<String, Object>(), getXpandTempDir());

		String builderCode = getFileText("org/fornax/cartridges/sculptor/examples/library/mediaalt/gwt/shared/domain/BookBuilder.java");
		Assert.assertNotNull(builderCode);
		
		assertContains(builderCode, "private String title;");
		assertContains(builderCode, "private String isbn;");
	}

	@Test
	public void assertPersonDtoBuilder() throws IOException {
		DomainObject personObj = (DomainObject) getNamedElement("Person",
				personModule().getStubModule().getDomainObjects());
		
		XpandUnit.xpand("templates::gwt::GwtDtoBuilder::builder", personObj,
				new HashMap<String, Object>(), getXpandTempDir());

		String builderCode = getFileText("org/fornax/cartridges/sculptor/examples/library/person/gwt/shared/domain/PersonBuilder.java");
		Assert.assertNotNull(builderCode);
		Assert.assertFalse(builderCode.contains("name"));
	}

}
