package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiDto;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.ServiceProxyOperation;
import sculptormetamodel.Attribute;
import sculptormetamodel.DomainObject;
import sculptormetamodel.DomainObjectOperation;
import sculptormetamodel.Parameter;
import sculptormetamodel.Reference;

//@Ignore("Skip this test now, due to problems when running from maven")
@SuppressWarnings("unchecked")
public class LibraryGwtGuiDslTransformationTest extends GuiDslTransformationBaseTest {
	
	

//	private static File TEMP = new File("target/temp-xpandoutput");


    @Test
    public void assertApplication() {
    	assertNotNull(guiApp);
        assertEquals("LibraryWeb", guiApp.getName());
    }


//    @Test
//    public void assertTableView() {
//    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
//    	assertNotNull(tableView);
//    	
//        EList widgets = tableView.getWidgets();
//        TableWidget personTable = (TableWidget)widgets.get(0);    	
//    	assertEquals("Person Table", personTable.getLabel());
//    	
//    	DomainObject person = personTable.getFor();
//    	assertNotNull(person);
//    	assertEquals("Person", person.getName());
//    	
//    	EList tableCols = personTable.getColumns();
//    	assertNotNull(tableCols);
//        assertOneAndOnlyOne(tableCols, "name", "birthDate", "edit");
//        
//        TableColumn nameCol = (TableColumn)tableCols.get(0);
//        assertEquals("name", nameCol.getName());
//        assertEquals("Text", nameCol.getColumnType());
//        assertEquals(true, nameCol.isFilterable());
//        assertEquals(true, nameCol.isSortable());
//        //assertEquals("getDisplayName", nameCol.getForOp().getName());
//
//        TableColumn birthDateCol = (TableColumn)tableCols.get(1);
//        assertEquals("birthDate", birthDateCol.getName());
//        assertEquals("Date", birthDateCol.getColumnType());
//        assertEquals(false, birthDateCol.isFilterable());
//        assertEquals(false, birthDateCol.isSortable());
//        
//        //assertEquals("birthDate", birthDateCol.getForAttribute().getName());
//        
//        TableColumn editCol = (TableColumn)tableCols.get(2);
//        assertNotNull(editCol);
//        assertEquals("Button", editCol.getColumnType());
//        assertEquals(1, editCol.getBehaviorBindings().size());
//        assertEquals(false, editCol.isFilterable());
//        assertEquals(false, editCol.isSortable());
//
//        OnClickBinding onClick = (OnClickBinding)editCol.getBehaviorBindings().get(0);
//        assertEquals(1, onClick.getBehaviors().size());
//        PopulatePanelBehavior populatePanel = (PopulatePanelBehavior)onClick.getBehaviors().get(0);
//        assertEquals("personDetailsPanel", populatePanel.getPanel().getName());
//        
//        
//    }
//    
//    @Test
//    public void assertEmptyPersonDetailsPanel() {
//    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
//
//    	PanelWidget emptyPane = (PanelWidget) getNamedElement("personDetailsEmptyPanel", tableView.getWidgets());
//    	assertNotNull(emptyPane);
//    	assertEquals(0, emptyPane.getWidgets().size());
//    	assertEquals("this is an empty panel", emptyPane.getDoc());
//    }
//    
    @Test
    public void assertMediaModule() {
    	GuiModule mediaModule = mediaModule();
    	
    	assertEquals("org.fornax.cartridges.sculptor.examples.library.mediaalt", mediaModule.getBasePackage());
    }
    
//    @Test
//    public void assertMediaBrowseView() {
//    	GuiModule mediaBrowseModule = mediaModule();
//    	
//        View view = (View) getNamedElement("MediaBrowse", mediaBrowseModule.getViews());
//        assertNotNull(view);
//        
//        EList<Widget> widgets = view.getWidgets();
//        
//        assertEquals(3, widgets.size());
//        
//        TableWidget table = (TableWidget)widgets.get(0);    	
//    	assertEquals("Library Table", table.getLabel());
//    	
//    	DomainObject library = table.getFor();
//    	assertNotNull(library);
//    	assertEquals("Library", library.getName());
//    }
//
//    @Test
//    public void assertPersonModule() {
//    	GuiModule mod = personModule();
//    	Assert.assertNotNull(mod);
//    	
//    	EList serviceProxies = mod.getServiceProxies();
//    	assertEquals(1, serviceProxies.size());
//    	
//        assertOneAndOnlyOne(serviceProxies, "PersonService");
//    	
//    }
//    
//    @Test
//    public void assertMenuView() {
//        View menuView = (View) getNamedElement("Menu", mainModule().getViews());
//        assertNotNull(menuView);
//        
//        EList widgets = menuView.getWidgets();
//        assertEquals(2, widgets.size());
//        assertOneAndOnlyOne(widgets, "personLink", "mediaBrowseLink");
//        
//    	LinkWidget personLink = (LinkWidget)widgets.get(1);
//    	assertEquals("Person Form", personLink.getLabel());
//    	assertEquals("PersonForm", personLink.getToView().getName());
//    	
//    	LinkWidget mediaBrowseLink = (LinkWidget)widgets.get(0);
//    	assertEquals("Media Browse", mediaBrowseLink.getLabel());
//    	assertEquals("MediaBrowse", mediaBrowseLink.getToView().getName());
//
//    }
//    
//    @Test
//    public void assertPersonFormView() {
//        View personForm = (View) getNamedElement("PersonForm", personModule().getViews());
//        assertNotNull(personForm);
//        
//        DomainObject forObj = personForm.getFor();
//        assertNotNull(forObj);
//        assertEquals("Person", forObj.getName());
//        
//        assertEquals(2, personForm.getParameters().size());
//
//        ViewParameter commandParam = (ViewParameter) personForm.getParameters().get(0);
//        assertNotNull(commandParam);
//        assertEquals("String", commandParam.getType());
//        assertEquals(Boolean.FALSE, commandParam.isNullable());
//
//        ViewParameter idParam = (ViewParameter) personForm.getParameters().get(1);
//        assertNotNull(idParam);
//        assertEquals("Integer", idParam.getType());
//        assertEquals(Boolean.TRUE, idParam.isNullable());
//        
//        
//        
////        assertEquals(1, personForm.getServiceProxies().size());
////        assertOneAndOnlyOne(personForm.getServiceProxies(), "PersonService");
////        Service svc = (Service)personForm.getServiceProxies().get(0);
//        
//        EList widgets = personForm.getWidgets();
//        assertEquals(7, widgets.size());
//        assertOneAndOnlyOne(widgets, "nameField", "birthDateField", "table1", "saveButton", "info1", "fullName", "textArea1"); //"autocomp1"
//        
//        InputTextWidget nameField = (InputTextWidget)widgets.get(0);
//        assertEquals("Name", nameField.getLabel());
//        //assertNotNull(nameField.getForReference());
////        assertEquals("name", nameField.getForReference().getName());
//
//        InputTextWidget birthDateField = (InputTextWidget)widgets.get(1);
//        assertEquals("Birth Date", birthDateField.getLabel());
//        //assertNotNull(birthDateField.getForAttribute());
//        //assertEquals("birthDate", birthDateField.getForAttribute().getName());
//
//        
//        InformationalTextWidget fullName = (InformationalTextWidget)widgets.get(5);
//        assertEquals("Full name", fullName.getLabel());
////        assertNotNull(fullName.getForOp());
////        assertEquals("getDisplayName", fullName.getForOp().getName());
//
//        
//        
//        // getDisplayName
//
////        assertNotNull(nameField.getForProperty());
////        ViewAttributeReference nameRef = (ViewAttributeReference)nameField.getForProperty();
////        nameRef.getAttribute();
//        
//        
////        AutocompleteWidget autoComp = (AutocompleteWidget)widgets.get(5);
////        assertEquals("Auto complete one", autoComp.getLabel());
//
//    }
//
//
//	
//	
//	@Test
//	public void assertCreatePersonCommand() {
//		EList cmds = personModule().getCommands();
//		assertEquals(2, cmds.size());
//		
//		GuiCommand cmd = (GuiCommand)getNamedElement("CreatePersonCmd", cmds);
//		assertNotNull(cmd);
//		assertEquals("CreatePersonCmd", cmd.getName());
//		
//		GuiCommand ext = (GuiCommand)cmd.getExtends();
//		assertNotNull(ext);
//		assertEquals("PersonCmd", ext.getName());
//		assertNull(cmd.getExtendsName());
//		
//		
//		EList attrs = cmd.getAttributes();
//		assertEquals(1, attrs.size());
//		
//		Attribute birthDate = (Attribute)getNamedElement("birthDate", attrs);
//		assertNotNull(birthDate);
//		assertEquals("birthDate", birthDate.getName());
//		
//		
//		assertEquals(0, cmd.getReferences().size());
//		
//		
//	}
//	
//	@Test
//	public void assertPersonCmd() {
//		GuiCommand cmd = (GuiCommand)getNamedElement("PersonCmd", personModule().getCommands());
//		assertNotNull(cmd);
//		assertEquals("PersonCmd", cmd.getName());
//
//		EList refs = cmd.getReferences();
//		assertEquals(1, refs.size());
//		
//		Reference ssn = (Reference)getNamedElement("ssn", refs);
//		assertNotNull(ssn);
//		assertEquals("ssn", ssn.getName());
//		assertSame(cmd, ssn.getFrom());
//		
//		DomainObject ssnDto = ssn.getTo();
//		assertNotNull(ssnDto);
//		System.out.println("SSN DTO: " + ssnDto);
//		
//		// Right now, SSN object still belongs to module
////		assertNull(ssnDto.getModule());
//
//	}
//	
//	
//
//	@Test
//	public void assertGetMapToDomainExpressionForDate() {
//		Service svc = (Service)getNamedElement("PersonService", personModule().getFor().getServices());
//		assertNotNull(svc);
//		
//		ServiceOperation op = (ServiceOperation)getNamedElement("findByDate", svc.getOperations());
//		assertNotNull(op);
//		
//		Parameter param = (Parameter)getNamedElement("entryDate", op.getParameters());
//		assertNotNull(param);
//		
//		String expr = GwtGenerationHelper.getMapToDomainExpression(param);
//		assertEquals("org.fornax.cartridges.sculptor.framework.gwt.server.ConversionUtils.convertToDate(entryDate)", expr);
//	}
//	
//	@Test
//	public void assertBehaviors() {
//		assertEquals(1, personModule().getBehaviors().size());
//		
//        assertOneAndOnlyOne(personModule().getBehaviors(), "populatePersonDetailsPanel");
//
//	}
//	
//	@Test
//	public void assertPopulatePersonDetailsBehavior() {
//		PopulatePanelBehavior populatePersonDetailsPanel = (PopulatePanelBehavior)getNamedElement("populatePersonDetailsPanel", personModule().getBehaviors());
//		assertNotNull(populatePersonDetailsPanel);
//		
//		assertEquals("Populate the person details panel", populatePersonDetailsPanel.getDoc());
//		assertEquals("personDetailsPanel", populatePersonDetailsPanel.getPanel().getName());
//		
//	}
//	
//	
	@Test
	public void assertGuiDtoMedia() {
		GuiDto media = (GuiDto)getNamedElement("Media", mediaModule().getDtos());
		assertNotNull(media);
		assertEquals(1, media.getAttributes().size());
		
		Assert.assertTrue(media.isAbstract());
		
		Attribute titleAttr = (Attribute)media.getAttributes().get(0);
		assertEquals("title", titleAttr.getName());
		assertEquals("String", titleAttr.getType());
		assertEquals(false, titleAttr.isChangeable());
		
	}
	
	@Test
	public void assertDomainObjectOperation() {
		GuiDto media = (GuiDto)getNamedElement("Media", mediaModule().getDtos());

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
		GuiDto media = (GuiDto)getNamedElement("Media", mediaModule().getDtos());

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
