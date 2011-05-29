package org.fornax.cartridges.sculptor.generator.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sculptorguimetamodel.CreateTask;
import sculptorguimetamodel.DerivedReferenceViewProperty;
import sculptorguimetamodel.GuiApplication;
import sculptorguimetamodel.GuiAttribute;
import sculptorguimetamodel.GuiEvent;
import sculptorguimetamodel.GuiModule;
import sculptorguimetamodel.InputTextWidget;
import sculptorguimetamodel.ListTask;
import sculptorguimetamodel.ReferenceViewProperty;
import sculptorguimetamodel.TableColumn;
import sculptorguimetamodel.TableWidget;
import sculptorguimetamodel.UpdateTask;
import sculptorguimetamodel.UserTask;
import sculptorguimetamodel.View;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Module;
import sculptormetamodel.Service;
import sculptormetamodel.ServiceOperation;

//@Ignore("Skip this test now, due to problems when running from maven")
@SuppressWarnings("unchecked")
public class LibraryGwtGuiDslTransformationTest extends TransformationTestBase {
    private static final boolean VALIDATE_SERVICE_OPERATION = true;
    private static final boolean DONT_VALIDATE_SERVICE_OPERATION = false;
    private static GuiApplication guiApp;

    @BeforeClass
    public static void before() throws Exception {
        System.setProperty("project.nature", "business-tier, rcp");
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
        guiApp = (GuiApplication) ctx.get("guiModel");
    }

    @AfterClass
    public static void after() {
        System.getProperties().remove("project.nature");
    }

    @Test
    public void assertApplication() {
        assertEquals("LibraryWeb", guiApp.getName());
    }


    @Test
    public void assertTableView() {
    	View tableView = (View) getNamedElement("TableView", personModule().getViews());
    	assertNotNull(tableView);
    	
        EList widgets = tableView.getWidgets();
        TableWidget table = (TableWidget)widgets.get(0);    	
    	assertEquals("My Table", table.getLabel());
    	
    	DomainObject person = table.getFor();
    	assertNotNull(person);
    	assertEquals("Person", person.getName());
    	
    	EList tableCols = table.getColumns();
    	assertNotNull(tableCols);
        assertOneAndOnlyOne(tableCols, "name");
        
        TableColumn nameCol = (TableColumn)tableCols.get(0);
        assertNotNull(nameCol);
        
        assertEquals("Text", nameCol.getColumnType());
    	
    }

    @Test
    public void assertReviewFormView() {
        View personForm = (View) getNamedElement("PersonForm", personModule().getViews());
        assertNotNull(personForm);
        
        DomainObject forObj = personForm.getFor();
        assertNotNull(forObj);
        assertEquals("Person", forObj.getName());
        
        assertEquals(1, personForm.getServiceDependencies().size());
        assertOneAndOnlyOne(personForm.getServiceDependencies(), "PersonService");
        Service svc = (Service)personForm.getServiceDependencies().get(0);
        
        EList widgets = personForm.getWidgets();
        assertEquals(4, widgets.size());
        assertOneAndOnlyOne(widgets, "nameField", "table1", "saveButton", "info1");
        InputTextWidget nameField = (InputTextWidget)widgets.get(0);
        assertEquals("Name", nameField.getLabel());
           
    }

    @Test
    public void assertMyEvent1() {
    	GuiEvent event = (GuiEvent) getNamedElement("MyEvent1", personModule().getEvents());
    	assertNotNull(event);
    	assertEquals("MyEvent1", event.getName());
    	assertEquals("This is some MyEvent1 documentation", event.getDoc());
    	
    	assertEquals(2, event.getAttributes().size());
    	GuiAttribute attr1 = (GuiAttribute) getNamedElement("attr1", event.getAttributes());
    	assertNotNull(attr1);
    	assertEquals("attr1", attr1.getName());
    	assertNull(attr1.getDoc());
    	assertEquals("String", attr1.getType());
    	
    }

//    @Test
//    public void assertMediaReferenceForUpdatePhyicalMedia() {
//        assertMediaReferenceForCreateUpdatePhysicalMedia((UpdateTask) getNamedElement("updatePhysicalMedia",
//                mediaModule().getUserTasks()));
//    }

