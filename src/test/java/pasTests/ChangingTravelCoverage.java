package pasTests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class ChangingTravelCoverage extends BaseClass {
	PolicySummaryPage saveChangesPage;
	PolicyDetailsPage policydeatilspage;
	PolicyPaymentsPage paymentpage;

	@BeforeMethod
	public void preRequisite() throws InterruptedException {
		
		
       
		saveChangesPage=PageFactory.initElements(driver,PolicySummaryPage.class);
		policydeatilspage=PageFactory.initElements(driver, PolicyDetailsPage.class);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		 BrowserFactory.quitBrowser(driver,loginPage);
		paymentpage=PageFactory.initElements(driver, PolicyPaymentsPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		DashBoardPage DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);

		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber", 1, 1));
		DashBoardPage.clickSearchedPolicy();

		policydeatilspage.clickUpdatePolicybutton();
	}

	@Test(description="Validating Travel Coverage by changing covrage and initiating refund")
	public void  tc1() throws InterruptedException

	{
		// enter traveler data
		logger = report.createTest("Validating Travel Coverage by changing covrage and initiating refund");
		policydeatilspage.edittotaltravelCare();
		//can put change date button as well
		policydeatilspage.changeCurrentPlan();
		//policydeatilspage.clickNotes();
		policydeatilspage.clickComapreandContinueButton();
		saveChangesPage.validtingSummaryPage(policydeatilspage,paymentpage,config);
		
	}
	@Test(description="Validating Travel Coverage by changing covrage and doing payment in cash",dependsOnMethods = {"tc1"})
	public void  tc2() throws InterruptedException

	{
		
		logger = report.createTest("Validating Travel Coverage by changing covrage and doing payment in cash");
		// enter traveler data
		policydeatilspage.edittotaltravelCare();
		//can put change date button as well
		policydeatilspage.changeCurrentPlan();
		//policydeatilspage.clickNotes();
		policydeatilspage.clickComapreandContinueButton();
		saveChangesPage.validtingSummaryPage(policydeatilspage,paymentpage,config);

	}

} 





