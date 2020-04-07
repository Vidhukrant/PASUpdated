package pasTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class ValidateDependent extends BaseClass
{
	PolicyPaymentsPage paymentpage;
	PolicyDetailsPage policydetailspage; 
	DashBoardPage DashBoardPage ;
	LoginPage loginPage;


	@BeforeMethod
	public void prerequisite() throws InterruptedException
	{

		loginPage = PageFactory.initElements(driver, LoginPage.class);
		paymentpage=PageFactory.initElements(driver, PolicyPaymentsPage.class);
		DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		policydetailspage = PageFactory.initElements(driver, PolicyDetailsPage.class);              

		BrowserFactory.quitBrowser(driver,loginPage);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber", 0, 1));
		DashBoardPage.clickSearchedPolicy();

		policydetailspage.clickUpdatePolicybutton();

	}
	@Test(description="Validating delelet dependent")
	public void tc3() throws InterruptedException {
		logger = report.createTest("Validating delete dependent functionality with respective to issue Endorsement");     
		// enter traveler data
		policydetailspage.deleteDependent();



	}

	@Test(description="Validating dependent errror message")
	public void tc4() throws InterruptedException {
		logger = report.createTest("Validating Add dependent functionality with respective error msg");            
		// enter traveler data
		// PolicyDetailsPage PolicyDeatilsPage = PageFactory.initElements(driver,PolicyDetailsPage.class);
		policydetailspage.validateAddDependent();
	}

	@Test(description="Validating dependent,Verifying User able add dependent")
	public void tc1() throws InterruptedException {
		logger = report.createTest("Validating Add dependent functionality with respective to summary page");             


		// enter traveler data
		policydetailspage.addDependent();
		policydetailspage.clickComapreandContinueButton();       
		PolicySummaryPage summaryPage=PageFactory.initElements(driver,PolicySummaryPage.class);
		summaryPage.validtingSummaryPage(policydetailspage,paymentpage,config);

	}
	@Test(description="Validating dependent by modifying values and going till summary page")
	public void tc2() throws InterruptedException {

		logger = report.createTest("Validating modifying dependent functionality with respective to issue Endorsement");     



		// enter traveler data
		policydetailspage.changesinDependent();
		// PolicyDetailsPage PolicyDeatilsPage = PageFactory.initElements(driver,PolicyDetailsPage.class);
		//policydetailspage.clickNotes();
		policydetailspage.clickComapreandContinueButton();       
		PolicySummaryPage summaryPage=PageFactory.initElements(driver,PolicySummaryPage.class);
		summaryPage.validtingSummaryPage(policydetailspage,paymentpage,config);

	}



}