    private void assertMediaReferenceForCreateUpdatePhysicalMedia(UserTask task) {
        // not possible to use assertReferenceViewProperty for media reference,
        // since there are derived reference props

        ReferenceViewProperty mediaRefProp = namedReferenceViewProperty("media", task.getViewProperties());
        assertEquals("Media", mediaRefProp.getTarget().getName());
        assertEquals("media", mediaRefProp.getReference().getName());
        assertOneAndOnlyOne(mediaRefProp.getPreviewProperties(), "isbn", "title", "urlIMDB", "playLength", "category");

        List<ReferenceViewProperty> mediaProps = elementsOfType(ReferenceViewProperty.class,
                namedElements("media", task.getViewProperties()));
        assertEquals(3, mediaProps.size());
        List<DerivedReferenceViewProperty> mediaDerivedRefProps = elementsOfType(DerivedReferenceViewProperty.class,
                mediaProps);
        assertEquals(2, mediaDerivedRefProps.size());

        for (DerivedReferenceViewProperty each : mediaDerivedRefProps) {
            if ("Book".equals(each.getTarget().getName())) {
                assertEquals("Media", each.getDerivedFrom().getTarget().getName());
                assertEquals("media", each.getReference().getName());
                assertAttributeViewProperty("isbn", each.getPreviewProperties());
                assertAttributeViewProperty("title", each.getPreviewProperties());
                assertReferenceViewProperty("media", each, new String[] { "createBookSubtask", "viewBookSubtask",
                        "updateBookSubtask", "addBookSubtask" }, new String[] { "isbn", "title" }, "Book");
            } else if ("Movie".equals(each.getTarget().getName())) {
                assertEquals("Media", each.getDerivedFrom().getTarget().getName());
                assertEquals("media", each.getReference().getName());
                assertAttributeViewProperty("urlIMDB", each.getPreviewProperties());
                assertAttributeViewProperty("title", each.getPreviewProperties());
                assertAttributeViewProperty("playLength", each.getPreviewProperties());
                assertReferenceViewProperty("media", each, new String[] { "createMovieSubtask", "viewMovieSubtask",
                        "updateMovieSubtask", "addMovieSubtask" }, new String[] { "urlIMDB", "title", "playLength",
                        "category" }, "Movie");
            } else {
                assertTrue("Unexpected DerivedReferenceViewProperty for media: " + each.getTarget().getName(), false);
            }
        }
    }

//    @Test
//    public void assertViewPhysicalMedia() {
//        ViewTask task = (ViewTask) getNamedElement("viewPhysicalMedia", mediaModule().getUserTasks());
//        assertAttributeViewProperty("status", task.getViewProperties());
//        assertAttributeViewProperty("location", task.getViewProperties());
//
//        assertReferenceViewProperty("library", task.getViewProperties(), new String[] { "viewLibrarySubtask" },
//                new String[] { "name" }, "Library");
//
//        assertOneAndOnlyOne(task.getSubTaskTransitions(), "viewLibrarySubtask", "viewMovieSubtask", "viewBookSubtask");
//
//    }
//
//    @Test
//    public void assertListPhysicalMedia() {
//        assertListTask("PhysicalMedia", "media", "status", "location");
//    }
//
//    @Test
//    public void assertViewMovie() {
//        ViewTask task = (ViewTask) getNamedElement("viewMovie", mediaModule().getUserTasks());
//
//        assertOneAndOnlyOne(task.getViewProperties(), "urlIMDB", "playLength", "category", "title", "physicalMedia",
//                "engagements", "mediaCharacters");
//        assertAttributeViewProperty("urlIMDB", task.getViewProperties());
//        assertAttributeViewProperty("playLength", task.getViewProperties());
//        assertAttributeViewProperty("title", task.getViewProperties());
//
//        assertEnumViewProperty("category", task.getViewProperties());
//
//        assertOneAndOnlyOne(task.getSubTaskTransitions(), "viewPhysicalMediaSubtask", "viewEngagementSubtask",
//                "viewMediaCharacterSubtask");
//
//        assertReferenceViewProperty("physicalMedia", task.getViewProperties(),
//                new String[] { "viewPhysicalMediaSubtask" }, new String[] { "status", "location" }, "PhysicalMedia");
//        assertReferenceViewProperty("engagements", task.getViewProperties(), new String[] { "viewEngagementSubtask" },
//                new String[] { "role" }, "Engagement");
//        assertReferenceViewProperty("mediaCharacters", task.getViewProperties(),
//                new String[] { "viewMediaCharacterSubtask" }, new String[] { "name" }, "MediaCharacter");
//    }

//    @Test
//    public void assertCreateBook() {
//        assertCreateTask("Book", "media", new String[] { "isbn", "title" }, new String[] { "viewPhysicalMediaSubtask",
//                "addPhysicalMediaSubtask", "viewEngagementSubtask", "createEngagementSubtask",
//                "createMediaCharacterSubtask", "viewMediaCharacterSubtask", "addMediaCharacterSubtask" },
//                DONT_VALIDATE_SERVICE_OPERATION);
//
//        CreateTask task = (CreateTask) getNamedElement("createBook", mediaModule().getUserTasks());
//
//        assertReferenceViewProperty("physicalMedia", task.getViewProperties(), new String[] {
//                "viewPhysicalMediaSubtask", "addPhysicalMediaSubtask" }, new String[] { "status", "location" },
//                "PhysicalMedia");
//        assertReferenceViewProperty("engagements", task.getViewProperties(), new String[] { "viewEngagementSubtask",
//                "createEngagementSubtask", }, new String[] { "role" }, "Engagement");
//
//        assertNull(task.getPopulateDOWith());
//    }
//
//    @Test
//    public void assertCreateMovie() {
//        assertCreateTask("Movie", "media", new String[] { "urlIMDB", "title" }, new String[] {
//                "viewPhysicalMediaSubtask", "addPhysicalMediaSubtask", "viewEngagementSubtask",
//                "createEngagementSubtask", "createMediaCharacterSubtask", "viewMediaCharacterSubtask",
//                "addMediaCharacterSubtask" }, DONT_VALIDATE_SERVICE_OPERATION);
//
//        CreateTask task = (CreateTask) getNamedElement("createMovie", mediaModule().getUserTasks());
//
//        assertReferenceViewProperty("physicalMedia", task.getViewProperties(), new String[] {
//                "viewPhysicalMediaSubtask", "addPhysicalMediaSubtask" }, new String[] { "status", "location" },
//                "PhysicalMedia");
//        assertReferenceViewProperty("engagements", task.getViewProperties(), new String[] { "viewEngagementSubtask",
//                "createEngagementSubtask" }, new String[] { "role" }, "Engagement");
//    }
//
//
//    @Test
//    public void assertMediaReferenceForCreateEngagement() {
//        UserTask task = (UserTask) getNamedElement("createEngagement", mediaModule().getUserTasks());
//        ReferenceViewProperty mediaRefProp = namedReferenceViewProperty("media", task.getViewProperties());
//        assertEquals("Media", mediaRefProp.getTarget().getName());
//        assertEquals("media", mediaRefProp.getReference().getName());
//        assertOneAndOnlyOne(mediaRefProp.getPreviewProperties(), "isbn", "title", "urlIMDB", "playLength", "category");
//
//        List<ReferenceViewProperty> mediaProps = elementsOfType(ReferenceViewProperty.class,
//                namedElements("media", task.getViewProperties()));
//        assertEquals(3, mediaProps.size());
//        List<DerivedReferenceViewProperty> mediaDerivedRefProps = elementsOfType(DerivedReferenceViewProperty.class,
//                mediaProps);
//        assertEquals(2, mediaDerivedRefProps.size());
//
//        for (DerivedReferenceViewProperty each : mediaDerivedRefProps) {
//            if ("Book".equals(each.getTarget().getName())) {
//                assertReferenceViewProperty("media", each, new String[] { "viewBookSubtask", "addBookSubtask" },
//                        new String[] { "isbn", "title" }, "Book");
//            } else if ("Movie".equals(each.getTarget().getName())) {
//                assertReferenceViewProperty("media", each, new String[] { "viewMovieSubtask", "addMovieSubtask" },
//                        new String[] { "urlIMDB", "title", "playLength", "category" }, "Movie");
//            } else {
//                assertTrue("Unexpected DerivedReferenceViewProperty for media: " + each.getTarget().getName(), false);
//            }
//        }
//    }

//    @Test
//    public void assertViewEngagement() {
//        ViewTask task = (ViewTask) getNamedElement("viewEngagement", mediaModule().getUserTasks());
//        assertAttributeViewProperty("role", task.getViewProperties());
//
//        assertOneAndOnlyOne(task.getSubTaskTransitions(), "viewPersonSubtask", "viewMovieSubtask", "viewBookSubtask");
//
//        assertReferenceViewProperty("person", task.getViewProperties(), new String[] { "viewPersonSubtask" },
//                new String[] { "ssnNumber", "ssnCountry", "nameFirst", "nameLast", "sex", "birthDate" }, "Person");
//
//    }
//
//    @Test
//    public void assertPersonModule() {
//        GuiModule module = personModule();
//        assertOneAndOnlyOne(module.getUserTasks(), "viewPerson", "createPerson", "updatePerson", "deletePerson",
//                "listPerson", "addPerson");
//    }


