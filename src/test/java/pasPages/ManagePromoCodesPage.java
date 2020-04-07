package pasPages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.management.ManagementPermission;
import java.util.List;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;

public class ManagePromoCodesPage {

	WebDriver driver;
	static String  promoName=null;

	public ManagePromoCodesPage(WebDriver ldriver) {

		this.driver = ldriver; // Initialize the webdriver

	}

	@FindBy(xpath = "//*[text()='Manage Promo Codes']")
	WebElement managePromoCodes;
	@FindBy(id = "PromoCode")
	WebElement addPromocode;
	@FindBy(id = "PromoCodeDescription")
	WebElement promocodeDescription;
	@FindBy(id = "inputClubs")
	WebElement selectClubs;
	@FindBy(id = "DiscountRate")
	WebElement discountRate;
	@FindBy(id = "EffectiveDate")
	WebElement effectiveDate;
	@FindBy(id = "ExpirationDate")
	WebElement expirationDate;
	@FindBy(xpath = "//div[contains(text(),'added successfully')]")
	WebElement addPromoMsg;
	@FindBy(xpath = "//div[contains(text(),'deleted successfully')]")
	WebElement deletePromoMsg;
	@FindBy(xpath = "//Button[contains(text(),'Close')]")
	WebElement closeButton;
	@FindBy(xpath = "((//h2[contains(text(),'Promo Codes')]/following::form)[1]//input)[1]")
	WebElement searchPromoInput;
	@FindBy(xpath = "((//h2[contains(text(),'Promo Codes')]/following::form)[1]//input)[2]")
	WebElement searchEffectiveDateInput;
	@FindBy(xpath = "((//h2[contains(text(),'Promo Codes')]/following::form)[1]//input)[3]")
	WebElement searchExpirationDateInput;
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	public WebElement searchButton;
	@FindBy(xpath = "//table")
	WebElement searchedTable;
	@FindBy(xpath = "//table/tbody/tr/td[4]")
	WebElement searchedPromoCode;
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement deletePromoCode;
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yesDeleteButton;
	@FindBy(xpath = "//td[text()='No matching records found']")
	WebElement noRecords;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveChanges;
	@FindBy(xpath="//div[contains(text(),'Please enter a Promo code Number')]")
	public WebElement errPromoCode;
	@FindBy(xpath="//div[contains(text(),'Promo Code Description is required')]")
	public WebElement errPromoDesc;
	@FindBy(xpath="//*[contains(text(),'Please select club')]")
	public WebElement club;
	@FindBy(xpath="//*[contains(text(),'Please enter a Discount for the Promo code')]")
	public WebElement errDiscountRate;
	@FindBy(xpath="//*[contains(text(),'Please enter a valid date')]")
	public WebElement errEffectiveDate;
	@FindBy(xpath="//*[contains(text(),'Please select the Expiration Date the Promo code needs to be valid to')]")
	public WebElement errExpDate;


	public void verifyPromoDescriptionErrorMsg() throws InterruptedException {
		Thread.sleep(3000);
		addPromocode.sendKeys("1010");
		selectClub(2);
		sendDiscountRate();
		Thread.sleep(1000);
		effectiveDate.sendKeys("27/03/2020");
		expirationDate.click();
		clickSaveButton();
	}
	public void verifyDiscountRateErrorMsg() throws InterruptedException {
		Thread.sleep(3000);
		addPromocode.sendKeys("1010");
		promocodeDescription.sendKeys("Promo Description");
		selectClub(2);
		//sendDiscountRate();
		Thread.sleep(1000);
		effectiveDate.sendKeys("27/03/2020");
		expirationDate.click();
		clickSaveButton();
	}
	public void verifyEffectiveDateErrorMsg() throws InterruptedException {
		Thread.sleep(3000);
		addPromocode.sendKeys("1010");
		promocodeDescription.sendKeys("Promo Description");
		selectClub(2);
		Thread.sleep(1000);
		sendDiscountRate();
		//effectiveDate.sendKeys("27/03/2020");
		//expirationDate.click();
		clickSaveButton();
	}



