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



public class TravellerEndorsementValidation extends BaseClass{
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


	@Test(description="Validate errors on Traveller card when leaving fields blank")
	public void verifyAddressValidation() throws InterruptedException {
		logger=report.createTest("Validate that user is not able to save the quote when user leave address field as blank");
		policydeatilspage.clickUpdatePolicybutton();
		policydeatilspage.clickTravellerEditButton();     
		policydeatilspage.clearText(driver, policydeatilspage.address,policydeatilspage.saveChanges);
		policydeatilspage.verifyText(driver, policydeatilspage.addressValidation, "Please enter the Street Address.");
	}

	@Test(description="when subrb is blank verifying error")
	public void verifySubrbValidation() throws InterruptedException {
		logger=report.createTest("Validate that user is not able to save the quote when user leave subrb field as blank");
		//policydeatilspage.clickUpdatePolicybutton();
		//policydeatilspage.clickTravellerEditButton();     
		policydeatilspage.clearText(driver, policydeatilspage.subrb,policydeatilspage.saveChanges);
		policydeatilspage.verifyText(driver, policydeatilspage.subValidation, "Please enter the Suburb.");
	}
	@Test(description="when post code field is blank")
	public void verifyPostCodeValidation() throws InterruptedException {
		logger=report.createTest("Validate that user is not able to save the quote when user leave post code field as blank");
		//policydeatilspage.clickUpdatePolicybutton();
		//policydeatilspage.clickTravellerEditButton();     
		policydeatilspage.clearText(driver, policydeatilspage.pCode1,policydeatilspage.saveChanges);
		policydeatilspage.verifyText(driver, policydeatilspage.postValidation, "Please enter the Postal Code.");
	}


	@Test(description="when email address is blank verify error")
	public void verifyEmailAddressValidation() throws InterruptedException {
		logger=report.createTest("Validate that user is not able to save the quote when user leave email address field as blank");
		//policydeatilspage.clickUpdatePolicybutton();
		//policydeatilspage.clickTravellerEditButton();     
		policydeatilspage.clearText(driver, policydeatilspage.email1,policydeatilspage.saveChanges);
		policydeatilspage.verifyText(driver, policydeatilspage.emailValidation, "Please enter the email address.");
	}
	@Test(description="when confirm email address is blank verify error")
	public void verifyConEmailAddressValidation() throws InterruptedException {
		logger=report.createTest("Validate that user is not able to save the quote when user leave confirm email address field as blank");
		//policydeatilspage.clickUpdatePolicybutton();
		//policydeatilspage.clickTravellerEditButton();     
		policydeatilspage.clearText(driver, policydeatilspage.conEmail,policydeatilspage.saveChanges);
		policydeatilspage.verifyText(driver, policydeatilspage.conValidation, "Please enter the confirm email address.");
	}
	@Test(description="when phone number is blank verify error")
	public void verifyPhoneNumberValidation() throws InterruptedException {
		logger=report.createTest("Validate that user is not able to save the quote when user leave phone number field as blank");
		//policydeatilspage.clickUpdatePolicybutton();
		//policydeatilspage.clickTravellerEditButton();     
		policydeatilspage.clearText(driver, policydeatilspage.phone,policydeatilspage.saveChanges);
		policydeatilspage.verifyText(driver, policydeatilspage.phnValidation, "Phone Number is required");
	}
}


