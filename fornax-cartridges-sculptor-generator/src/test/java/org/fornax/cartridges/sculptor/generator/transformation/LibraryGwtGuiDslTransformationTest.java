package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.fornax.cartridges.sculptor.gwt.generator.util.GwtGenerationHelper;
import org.junit.Assert;
import org.junit.Test;

import sculptorguimetamodel.GuiDto;
import sculptorguimetamodel.GuiEnum;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.StubModule;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectOperation;
import sculptormetamodel.Parameter;
import sculptormetamodel.Reference;
import sculptormetamodel.Service;
import sculptormetamodel.ServiceOperation;

//@Ignore("Skip this test now, due to problems when running from maven")
@SuppressWarnings("unchecked")
public class LibraryGwtGuiDslTransformationTest extends GuiDslTransformationBaseTest {
	
	

//	private static File TEMP = new File("target/temp-xpandoutput");


    @Test
    public void assertApplication() {
    	assertNotNull(guiApp);
        assertEquals("LibraryWeb", guiApp.getName());
    }


    @Test
    public void assertMediaModule() {
    	GuiModule mediaModule = mediaModule();
    	
    	assertEquals("org.fornax.cartridges.sculptor.examples.library.mediaalt", mediaModule.getBasePackage());
    	
    	assertNotNull(mediaModule.getStubModule());
    	Assert.assertTrue(mediaModule.getStubModule() instanceof StubModule);
    	assertEquals("org.fornax.cartridges.sculptor.examples.library.mediaalt", mediaModule.getStubModule().getBasePackage());
    	Assert.assertSame(mediaModule.getStubModule().getStubFor(), mediaModule().getFor());
    	Assert.assertSame(mediaModule.getStubModule().getGuiModule(), mediaModule);
    }
    

    @Test
    public void assertSkippedDomainObject() {
    	assertNull(getNamedElement("GameMedia", mediaModule().getStubModule().getDomainObjects()));
  
    	// TODO: Put back once GuidslHelper.skip.. method is working
//    	assertNotNull(getNamedElement("GameMedia", mediaModule().getGuiDtoOptions()));
    }
    
    @Test
    public void assertPersonModule() {
    	GuiModule mod = personModule();
    	Assert.assertNotNull(mod);
    	
    	assertNotNull(mod.getStubModule());
    	
    	assertEquals(null, mod.getStubModule().getBasePackage());
    	
    	EList serviceProxies = mod.getStubModule().getServices();
    	assertEquals(1, serviceProxies.size());
    	
        assertOneAndOnlyOne(serviceProxies, "PersonService");
    	
    }
    


	

	

	@Test
	public void assertGetMapToDomainExpressionForDate() {
		Service svc = (Service)getNamedElement("PersonService", personModule().getFor().getServices());
		assertNotNull(svc);
		
		ServiceOperation op = (ServiceOperation)getNamedElement("findByDate", svc.getOperations());
		assertNotNull(op);
		
		Parameter param = (Parameter)getNamedElement("entryDate", op.getParameters());
		assertNotNull(param);
		
		String expr = GwtGenerationHelper.getMapToDomainExpression(param);
		assertEquals("org.fornax.cartridges.sculptor.framework.gwt.server.ConversionUtils.convertToDate(entryDate)", expr);
	}
	
	@Test
	public void assertGuiDtoMedia() {
		GuiDto media = (GuiDto)getNamedElement("Media", mediaModule().getStubModule().getDomainObjects());
		assertNotNull(media);
		assertEquals(3, media.getAttributes().size());
		
		Assert.assertTrue(media.isAbstract());
		
		Attribute titleAttr = getAttribute(media, "title");
		assertEquals("title", titleAttr.getName());
		assertEquals("String", titleAttr.getType());
		assertEquals(false, titleAttr.isChangeable());
		
		assertNotNull(media.getModule());
		assertEquals("org.fornax.cartridges.sculptor.examples.library.mediaalt", media.getModule().getBasePackage());
		
		Attribute idAttr = getAttribute(media, "id");
		assertNotNull(idAttr);
		assertEquals("id", idAttr.getName());
		assertEquals("IDTYPE", idAttr.getType());
		assertEquals(false, idAttr.isChangeable());
		
		// Make sure the "for" domain object has the same id attribute type
		Attribute idForAttr = getAttribute(media.getFor(), "id");
		assertEquals("IDTYPE", idForAttr.getType());
		
		// Verify 'version' attribute
		Attribute versionAttr = getAttribute(media, "version");
		assertNotNull(versionAttr);
	}
	
	@Test
	public void assertDomainObjectOperation() {
		GuiDto media = (GuiDto)getNamedElement("Media", mediaModule().getStubModule().getDomainObjects());

		assertEquals(3, media.getOperations().size());
		
		DomainObjectOperation getDisplayTitleOp = (DomainObjectOperation)media.getOperations().get(0);
		assertEquals("getDisplayTitle", getDisplayTitleOp.getName());
		assertEquals("String", getDisplayTitleOp.getType());
		
		DomainObjectOperation assignPhysicalMediaOp = (DomainObjectOperation)media.getOperations().get(1);
		assertEquals("assignPhysicalMedia", assignPhysicalMediaOp.getName());
		assertEquals("void", assignPhysicalMediaOp.getType());
		assertEquals(1, assignPhysicalMediaOp.getParameters().size());
		Parameter param1 = (Parameter)assignPhysicalMediaOp.getParameters().get(0);
		assertNotNull(param1);
		assertEquals("PhysicalMedia", param1.getDomainObjectType().getName());
		Assert.assertTrue(param1.getDomainObjectType() instanceof GuiDto);
		// assignPhysicalMedia
		
		DomainObjectOperation getTopPhysicalMediaOp = (DomainObjectOperation)media.getOperations().get(2);
		assertEquals("getTopPhysicalMedia", getTopPhysicalMediaOp.getName());
		assertEquals(0, getTopPhysicalMediaOp.getParameters().size());
		assertNull(getTopPhysicalMediaOp.getType());
		assertEquals("PhysicalMedia", getTopPhysicalMediaOp.getDomainObjectType().getName());
		Assert.assertTrue(getTopPhysicalMediaOp.getDomainObjectType() instanceof GuiDto);

	}
	
