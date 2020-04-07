package pasPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {

		this.driver = ldriver; // Initialize the webdriver

	}
	@FindBy(xpath="//*[@class='btn btn-sm btn-primary']")
	WebElement manageUser;

	@FindBy(xpath="//*[contains(text(),'User has been updated successfully  ...')]")
	WebElement editUserSuccessMessage;
	@FindBy(xpath="(//table/tbody//tr/td/a[@columntext='Edit'])[3]")
	WebElement editManageUser;
	@FindBy(xpath="//*[contains(text(),'Add a User')]")
	WebElement addAUser;
	@FindBy(xpath="//*[contains(text(),'Save Changes')]")
	WebElement addSaveChanges;
	@FindBy(xpath="//*[contains(text(),'added successfully')]")
	WebElement addUserSuccessMessage;
	@FindBy(xpath="//*[contains(text(),'An email with this user already exists in the current organization ...')]")
	WebElement addUserWarningMessage;

	@FindBy(xpath="//*[contains(text(),'Close')]")
	WebElement closeSuccessMessage;

	@FindBy(xpath="//*[contains(text(),'Email address is required')]")
	WebElement emailerrorMessage;

	@FindBy(xpath="//*[contains(text(),'First name is required')]")
	WebElement firstNameerrorMessage;

	@FindBy(xpath="//*[contains(text(),'Last name is required')]")
	WebElement lastNameerrorMessage;

	@FindBy(xpath="(//*[@id='inputState'])[1]")
	WebElement adduserSelectAutoClub;

	@FindBy(xpath="(//*[@id='inputState'])[2]")
	WebElement adduserSelectBranch;

	@FindBy(xpath="(//*[@id='inputState'])[3]")
	WebElement adduserSelectRole;

	@FindBy(id="Email")
	WebElement eMail;

	@FindBy(id="FirstName")
	WebElement eFirstName;

	@FindBy(id="LastName")
	WebElement eLastName;
	@FindBy(id = "okta-signin-username")
	@CacheLookup
	public WebElement uname;
	@FindBy(xpath = "//input[@id='okta-signin-password']")
	@CacheLookup
	WebElement pass;
	@FindBy(id = "okta-signin-submit")
	@CacheLookup
	WebElement signinbutton;
	String errorMsgs="//p";
	@FindBy(xpath="//option[contains(text(),'AutoClub')]/..")
	WebElement sautoClub;

	@FindBy(xpath="//option[contains(text(),'Select Branch')]/..")
	WebElement sbranch;

	@FindBy(xpath="//option[contains(text(),'Select Agent Name')]/..")
	WebElement srole;

	@FindBy(xpath="(//*[contains(text(),'Manage Users')])[2]")
	WebElement manageUserText;
	@FindBy(xpath="//*[contains(text(),'Cancel')]")
	public WebElement cancelButton;

	public void signintoApplication(String username, String password) throws InterruptedException {
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {

		}

		uname.sendKeys(username);
		pass.sendKeys(password);
		signinbutton.click();
		Thread.sleep(2000);

	}

	public void clickManageUsers(){

		BrowserFactory.explicitWait(driver, manageUser);
		manageUser.click();
	}

	public void manageUserPage()
	{
		BrowserFactory.explicitWait(driver, manageUserText);
		Assert.assertTrue(manageUserText.getText().equalsIgnoreCase("Manage Users"));
	}


	public void clickAddUser() throws InterruptedException
	{
		BrowserFactory.explicitWait(driver, addAUser);
		addAUser.click();
		Thread.sleep(2000);
		Helper.waitForLoader(driver);
	}

	public  String addUser(String autoclubtext,String branchtext,String roletext,String FName,String LName) throws InterruptedException
	{
		String email=null;
		BrowserFactory.explicitWait(driver, adduserSelectAutoClub);
		Select autoclubdropdown=new Select(adduserSelectAutoClub);

		if(autoclubtext.equalsIgnoreCase("World 2 Cover"))
		{
			autoclubdropdown.selectByVisibleText(autoclubtext);
			Thread.sleep(2000);
			boolean branch=adduserSelectBranch.isEnabled();
			if(branch==true)
			{
				Assert.assertTrue(false, "Some Drop down added for World 2 Cover");
			}
			else 
			{
				String autobranchtext=adduserSelectBranch.getText();
				Select roledropdown=new Select(adduserSelectRole);

				if(roletext.equalsIgnoreCase("TMMA Super Admin")){

					roledropdown.selectByVisibleText(roletext);
				}
				else if (roletext.equalsIgnoreCase("TMMA Agent"))
				{
					roledropdown.selectByVisibleText(roletext);
				}
				else if (roletext.equalsIgnoreCase("Read Only"))
				{
					roledropdown.selectByVisibleText(roletext);
				}
			}


		}
		else if(autoclubtext.matches("Royal Automobile Club of Victoria|Royal Automobile Association of South Australia|The Royal Automobile Club of WA|Royal Automobile Club of Queensland|Automobile Association of the Northern Territory"))
		{
			autoclubdropdown.selectByVisibleText(autoclubtext);
			Helper.waitForLoader(driver); 
			boolean branch=adduserSelectBranch.isEnabled();
			if(branch==true)
			{
				Select selbranch=new Select(adduserSelectBranch);
				selbranch.selectByIndex(1);;

				Select roledropdown=new Select(adduserSelectRole);

				if(roletext.equalsIgnoreCase("Club Agent"))
				{

					roledropdown.selectByVisibleText(roletext);
				}
				else if (roletext.equalsIgnoreCase("Club Super User"))
				{
					roledropdown.selectByVisibleText(roletext);
				}
				else if (roletext.equalsIgnoreCase("Read Only"))
				{
					roledropdown.selectByVisibleText(roletext);
				}
			}
			else
			{
				Assert.assertTrue(false, "Branch is not enabled for Royal Automobile Club of Victoria");
			}
		}
		BrowserFactory.explicitWait(driver, eMail);

		String em1= Helper.getAlphaNumericString(10);
		String emaillowercase=em1.toLowerCase();
		email= emaillowercase+"@gmail.com";

		eMail.sendKeys(email);
		Thread.sleep(2000);
		BrowserFactory.explicitWait(driver, eFirstName);
		eFirstName.sendKeys(FName);
		Thread.sleep(2000);
		BrowserFactory.explicitWait(driver, eLastName);
		eLastName.sendKeys(LName);
		Thread.sleep(2000);
		addSaveChanges.click();
		Thread.sleep(2000);
		Helper.waitForLoader(driver);
		Boolean flag=BrowserFactory.isElementEnabled(driver, addUserSuccessMessage);
		if(flag==true)
		{
			BrowserFactory.explicitWait(driver, addUserSuccessMessage);
			Boolean verifySaveChanges=BrowserFactory.isElementPresent(driver, addUserSuccessMessage);
			if(verifySaveChanges==true)
			{
				Assert.assertTrue(true,"User had been updated successfully");
				((JavascriptExecutor)driver).executeScript("arguments[0].click();",closeSuccessMessage);

			}
			else
			{
				Assert.assertTrue(false,"An email with this user already exists in the current organization ..."); 
				((JavascriptExecutor)driver).executeScript("arguments[0].click();",closeSuccessMessage);
			}
		}
		else
		{
			Assert.assertTrue(true);
			BrowserFactory.refresh(driver);
		}
		return email;
	}

	public void emailerrorMsg(String autoclubtext,String branchtext,String roletext) throws InterruptedException
	{
		BrowserFactory.explicitWait(driver, adduserSelectAutoClub);
		adduserSelectAutoClub.click();
		Select autoclubdropdown=new Select(adduserSelectAutoClub);
		autoclubdropdown.selectByVisibleText(autoclubtext);
		Helper.waitForLoader(driver); 
		Select selbranch=new Select(adduserSelectBranch);
		selbranch.selectByIndex(1);
		Select roledropdown=new Select(adduserSelectRole);
		roledropdown.selectByVisibleText(roletext);
		addSaveChanges.click();

		String emailerrorMsg= emailerrorMessage.getText();
		Assert.assertTrue(emailerrorMsg.equalsIgnoreCase("Email address is required"));

	}

	public void firstNameerrorMsg(String autoclubtext,String branchtext,String roletext) throws InterruptedException
	{


		String fstnameerrorMsg= firstNameerrorMessage.getText();
		Assert.assertTrue(fstnameerrorMsg.equalsIgnoreCase("First name is required"));

	}

	public void lastNameerrorMsg(String autoclubtext,String branchtext,String roletext) throws InterruptedException
	{


		String lastNameerrorMsg= lastNameerrorMessage.getText();
		Assert.assertTrue(lastNameerrorMsg.equalsIgnoreCase("Last name is required"));

	}

	public void searchBy(String opt1,String opt2) throws InterruptedException
	{
		BrowserFactory.explicitWait(driver, sautoClub);
		sautoClub.click();
		Select sel1=new Select(sautoClub);
		sel1.selectByVisibleText(opt1);
		Helper.waitForLoader(driver);
		BrowserFactory.explicitWait(driver, sbranch);
		Select sel2=new Select(sbranch);
		sel2.selectByIndex(1);
		Helper.waitForLoader(driver);

	}

	public void editManageUser(String email, String fName,String lName) throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath("//*[text()='"+email+"']/following::a[1]"));
		BrowserFactory.scrolltoElement(driver, ele);
		BrowserFactory.explicitWait(driver, ele);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",ele);
		//Select roledropdown=new Select(adduserSelectRole);
		//roledropdown.selectByVisibleText(roletext);
		eFirstName.clear();
		Thread.sleep(4000);
		eFirstName.sendKeys(fName);
		eLastName.clear();
		Thread.sleep(4000);
		eLastName.sendKeys(lName);
		addSaveChanges.click();
		boolean editUserVerify=BrowserFactory.isElementPresent(driver, editUserSuccessMessage);
		if(editUserVerify==true)
		{
			Assert.assertTrue(true,"User has been updated successfully  ...");
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",closeSuccessMessage);
		}
		else
		{
			Assert.assertTrue(false,"User was not able to edit the manage user");	
		}


	}

	public void errorwithoutCredentials()
	{
		List<WebElement> element=driver.findElements(By.xpath(errorMsgs));
		Assert.assertEquals(element.get(1).getText(),"Please enter a username");
		Assert.assertEquals(element.get(2).getText(),"Please enter a password");
	}

	public void errorWithoutPwd() throws InterruptedException
	{
		uname.sendKeys("test");
		Thread.sleep(2000);
		List<WebElement> element=driver.findElements(By.xpath(errorMsgs));
		Assert.assertEquals(element.get(1).getText(),"Please enter a password");
		Thread.sleep(2000);
		uname.clear();
	}

	public void errorWhileSignIn()
	{
		BrowserFactory.explicitWait(driver, driver.findElement(By.xpath(errorMsgs)));
		String message=	driver.findElement(By.xpath(errorMsgs)).getText();
		Assert.assertEquals(message, "Sign in failed!");
		uname.clear();
		pass.clear();

	}

}
