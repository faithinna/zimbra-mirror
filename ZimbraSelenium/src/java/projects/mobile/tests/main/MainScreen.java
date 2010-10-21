package projects.mobile.tests.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.testng.annotations.Test;

import projects.mobile.tests.CommonTest;
import projects.mobile.ui.PageMain;
import framework.util.HarnessException;
import framework.util.ZAssert;

public class MainScreen extends CommonTest {
	
	public MainScreen() {
		logger.info("New "+ MainScreen.class.getCanonicalName());
		
		// All tests start at the login page
		super.startingPage = app.zPageMain;
		super.startingAccount = null;
		
	}
	
	@Test(	description = "Verify basic elements on the Main Screen",
			groups = { "sanity" })
	public void MainScreen_01() throws HarnessException {
				
		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.appbarMail),		"Verify that the appbar Mail icon is present");
		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.appbarContact),	"Verify that the appbar Contact icon is present");
		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.appbarCal),		"Verify that the appbar Cal icon is present");
		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.appbarDocs),		"Verify that the appbar Docs icon is present");
		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.appbarSearch),	"Verify that the appbar Search icon is present");
		
		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.compose),		"Verify that the New Compose link is present");

		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.preferences),	"Verify that the Preferences link is present");

	}

	@Test(	description = "Verify Copyright on the Main Screen",
			groups = { "smoke" })
	public void MainScreen_02() throws HarnessException {
				
		// The copyright doesn't seem to be translated
		String copyright = "Copyright � 2008-2010 Zimbra, Inc.";
		
		ZAssert.assertTrue(app.zPageMain.isElementPresent(PageMain.mainCopyright),	"Verify that the copyright notice is present");
		
		String text = app.zPageMain.getText(PageMain.mainCopyright);
		ZAssert.assertEquals(text, copyright, "Verify the copyright text is correct");
		
		Calendar calendar = new GregorianCalendar();
		String thisYear = "" + calendar.get(Calendar.YEAR);

		ZAssert.assertStringContains(text, thisYear, "Verify the copyright text is correct");

	}


}
