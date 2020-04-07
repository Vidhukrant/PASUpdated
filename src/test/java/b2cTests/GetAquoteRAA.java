package b2cTests;



import static org.assertj.core.api.Assertions.assertThat;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import RACVUtility.BrowserFactory;
import RACVUtility.Helper;
import b2cPages.AllPagesMethods;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasTests.BaseClass;


                 
public class GetAquoteRAA extends BaseClass {
              LoginPage loginPage;
              String  parent;
              
              
              
              @BeforeMethod
              public void initial() throws InterruptedException
              {
                             loginPage  = PageFactory.initElements(driver, LoginPage.class);
                             BrowserFactory.closeTab(driver);
                             BrowserFactory.quitBrowser(driver, loginPage);
              }

                 @Test(description="Validate that user is able to proceed quote with International country with no medical condition")
              public void testSingleTripInternationalNoMedicalCondition() throws InterruptedException {

                             logger = report.createTest("Validate that user is able to proceed quote with International country with no medical condition");
                            // LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                             logger.info("Starting Application");
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

                             DashBoardPage dp=PageFactory.initElements(driver, DashBoardPage.class);

                             dp.selectDropDownQuote(dp.RAA);

                             AllPagesMethods Page1 = new AllPagesMethods(driver);
                             Set<String> handles =driver.getWindowHandles();

                             for(String window : handles){
                     if (!window.equals(parent))
                     {
                               driver.switchTo().window(window);
                     }
                             }
                             Page1.getSingleTripGetQuoteRAA("ENGLAND",Helper.increateDateByDay(1), "20", "25", "");
                             AllPagesMethods Page2 = new AllPagesMethods(driver);
                             Page2.getSingleTripClickContinue();
                             AllPagesMethods Page3 = new AllPagesMethods(driver);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             Page3.pdsCondition();
                             Page3.marketCondition();
                             Page3.getNoMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             
                             //Page3.marketCondition();
                             AllPagesMethods page4 = new AllPagesMethods(driver);
                             page4.getCard("Suru", "4111111111111111", "12/23", "943");


              }

