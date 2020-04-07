package pasTests;




import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;

public class ValidateDashboard extends BaseClass
{

	LoginPage loginPage;
	DashBoardPage dashboardpage ;

	@BeforeClass
	public void preRequisite() throws InterruptedException {


		loginPage=PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		dashboardpage=PageFactory.initElements(driver, DashBoardPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
	}

	@Test(description="Validating search button on dashboard")
	public void searchWithoutAnyData() throws InterruptedException {
		logger = report.createTest("Validate that user is not able to search policy without entering any data");
		dashboardpage.clickSearchButton();
	} 
	@Test(description="Without firstName")
	public void searchWithFname() throws InterruptedException {
		logger = report.createTest("Validate that user is not able to search policy with first name");
		dashboardpage.enterFnameSearch(config.getDataFromConfig("Fname"));
	}
	@Test(description="without lastName")
	public void searchWithLname() throws InterruptedException {
		logger = report.createTest("Validate that user is not able to search policy with last name");
		dashboardpage.enterLnameSearch(config.getDataFromConfig("Lname"));
	}
	@Test(description="Validating clear button functionality")
	public void clearAllField() throws InterruptedException {
		logger = report.createTest("Validate that user is able to clear all search field");
		dashboardpage.clearAllField(config.getDataFromConfig("Policy"),config.getDataFromConfig("Fname"),config.getDataFromConfig("Lname"));
	}
	@Test(description="Searching quote with first name")
	public void searchQuoteWithFname() throws InterruptedException {
		logger = report.createTest("Validate that user is able to search quote with first name.");
		dashboardpage.quoteFname(config.getDataFromConfig("Fname"));
	}
	@Test(description="Searching quote with Last name")
	public void searchQuoteWithLname() throws InterruptedException {
		logger = report.createTest("Validate that user is able to search quote with last name.");
		dashboardpage.quoteLname(config.getDataFromConfig("Lname"));
	}
	@Test(description="Searching quote quote number")
	public void searchQuoteWithQuote() throws InterruptedException {
		logger = report.createTest("Validate that user is able to search quote with quote number");
		dashboardpage.searchWithQuote(config.getDataFromConfig("Policy"));
	}


}