	public void verifyClubErrorMsg() throws InterruptedException {
		
		Select select =new Select(selectClubs);
		List<WebElement> listOptionDropdown = select.getOptions();
		listOptionDropdown.size();
		if(listOptionDropdown.size()>1)
		{
			verifyText(driver,club,"Please select club");
			}



	}
	public void verifyPromoCodeErrorMsg() throws InterruptedException
	{
		Thread.sleep(3000);
		promocodeDescription.sendKeys("Promo Description");
		selectClub(2);
		sendDiscountRate();
		Thread.sleep(1000);
		effectiveDate.sendKeys("27/03/2020");
		expirationDate.click();
		clickSaveButton();
	}
	public void sendDescriptioon()
	{
		promocodeDescription.sendKeys("TESTING");
	}
	public void enterPromoCode()
	{
		promoName=Helper.getAlphaNumericString(6);
		addPromocode.sendKeys(promoName);
	}

	public void clickManagePromoCodes()
	{
		BrowserFactory.explicitWait(driver, managePromoCodes);
		managePromoCodes.click();
		BrowserFactory.explicitWait(driver, promocodeDescription);
	}

	public void selectClub(int indexValue)
	{
		Select select =new Select(selectClubs);
		List<WebElement> listOptionDropdown = select.getOptions();
		listOptionDropdown.size();
		if(listOptionDropdown.size()>1)
		{
			select.selectByIndex(1);}
		else
		{
			select.selectByIndex(0);
		}

	}

	public void sendDiscountRate()
	{
		discountRate.sendKeys("10");
	}

	public void sendEffectiveDate()
	{
		effectiveDate.sendKeys(Helper.currentLocaldate());
	}

	public void sendExpirationDate()
	{
		expirationDate.click();
		//expirationDate.sendKeys(Helper.currentLocaldate());
	}
	public void clickSaveButton() throws InterruptedException
	{
		saveChanges.click();
		Thread.sleep(2000);
	}
	public void validateMessage()
	{
		BrowserFactory.explicitWait(driver,addPromoMsg);
		assertEquals(addPromoMsg.getText(),"Promo Code has been added successfully");

	}
	public void clickClose() throws InterruptedException
	{
		closeButton.click();
		Thread.sleep(2000);
		Helper.waitForLoader(driver);

	}
	public void searchPromoCode() throws InterruptedException
	{
		searchPromoInput.sendKeys(promoName);
		Thread.sleep(2000);
		//searchEffectiveDateInput.sendKeys(Helper.currentLocaldate());
		searchButton.click();
		Thread.sleep(5000);
		BrowserFactory.explicitWait(driver, searchedTable);

	}
	public void validateSearchedTable() throws InterruptedException
	{
		Assert.assertEquals(searchedPromoCode.getText(),promoName);
		Thread.sleep(2000);

	}
	public void verifyText(WebDriver driver,WebElement element, String exp) throws InterruptedException {
		try {
			Thread.sleep(2000);
			String act=element.getText();
			Thread.sleep(1000);
			Assert.assertEquals(act, exp);
		}
		catch (Exception e) {

			Assert.assertTrue(false, "Text not matched");

		}
	}
	public void deleteSearchedPromo() throws InterruptedException
	{

		deletePromoCode.click();
		Thread.sleep(2000);
		yesDeleteButton.click();
		BrowserFactory.explicitWait(driver, deletePromoMsg);
		Thread.sleep(2000);
		Assert.assertEquals(deletePromoMsg.getText(),"Promo Code has been deleted successfully");
		closeButton.click();
		Thread.sleep(2000);

	}

	public void validatenoRows() throws InterruptedException
	{
		BrowserFactory.scrolldown(driver);
		Boolean visible=	BrowserFactory.isElementPresent(driver,searchedPromoCode);
		if (visible==true)
		{
			assertTrue(false,"promocode founded which deleted in previous test case");
		}
		else
		{
			assertTrue(true,"No record found");

		}
	}






}