              /*@Test
              public void testAnnualMulTiTripInternationalNoMedicalCondition() throws InterruptedException {

                             logger = report.createTest("Validate that user is able to proceed quote with domestic country AMT with no medical condition");
                             LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                             logger.info("Starting Application");
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

                             DashBoardPage dp=PageFactory.initElements(driver, DashBoardPage.class);

                             dp.selectDropDownQuote(DashBoardPage.RAA);

                             AllPagesMethods Page1 = new AllPagesMethods(driver);
                             Set<String> handles =driver.getWindowHandles();

                             for(String window : handles){
                     if (!window.equals(parent))
                     {
                               driver.switchTo().window(window);
                     }
                             }
                             Page1.getMultiTripGetAQuote("ENGLAND", Helper.increateDateByDay(1), Helper.increaseDate(1), "20", "25", "",driver);
                             AllPagesMethods Page2 = new AllPagesMethods(driver);
                             Page2.getAMTClickContinue();
                             AllPagesMethods Page3 = new AllPagesMethods(driver);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             Page3.pdsCondition();
                             Page3.marketCondition();
                             Page3.getNoMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             //Page3.marketCondition();
                             AllPagesMethods page4 = new AllPagesMethods(driver);
                             page4.getCard("Suru", "4111111111111111", "12/23", "943");

              }

              @Test
              public void testforDomesticAMTNoMedicalCondition() throws InterruptedException {
                             logger = report.createTest("Validate that user is able to proceed quote with domestic AMT country with no medical condition");
                             LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                             logger.info("Starting Application");
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

                             DashBoardPage dp=PageFactory.initElements(driver, DashBoardPage.class);
                             dp.selectDropDownQuote(DashBoardPage.RAA);

                             AllPagesMethods Page1 = new AllPagesMethods(driver);
                             Set<String> handles =driver.getWindowHandles();

                             for(String window : handles){
                     if (!window.equals(parent))
                     {
                               driver.switchTo().window(window);
                     }
                             }
                             Page1.getMultiTripDomestic("AUSTRALIA", Helper.increateDateByDay(1), Helper.increaseDate(1), "20", "25", "",driver);
                             AllPagesMethods Page2 = new AllPagesMethods(driver);
                             Page2.getSingleTripClickContinue();
                             AllPagesMethods Page3 = new AllPagesMethods(driver);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             Page3.pdsCondition();
                             Page3.marketCondition();
                             Page3.getNoMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             //Page3.marketCondition();
                             AllPagesMethods page4 = new AllPagesMethods(driver);
                             page4.getCard("Suru", "4111111111111111", "12/23", "943");

              }

              @Test
              public void testforDomesticSingleTripNoMedicalCondition() throws InterruptedException {
                             logger = report.createTest("Validate that user is able to proceed quote with domestic country with no medical condition");
                             LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                             logger.info("Starting Application");
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

                             DashBoardPage dp=PageFactory.initElements(driver, DashBoardPage.class);

                             dp.selectDropDownQuote(DashBoardPage.RAA);

                             AllPagesMethods Page1 = new AllPagesMethods(driver);
                             Set<String> handles =driver.getWindowHandles();

                             for(String window : handles){
                     if (!window.equals(parent))
                     {
                               driver.switchTo().window(window);
                     }
                             }

                             Page1.getSingleTripDomestic("AUSTRALIA", Helper.increateDateByDay(1), "20", "25", "");
                             AllPagesMethods Page2 = new AllPagesMethods(driver);
                             Page2.getSingleTripClickContinue();
                             AllPagesMethods Page3 = new AllPagesMethods(driver);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             Page3.pdsCondition();
                             Page3.marketCondition();
                             Page3.getNoMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             //Page3.marketCondition();
                             AllPagesMethods page4 = new AllPagesMethods(driver);
                            page4.getCard("Suru", "4111111111111111", "12/23", "943");

              }

           @Test
              public void testSingleTripDomesticYesMedicalCondition() throws InterruptedException {
                             logger = report.createTest("Validate that user is able to proceed quote with domestic country with yes medical condition");
                             LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                             logger.info("Starting Application");
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

                             DashBoardPage dp=PageFactory.initElements(driver, DashBoardPage.class);

                             dp.selectDropDownQuote(DashBoardPage.RAA);

                             AllPagesMethods Page1 = new AllPagesMethods(driver);
                             Set<String> handles =driver.getWindowHandles();

                             for(String window : handles){
                     if (!window.equals(parent))
                     {
                               driver.switchTo().window(window);
                     }
                             }
                             Page1.getSingleTripDomestic("AUSTRALIA", Helper.increateDateByDay(1), "20", "25", "");
                             AllPagesMethods Page2 = new AllPagesMethods(driver);
                             Page2.getSingleTripClickContinue();
                             AllPagesMethods Page3 = new AllPagesMethods(driver);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             Page3.pdsCondition();
                             Page3.marketCondition();
                             Page3.RACQgetYesMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                             AllPagesMethods MPage3 = new AllPagesMethods(driver);
                             MPage3.getYesMedicalConditionDeclaration();
                             MPage3.getAccessMedicalConditionDeclaration();
                             AllPagesMethods AssessPage = new AllPagesMethods(driver);
                             AssessPage.getMedicalAssessmentRACQ();
                             AssessPage.getMedicalAssessmentSearch("Diabetes",driver);
                             MPage3.getMedicalConditionCOntinueLaststage();
                             //Page3.pdsCondition();
                             //Page3.marketCondition();
                             AllPagesMethods page4 = new AllPagesMethods(driver);
                             page4.getCard("Suru", "4111111111111111", "12/23", "943");

              }

              @Test
              public void testforDomesticAMTYesMedicalCondition() throws InterruptedException {
                             logger = report.createTest("Validate that user is able to proceed quote with domestic country with yes medical condition");
                             LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                             logger.info("Starting Application");
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

                             DashBoardPage dp=PageFactory.initElements(driver, DashBoardPage.class);

                             dp.selectDropDownQuote(DashBoardPage.RAA);

                             AllPagesMethods Page1 = new AllPagesMethods(driver);
                             Set<String> handles =driver.getWindowHandles();

                             for(String window : handles){
                     if (!window.equals(parent))
                     {
                               driver.switchTo().window(window);
                     }
                             }
                             Page1.getMultiTripDomestic("AUSTRALIA", Helper.increateDateByDay(1), Helper.increaseDate(1), "20", "25", "",driver);
                             AllPagesMethods Page2 = new AllPagesMethods(driver);
                             Page2.getAMTClickContinue();
                             AllPagesMethods Page3 = new AllPagesMethods(driver);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             Page3.pdsCondition();
                             Page3.marketCondition();
                             Page3.RACQgetYesMedicalCondition();
                             Page3.confirmAndFinaliseQuote();
                            
                            
                             AllPagesMethods MPage3 = new AllPagesMethods(driver);
                             MPage3.getYesMedicalConditionDeclaration();
                             MPage3.getAccessMedicalConditionDeclaration();
                             AllPagesMethods AssessPage = new AllPagesMethods(driver);
                             AssessPage.getMedicalAssessmentRACQ();
                             AssessPage.getMedicalAssessmentSearch("Diabetes",driver);
                             MPage3.getMedicalConditionCOntinueLaststage();
                             //Page3.pdsCondition();
                             //Page3.marketCondition();
                             AllPagesMethods page4 = new AllPagesMethods(driver);
                             page4.getCard("Suru", "4111111111111111", "12/23", "943");

              }

              @Test
              public void testSingleTripInternationalYesMedicalCondition() throws InterruptedException {
                             logger = report.createTest("Validate that user is able to proceed quote with international trip with yes medical condition");
                             LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                             logger.info("Starting Application");
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

                             DashBoardPage dp=PageFactory.initElements(driver, DashBoardPage.class);
                             dp.selectDropDownQuote(DashBoardPage.RAA);

                             AllPagesMethods Page1 = new AllPagesMethods(driver);
                             Set<String> handles =driver.getWindowHandles();

                             for(String window : handles){
                                           if (!window.equals(parent))
                                           {
                                                          driver.switchTo().window(window);
                                           }
                             }
                         Page1.getSingleTripGetQuote("ENGLAND",Helper.increateDateByDay(1), "20", "25", "");
                             AllPagesMethods Page2 = new AllPagesMethods(driver);
                             Page2.getSingleTripClickContinue();
                             AllPagesMethods Page3 = new AllPagesMethods(driver);
                             Page3.getNoMedicalConditionWithoutDependent("Jenifer", "Rajan", "03/01/2000", "Sowmiya", "Rajan", "03/01/1995",
                                                          "Address1", "SALISBURY DOWNS", "5108", "Vikash.3.Pandey@NIIT-Tech.com", "Vikash.3.Pandey@NIIT-Tech.com",
                                                          "8892414134");
                             Page3.pdsCondition();
         Page3.marketCondition();
         Page3.RACQgetYesMedicalCondition();
         Page3.confirmAndFinaliseQuote();
                             
                             AllPagesMethods MPage3 = new AllPagesMethods(driver);
                             MPage3.getYesMedicalConditionDeclaration();
                             MPage3.getAccessMedicalConditionDeclaration();
                             AllPagesMethods AssessPage = new AllPagesMethods(driver);
                             AssessPage.getMedicalAssessmentRACQ();
                             AssessPage.getMedicalAssessmentSearch("Diabetes",driver);
                             MPage3.getMedicalConditionCOntinueLaststage();
                             //Page3.pdsCondition();
                             //Page3.marketCondition();
                             AllPagesMethods page4 = new AllPagesMethods(driver);
                             page4.getCard("Suru", "4111111111111111", "12/23", "943");

              }
*/}


