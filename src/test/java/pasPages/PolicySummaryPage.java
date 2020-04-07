package pasPages;




import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;

import RACVUtility.BrowserFactory;
import RACVUtility.ConfigDataProvider;
import RACVUtility.Helper;

public class PolicySummaryPage {

	WebDriver driver;
	String refundValue;
	
	
	public PolicySummaryPage(WebDriver ldriver) {

		this.driver = ldriver; // Initialize the webdriver

	}
	@FindBy(xpath="//h6") WebElement errorafterinitiaterefund;
	@FindBy(xpath="//*[text()='An already issued policy cannot be issued again. ...']") WebElement warning;
	@FindBy(xpath = "//button[contains (text(),'Continue to Payment')]")WebElement continuepayemntbutton;
	@FindBy(xpath="//button[contains(text(),' Issue Endorsement') ]") WebElement issueEndorsement;
	@FindBy(xpath="//button[contains(text(),'Initiate Refund')]") WebElement initiateRefund;
	@FindBy(xpath="//button[contains(text(),'Issued')]") WebElement issued;
	@FindBy(xpath="//button[contains(text(),'Close')]") WebElement close;
	@FindBy(xpath="//table[@id='datatableRefunds']/tbody/tr/td[3]") WebElement tableCurrency;
	@FindBy(xpath="	//*[text()='SUCCESS ...']") WebElement successMessage;
	@FindBy(xpath="//*[contains(text(),'Refund has been successfully issued. ...')]") WebElement refundsuccessMessage;
	

	// Verify and click clickComapreandContinueButton
	public void VerfiySummaryPageContinuePayement() throws InterruptedException {

		Boolean flag = BrowserFactory.isElementPresent(driver, continuepayemntbutton);
		if (flag == false) {
			Assert.assertTrue(false, "no continue payemnt button button found");
		} else {
			continuepayemntbutton.click();
			Thread.sleep(2000);
			Helper.waitForLoader(driver);
		}

	}

	public void validtingSummaryPage(PolicyDetailsPage policydeatilspage,PolicyPaymentsPage paymentPage,ConfigDataProvider config) throws InterruptedException
	{
		BrowserFactory.scrolldown(driver);
		Thread.sleep(2000);
		Boolean flag=BrowserFactory.isElementPresent(driver, issueEndorsement);
		if (flag==false)
		{
			continuepayemntbutton.click();
			Helper.waitForLoader(driver);
			paymentPage.clickPayementOption(1,config);
		}
		else
		{
			issueEndorsement.click();
			Helper.waitForLoader(driver);
			Thread.sleep(5000);
			Boolean warningMsg= BrowserFactory.isElementPresent(driver,warning);
			if(warningMsg==true)
			{
				System.out.println("This policy has been used already.So please changes the test data");
				Assert.assertTrue(false,"This policy has been used already.So please changes the test data");
			}
			else
			{
				Boolean flag2=BrowserFactory.isElementPresent(driver, initiateRefund);
				if(flag2==true)
				{
					refundValue= initiateRefund();
					String appendValue="-"+refundValue;
					//policydeatilspage.policyMovement(appendValue);
				}
				else
				{
					Assert.assertEquals(successMessage.getText(), "SUCCESS ...");
					close.click();
					Thread.sleep(2000);
				}

		}
		
		}

	}

	public String initiateRefund() throws InterruptedException
	{
		initiateRefund.click();
		Thread.sleep(2000);
		Boolean flag1=BrowserFactory.isElementPresent(driver, errorafterinitiaterefund);
		if(flag1==true)
		{
			
			Assert.assertTrue(false,"Failed due to this error"+errorafterinitiaterefund.getText());
		}
		Thread.sleep(2000);
		Boolean flag=issued.isEnabled();
		assertFalse(flag,"issued successfully");
		String value=tableCurrency.getText();
		close.click();
		Thread.sleep(5000);
		//Assert.assertEquals(refundsuccessMessage.getText(), "Refund has been successfully issued. ...");
		//close.click();
		//Thread.sleep(5000);
		return value;


	}



	// Misc methods



}


