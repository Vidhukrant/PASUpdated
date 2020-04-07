package pasPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import RACVUtility.BrowserFactory;
import RACVUtility.ConfigDataProvider;
import RACVUtility.Helper;

public class PolicyPaymentsPage {

	WebDriver driver;
	

	public PolicyPaymentsPage(WebDriver ldriver) {

		this.driver = ldriver; // Initialize the webdriver

	}

	
	@FindBy(xpath="//*[contains(text(),'Continue to Payment')]")WebElement continueToPayment; 
	@FindBy(xpath = "//h1")WebElement amount;
	@FindBy(xpath = "//select[@formcontrolname='PaymentType']")WebElement paymentType;
	@FindBy(xpath = "//button[text()='Continue']")WebElement continueButton;
	@FindBy(xpath = "//input[@placeholder='Payment Transaction Number']|//input[@placeholder='Payment Receipt']")WebElement reciptNumber;
	@FindBy(xpath = "//input[@placeholder='Payment Transaction Number']/following::button[1]|//input[@placeholder='Payment Receipt']/following::button[1]")WebElement submitPayemnt;
	@FindBy(xpath="//button[contains(text(),'Close')]") WebElement closeSuccess;
	@FindBy(xpath="//button[contains(text(),'Ok')]") WebElement oK;
	
	// xpath for payment Summary page details

		@FindBy(xpath = "//input[@id='braintree__card-view-input__cardholder-name']")
		WebElement CName;
		@FindBy(xpath = "//input[@id='credit-card-number']")
		WebElement CCNumber;
		@FindBy(xpath = "//*[@id='expiration']")
		WebElement ExpDate;
		@FindBy(xpath = "//*[@id='cvv']")
		WebElement CVV;
		@FindBy(xpath = "//button[contains(text(),'Confirm and Pay')]")
		WebElement CnfPay;

	// Select from drop down cash/online
		//analysis in progress
		public String clickPayementOption(int type,ConfigDataProvider config) throws InterruptedException {
			String expectedAmnt = amount.getText();
			Thread.sleep(2000);
			Select dropdown = new Select (paymentType);
			dropdown.selectByIndex(type); // click first option in dropdown
			Thread.sleep(2000);
			continueButton.click();
			Boolean flag=BrowserFactory.isElementPresent(driver, oK);
			if(flag==true)
			{
			oK.click();
			}
			Thread.sleep(2000);
			if(type==1)
			{
			BrowserFactory.explicitWait(driver, reciptNumber);
			reciptNumber.sendKeys("12345");
			Thread.sleep(2000);
			submitPayemnt.click();
			Thread.sleep(2000);
			Helper.waitForLoader(driver);
			closeSuccess.click();}
			else
			{
				BrowserFactory.explicitWait(driver, CName);
				getCard(config.getDataFromConfig("CCName"), config.getDataFromConfig("Number"), config.getDataFromConfig("ExpDate1"), config.getDataFromConfig("CVV1"));
			}
			Helper.waitForLoader(driver);
			Thread.sleep(5000);
			return expectedAmnt;

		}
		public void clickToContinuePayment() throws InterruptedException
		{
			BrowserFactory.explicitWait(driver, continueToPayment);
			BrowserFactory.scrolltoElement(driver, continueToPayment);
			continueToPayment.click();
			Thread.sleep(3000);
		} 

		public void getCard(String CCName, String Number, String ExpDate1, String CVV1) throws InterruptedException {
			Thread.sleep(3000);
			BrowserFactory.scrolldown(driver);
			CName.sendKeys(CCName);
			driver.switchTo().frame(0);
			CCNumber.sendKeys(Number);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			ExpDate.sendKeys(ExpDate1);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			CVV.sendKeys(CVV1);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			CnfPay.click();

		}

	// Misc methods

	

}
