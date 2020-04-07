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

public class CancelPolicyValidation extends BaseClass {
	String expectedAmount;
	PolicySummaryPage summaryPage;

	@BeforeMethod
	public void preRequisite() throws InterruptedException {
	
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver, loginPage);
		summaryPage =PageFactory.initElements(driver, PolicySummaryPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		DashBoardPage DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber", 4, 1));
		DashBoardPage.clickSearchedPolicy();
	}

	@Test(description="Validating Cancel Button Functionality")
	public void validatingCancelPolicy() throws InterruptedException {
		
		logger = report.createTest("Validating Cancel Button Functionality");
		PolicyDetailsPage PolicyDeatilsPage = PageFactory.initElements(driver, PolicyDetailsPage.class); 
		//PolicyDeatilsPage.clickNotes();
		PolicyDeatilsPage.cancelPolicybutton("Insured Request","Yes",summaryPage);
		

	}
	
	

	
} 