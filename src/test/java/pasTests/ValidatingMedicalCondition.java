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

public class ValidatingMedicalCondition extends BaseClass {

	PolicySummaryPage summaryPage;
	PolicyPaymentsPage paymentpage;
	PolicyDetailsPage policyDeatilsPage;
	@BeforeMethod
	public void preRequisite() throws InterruptedException {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		 BrowserFactory.quitBrowser(driver,loginPage);
		policyDeatilsPage = PageFactory.initElements(driver,PolicyDetailsPage.class);
		paymentpage=PageFactory.initElements(driver,PolicyPaymentsPage.class);
		summaryPage=PageFactory.initElements(driver,PolicySummaryPage.class);
		
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		DashBoardPage DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber", 5, 1));
		DashBoardPage.clickSearchedPolicy();
		policyDeatilsPage.clickUpdatePolicybutton();
	}

	@Test(description="validating medical condition policy")	  
	public void tc1() throws InterruptedException  
	{
		logger = report.createTest("Validating medical conditions");
		policyDeatilsPage.medicalScenario(1, 1, "Diabetes");
		//policyDeatilsPage.clickNotes();
		policyDeatilsPage.clickComapreandContinueButton();
		summaryPage.validtingSummaryPage(policyDeatilsPage,paymentpage,config);
	}






} 

