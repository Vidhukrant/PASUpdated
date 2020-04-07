package pasTests;



import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;

public class ManageUser extends BaseClass
{
	String expectedAmount;
	PolicyDetailsPage detailPage;
	LoginPage loginPage ;
	DashBoardPage DashBoardPage;
	String email;

	@BeforeClass
	public void loginApp() throws InterruptedException {

		loginPage	= PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		detailPage=PageFactory.initElements(driver,PolicyDetailsPage.class);
		DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

	}

	@Test(description="Verifying Manage User page")
	public void tc1()throws InterruptedException

	{

		logger = report.createTest("Verify whether the user is able to navigate to Manage Users Page");
		loginPage.clickManageUsers();
		loginPage.manageUserPage();
	}

	@Test(description="Verify whether the user is able to Add new user.")
	public void tc2()throws InterruptedException

	{

		logger = report.createTest("Verify whether the user is able to Add new user.");
		loginPage.clickAddUser();
		email=loginPage.addUser(config.getDataFromConfig("Autoclub"),config.getDataFromConfig("Branch"),config.getDataFromConfig("Role"),config.getDataFromConfig("Fname"),config.getDataFromConfig("Lname"));

	}
	
	@Test(description="Verify error message if we leave Email Field Blank")
	public void tc3()throws InterruptedException

	{

		logger = report.createTest("Verify whether the system shows error message if we leave Email Field Blank");
		loginPage.clickAddUser();
		loginPage.emailerrorMsg(config.getDataFromConfig("Autoclub"),config.getDataFromConfig("Branch"),config.getDataFromConfig("Role"));
	}
	@Test(description="Verify error message if we leave FirstName Field Blank")
	public void tc4()throws InterruptedException

	{
		logger = report.createTest("Verify whether the system shows error message if we leave First Name Field Blank");
		loginPage.firstNameerrorMsg(config.getDataFromConfig("Autoclub"),config.getDataFromConfig("Branch"),config.getDataFromConfig("Role"));
	}
	@Test(description="Verify error message if we leave LastName Field Blank")
	public void tc5()throws InterruptedException

	{
		logger = report.createTest("Verify whether the system shows error message if we leave Last Name Field Blank");
		loginPage.lastNameerrorMsg(config.getDataFromConfig("Autoclub"),config.getDataFromConfig("Branch"),config.getDataFromConfig("Role"));
		loginPage.cancelButton.click();
		BrowserFactory.waitFor(2);
	}
	@Test(description="Verify whether the user is able to edit the manage user")
	public void tc6()throws InterruptedException

	{
		logger = report.createTest("Verify whether the user is able to edit the manage user");
		loginPage.searchBy(config.getDataFromConfig("Autoclub"),config.getDataFromConfig("Branch"));
		loginPage.editManageUser(email,config.getDataFromConfig("Fname"),config.getDataFromConfig("Lname"));		
	}





}

