package org.fornax.cartridges.sculptor.generator.templates;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import junit.framework.Assert;

import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.fornax.cartridges.sculptor.generator.transformation.TransformationTestBase;
import org.fornax.utilities.xtendtools.xunit.XpandUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import sculptorguimetamodel.GuiApplication;

public class TemplateTestBase extends TransformationTestBase {
	
	/**
	 * This is the directory where xpand output will be generated to
	 */
	private static File XPAND_OUTPUT_TEMP_DIR = new File(
			"target/temp-xpandoutput");

    protected static GuiApplication guiApp;

    @BeforeClass
    public static void before() throws Exception {
        initTemplateTestBase();
    }

    @AfterClass
    public static void after() {
        teardownTemplateTestBase();
    }

	protected static void initTemplateTestBase() throws Exception {
		System.setProperty("project.nature", "business-tier, rcp");
		System.setProperty("datetime.library", "joda");
        System.setProperty("gui.createDefaults", "false");
        System.setProperty("package.gwt", "gwt");
        System.setProperty("ui.custom.guidto", "True");
                
        initWorkflowContext("workflowguidsl-test-library-gwt.mwe");
        guiApp = (GuiApplication) ctx.get("guiModel");
        
		XPAND_OUTPUT_TEMP_DIR.mkdirs();
		
		XpandUnit.initXpand(new EmfRegistryMetaModel());
	}


	protected static void teardownTemplateTestBase() {
		System.getProperties().remove("project.nature");
		System.getProperties().remove("datetime.library");
		System.getProperties().remove("gui.createDefaults");
		System.getProperties().remove("package.gwt");
		System.getProperties().remove("ui.custom.guidto");
	}


	
	protected static File getXpandTempDir() {
		return XPAND_OUTPUT_TEMP_DIR;
	}

	protected static String getFileText(String filePath) throws IOException {
		File f = new File(XPAND_OUTPUT_TEMP_DIR, filePath);
		return getFileText(f);
	}

	protected void assertContains(String text, String subString) {
		Assert.assertTrue("text does not contain expected substring: "
				+ subString, text.contains(subString));
	}

	/**
	 * Assert that the given text contains the regular expression, using
	 * multiline matching
	 */
	protected void assertMatchesRegexp(String text, String regexp) {
		Pattern p = Pattern.compile(regexp, Pattern.MULTILINE);
		Assert.assertTrue("Text did not contain pattern \"" + regexp + "\"", p
				.matcher(text).find());
	}

	protected void assertContainsConsecutiveFragments(String text,
			String... fragments) {
		StringBuilder sb = new StringBuilder();

		for (String fragment : fragments) {
			sb.append("\\Q" + fragment + "\\E\\s*");
		}
		assertMatchesRegexp(text, sb.toString());
	}
	

	protected void assertNotContains(String text, String subStr) {
		Assert.assertFalse("Text contained substring \"" + subStr + "\"",
				text.contains(subStr));
	}

	protected static String getFileText(File textFile) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader in = new BufferedReader(new FileReader(textFile));
		String str;
		while ((str = in.readLine()) != null) {
			sb.append(str);
		}
		in.close();
		return sb.toString();
	}

}