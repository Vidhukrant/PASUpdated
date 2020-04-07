package pasPages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;

public class PolicyDetailsPage {

              WebDriver driver;

              public PolicyDetailsPage(WebDriver ldriver) {

                             this.driver = ldriver; // Initialize the webdriver

              }
              @FindBy(xpath="(//span[@aria-hidden='true'])[1]")
              WebElement closeMedical;

@FindBy(xpath="//strong[contains(text(),'AUSTRALIA')]")
              WebElement validateCountry;
              @FindBy(css = "input.verisk-form-control")
              WebElement conditionName;
              @FindBy(xpath = "//*[contains(text(),'Save as PDF')]")
              WebElement SaveAsPDF;
              @FindBy(xpath = "//*[contains(text(),'Accepted')]")
              WebElement acceptStatus;
              @FindBy(xpath = "//*[text()='Plan']/following::div[1]")
              WebElement policyType;

              @FindBy(xpath = "//*[text()=' Continue ']")
              WebElement continueWithResume;

              @FindBy(xpath = "(//*[contains(text(),'Additional premium:')])[1]")
              WebElement additionalPremium;

              @FindBy(xpath = "(//*[contains(text(),' Medical Score : ')])[1]")
              WebElement medicalScore;

              @FindBy(xpath = "//div[@class='c-list']")
              WebElement addMultiple;
              @FindBy(xpath = "//*[contains(text(),'View PDS')]")
              WebElement ViewPDS;

              @FindBy(xpath = "//*[@type='application/pdf']")
              WebElement ViewPDSLink;

              @FindBy(xpath = "//*[contains(text(),'View/Download COI')]")
              WebElement ViewCOI;
              @FindBy(xpath = "//div[contains(text(),'Domestic')]")
              WebElement domesticError;
              @FindBy(xpath = "//div[contains(text(),'Do not travel')]")
              WebElement notTravelDestinations;

              @FindBy(xpath = "//*[contains(text(),'Resend COI')]")
              WebElement ResendCOI;

              @FindBy(xpath = "//*[text()='+']")
              WebElement addTraveller;
              @FindBy(xpath = "//*[text()='Diabetes']")
              WebElement condtionClick;
              @FindBy(xpath = "//button[@class='verisk-btn verisk-btn-primary verisk-right-float']")
              WebElement startDeclaration;
              @FindBy(xpath = "//input[@formcontrolname='SecondaryfirstName'] ")
              WebElement secFname;
              @FindBy(xpath = "//input[@formcontrolname='SecondaryLastName'] ")
              WebElement secLname;
              @FindBy(xpath = "//label[text()='No']")
              WebElement noInsulin;
              @FindBy(xpath = "//div[@class='col-lg-3 col-auto']/label[text()='0']")
              WebElement selectZero;
              @FindBy(xpath = "//label[div[div[text()='No']]]")
              WebElement noChainSmoker;
              @FindBy(xpath = "//label[div[div[text()='No - none of the above']]]")
              WebElement doYouHaveAnyOfTheAbove;
              @FindBy(xpath = "//button[text()='Done']")
              WebElement done;
              @FindBy(xpath = "//div[contains(text(),'select country')]")
              WebElement selectCountryError;

              @FindBy(xpath = "(//label[@class='btn btn-light'])[1]")
              WebElement primaryYes;
              @FindBy(xpath = "(//*[contains(text(),'Yes')])[2]")
              WebElement secondaryYes;
              @FindBy(xpath = "(//*[contains(text(),'Yes')])[3]")
              WebElement dependentYes;
              @FindBy(xpath = "//*[contains(text(),'Continue Revision')]")
              WebElement continueRevision;
              @FindBy(xpath = "(//*[@class='btn btn-secondary assess-btn custom-theme-group-two ml-2'])[1]")
              WebElement primaryAssess;
              @FindBy(xpath = "(//*[contains(text(),'Assess')])[2]")
              WebElement secondaryAssess;
              @FindBy(xpath = "(//*[contains(text(),'Assess')])[3]")
              WebElement dependentAssess;

              @FindBy(xpath = "(//button[contains(text(),'Continue')])[3]")
              WebElement continuewithMedical;

