package pasPages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.lang.management.ManagementPermission;
import java.util.List;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;

public class ManageBranchePage {

	WebDriver driver;
	static String  promoName=null;

	public ManageBranchePage(WebDriver ldriver) {

		this.driver = ldriver; // Initialize the webdriver

	}
	@FindBy(xpath = "//select")
	WebElement mainUIDropDown;
	@FindBy(xpath = "//a[text()='Manage Branches']")
	WebElement manageBranches;
	@FindBy(xpath = "//a[text()='Add a Branch']")
	WebElement addBranch;
	@FindBy(xpath = "//select[@formcontrolname='selectAutoClub']")
	WebElement dropDownClub;
	@FindBy(id = "OrgFullName")
	WebElement branchName;
	@FindBy(xpath = "//input[@placeholder='Branch Address']")
	WebElement branchAddress;
	@FindBy(xpath = "//a[contains(text(),'Save')]")
	WebElement saveButton;
	@FindBy(xpath = "//div[@*='invalid-feedback']/div")
	WebElement errors;
	@FindBy(xpath = "//Button[contains(text(),'Close')]")
	WebElement closeButton;
	@FindBy(xpath = "//div[contains(text(),'successfully')]")
	WebElement SuccessMessage;
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yes;

	//*[text()='jkol']/following::a[1]  edit
	//*[text()='jkol']/following::a[2] delete

	By firstAddress=By.xpath("//list-item[1]");
	String pageLink="//*[@class='page-link']";

	public void selectFromAutoClub() throws InterruptedException
	{
		Select select=new Select(dropDownClub);
		select.selectByVisibleText(" Royal Automobile Club of Victoria");
		Thread.sleep(2000);
	}
	public void selectFromManageBranches() throws InterruptedException
	{
		Select select=new Select(mainUIDropDown);
		select.selectByVisibleText(" Royal Automobile Club of Victoria");
		Helper.waitForLoader(driver);
	}

	public void clickManageBranches() throws InterruptedException
	{
		BrowserFactory.explicitWait(driver, manageBranches);
		manageBranches.click();
		Thread.sleep(2000);
	}

	public void validatePage()
	{
		BrowserFactory.explicitWait(driver, addBranch);
		Boolean flag=BrowserFactory.isElementPresent(driver,addBranch);
		if(flag==true)
		{assertTrue(true);
		}
		else
		{
			assertTrue(false,"no add branch drop down found on manage branch page");
		}
	}

	public void clickAddBranch() throws InterruptedException 
	{
		addBranch.click();
		Thread.sleep(2000);
	}
	public String inputValues() throws InterruptedException
	{
		String branchname;
		branchname=Helper.getRandomString(10);
		branchName.sendKeys(branchname);	
		branchAddress.sendKeys("1 f");
		Thread.sleep(2000);
		driver.findElement(firstAddress).click();
		Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(2000);
		BrowserFactory.explicitWait(driver,closeButton);
		return branchname;
	}

	public void validateSuccessMessage() throws InterruptedException
	{
		Assert.assertEquals(SuccessMessage.getText().trim(), "Branch has been added successfully ...");
		closeButton.click();
		Helper.waitForLoader(driver);
	}

	public void pageIgnation() throws InterruptedException
	{
		List<WebElement> ele=driver.findElements(By.xpath(pageLink));
		int length=ele.size();
		ele.get(length-1).click();
		Thread.sleep(2000);

	}

	public void validateBranchName(String name) throws InterruptedException
	{
		WebElement element=driver.findElement(By.xpath("//*[text()='"+name+"']"));
		BrowserFactory.scrolltoElement(driver, element);
		Thread.sleep(2000);
		Boolean flag=BrowserFactory.isElementPresent(driver, element);
		if(flag==true)
		{assertTrue(true);
		}
		else
		{
			assertTrue(false,"no  branch added");
		}

	}

	public void validateBranchAfterDelete(String name) throws InterruptedException
	{
		Boolean flag;
		try {
			driver.findElement(By.xpath("//*[text()='"+name+"']"));
			flag=true;
		}
		catch (Exception e) {
			flag=false;
		}
		
		if(flag==true)
		{
		assertFalse(true,"founded deleted branch");
		}


	}


	public String editBranchName(String name) throws InterruptedException
	{
		String newbranchname;
		driver.findElement(By.xpath("//*[text()='"+name+"']/following::a[1]")).click();
		newbranchname=Helper.getRandomString(7);
		branchName.clear();
		Thread.sleep(2000);
		branchName.sendKeys(newbranchname);	
		saveButton.click();
		return newbranchname;

	}
	public void validateupdateMessage() throws InterruptedException
	{
		Assert.assertEquals(SuccessMessage.getText().trim(), "Branch has been updated successfully ...");
		closeButton.click();
		Helper.waitForLoader(driver);
	}
	
	public void validatedeactivateMessage() throws InterruptedException
    {
           Assert.assertEquals(SuccessMessage.getText().trim(), "Branch has been deactivated successfully ...");
          closeButton.click();
          Helper.waitForLoader(driver);
    }


    public void deactivateBranchName(String name) throws InterruptedException
    {

    driver.findElement(By.xpath("//*[text()='"+name+"']/following::a[2]")).click();
          Thread.sleep(2000);
          yes.click();
          Thread.sleep(2000);

    }

public void validateBranchAfterDeactivate(String name) throws InterruptedException
    {
          Boolean flag;
          try {
                 driver.findElement(By.xpath("//*[text()='"+name+"']"));
                 assertTrue(true,"founded deativated branch");
          }
          catch (Exception e) {
                 flag=false;
                 assertTrue(false,"Branch name not found");
          }
          
          String text=driver.findElement(By.xpath("//*[text()='"+name+"']/following::a[2]")).getText();
        Assert.assertEquals(text, "Reactivate");


    }


	
}









