package pasTests;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.ExceptionUtil;

import RACVUtility.BrowserFactory;
import RACVUtility.ConfigDataProvider;
import RACVUtility.ExcelDataProvider;
import RACVUtility.Helper;


public class BaseClass {

	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	public  static ExtentHtmlReporter extent;
	public static ExtentReports report;
	public static ExtentTest logger;



	@BeforeSuite
	public void setUpSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
		extent = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+Helper.getCurrenDateTime()+".html");
		report = new ExtentReports();
		report.attachReporter(extent);
		extent.config().setReportName("Automation report");
		driver=BrowserFactory.startChrome(config.getBrowser(), driver);
		BrowserFactory.startApplication(driver, config.getDataFromConfig("qaURL"));

	}



	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException, InterruptedException {
		if(result.getStatus()== ITestResult.FAILURE){
			Throwable exception=result.getThrowable();
			
			
			//String msg[] =new String[2];
			 //msg=ExceptionUtil.getStackTrace(exception).split("at");
			
            
			logger.fail("Test Failed due to    "+exception.toString()+result.getTestContext().toString(),MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		
		}
		else if(result.getStatus()== ITestResult.SUCCESS) {
			logger.pass("Test case passed");
           
		}
		else if(result.getStatus()== ITestResult.SKIP) {
			logger.skip("Test skipped",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());

		}
		report.flush();
		//BrowserFactory.quitBrowser(driver);
	}
	@AfterSuite
	public void quit()
	{
		
		driver.quit();
	}


}