              @FindBy(xpath = "(//div[1]//div[2]//div[1]//*[contains(text(),'Yes')])[1]")
              WebElement option1Yes;
              @FindBy(xpath = "(//div[2]//div[2]//div[1]//*[contains(text(),'No')])[3]")
              WebElement option1No;
              @FindBy(xpath = "(//div[2]//div[2]//div[1]//*[contains(text(),'Yes')])[2]")
              WebElement option2Yes;
              @FindBy(xpath = "(//div[2]//div[2]//div[1]//*[contains(text(),'No')])[4]")
              WebElement option2No;
              @FindBy(xpath = "(//div[3]//div[2]//div[1]//*[contains(text(),'Yes')])[1]")
              WebElement option3Yes;
              @FindBy(xpath = "(//div[2]//div[2]//div[1]//*[contains(text(),'No')])[5]")
              WebElement option3No;
              @FindBy(xpath = "(//div[4]//div[2]//div[1]//*[contains(text(),'Yes')])[1]")
              WebElement option4Yes;
              @FindBy(xpath = "(//div[2]//div[2]//div[1]//*[contains(text(),'No')])[6]")
              WebElement option4No;
              @FindBy(xpath = "//h1[contains(text(),'PRE-EXISTING CONDITIONS')]/following::i[1]")
              WebElement preExistingCondition;
              @FindBy(xpath = "//button[text()='Update Policy']|//button[text()='Continue Revision']")
              public static WebElement updatepolicybutton;
              @FindBy(xpath = "//input[@formcontrolname='TripFromDate']")
              WebElement fromMonth;
              @FindBy(xpath = "//input[@formcontrolname='TripToDate']")
              WebElement toMonth;
              @FindBy(xpath = "(//button[contains(text(),'CHOOSE')])[1]")
              WebElement ChooseButton;
              @FindBy(xpath = "//*[@formcontrolname='dob']")
              public WebElement PriDob;
              @FindBy(xpath = "//*[@formcontrolname='dob1']")
              public WebElement secDOB;
              @FindBy(xpath = "//h1[text()='TRAVELLERS']/following::i[1]")
              WebElement TravelelrsEdit;
              @FindBy(xpath = "//table[@id='datatableRefunds']/tbody/tr/td[3]")
              WebElement tableCurrency;
              @FindBy(xpath = "//h1[text()='TOTAL TRAVEL CARE']/following::i[1]|//h1[text()='EXTRA TRAVEL CARE']/following::i[1]|//h1[text()='TRAVEL CARE']/following::i[1]|//h1[text()='ANNUAL MULTI-TRIP']/following::i[1]")
              WebElement travelCareEdit;
              @FindBy(xpath = "//h1[text()='TRIP DETAILS']/following::i[1]")
              WebElement tripDetailsEdit;
              @FindBy(xpath = "//*[text()='DEPENDENTS']/following::i[1]")
              WebElement dependentEdit;
              @FindBy(xpath = "//button[text()='Add more Dependents']")
              WebElement addDependent;
              @FindBy(xpath = "//input[@placeholder='First Name']")
              WebElement firstName;
              @FindBy(xpath = "//input[@placeholder='Last Name']")
              WebElement lastName;
              @FindBy(xpath = "//input[@placeholder='Date of Birth']")
              WebElement dob;
              @FindBy(xpath = "//div[@class='col-lg-3 col-auto']/label[text()='No']")
              WebElement advisedToTakeMedicationForBloodPressure;
              @FindBy(xpath = "//div[@class='col-lg-3 col-auto']/label[text()='No']")
              WebElement advisesToTakeMedicationForCholestrol;
              @FindBy(xpath = "//*[contains(text(),'Resume')]")
              WebElement resume;
              @FindBy(xpath = "//button[contains(text(),'Accept')]")
              WebElement acceptPremium;
              @FindBy(xpath = "//*[text()='Continue']")
              WebElement continuelast;
              @FindBy(css = "#btnReactFinish")
              WebElement completeDeclaration;
              @FindBy(xpath = "//button[contains(text(),'Ok')]")
              WebElement Ok;
              @FindBy(xpath = "//i[@class='far fa-trash-alt']")
              WebElement deleteTraveller;
              @FindBy(xpath = "//span[@class='c-remove clear-all']")
              WebElement clearAll;
              @FindBy(xpath = "//span[text()='Select Fields']")
              WebElement selectFields;

              @FindBy(xpath = "//button[text()='Cancel']")
              WebElement cancelbutton;

              @FindBy(xpath = "//*[contains(text(),'Cancel Policy')]")
              WebElement cancelPolicybutton;
              @FindBy(id = "inputState")
              WebElement reasonClick;
              @FindBy(xpath = "//*[contains(text(),'Insured Request')]")
              WebElement insuredReason;
              @FindBy(xpath = "//*[contains(text(),'Underwriter Request')]")
              WebElement underwriterRequest;
              @FindBy(xpath = "//*[@type='submit']")
              WebElement cancelPolicy;
              @FindBy(xpath = "//button[text()='Yes']")
              WebElement cancelPolicyYes;
              @FindBy(xpath = "(//button[text()='No']")
              WebElement cancelPolicyNo;
              @FindBy(xpath = "//button[contains(text(),'Initiate Refund')]")
              WebElement initiateRefund;

              @FindBy(xpath = "//button[contains(text(),' Issued')]")
              WebElement issuedButton;

              @FindBy(xpath = "//button[contains(text(),'Close')]")
              WebElement Close;

              @FindBy(xpath = "//h6")
              WebElement errorafterinitiaterefund;
              @FindBy(xpath = "//div[@class='error-msg']/div")
              WebElement errorMsg;

