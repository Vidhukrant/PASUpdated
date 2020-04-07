package RACVUtility;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pasPages.LoginPage;

public class BrowserFactory {
	public static WebDriver startChrome(String browserName,WebDriver driver)
	{
		if (browserName.equals("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			// JavascriptExecutor js = (JavascriptExecutor) driver;
		} else {
			System.out.println("no other browser present");
		}
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	public static Boolean isElementEnabled(WebDriver driver,WebElement element)
	{Boolean flag;
		try {
			flag=element.isEnabled();
		}
		catch (Exception e) {
		 System.out.println("Button not Enabled");
		 flag=false;
		}
		
		return flag;
		
	} 
	
	public static void click(WebElement element,WebDriver driver)
	{
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
		
	}
			
			
	public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } 
	
	public static void closeTab(WebDriver driver) throws InterruptedException
	{
		 ArrayList<String> tabs = null;
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   try { driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    driver.close();
	    Thread.sleep(2000);
	    }
	    catch (Exception e) {
	    	tabs = new ArrayList<String> (driver.getWindowHandles());
	    	 driver.switchTo().window(tabs.get(0));
	    	 
		}
	   tabs = new ArrayList<String> (driver.getWindowHandles());
	  //driver.switchTo().defaultContent();
	   driver.switchTo().window(tabs.get(0));
	   Thread.sleep(2000);
	}
	public static void switchToTabs(WebDriver driver) throws InterruptedException
	{
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    Thread.sleep(2000);
		    driver.close();
		    Thread.sleep(2000);
		    driver.switchTo().window(tabs2.get(0));
	}
	public static void  startApplication(WebDriver driver, String appURL) {
		
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public static void explicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void refresh(WebDriver driver) throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		Helper.waitForLoader(driver);
	}
	public static void quitBrowser(WebDriver driver,LoginPage login) throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(20000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.localStorage.clear();");

		js.executeScript("window.sessionStorage.clear();");
		//driver.quit();
		Helper.waitForLoader(driver);
		boolean visible=BrowserFactory.isElementPresent(driver, login.uname);
		if(visible==false)
		{
			quitBrowser(driver, login);
		}
		
		
		}
	
	
	public static void scrolldown(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

	public static void scrolltoElement(WebDriver driver,WebElement element) {
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);}

	
	public static Boolean isElementPresent(WebDriver driver,WebElement element)
	{Boolean flag;
		try {
			flag=element.isDisplayed();
		}
		catch (Exception e) {
		 System.out.println("Button not displayed");
		 flag=false;
		}
		
		return flag;
		
	}
}
