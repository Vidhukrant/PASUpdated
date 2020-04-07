

package pasTests;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.aventstack.extentreports.MediaEntityBuilder;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class ChangingTravellerEndorsement extends BaseClass {
	String expectedAmount;
	LoginPage loginPage;
	DashBoardPage dashboardpage ;
	PolicyDetailsPage policydeatilspage ;
	PolicySummaryPage Summary;
	PolicyPaymentsPage paymentpage;
	@BeforeClass
	public void preRequisite() throws InterruptedException {
		loginPage=PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		
		dashboardpage=PageFactory.initElements(driver, DashBoardPage.class);
		policydeatilspage=PageFactory.initElements(driver, PolicyDetailsPage.class);
		Summary = PageFactory.initElements(driver, PolicySummaryPage.class);
		paymentpage = PageFactory.initElements(driver, PolicyPaymentsPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		dashboardpage.searchPolicy(excel.getStringData("PolicyNumber", 3, 1));
		dashboardpage.clickSearchedPolicy();
	}

	@Test(description="Validate user is able to change DOB for primary and secondry traveller")
	public void tc1() throws InterruptedException {
		logger = report.createTest("Validate user is able to change DOB for primary and secondry traveller");
		policydeatilspage.clickUpdatePolicybutton();
		policydeatilspage.clickTravellerEditButton();
		policydeatilspage.increaseDateByMonth(policydeatilspage.PriDob);
		policydeatilspage.increaseDateByMonth(policydeatilspage.secDOB);
		policydeatilspage.saveChange();
		//policydeatilspage.clickNotes();
		policydeatilspage.clickComapreandContinueButton();
		Summary.validtingSummaryPage(policydeatilspage,paymentpage,config);

	}

	
	@Test(description="Validate that user is able to add secondry traveller on policy if it is not present")
	public void tc2() throws InterruptedException {
		
		logger = report.createTest("Validate that user is able to add secondry traveller on policy");
		policydeatilspage.clickUpdatePolicybutton();
		policydeatilspage.clickTravellerEditButton();
		policydeatilspage.addSecondryTraveller();
		policydeatilspage.validateaddSecondryTraveller();
		policydeatilspage.saveChange();
		

	}
	@Test(description="After adding secondry traveller on policy doing payment")
	public void tc3() throws InterruptedException {
	logger = report.createTest("After adding secondry traveller on policy doing payment");
	//policydeatilspage.clickNotes();
	policydeatilspage.clickComapreandContinueButton();
	Summary.validtingSummaryPage(policydeatilspage,paymentpage,config);
	}

	@Test(description="Validate that user is able to modify first name,last name and DOB for primary traveller")
	public void tc4() throws InterruptedException {
		logger = report.createTest("Validate that user is able to modify first name,last name and DOB for primary traveller.");
		policydeatilspage.clickUpdatePolicybutton();
		policydeatilspage.clickTravellerEditButton();
		//policydeatilspage.addSecondryTraveller();
		policydeatilspage.updateTravellersDetails();
		//policydeatilspage.increaseDateByMonth(policydeatilspage.PriDob);
		policydeatilspage.saveChange();
		//policydeatilspage.clickNotes();
		policydeatilspage.clickComapreandContinueButton();
		Summary.validtingSummaryPage(policydeatilspage,paymentpage,config);
	}
	@Test(description="Validate user is able to delete traveller")
	public void tc5s() throws InterruptedException {
		logger = report.createTest("Validate user is able to delete traveller");
		policydeatilspage.clickUpdatePolicybutton();
		policydeatilspage.clickTravellerEditButton();
		policydeatilspage.clickDeleteTraveller();
		policydeatilspage.validateDeletedTraveller();
		policydeatilspage.saveChange();


	}
	@Test(description="Validate user is able to do issue endorsement after deleting traveller")
	public void tc6() throws InterruptedException
	{   
		logger = report.createTest("After deleting traveller is user able to initiate refund");
		//policydeatilspage.clickNotes();
		policydeatilspage.clickComapreandContinueButton();
		//Summary.validtingSummaryPage(policydeatilspage,paymentpage,config);

	}





}