              @FindBy(xpath = "//input[@placeholder='Search Fields']")
              WebElement searchFields;
              @FindBy(xpath = "//label[text()='CANADA']")
              WebElement valueDestination;
              @FindBy(xpath = "//span[text()='CANADA']")
              WebElement selectedDestination;
              @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
              public WebElement saveChanges;
              @FindBy(xpath = "//input[@formcontrolname='firstName']")
              WebElement primaryFname;
              @FindBy(xpath = "//input[@formcontrolname='lastName']")
              WebElement primaryLname;
              @FindBy(xpath="//input[@formcontrolname='address']") public WebElement address; 
    @FindBy(xpath="//*[contains(text(),'Please enter the Street Address.')]") public WebElement addressValidation;
    @FindBy(xpath="//input[@formcontrolname='confirmEmail']") public WebElement conEmail;
    @FindBy(xpath="//input[@placeholder='Email Address']") public WebElement email1;
    @FindBy(xpath="//*[contains(text(),'Please enter the email address.')]") public WebElement emailValidation;
    @FindBy(xpath="//*[contains(text(),'Please enter the confirm email address.')]") public WebElement conValidation;
    @FindBy(xpath="//input[@formcontrolname='phoneNumber']") public WebElement phone;
    @FindBy(xpath="//div[contains(text(),'Phone Number is required')]") public WebElement phnValidation;
    @FindBy(xpath="//input[@placeholder='Postal Code']") public WebElement pCode1;
    @FindBy(xpath="//*[contains(text(),'Please enter the Postal Code.')]") public WebElement postValidation;
    @FindBy(xpath="//input[@placeholder='Suburb']") public WebElement subrb;
    @FindBy(xpath="//*[contains(text(),'Please enter the Suburb.')]") public WebElement subValidation;
              @FindBy(xpath = "//*[text()='Notes']")
              WebElement notesEdit;
              @FindBy(xpath = "//button[@class='btn btn-secondary custom-theme-group-two']")
              WebElement continueAssess;
              @FindBy(xpath = "//textarea[@placeholder='Add notes here']")
              WebElement enterinEditBox;
              @FindBy(xpath = "//textarea[@placeholder='Add notes here']/following::button[1]")
              WebElement AddNotes;
              @FindBy(xpath = "(//textarea[@placeholder='Add notes here'])[2]")
              WebElement enterinEditBox_prompt;
              @FindBy(xpath = "(//textarea[@placeholder='Add notes here']/following::button[2])[2]")
              WebElement AddNotes_prompt;
              @FindBy(xpath = "//button[text()='Compare and Continue']")
              WebElement ComapreandContinue;
              @FindBy(xpath = "//*[text()='Policy Movement']")
              WebElement policyMovement;
              @FindBy(xpath="//input[@formcontrolname='address']")
              WebElement paddress;
              @FindBy(xpath="//input[@formcontrolname='city']")
              WebElement pcity;
              @FindBy(xpath="//input[@formcontrolname='zipCode']")
              WebElement pCode;
              @FindBy(xpath="//input[@formcontrolname='email']")
              WebElement email;
              @FindBy(xpath="//input[@formcontrolname='confirmEmail']")
              WebElement cEmail;
              String inputTravllerDetails = "//h2[text()='Adult Travellers']/following::input";

              // Click Notes Button
              public void clickNotes() throws InterruptedException {

                             BrowserFactory.explicitWait(driver, notesEdit);
                             notesEdit.click();
                             Thread.sleep(2000);
                             BrowserFactory.scrolldown(driver);
                             enterinEditBox.sendKeys("" + getStreetName());
                             AddNotes.click();
                             Thread.sleep(5000);

              }
public void enterNotesInPrompt() throws InterruptedException
{
              Boolean flag=BrowserFactory.isElementPresent(driver,enterinEditBox_prompt);
              if(flag==true)
              {
              enterinEditBox_prompt.sendKeys("" + getStreetName());
              AddNotes_prompt.click();
              Thread.sleep(5000);}
}


              // Click Compare and Continue Button
              public void clickComapreandContinueButton() throws InterruptedException {

                             BrowserFactory.scrolltoElement(driver, ComapreandContinue);
                             ComapreandContinue.click();
                             enterNotesInPrompt();
                             Helper.waitForLoader(driver);
                             

              }

              // Click Update Policy Button
              public void clickUpdatePolicybutton() throws InterruptedException {

                             updatepolicybutton.click();
                             Thread.sleep(2000);
                             Helper.waitForLoader(driver);

              }

              public void replaceNewDestination(String destination) throws InterruptedException
              {
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             Boolean checkforCountry = BrowserFactory.isElementPresent(driver, validateCountry);
                             if(checkforCountry==true)
                             {
                                           Assert.assertTrue(false,"Please select some other country to perform medical rescoring");
                                           
                              }
                             else
                             {
                             BrowserFactory.explicitWait(driver, tripDetailsEdit);
                             tripDetailsEdit.click();
                             Thread.sleep(2000);
                             Boolean checkfromDateMessage = BrowserFactory.isElementEnabled(driver, fromMonth);
                             if(checkfromDateMessage==true)
                             {
                                           fromMonth.clear();
                             }
                                 toMonth.clear();
                                           Thread.sleep(2000);
                                           replaceDestination(destination);
                                           fromMonth.sendKeys(Helper.increateDateByDay(3));
                                           increaseDate(toMonth);                                           
                                           Thread.sleep(4000);
                             }
              }
              public void replaceDestination(String destination) throws InterruptedException
              {

        clearAll.click();
                             Thread.sleep(4000);
                             selectFields.click();
                             Thread.sleep(2000);
                             searchFields.sendKeys(destination);
                             Thread.sleep(2000);
                           driver.findElement(By.xpath("//label[text()='"+destination+"']")).click();
                             Thread.sleep(4000);
                           driver.findElement(By.xpath("//span[text()='"+destination+"']")).click();
                             Thread.sleep(2000);

              }
              public void addMultipleDestination(String destination) throws InterruptedException {

                             Thread.sleep(2000);
                             addMultiple.click();
                             Thread.sleep(2000);
                             searchFields.sendKeys(destination);
                             Thread.sleep(2000);
                             driver.findElement(By.xpath("//label[text()='" + destination + "']")).click();
                             Thread.sleep(4000);
                             driver.findElement(By.xpath("//span[text()='" + destination + "']")).click();
                             Thread.sleep(2000);

              }

