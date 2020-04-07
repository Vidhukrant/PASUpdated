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

public class TravelCoverageAnnualMultiTrip extends BaseClass

{
	PolicySummaryPage saveChangesPage;
	PolicyDetailsPage policydeatilspage;
	PolicyPaymentsPage paymentpage;

	@BeforeClass
	public void preRequisite() throws InterruptedException {
		saveChangesPage=PageFactory.initElements(driver,PolicySummaryPage.class);
		policydeatilspage=PageFactory.initElements(driver, PolicyDetailsPage.class);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		 BrowserFactory.quitBrowser(driver,loginPage);
		paymentpage=PageFactory.initElements(driver, PolicyPaymentsPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		DashBoardPage DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber", 12, 1));
		DashBoardPage.clickSearchedPolicy();
		policydeatilspage.clickUpdatePolicybutton();
	}
	
	@Test(description="Validating policy type for Annual Multi Trip")
	public void  tc1() throws InterruptedException

	{
		// enter traveler data
		logger = report.createTest("Validating policy type for Annual Multi Trip");
		policydeatilspage.validatepolicyType("Annual Multi-Trip");
	}
	
	

	@Test(description="Validating dependent for Annual multi trip")
	public void  tc2() throws InterruptedException

	{
		// enter traveler data
		logger = report.createTest("Validating dependent for Annual multi trip");
		policydeatilspage.addDependent();
	
	}
	
	@Test(description="Validating Summary page")
	public void tc3() throws InterruptedException
	{
		logger = report.createTest("Doing payment for Annual Multi trip");
		//policydeatilspage.clickNotes();
		policydeatilspage.clickComapreandContinueButton();
		//saveChangesPage.validtingSummaryPage(policydeatilspage,paymentpage,config);
	}
}
