package b2cPages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseB2C {
	   protected WebDriver d;
	    //protected By pageHeading = By.cssSelector("h1.jumbotron-heading");

	    public BaseB2C(WebDriver d) {
	        this.d = d;
	       // waitForLoader();
	    }

	    public void waitForPageLoad() {

	    }

	    public void waitFor(int seconds) {
	        try {
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

	    public void scrollBy(String scrollByPx) {
	        JavascriptExecutor js = (JavascriptExecutor) d;
	        js.executeScript("window.scrollBy(0," + scrollByPx + ")");
	    }

	    public void waitForVisible(By locator) {
	        new WebDriverWait(d,180).until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    public void waitShortForVisible(By locator) {
	        new WebDriverWait(d, 30).until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    public void waitForLoader() {
	        try {
	                                           waitShortForVisible(By.cssSelector(".c-loader"));
	                             } catch (Exception e) {
	                                           e.printStackTrace();
	                             }
	        //waitForVisible(By.xpath("//div[@class='c-loader ng-star-inserted']"));
	        waitFor(5);
	    }

	    public void ScrollForLocator(By ScrollByLocator) {
	        JavascriptExecutor js = (JavascriptExecutor) d;
	        js.executeScript("arguments[0].scrollIntoView;", ScrollByLocator);
	    }

	}