              public void addNewDestination(String destination) throws InterruptedException
              {
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             Boolean checkforCountry = BrowserFactory.isElementPresent(driver, validateCountry);
                             if(checkforCountry==true)
                             {
                                           Assert.assertTrue(false,"Please select someother country to perform medical rescoring");
                                           
                              }
                             else
                             {
                             BrowserFactory.explicitWait(driver, tripDetailsEdit);
                             tripDetailsEdit.click();
                             Thread.sleep(2000);
                             Boolean checkfromDateMessage = BrowserFactory.isElementEnabled(driver, fromMonth);
                             if(checkfromDateMessage==true)
                            {
                             fromMonth.clear();
                             }
                                 toMonth.clear();
                                           Thread.sleep(2000);
                                           addMultipleDestination(destination);
                                           fromMonth.sendKeys(Helper.increateDateByDay(3));
                                           increaseDate(toMonth);
                                           Thread.sleep(5000);
                             
              }}
              public void getResume() throws InterruptedException {

                             BrowserFactory.scrolltoElement(driver, preExistingCondition);
                             BrowserFactory.explicitWait(driver, preExistingCondition);
                             Boolean checkAcceptedMessage = BrowserFactory.isElementPresent(driver, acceptStatus);
                             if (checkAcceptedMessage == true) {
                                           BrowserFactory.explicitWait(driver, preExistingCondition);
                                           preExistingCondition.click();
                                           BrowserFactory.scrolltoElement(driver, resume);
                                           BrowserFactory.explicitWait(driver, resume);
                                           resume.click();

                             } else {
                                           Assert.assertTrue(false, "Select a Policy with medical condition");

                             }
              }

              public String getAddtionalPremiumValue() {
                             BrowserFactory.explicitWait(driver, additionalPremium);
                             BrowserFactory.scrolltoElement(driver, additionalPremium);
                             return additionalPremium.getText();

              }

              public String getmedicalScore() {
                             BrowserFactory.explicitWait(driver, medicalScore);
                             BrowserFactory.scrolltoElement(driver, medicalScore);
                             return medicalScore.getText();
              }

              public void cancelMedical() throws InterruptedException