	@Test
	public void assertManyBiReference() {
		GuiDto media = (GuiDto)getNamedElement("Media", mediaModule().getStubModule().getDomainObjects());

		Reference physicalMediaRef = (Reference)getNamedElement("physicalMedia", media.getReferences());
		assertNotNull(physicalMediaRef);
		
		Assert.assertSame(media, physicalMediaRef.getFrom());
		DomainObject to = physicalMediaRef.getTo();
		assertNotNull(to);
		Assert.assertTrue(to instanceof GuiDto);
		assertEquals("Set", physicalMediaRef.getCollectionType());
		Assert.assertTrue(physicalMediaRef.isMany());
		
		Reference backRef = (Reference)getNamedElement("media", to.getReferences());
		Assert.assertSame(physicalMediaRef.getOpposite(), backRef);
	}
	
	@Test
	public void assertBasicTypeReference() {
		GuiDto ssn = (GuiDto)getNamedElement("Ssn", personModule().getStubModule().getDomainObjects());
		assertNotNull(ssn);
		assertEquals("person", ssn.getGuiModule().getName());
		assertNotNull(ssn.getFor());
		assertEquals("Ssn", ssn.getFor().getName());
		
		GuiDto person = (GuiDto)getNamedElement("Person", personModule().getStubModule().getDomainObjects());
		assertNotNull(person);
		
		Reference ssnRef = (Reference)getNamedElement("ssn", person.getReferences());
		assertNotNull(ssnRef);
		Assert.assertSame(ssnRef.getTo(), ssn);
	}
	
	@Test
	public void assertSkippedReference() {
		GuiDto person = (GuiDto)getNamedElement("Person", personModule().getStubModule().getDomainObjects());
		Reference nameRef = (Reference)getNamedElement("name", person.getReferences());
		assertNull(nameRef);
	}
	
	@Test
	public void assertSkippedBackReference() {
		GuiDto person = (GuiDto)getNamedElement("PhysicalMedia", mediaModule().getStubModule().getDomainObjects());
		Reference nameRef = (Reference)getNamedElement("library", person.getReferences());
		assertNull(nameRef);		
	}
	
	
	@Test
	public void assertEntity() {
		GuiDto person = (GuiDto)getNamedElement("Person", personModule().getStubModule().getDomainObjects());
		assertNotNull(person);
		
		assertNotNull(person.getFor());
		assertEquals("Person", person.getFor().getName());
		assertNotNull(person.getGuiModule());
		
		Reference ssnAttr = getReference(person, "ssn");
		assertNotNull(ssnAttr);
		Assert.assertTrue(ssnAttr.isNaturalKey());
	}
	
	@Test
	public void assertExtends() {
		GuiDto book = (GuiDto)getNamedElement("Book", mediaModule().getStubModule().getDomainObjects());
		assertNotNull(book);
		GuiDto media = (GuiDto)book.getExtends();
		assertNotNull(media);
		assertEquals("Media", media.getName());
		
	}
	
	@Test
	public void assertGuiEnum() {
		GuiEnum country = (GuiEnum)getNamedElement("Country", personModule().getStubModule().getDomainObjects());
		assertNotNull(country);
		
		assertEquals("Country", country.getName());
		
		assertNotNull(country.getGuiModule());
		
		assertEquals(3, country.getValues().size());
		
		assertNotNull(country.getFor());
	}
	
	@Test
	public void assertEngagementValueObject() {
		GuiDto engagement = (GuiDto)getNamedElement("Engagement", mediaModule().getStubModule().getDomainObjects());
		assertNotNull(engagement);
		Attribute attr2 = (Attribute)engagement.getAttributes().get(1);
		assertEquals("role", attr2.getName());
		Assert.assertFalse(attr2.isChangeable());
	}
	
	@Test
	public void assertCommentValueObject() {
		GuiDto comment = (GuiDto)getNamedElement("Comment", mediaModule().getStubModule().getDomainObjects());
		assertNotNull(comment);
		Attribute attr2 = (Attribute)comment.getAttributes().get(1);
		assertEquals("text", attr2.getName());
		Assert.assertTrue(attr2.isChangeable());
	}
	
	
//	protected String getFileText(String filePath) {
//		File f = new File(
//				TEMP, filePath);
//		return getFileText(f);		
//	}

	protected String getFileText(File textFile) {
		try {
			StringBuffer sb = new StringBuffer();
			BufferedReader in = new BufferedReader(new FileReader(textFile));
			String str;
			while ((str = in.readLine()) != null) {
				sb.append(str);
			}
			in.close();
			return sb.toString();
		} catch (IOException e) {
		}
		return null;
	}

	
	
	protected void assertMatchesRegexp(String text, String regexp) {
		Pattern p = Pattern.compile(regexp, Pattern.MULTILINE);
		Assert.assertTrue("Text did not contain pattern \"" + regexp  + "\"", p.matcher(text).find());		
	}

	protected void assertContains(String text, String subStr) {
		Assert.assertTrue("Text did not contain substring \"" + subStr  + "\"", text.contains(subStr));		
	}

	protected void assertNotContains(String text, String subStr) {
		Assert.assertFalse("Text contained substring \"" + subStr  + "\"", text.contains(subStr));		
	}



}
