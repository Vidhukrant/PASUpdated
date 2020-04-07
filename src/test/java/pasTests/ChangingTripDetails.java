package pasTests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class ChangingTripDetails extends BaseClass {
	String expectedAmount;
	PolicyDetailsPage policyDetailsPage;
	DashBoardPage DashBoardPage;

	@BeforeMethod
	public void PreRequisite() throws InterruptedException 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		policyDetailsPage=PageFactory.initElements(driver, PolicyDetailsPage.class);

		DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);



	}
	@Test(description="Updating Trip Details and increasing to date by two months and doing payment by cash")
	public void tc1() throws InterruptedException 
	{
		logger = report.createTest("Updating Trip Details and increasing to date by two months and doing payment by cash");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",2, 1));
		DashBoardPage.clickSearchedPolicy();



		policyDetailsPage.clickUpdatePolicybutton();
		policyDetailsPage.clickeditTripDetails(false,config.getDataFromConfig("Destination"));

		PolicyDetailsPage PolicyDeatilsPage = PageFactory.initElements(driver, PolicyDetailsPage.class);
		//PolicyDeatilsPage.clickNotes();
		PolicyDeatilsPage.clickComapreandContinueButton();
		PolicySummaryPage Summary = PageFactory.initElements(driver, PolicySummaryPage.class);
		Summary.VerfiySummaryPageContinuePayement();
		PolicyPaymentsPage SaveChangesPage = PageFactory.initElements(driver, PolicyPaymentsPage.class);
		expectedAmount = SaveChangesPage.clickPayementOption(1,config);
		policyDetailsPage.policyMovement(expectedAmount);

	}
	@Test(description="Updating Trip Details increasing To date by two months and doing payment Online anad Validating the same amount in detail page")
	public void tc2() throws InterruptedException
	{
		logger = report.createTest("Updating Trip Details increasing To date by two months and doing payment Online anad Validating the same amount in detail page");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",2, 2));
		DashBoardPage.clickSearchedPolicy();
		policyDetailsPage.clickUpdatePolicybutton();	
		policyDetailsPage.clickeditTripDetails(false,config.getDataFromConfig("Destination"));
		PolicyDetailsPage PolicyDeatilsPage = PageFactory.initElements(driver, PolicyDetailsPage.class);
		//PolicyDeatilsPage.clickNotes();
		PolicyDeatilsPage.clickComapreandContinueButton();
		PolicySummaryPage Summary = PageFactory.initElements(driver, PolicySummaryPage.class);
		Summary.VerfiySummaryPageContinuePayement();
		PolicyPaymentsPage SaveChangesPage = PageFactory.initElements(driver, PolicyPaymentsPage.class);
		expectedAmount = SaveChangesPage.clickPayementOption(2,config);
		policyDetailsPage.policyMovement(expectedAmount);
	}
	@Test(description="Updating Detination in Trip Details and increasing to date by two months and doing payment Online anad Validating the same amount in PolicyMovement")
	public void tc3() throws InterruptedException
	{
		logger = report.createTest("Updating Detinatioin in Trip Details and increasing to date by two months and doing payment Online anad Validating the same amount in PolicyMovemnet");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",2, 3));
		DashBoardPage.clickSearchedPolicy();
		policyDetailsPage.clickUpdatePolicybutton();	
		policyDetailsPage.clickeditTripDetails(true,config.getDataFromConfig("Destination"));
		PolicyDetailsPage PolicyDeatilsPage = PageFactory.initElements(driver, PolicyDetailsPage.class);
		//PolicyDeatilsPage.clickNotes();
		PolicyDeatilsPage.clickComapreandContinueButton();
		PolicySummaryPage Summary = PageFactory.initElements(driver, PolicySummaryPage.class);
		Summary.VerfiySummaryPageContinuePayement();
		PolicyPaymentsPage SaveChangesPage = PageFactory.initElements(driver, PolicyPaymentsPage.class);
		expectedAmount = SaveChangesPage.clickPayementOption(2,config);
		policyDetailsPage.policyMovement(expectedAmount);
	}
	

}
