package pasTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;

public class validatingTripDetails extends BaseClass
{
	PolicyDetailsPage policyDetailsPage;
	DashBoardPage DashBoardPage;
	@BeforeClass
	public void PreRequisite() throws InterruptedException 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		policyDetailsPage=PageFactory.initElements(driver, PolicyDetailsPage.class);

		DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		logger = report.createTest("Updating Trip Details and increasing to date by two months and doing payment by cash");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",2, 2));
		DashBoardPage.clickSearchedPolicy();
		policyDetailsPage.clickUpdatePolicybutton();
		policyDetailsPage.clicktripDetails();



	}
	
	@Test(description="Verifying Trip details error first is for Australia")
	public void tc1() throws InterruptedException 
	{
	
		policyDetailsPage.ChangeDestination(config.getDataFromConfig("DomesticDestination"));
	    policyDetailsPage.validatingDomesticError();
	}
	@Test(description="When putting Travel detination Romania")
	public void tc2() throws InterruptedException 
	{
	
		policyDetailsPage.ChangeDestination(config.getDataFromConfig("NotTravelDestination1"));
		policyDetailsPage.notTravelDetinationError(config.getDataFromConfig("NotTravelDestination1"));
	}
	@Test(description="When putting Travel detination Syria")
	public void tc3() throws InterruptedException 
	{
	
		policyDetailsPage.ChangeDestination(config.getDataFromConfig("NotTravelDestination2"));
		policyDetailsPage.notTravelDetinationError(config.getDataFromConfig("NotTravelDestination2"));
	}
	@Test(description="When putting Travel detination Burundi")
	public void tc4() throws InterruptedException 
	{
	
		policyDetailsPage.ChangeDestination(config.getDataFromConfig("NotTravelDestination3"));
		policyDetailsPage.notTravelDetinationError(config.getDataFromConfig("NotTravelDestination3"));
	}
	
	@Test(description="When putting Travel detination null")
	public void tc5() throws InterruptedException 
	{
	
		policyDetailsPage.validateCountryError();
	}
}
