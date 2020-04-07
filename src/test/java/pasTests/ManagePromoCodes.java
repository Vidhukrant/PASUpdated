package pasTests;

import org.testng.annotations.Test;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import com.aventstack.extentreports.MediaEntityBuilder;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.ManagePromoCodesPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class ManagePromoCodes extends BaseClass {
	PolicyPaymentsPage paymentpage;
	PolicyDetailsPage policydetailspage; 
	ManagePromoCodesPage managePromoCode;
	LoginPage loginPage ;



	@BeforeMethod
	public void prerequisites() throws InterruptedException
	{


		loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		paymentpage=PageFactory.initElements(driver, PolicyPaymentsPage.class);
		managePromoCode= PageFactory.initElements(driver, ManagePromoCodesPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		managePromoCode.clickManagePromoCodes();


	}

	@Test(description="Creating Promo Code on Manage Promo Code Page")
	public void tc1() throws InterruptedException {
		logger = report.createTest("Creating Promo Code on Manage Promo Code Page");	
		managePromoCode.enterPromoCode();
		managePromoCode.sendDescriptioon();
		managePromoCode.selectClub(0);
		managePromoCode.sendDiscountRate();
		managePromoCode.sendEffectiveDate();
		managePromoCode.clickSaveButton();
		managePromoCode.validateMessage();
		managePromoCode.clickClose();

		// enter traveler data
	}

	@Test(description="Validating created code using search functionality and deleting the same code")
	public void tc2() throws InterruptedException
	{
		logger = report.createTest("Validating created code using search functionality and deleting the same code");	
		managePromoCode.searchPromoCode();
		managePromoCode.validateSearchedTable();
		managePromoCode.deleteSearchedPromo();

	}

	@Test(description="Validating deleted code should not be searched")
	public void tc3() throws InterruptedException
	{
		logger = report.createTest("Validating deleted code should not be searched");	
		managePromoCode.searchPromoCode();
		managePromoCode.validatenoRows();



	}


}
