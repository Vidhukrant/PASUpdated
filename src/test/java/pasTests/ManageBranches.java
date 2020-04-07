package pasTests;

import org.testng.annotations.Test;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import com.aventstack.extentreports.MediaEntityBuilder;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.ManageBranchePage;
import pasPages.ManagePromoCodesPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class ManageBranches extends BaseClass {
              PolicyPaymentsPage paymentpage;
              PolicyDetailsPage policydetailspage; 
              ManageBranchePage manageBranches;
              LoginPage loginPage ;
    String branchName;
    String newbranchName;


              @BeforeClass
              public void prerequisites() throws InterruptedException
              {

                             
                             loginPage = PageFactory.initElements(driver, LoginPage.class);
                             BrowserFactory.quitBrowser(driver,loginPage);
                             paymentpage=PageFactory.initElements(driver, PolicyPaymentsPage.class);
                             manageBranches= PageFactory.initElements(driver, ManageBranchePage.class);
                             loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
                             manageBranches.clickManageBranches();

              }

              @Test(description="Validate Manage Branches Page")
              public void tc1() throws InterruptedException {
                             logger = report.createTest("Validating ManageBranches page"); 
                             manageBranches.validatePage();
                             
                             // enter traveler data
              }

              @Test(description="Inserting values for new branch")
              public void tc2() throws InterruptedException
              {
                             logger = report.createTest("Input data in add branch");  
                             manageBranches.clickAddBranch();
                             manageBranches.selectFromAutoClub();
                             branchName=manageBranches.inputValues();
                             

              }

              @Test(description="Validating SuccessFul message after adding branch")
              public void tc3() throws InterruptedException
              {
                             logger = report.createTest("Validating SuccessFul message after adding branch");   
                             manageBranches.validateSuccessMessage();

              }
              @Test(description="Verifying the branch which added SuccessFully")
              public void tc4() throws InterruptedException
              {
                             logger = report.createTest("Validating branch added SuccessFully");  
                             manageBranches.selectFromManageBranches();
                             manageBranches.pageIgnation();
                             manageBranches.validateBranchName(branchName);

              }
              @Test(description="Edit branch name and validating the message after updating")
              public void tc5() throws InterruptedException
              {
                             logger = report.createTest("Editing branch name and validating the message after updating"); 
                            newbranchName=manageBranches.editBranchName(branchName);
                             manageBranches.validateupdateMessage();
                             

              }
              
              @Test(description="Verifying branch which updated SuccessFully")
              public void tc6() throws InterruptedException
              {
                             logger = report.createTest("Validating branch updated SuccessFully");  
                             manageBranches.selectFromManageBranches();
                             manageBranches.pageIgnation();
                             manageBranches.validateBranchName(newbranchName);

              }
              
              @Test(description="Deactivating branch and validating message")
              public void tc7() throws InterruptedException
              {
                             logger = report.createTest("Deactivating branch and validating message");         
                             manageBranches.deactivateBranchName(newbranchName);
                             manageBranches.validatedeactivateMessage();

              }
              
              @Test(description="Verifying branch after deactivating successfully")
              public void tc8() throws InterruptedException
              {
                             logger = report.createTest("Validate branch after deactivating successfully");   
                             manageBranches.selectFromManageBranches();
                             manageBranches.pageIgnation();
                            manageBranches.validateBranchAfterDeactivate(newbranchName);

              }
              


}
