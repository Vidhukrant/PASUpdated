package pasTests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;

public class VerifyLinks extends BaseClass
{
	String expectedAmount;
	PolicyDetailsPage detailPage;
	LoginPage loginPage ;
	DashBoardPage DashBoardPage;

	@BeforeClass(description="Logging In And verifying links on detail page")
	public void loginApp() throws InterruptedException {
		
		loginPage	= PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		detailPage=PageFactory.initElements(driver,PolicyDetailsPage.class);
		DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
	
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber", 6, 1));
		DashBoardPage.clickSearchedPolicy();
}



	@Test(description="Veifying Resend COI link")
	public void tc1()throws InterruptedException

	{
		
		logger = report.createTest("Verifying links on policy detail page-Resend COI");
		Assert.assertTrue(detailPage.resendLink(), "Resend COI Link is Enabled");
		detailPage.clickResendCOILink();
		//have to cover pds link close the tab and get to parent window.
	}
	
	@Test(description="Veifying View/Download COI link")
	public void tc2()throws InterruptedException
	{
		logger = report.createTest("Verifying links on policy detail page-View/Download COI");
		Assert.assertTrue(detailPage.ViewCOILink(), "View COI Link is Enabled");
		detailPage.clickviewCOILink();
	}
	
	@Test(description="Veifying View PDS")
	public void tc3()throws InterruptedException

	{
		
		logger = report.createTest("Verifying links on policy detail page-View PDS");
		//have to cover pds link close the tab and get to parent window.
		Assert.assertTrue(detailPage.ViewPDSlink(), "View PDF Link is Enabled");
		detailPage.clickviewPDSLink();

	}
	
	
	
	


}
