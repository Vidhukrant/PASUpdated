package pasPages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;


public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver ldriver) {

		this.driver = ldriver; // Initialize the webdriver
	}

	/*
	 * String form1Inputs="//form//input"; String form1Buttons="//form//button";
	 */
	@FindBy(xpath="(//*[@id='dropdownMenuLink'])[2]") WebElement DropDown; 
	@FindBy(xpath="//a[text()='Royal Automobile Club of Victoria']") public WebElement RACV;
	@FindBy(xpath="//a[text()='Automobile Association of the Northern Territory']") public WebElement AANT;
	@FindBy(xpath="//a[text()='Royal Automobile Association of South Australia']") public WebElement RAA;
	@FindBy(xpath="//a[text()='The Royal Automobile Club of WA']") public WebElement RAC;
	@FindBy(xpath="//a[text()='Select AutoClub']/../a[4]") public static  WebElement RACQ;
	@FindBy(xpath="//a[text()='Select AutoClub']/../a[7]") public  WebElement W2C;
    

	@FindBy(xpath="(//a[@target='_blank'])[2]") WebElement GetQuote; 
	@FindBy(xpath="//table/tbody//tr/td[5]")
	WebElement checkStatus;
	@FindBy(xpath = "//table/tbody//tr/td[2]/a")
	WebElement searchedPolicy;
	@FindBy(xpath="(//*[@class='custom-control-label'])[2]")
	WebElement quoteSearch;
	@FindBy(xpath="//input[@placeholder='Quote Number']")
	WebElement quoteSearchBox;

	// Searched Policy Number Element locator
	@FindBy(xpath = "//input[@placeholder='Policy Number']")

	WebElement PolicySearchBox;
	@FindBy(id = "apply")

	WebElement SearchButton;
	@FindBy(xpath="//*[@for='Quotes']")WebElement clickQuote;
	@FindBy(xpath="//input[@placeholder='First Name']")WebElement fname;
	@FindBy(xpath="//input[@placeholder='Last Name']")WebElement lname;
	@FindBy(xpath="//button[@id='clear']")WebElement clear;
	@FindBy(xpath="//input[@placeholder='Quote Number']") WebElement searchQuote;

	// enter policy number and click Search button
	public void searchPolicy(String PolicyN) throws InterruptedException {
		/*
		 * Thread.sleep(10000); BrowserFactory.scrolldown(driver); //textbox lists
		 * List<WebElement> list=driver.findElements(By.xpath(form1Inputs));
		 * list.get(0).sendKeys("30500079"); //button lists List<WebElement>
		 * listButtons=driver.findElements(By.xpath(form1Buttons));
		 * listButtons.get(3).click();
		 */
		Thread.sleep(10000);
		BrowserFactory.scrolldown(driver);
		BrowserFactory.explicitWait(driver,PolicySearchBox);
		PolicySearchBox.sendKeys(PolicyN);
		SearchButton.click();
		Helper.waitForLoader(driver);
	}

	// After Search a row will be displayed and clicked on the policy number link
	
		public void clickSearchedPolicy() throws InterruptedException {

				BrowserFactory.scrolldown(driver);
				String Status=checkStatus.getText();
				if(Status.equalsIgnoreCase("Current")||(Status.equalsIgnoreCase("Active"))) {
					searchedPolicy.click();
					Helper.waitForLoader(driver);
					BrowserFactory.explicitWait(driver, PolicyDetailsPage.updatepolicybutton);
				}
				else {
					Assert.assertTrue(false, "Policy is not in active status so this test case would not be able to process");
				}

			} 
		 

	public void clickQuotePolicy() throws InterruptedException {
        Thread.sleep(2000);
             BrowserFactory.scrolldown(driver);
             searchedPolicy.click();
             Helper.waitForLoader(driver);
       }
       
	
	public  void selectDropDownQuote(WebElement portal) {
        BrowserFactory.waitFor(30);
        BrowserFactory.explicitWait(driver, DropDown);
        DropDown.click();
        BrowserFactory.waitFor(2);
        portal.click();
        BrowserFactory.waitFor(15);
        BrowserFactory.explicitWait(driver, GetQuote);
        GetQuote.click();
        BrowserFactory.waitFor(10);
        
        
  }


public void selectDropDownQuoteForResume() {
	
	BrowserFactory.waitFor(30);
	DropDown.click();
	BrowserFactory.waitFor(2);
	RACV.click();
	BrowserFactory.waitFor(10);
	
	
} 


	public void clickSearchButton() throws InterruptedException {
		Helper.waitForLoader(driver);
		Thread.sleep(10000);
		SearchButton.click();
	}
	public void enterFnameSearch(String val) throws InterruptedException {
		Helper.waitForLoader(driver);
		Thread.sleep(5000);
		fname.sendKeys(val);
		Thread.sleep(2000);
		SearchButton.click();
	}
	public void enterLnameSearch(String val) throws InterruptedException {
		Helper.waitForLoader(driver);
		Thread.sleep(6000);
		lname.sendKeys(val);
		Thread.sleep(2000);
		SearchButton.click();
	}
	public void clearAllField(String policy,String val,String val1) throws InterruptedException {
		Helper.waitForLoader(driver);
		Thread.sleep(6000);
		PolicySearchBox.sendKeys(policy);
		Thread.sleep(1000);
		fname.sendKeys(val);
		Thread.sleep(1000);
		lname.sendKeys(val1);
		Thread.sleep(1000);
		clear.click();
	}
	public void searchQuote(String PolicyN) throws InterruptedException {
		/*
		 * Thread.sleep(10000); BrowserFactory.scrolldown(driver); //textbox lists
		 * List<WebElement> list=driver.findElements(By.xpath(form1Inputs));
		 * list.get(0).sendKeys("30500079"); //button lists List<WebElement>
		 * listButtons=driver.findElements(By.xpath(form1Buttons));
		 * listButtons.get(3).click();
		 */
		Thread.sleep(12000);
		BrowserFactory.scrolldown(driver);
		quoteSearch.click();
		Thread.sleep(5000);
		quoteSearchBox.sendKeys(PolicyN);
		SearchButton.click();
		Helper.waitForLoader(driver);

	}


	public void quoteClick() throws InterruptedException {
		Helper.waitForLoader(driver);
		Thread.sleep(6000);
		clickQuote.click();
	}
	public void quoteFname(String val) throws InterruptedException {
		quoteClick();
		enterFnameSearch(val);
	}
	public void quoteLname(String val) throws InterruptedException {
		quoteClick();
		enterLnameSearch(val);
	}
	public void searchWithQuote(String val) throws InterruptedException {
		quoteClick();
		Helper.waitForLoader(driver);
		searchQuote.sendKeys(val);
		Thread.sleep(1000);
		SearchButton.click();
	}
	public void verifyingSearchBox() throws InterruptedException
	{
		Thread.sleep(10000);
		BrowserFactory.scrolldown(driver);
		BrowserFactory.explicitWait(driver,PolicySearchBox);
		Boolean flag=BrowserFactory.isElementPresent(driver, PolicySearchBox);
		if(flag==true)
		{
			assertTrue(true,"login successfully");
		}
		else
		{
			assertTrue(false,"login not successfull");
		}

	}
	// After Search a r







}
