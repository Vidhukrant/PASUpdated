package RACVUtility;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

	public static String captureScreenshot(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String screenshotPath = System.getProperty("user.dir") + "./Screenshots/PAS_" + getCurrenDateTime() + ".png";
		try {
			FileHandler.copy(src, new File(screenshotPath));
		} catch (Exception e) {

			System.out.println("Unable to capture screenshots" + e.getMessage());

		}
		return screenshotPath;
	}
	public static String increateDateByDay(int days)
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		// get current date time with Date()
		Date date = new Date();


		Calendar c = Calendar.getInstance(); 

		c.setTime(date); 
		c.add(Calendar.DATE, days);
		date = c.getTime();
		return dateFormat.format(date);

	}
	public static void closeCurentWindow(WebDriver driver,String parent) throws InterruptedException
	{
		Set<String> handles =driver.getWindowHandles();

		for(String window : handles){
			if (!window.equals(parent))
			{
				driver.close();
				Thread.sleep(2000);
				driver.switchTo().window(parent);
				Thread.sleep(2000);
			}
		}

		
	}
	public static void waitShortForVisible(By locator,WebDriver driver) {
		new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static void waitForLoader(WebDriver driver) throws InterruptedException {
		try {
			waitShortForVisible(By.cssSelector(".c-loader"),driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//waitForVisible(By.xpath("//div[@class='c-loader ng-star-inserted']"));
		Thread.sleep(5000);
	}

	public static String currentLocaldate() {

		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String date1 = dateFormat.format(date);


		// Print the Date
		return date1;

	}
	public static String increaseDate(int increaseMonth) throws InterruptedException {


		//toMonth.sendKeys(currentLocaldate());
		//String date = toMonth.getAttribute("value");
		String values[] = currentLocaldate().split("/");
		String month = values[1];
		int previousMonth = Integer.parseInt(month);
		int newMonth = previousMonth + increaseMonth;
		String newDate = values[0] + "/" + newMonth + "/" + values[2];

		Thread.sleep(2000);
		return newDate;
	}

    public static String getRandomString(int n)
    {
    	String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    	StringBuilder buider =new StringBuilder(n);
    	for(int i=0;i<n;i++)
    	{
    		int index =(int)(alphabets.length()*Math.random());
    		buider.append(alphabets.charAt(index));
    	}
    	return buider.toString();
    }
    
	public static String getAlphaNumericString(int n) 
	{ 

		// chose a Character random from this String 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz"; 

		// create StringBuffer size of AlphaNumericString 
		StringBuilder sb = new StringBuilder(n); 

		for (int i = 0; i < n; i++) { 

			// generate a random number between 
			// 0 to AlphaNumericString variable length 
			int index 
			= (int)(AlphaNumericString.length() 
					* Math.random()); 

			// add Character one by one in end of sb 
			sb.append(AlphaNumericString 
					.charAt(index)); 
		} 

		return sb.toString(); 
	} 
	public static String getCurrenDateTime() {

		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}


}
