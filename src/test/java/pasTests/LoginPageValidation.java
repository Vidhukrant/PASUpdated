package pasTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicySummaryPage;

public class LoginPageValidation extends BaseClass
{
	LoginPage loginPage ;
	DashBoardPage dashPage;
	@BeforeClass(description="Veifying LoginPage")
	public void initialize() throws InterruptedException
	{
		
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		dashPage=PageFactory.initElements(driver, DashBoardPage.class);
	}

	@Test(description="Validating Login Button without credentials")
	public void tc1() throws InterruptedException
	{
		logger = report.createTest("Validating Login Button without credentials");
		loginPage.signintoApplication("", "");
		loginPage.errorwithoutCredentials();
	}


	@Test(description="Validating Login Button without pwd")
	public void tc2() throws InterruptedException
	{
		logger = report.createTest("Validating Login Button without pwd");
		loginPage.signintoApplication("", "");
		loginPage.errorWithoutPwd();
	}

	@Test(description="Validating Login Button with wrongCredentials")
	public void tc3() throws InterruptedException
	{
		logger = report.createTest("Validating Login Button with wrongCredentials");
		loginPage.signintoApplication("test","testing");
		loginPage.errorWhileSignIn();
	}
	
	@Test(description="Validating Login Button with valid credentials")
	public void tc4() throws InterruptedException
	{
		logger = report.createTest("Validating Login Button with valid credentials");
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		dashPage.verifyingSearchBox();
	}


}