    private GuiModule mediaModule() {
        return (GuiModule) getNamedElement("media", guiApp.getModules());
    }

    private GuiModule personModule() {
        return (GuiModule) getNamedElement("person", guiApp.getModules());
    }

    private void assertListTask(String domainObjectName, String moduleName, String... attributeNames) {
        ListTask task = (ListTask) getNamedElement("list" + domainObjectName,
                ((GuiModule) getNamedElement(moduleName, guiApp.getModules())).getUserTasks());

        assertEquals("list" + domainObjectName, task.getName());
        assertEquals("list", task.getTaskType());
        assertEquals(domainObjectName, task.getFor().getName());

        assertEquals("findAll", task.getSearchDOWith().getName());
        assertEquals(domainObjectName + "Service", task.getSearchDOWith().getService().getName());
        Module businessModule = (Module) getNamedElement(moduleName, task.getModule().getApplication()
                .getGuiForApplication().getModules());
        Service service = (Service) getNamedElement(domainObjectName + "Service", businessModule.getServices());
        assertSame(service, task.getSearchDOWith().getService());
        ServiceOperation operation = (ServiceOperation) getNamedElement("findAll", service.getOperations());
        assertSame(operation, task.getSearchDOWith());
        assertOneAndOnlyOne(task.getViewProperties(), attributeNames);
        for (String attribute : attributeNames) {
            assertAttributeViewProperty(attribute, task.getViewProperties());
        }
        assertEquals(3, task.getSubTaskTransitions().size());
        assertOneAndOnlyOne(task.getSubTaskTransitions(), "view subtask", "update subtask", "delete subtask");

    }

