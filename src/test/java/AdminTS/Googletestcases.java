package AdminTS;

import base.BaseTest;
import base.ExtentTestManager;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.TestGroups;


/*
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
*/

public class Googletestcases extends BaseTest {
	
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Google Page navigation")
	public void navigateToGoogleTextBox()
	{
		ExtentTestManager.getTest().getTest().setName("Google navigation");
		LoginPage login=new LoginPage(driver);
		login.setText();
		
	}
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Open Gmail")
	public void navigateToGmail()
	{
		ExtentTestManager.getTest().getTest().setName("Gmail Navigation	");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setGmail();
		ExtentTestManager.getTest().getTest().setName("Gmail Opened");
		
	}
	@Test(groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Open Google images")
	public void navigateToGoogleImages()
	{
		ExtentTestManager.getTest().getTest().setName("Google Image Navigation	");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setImages();
		ExtentTestManager.getTest().getTest().setName("Images opened");
		
	}
}