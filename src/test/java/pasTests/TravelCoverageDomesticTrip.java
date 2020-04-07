package pasTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class TravelCoverageDomesticTrip extends BaseClass

{
	PolicySummaryPage saveChangesPage;
	PolicyDetailsPage policydeatilspage;
	PolicyPaymentsPage paymentpage;
	LoginPage loginPage;

	@BeforeClass
	public void preRequisite() throws InterruptedException {
		saveChangesPage=PageFactory.initElements(driver,PolicySummaryPage.class);
		policydeatilspage=PageFactory.initElements(driver, PolicyDetailsPage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		paymentpage=PageFactory.initElements(driver, PolicyPaymentsPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		DashBoardPage DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber", 13, 1));
		DashBoardPage.clickSearchedPolicy();
		policydeatilspage.clickUpdatePolicybutton();
	}

	@Test(description="Validating policy type for Domestic Trip")
	public void  tc1() throws InterruptedException

	{
		// enter traveler data
		logger = report.createTest("Validating policy type for Domestic Trip");
		policydeatilspage.validatepolicyType("Domestic");
	}



	@Test(description="Adding dependent for Domestic trip")
	public void  tc2() throws InterruptedException

	{
		// enter traveler data
		logger = report.createTest("Validating dependent for Domestic trip");
		policydeatilspage.addDependent();
		
	}

	@Test(description="Validating summary page for Domestic trip")
	public void tc3() throws InterruptedException
	{
		logger = report.createTest("Doing payment for Domestic trip");
		//policydeatilspage.clickNotes();
		policydeatilspage.clickComapreandContinueButton();
		saveChangesPage.validtingSummaryPage(policydeatilspage,paymentpage,config);
	}
}