              {
                             Thread.sleep(4000);
                             BrowserFactory.explicitWait(driver, closeMedical);
                             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeMedical);

              }

              public void acceptPremiumAfterEditing() throws InterruptedException {
                             BrowserFactory.scrolltoElement(driver, preExistingCondition);
                             BrowserFactory.explicitWait(driver, preExistingCondition);
                             preExistingCondition.click();
                             BrowserFactory.scrolltoElement(driver, resume);
                             BrowserFactory.explicitWait(driver, resume);
                             resume.click();
                             Thread.sleep(5000);
              }

              public void edittravelCareformedicalrescoring() throws InterruptedException {
                             Thread.sleep(4000);
                             BrowserFactory.scrolltoElement(driver, travelCareEdit);
                             Thread.sleep(2000);
                             BrowserFactory.explicitWait(driver, travelCareEdit);
                             travelCareEdit.click();
                             Helper.waitForLoader(driver);
              }

              public void updateTravellersNameContactAndMobileNo() throws InterruptedException {

                             primaryFname.clear();
                             Thread.sleep(2000);
                             primaryFname.sendKeys("Leah");
                             Thread.sleep(2000);
                             primaryLname.clear();
                             Thread.sleep(2000);
                             primaryLname.sendKeys("Thomas");
                             Thread.sleep(2000);
                             paddress.clear();
                             Thread.sleep(2000);
                             paddress.sendKeys("546 Halwin palace");
                             pcity.clear();
                             Thread.sleep(2000);
                             pcity.sendKeys("Niddre");
                             Thread.sleep(2000);
                             email.clear();
                             Thread.sleep(2000);
                             email.sendKeys("ss@gmail.com");
                             Thread.sleep(2000);
                             cEmail.clear();
                             Thread.sleep(2000);
                             cEmail.sendKeys("ss@gmail.com");
                             Thread.sleep(2000);

              }
              public void increaseDateByYear(WebElement element) throws InterruptedException {


                                           //toMonth.sendKeys(currentLocaldate());
                                           //String date = toMonth.getAttribute("value");
                                           String values[] = element.getAttribute("value").split("/");
                                           String year = values[2];
                                           int previousYear = Integer.parseInt(year);
                                           int newYear = previousYear - 20;
                                           String newDate = values[0] + "/" + values[1] + "/" + newYear;
                                           element.clear();
                                           Thread.sleep(2000);
                                           element.sendKeys(newDate);
                                           Thread.sleep(2000);
              
               
} 

              // Click Edit icon in Traveller Section
              public void clickeditDetails() throws InterruptedException {
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             TravelelrsEdit.click();

              }

              public void policyMovement(String expectedAmount) throws InterruptedException {

                             policyMovement.click();
                             Thread.sleep(2000);
                             String actualAmount = driver.findElement(By.xpath("//*[text()='" + expectedAmount + "']")).getText();
                             assertEquals(actualAmount, expectedAmount);
              }

              public void clickTravellerEditButton() throws InterruptedException {
                             BrowserFactory.scrolldown(driver);
                             ((JavascriptExecutor) driver).executeScript("arguments[0].click()", TravelelrsEdit);
                             Thread.sleep(2000);
                             Helper.waitForLoader(driver);
              }
              public void clearText(WebDriver driver,WebElement element,WebElement element2) throws InterruptedException {
        
        Thread.sleep(3000);
        element.sendKeys(Keys.CONTROL + "a");
        Thread.sleep(500);
        //element.sendKeys("a");
        element.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        element2.click();
        
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
              public void saveChange() throws InterruptedException {

                             Thread.sleep(2000);
                             saveChanges.click();
                             Helper.waitForLoader(driver);
                             Thread.sleep(2000);
                             Ok.click();
                             Thread.sleep(2000);
              }

              public void changeCurrentPlan() throws InterruptedException {
                             Thread.sleep(5000);

                             BrowserFactory.explicitWait(driver, ChooseButton);
                             ChooseButton.click();
                             Thread.sleep(2000);
                             saveChanges.click();
                             Thread.sleep(2000);
                             Helper.waitForLoader(driver);
                             Ok.click();
                             Thread.sleep(2000);
                             Helper.waitForLoader(driver);
                             

              }

              public void validateAnuualMultiTripCoverage() throws InterruptedException
              {
                             Boolean flag=BrowserFactory.isElementPresent(driver,ChooseButton);
                             if(flag==true)
                             {
                                           Assert.assertEquals(false, true,"choose button should not visible");      
                             }
                             cancelbutton.click();
                             Thread.sleep(2000);
              }
              public void edittotaltravelCare() throws InterruptedException {
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             BrowserFactory.explicitWait(driver, travelCareEdit);
                             travelCareEdit.click();
                             Helper.waitForLoader(driver);
              }

              public void decreaseDate() throws InterruptedException {
                             List<WebElement> inputBoxes = driver.findElements(By.xpath(inputTravllerDetails));
                             String date = inputBoxes.get(2).getText();
                             String values[] = date.split("/");
                             String year = values[2];
                             int previousYear = Integer.parseInt(year);
                             int newYear = previousYear - 1;
                             String newDate = values[0] + "/" + values[1] + "/" + newYear;
                             inputBoxes.get(2).sendKeys(newDate);
                             Thread.sleep(2000);
                             saveChanges.click();
                             Thread.sleep(2000);
              }

              public void updateTravellersDetails() throws InterruptedException {

                             primaryFname.clear();
                             Thread.sleep(2000);
                             primaryFname.sendKeys("Leah");
                             Thread.sleep(2000);
                             primaryLname.clear();
                             Thread.sleep(2000);
                             primaryLname.sendKeys("Thomas");

              }

              // Enter and Update Traveller Details

              public void enterTravellerData(String FirstName, String LastName, String Sub, String PC, String E, String CE,
                                           String Mobile) throws InterruptedException {

                             clickeditDetails();
                             Thread.sleep(2000);

                             List<WebElement> inputBoxes = driver.findElements(By.xpath(inputTravllerDetails));

                             inputBoxes.get(0).clear();
                             inputBoxes.get(0).sendKeys(FirstName);
                             inputBoxes.get(1).clear();
                             inputBoxes.get(1).sendKeys(LastName);
                             inputBoxes.get(2).clear();
                             inputBoxes.get(2).sendKeys("" + getDOB());
                             inputBoxes.get(6).clear();
                             inputBoxes.get(6).sendKeys("" + getStreetName());
                             inputBoxes.get(7).clear();
                             inputBoxes.get(7).sendKeys(Sub);
                             inputBoxes.get(8).clear();
                             inputBoxes.get(8).sendKeys(PC);
                             inputBoxes.get(9).clear();
                             inputBoxes.get(9).sendKeys(E);
                             inputBoxes.get(10).clear();
                             inputBoxes.get(10).sendKeys(CE);
                             inputBoxes.get(11).clear();
                             inputBoxes.get(11).sendKeys(Mobile);
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             saveChanges.click();
                             Thread.sleep(2000);
              }

              public void validateCountryError() throws InterruptedException {
                             clearAll.click();
                             Thread.sleep(2000);
                             Assert.assertEquals(selectCountryError.getText(), "Please select country");
              }

              public void ChangeDestination(String destination) throws InterruptedException {

                             clearAll.click();
                             Thread.sleep(2000);
                             selectFields.click();
                             Thread.sleep(2000);
                             searchFields.sendKeys(destination);
                             Thread.sleep(2000);
                             driver.findElement(By.xpath("//label[text()='" + destination + "']")).click();
                             Thread.sleep(4000);
                             driver.findElement(By.xpath("//span[text()='" + destination + "']")).click();
                             Thread.sleep(2000);

              }

              public void validatingDomesticError() {
                             Assert.assertEquals(domesticError.getText(),
                                                          "Cannot select Domestic destination for an International Policy or International Destination for a Domestic Policy");
              }
              public void notTravelDetinationError(String Destination) {
                             Assert.assertEquals(notTravelDestinations.getText(),
                                                          "Our policy excludes cover to any country with the advice of Do not travel and we cannot offer a policy to "+Destination+".");
              }


              public void clickDeleteTraveller() throws InterruptedException {

                             Thread.sleep(3000);
                             Boolean flag = BrowserFactory.isElementPresent(driver, deleteTraveller);
                             if (flag == true) {
                                           deleteTraveller.click();
                             } else {
                                           assertTrue(true, "no traveller to delete");
                             }

              }

              public void validateDeletedTraveller() {
                             Boolean flag = BrowserFactory.isElementPresent(driver, deleteTraveller);
                             if (flag == true) {
                                           assertTrue(false, "Traveller not deleted successfully");
                             } else {
                                           assertTrue(true, "deleted successfully");
                             }

              }

              public boolean saveAsPDFlink() throws InterruptedException {
                             {
                                           SaveAsPDF.isEnabled();

                             }
                             return true;
              }

              public void clickSavePDFLink() throws InterruptedException {
                             {
                                           SaveAsPDF.click();

                             }
              }

              public boolean ViewPDSlink() throws InterruptedException {
                             
                                           Boolean flag=ViewPDS.isEnabled();

                             
                             return flag;
              }

              public void clickviewPDSLink() throws InterruptedException {
                             {

                                           ViewPDS.click();
                                           Thread.sleep(5000);
                                           BrowserFactory.switchToTabs(driver);

                             }
              }
              public void validatepolicyType(String Type)
              {
                             Assert.assertEquals(policyType.getText().trim(), Type);
              }
              public boolean ViewCOILink() throws InterruptedException {

              
                             
                                           Boolean flag=ViewCOI.isEnabled();
                                           return flag;

                             
                             
              }

              public void clickviewCOILink() throws InterruptedException {
                             {
                                           ViewCOI.click();
                                           Thread.sleep(5000);
                                           BrowserFactory.switchToTabs(driver);

                             }
              }

              public boolean resendLink() throws InterruptedException {
                             {

                                           ResendCOI.isEnabled();

                             }
                             return true;
              }

              public void clickResendCOILink() throws InterruptedException {
                             {
                                           ResendCOI.click();

                             }
              }

              public void increaseDateByMonth(WebElement element) throws InterruptedException {

                             // toMonth.sendKeys(currentLocaldate());
                             // String date = toMonth.getAttribute("value");
                             Boolean flag = BrowserFactory.isElementPresent(driver, element);
                             if (flag == true) {
                                           String values[] = element.getAttribute("value").split("/");
                                           String month = values[1];
                                           int previousMonth = Integer.parseInt(month);
                                           int newMonth = previousMonth + 1;
                                           String newDate = values[0] + "/" + newMonth + "/" + values[2];
                                           element.clear();
                                           Thread.sleep(2000);
                                           element.sendKeys(newDate);
                                           Thread.sleep(2000);
                             }

              }

              public void addDependent() throws InterruptedException {
                             dependentEdit.click();
                             Thread.sleep(2000);
                             addDependent.click();
                             Thread.sleep(2000);
                             List<WebElement> ele = driver.findElements(By.xpath("//input[@placeholder='Last Name']"));
                             if (ele.size() > 1) {
                                           for (int i = 1; i < ele.size(); i++) {
                                                         driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]/following::a[1]")).click();
                                                          ;
                                           }
                             }
                             firstName.sendKeys("fIrstName");
                             Thread.sleep(2000);
                             lastName.sendKeys("lastName");
                             Thread.sleep(2000);
                             dob.sendKeys("23/09/1996");
                             Thread.sleep(2000);
                             saveChanges.click();
                             Thread.sleep(4000);
                             Helper.waitForLoader(driver);
                             Ok.click();
                             Thread.sleep(2000);

              }

              public void changesinDependent() throws InterruptedException {
                             BrowserFactory.click(dependentEdit, driver);
                             Thread.sleep(2000);
                             firstName.clear();
                             firstName.sendKeys("fIrstNameChaanged");
                             Thread.sleep(2000);
                             lastName.clear();
                             lastName.sendKeys("lastNameChanged");
                             Thread.sleep(2000);
                             dob.clear();
                             dob.sendKeys("23/09/1998");
                             Thread.sleep(2000);
                             saveChanges.click();
                             Thread.sleep(4000);
                             Helper.waitForLoader(driver);
                             Ok.click();
                             Thread.sleep(2000);

              }
              public void changeCurrentPlanWithSaveChanges() throws InterruptedException
              {
                             Thread.sleep(5000);

                             BrowserFactory.explicitWait(driver,ChooseButton);
                             ChooseButton.click();
                             Thread.sleep(2000);
                             saveChange();
                             Thread.sleep(2000);
                             Helper.waitForLoader(driver);

              }             
              public void deleteDependent() throws InterruptedException {
                             BrowserFactory.click(dependentEdit, driver);
                             Thread.sleep(2000);
                             addDependent.click();
                             List<WebElement> ele = driver.findElements(By.xpath("//input[@placeholder='Last Name']"));
                             if (ele.size() > 1) {
                                           for (int i = 1; i <= ele.size(); i++) {
                                                         driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]/following::a[1]")).click();
                                                          
                                           }
                             }
                             saveChanges.click();
                             Thread.sleep(4000);
                             Helper.waitForLoader(driver);
                             Ok.click();
                             Thread.sleep(2000);

              }

              public void validateAddDependent() throws InterruptedException {
                             BrowserFactory.click(dependentEdit, driver);
                             Thread.sleep(2000);
                             addDependent.click();
                             Thread.sleep(2000);
                             List<WebElement> ele = driver.findElements(By.xpath("//input[@placeholder='Last Name']"));
                             if (ele.size() > 1) {
                                           for (int i = 1; i < ele.size(); i++) {
                                                         driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]/following::a[1]")).click();
                                                          ;
                                           }
                             }
                             firstName.sendKeys("fIrstName");
                             Thread.sleep(2000);
                             lastName.sendKeys("lastName");
                             Thread.sleep(2000);
                             dob.sendKeys("23/09/1993");
                             Thread.sleep(2000);
                             saveChanges.click();
                             Thread.sleep(4000);
                             Assert.assertEquals(errorMsg.getText(), "Please enter the age between 0 to 25 years");
                             cancelbutton.click();
                             Thread.sleep(2000);
              }

              public void addSecondryTraveller() throws InterruptedException {
                             Boolean flag = BrowserFactory.isElementPresent(driver, addTraveller);
                             if (flag == true) {
                                           addTraveller.click();
                                           Thread.sleep(2000);
                                           secFname.sendKeys("test");
                                           secLname.sendKeys("ing");
                                           secDOB.sendKeys("12/12/1996");

                             } else {
                                           Assert.assertTrue(true, "Secondry traveller already added on the policy");
                             }
                             // *[text()='+']
              }

              public void validateaddSecondryTraveller() throws InterruptedException {
                             Boolean flag = BrowserFactory.isElementPresent(driver, addTraveller);
                             if (flag == true) {
                                           assertTrue(false, "secondryTraveller not added");

                             } else {
                                           Assert.assertTrue(true, "Secondry traveller added on the policy");
                             }
                             // *[text()='+']
              }

              // Misc methods

              public float getStreetName() {
                             // create instance of Random class
                             Random rand = new Random();
                             // Generate and return Random number with decimal
                             return rand.nextFloat();
              }

              public LocalDate getDOB() {
                             Random random = new Random();
                             int minDay = (int) LocalDate.of(1920, 1, 1).toEpochDay();
                             int maxDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
                             long randomDay = minDay + random.nextInt(maxDay - minDay);

                             LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

                             return randomBirthDate;
              }

              public void clicktripDetails() throws InterruptedException {
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             BrowserFactory.scrolldown(driver);
                             Thread.sleep(2000);
                             BrowserFactory.explicitWait(driver, tripDetailsEdit);
                             tripDetailsEdit.click();
                             Thread.sleep(2000);
              }

              // Click Edit icon in TRIP Details
              public void clickeditTripDetails(Boolean changeDestination, String destination) throws InterruptedException {
                             clicktripDetails();
                             Thread.sleep(2000);
                             toMonth.clear();
                             fromMonth.clear();
                             fromMonth.sendKeys(Helper.increateDateByDay(1));
                             Thread.sleep(2000);
                             if (changeDestination == true) {
                                           ChangeDestination(destination);
                             }

                             // toMonth.clear();
                             increaseDate(toMonth);
                             // toMonth.sendKeys(increaseDate(element));

              }

              public void medicalTraveller(int traveller) throws InterruptedException {

                             {
                                           /* preExistingCondition.click(); */
                                           /*
                                           * primaryYes.click(); primaryAssess.click();
                                           */

                                           boolean primaryTraveller = traveller == 1;
                                           boolean secondaryTraveller = traveller == 2;
                                           boolean dependentTraveller = traveller == 3;
                                           if (primaryTraveller) {
                                                          Thread.sleep(3000);
                                                          BrowserFactory.scrolltoElement(driver, primaryYes);
                                                          primaryYes.click();
                                                          Thread.sleep(3000);
                                                          BrowserFactory.scrolltoElement(driver, primaryAssess);
                                                          primaryAssess.click();
                                           } else if (secondaryTraveller) {
                                                          secondaryYes.click();
                                                          secondaryAssess.click();
                                           }

                                           else if (dependentTraveller) {
                                                          dependentYes.click();
                                                          dependentAssess.click();
                                           }

                             }
              }

              public void medicalAssessment(int medcondition) throws InterruptedException {

                             if (medcondition == 1) {

                                           BrowserFactory.scrolltoElement(driver, option4Yes);
                                           option4Yes.click();
                                           BrowserFactory.scrolltoElement(driver, continueWithResume);
                                           continueWithResume.click();

                             } else {
                                           option1Yes.click();
                                           option2No.click();
                                           option3No.click();
                                           option4Yes.click();
                                           continueWithResume.click();
                             }
              }

              public void conditionname(String disease) throws InterruptedException {
                             {
                                           Thread.sleep(8000);
                                           BrowserFactory.explicitWait(driver, conditionName);
                                           conditionName.sendKeys(disease);
                                           Thread.sleep(8000);
                                           BrowserFactory.explicitWait(driver, condtionClick);
                                           condtionClick.click();
                                           BrowserFactory.explicitWait(driver, startDeclaration);
                                           startDeclaration.click();
                                           BrowserFactory.explicitWait(driver, noInsulin);
                                           noInsulin.click();
                                           BrowserFactory.explicitWait(driver, selectZero);
                                           selectZero.click();
                                           BrowserFactory.explicitWait(driver, noChainSmoker);
                                           noChainSmoker.click();
                                           BrowserFactory.explicitWait(driver, doYouHaveAnyOfTheAbove);
                                           doYouHaveAnyOfTheAbove.click();
                                           BrowserFactory.explicitWait(driver, done);
                                           BrowserFactory.explicitWait(driver, done);
                                           done.click();
                                           BrowserFactory.explicitWait(driver, advisedToTakeMedicationForBloodPressure);
                                           advisedToTakeMedicationForBloodPressure.click();
                                           Thread.sleep(2000);
                                           advisesToTakeMedicationForCholestrol.click();

                                           WebDriverWait wait = new WebDriverWait(driver, 40);

                             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue']")));
                                           continuelast.click();
                                           BrowserFactory.explicitWait(driver, completeDeclaration);
                                           completeDeclaration.click();
                             }

              }

              public void acceptmedicalPremium() throws InterruptedException

              {

                             BrowserFactory.explicitWait(driver, acceptPremium);
                             Thread.sleep(4000);
                             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", acceptPremium);
                             Helper.waitForLoader(driver);
                             Thread.sleep(5000);

              }

              public void cancelPolicybutton(String reason, String option, PolicySummaryPage summarypage)
                                           throws InterruptedException {

                             /* BrowserFactory.scrolltoElement(driver,cancelbutton); */

                             Boolean continueRevisionbutton = BrowserFactory.isElementPresent(driver, continueRevision);
                             if (continueRevisionbutton == true) {

                                           Assert.assertTrue(false, "Cannot cancel the policy when it is under revision");
                                           Boolean cancelbtn = BrowserFactory.isElementPresent(driver, cancelbutton);
                                           if (cancelbtn == true) {
                                                          Assert.assertTrue(false, "Cannot button should not be available when it is under continue revision");
                                           }

                             } else {
                                           cancelPolicybutton.click();
                                           enterNotesInPrompt();

                                           Select sel = new Select(reasonClick);
                                           if (reason.equalsIgnoreCase("Insured Request")) {
                                                          sel.selectByVisibleText(reason);
                                                          cancelPolicy.click();
                                                          Thread.sleep(5000);
                                                          if (option.equalsIgnoreCase("Yes")) {
                                                                        BrowserFactory.explicitWait(driver, cancelPolicyYes);
                                                                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelPolicyYes);
                                                                        Thread.sleep(8000);
                                                                        Boolean flag = BrowserFactory.isElementPresent(driver, initiateRefund);
                                                                        if (flag == true) {
                                                                                      summarypage.initiateRefund();
                                                                        } else {
                                                                                      Assert.assertTrue(false, "it failed due to api issue");
                                                                        }

                                                          } else {
                                                                        cancelPolicyNo.click();
                                                          }

                                           } else if (reason.equalsIgnoreCase("Underwriter Request")) {
                                                          sel.selectByVisibleText(reason);
                                                          cancelPolicy.click();
                                                          if (option.equalsIgnoreCase("Yes")) {
                                                                        BrowserFactory.explicitWait(driver, cancelPolicyYes);
                                                                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelPolicyYes);
                                                                        Thread.sleep(8000);
                                                                        Boolean flag = BrowserFactory.isElementPresent(driver, initiateRefund);
                                                                        if (flag == true) {
                                                                                      summarypage.initiateRefund();
                                                                        } else {
                                                                                      Assert.assertTrue(false, "it failed due to api issue");
                                                                        }
                                                          } else {
                                                                        cancelPolicyNo.click();
                                                          }
                                           }
                             }
              }

              public void medicalScenario(int traveller, int medcondition, String disease) throws InterruptedException {
                             {
                                           BrowserFactory.scrolltoElement(driver, preExistingCondition);
                                           preExistingCondition.click();
                                           Helper.waitForLoader(driver);
                                           medicalTraveller(traveller);
                                           medicalAssessment(medcondition);
                                           conditionname(disease);
                                           acceptmedicalPremium();
                                           continuewithMedical.click();

                             }

              }

              public void increaseDate(WebElement element) throws InterruptedException {

                             // toMonth.sendKeys(currentLocaldate());
                             // String date = toMonth.getAttribute("value");
                             String values[] = Helper.currentLocaldate().split("/");
                             String month = values[1];
                             int previousMonth = Integer.parseInt(month);
                             int newMonth = previousMonth + 2;
                             String newDate = values[0] + "/" + newMonth + "/" + values[2];
                             element.sendKeys(newDate);
                             Thread.sleep(2000);
                             saveChanges.click();
                             Helper.waitForLoader(driver);
                             Thread.sleep(2000);
              }
}
