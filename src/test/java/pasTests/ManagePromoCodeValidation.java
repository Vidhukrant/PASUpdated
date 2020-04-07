package pasTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RACVUtility.BrowserFactory;
import pasPages.LoginPage;
import pasPages.ManagePromoCodesPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;

public class ManagePromoCodeValidation extends BaseClass {

	PolicyDetailsPage policydetailspage; 
	ManagePromoCodesPage managePromoCode;
	LoginPage loginPage ;

	@BeforeClass
	public void prerequisitesssss() throws InterruptedException
	{
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		//paymentpage=PageFactory.initElements(driver, PolicyPaymentsPage.class);
		managePromoCode= PageFactory.initElements(driver, ManagePromoCodesPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		managePromoCode.clickManagePromoCodes();
		managePromoCode.clickSaveButton();
	}

	@Test(description="Validating error on ManagePromocode Page without giving code number")
	public void errPromoCode() throws InterruptedException {
		logger = report.createTest("Validate user is not able to add promo code without entering promo code number");
		//managePromoCode.verifyPromoCodeErrorMsg();
		managePromoCode.verifyText(driver,managePromoCode.errPromoCode,"Please enter a Promo code Number");
	}
	@Test(description="Validating error on ManagePromocode Page without giving code description")
	public void errPromoDescription() throws InterruptedException {
		logger = report.createTest("Validate user is not able to add promo code without entering promo code description");
	//	managePromoCode.verifyPromoDescriptionErrorMsg();
		managePromoCode.verifyText(driver,managePromoCode.errPromoDesc,"Promo Code Description is required");
	}

	@Test(description="Validate user is not able to add promo code without selecting auto club")
	public void errClub() throws InterruptedException {
		logger = report.createTest("Validate user is not able to add promo code without selecting auto club");
		managePromoCode.verifyClubErrorMsg();
		
	}

	@Test(description="Validate user is not able to add promo code without entering discount rate")
	public void errDiscountRate() throws InterruptedException {
		logger = report.createTest("Validate user is not able to add promo code without entering discount rate");
		//managePromoCode.verifyDiscountRateErrorMsg();
		managePromoCode.verifyText(driver,managePromoCode.errDiscountRate,"Please enter a Discount for the Promo code");
	}
	@Test(description="Validate user is not able to add promo code without entering effective/expiry date")
	public void errEffectiveDate() throws InterruptedException {
		logger = report.createTest("Validate user is not able to add promo code without entering effective/expiry date");
		//managePromoCode.verifyEffectiveDateErrorMsg();
		managePromoCode.verifyText(driver,managePromoCode.errExpDate,"Please select the Expiration Date the Promo code needs to be valid to");
	}
}