    private void assertCreateTask(String domainObjectName, String moduleName, String[] attributeNames,
            String[] subtaskNames, boolean assertServiceOperation) {
        CreateTask task = (CreateTask) getNamedElement("create" + domainObjectName,
                ((GuiModule) getNamedElement(moduleName, guiApp.getModules())).getUserTasks());
        assertEquals("create" + domainObjectName, task.getName());
        assertEquals("create", task.getTaskType());
        assertEquals(domainObjectName, task.getFor().getName());

        if (assertServiceOperation) {
            assertEquals("save", task.getCreateDOWith().getName());
            assertEquals(domainObjectName + "Service", task.getCreateDOWith().getService().getName());
            Module businessModule = (Module) getNamedElement(moduleName, task.getModule().getApplication()
                    .getGuiForApplication().getModules());
            Service service = (Service) getNamedElement(domainObjectName + "Service", businessModule.getServices());
            assertSame(service, task.getCreateDOWith().getService());
            ServiceOperation operation = (ServiceOperation) getNamedElement("save", service.getOperations());
            assertSame(operation, task.getCreateDOWith());
        }
        for (String attributeName : attributeNames) {
            assertAttributeViewProperty(attributeName, task.getViewProperties());
        }

        assertOneAndOnlyOne(task.getSubTaskTransitions(), subtaskNames);

    }

    private void assertUpdateTask(String domainObjectName, String moduleName, String[] attributeNames,
            String[] subtaskNames) {
        UpdateTask task = (UpdateTask) getNamedElement("update" + domainObjectName,
                ((GuiModule) getNamedElement(moduleName, guiApp.getModules())).getUserTasks());
        assertEquals("update" + domainObjectName, task.getName());
        assertEquals("update", task.getTaskType());
        assertEquals(domainObjectName, task.getFor().getName());

        assertEquals("save", task.getUpdateDOWith().getName());
        assertEquals(domainObjectName + "Service", task.getUpdateDOWith().getService().getName());
        Module businessModule = (Module) getNamedElement(moduleName, task.getModule().getApplication()
                .getGuiForApplication().getModules());
        Service service = (Service) getNamedElement(domainObjectName + "Service", businessModule.getServices());
        assertSame(service, task.getUpdateDOWith().getService());
        ServiceOperation operation = (ServiceOperation) getNamedElement("save", service.getOperations());
        assertSame(operation, task.getUpdateDOWith());
        for (String attributeName : attributeNames) {
            assertAttributeViewProperty(attributeName, task.getViewProperties());
        }

        assertOneAndOnlyOne(task.getSubTaskTransitions(), subtaskNames);

    }

}
