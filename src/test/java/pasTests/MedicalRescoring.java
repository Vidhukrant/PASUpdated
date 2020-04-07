package pasTests;

import org.testng.annotations.Test;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import RACVUtility.BrowserFactory;
import pasPages.DashBoardPage;
import pasPages.LoginPage;
import pasPages.PolicyDetailsPage;
import pasPages.PolicyPaymentsPage;
import pasPages.PolicySummaryPage;

public class MedicalRescoring extends BaseClass {
	String expectedAmount;
	PolicyDetailsPage policyDetailsPage;
	DashBoardPage DashBoardPage;

	@BeforeMethod
	public void PreRequisite() throws InterruptedException 
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		BrowserFactory.quitBrowser(driver,loginPage);
		
		loginPage.signintoApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		policyDetailsPage=PageFactory.initElements(driver, PolicyDetailsPage.class);

		DashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);



	}
	@Test(description="Updating Detination in Trip Details and increasing to date by two months and comparing additonal premium and medical score before and after replacing the destination")
	public void tc1() throws InterruptedException 
	{
		logger = report.createTest("Updating Detination in Trip Details and increasing to date by two months and comparing additonal premium and medical score before and after replacing the destination");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",7, 1));
		DashBoardPage.clickSearchedPolicy();



		policyDetailsPage.clickUpdatePolicybutton();
		
		policyDetailsPage.getResume();
		
		Reporter.log("---Before Change---");
		
		String BeforechangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
		String BeforechangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
		
		 Reporter.log("Before Replacing the existing Destination AddionalPremium value " + BeforechangeMedicalconditionvalue);
	 	 Reporter.log("Before Replacing the existing Destination Medical score value: " + BeforechangeMedicalscorevalue);
	 		
		
         policyDetailsPage.cancelMedical();
         
		
         policyDetailsPage.replaceNewDestination(config.getDataFromConfig("MedicalRescoringReplaceDestination"));
        
         policyDetailsPage.acceptPremiumAfterEditing();
         
         Reporter.log("---After Change---");
  		
  		String AfterchangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
  		String AfterchangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
  		
  		 Reporter.log(AfterchangeMedicalconditionvalue);
         Reporter.log(AfterchangeMedicalscorevalue);
         
         Reporter.log("After Replacing the existing Destination AddionalPremium value " + AfterchangeMedicalconditionvalue);
 		Reporter.log("After Replacing the existing Destination Medical score value: " + AfterchangeMedicalscorevalue);
 		
 		
 		
        SoftAssertions softly = new SoftAssertions();



 		softly.assertThat(BeforechangeMedicalconditionvalue).as("Medical Condition").isNotEqualTo(AfterchangeMedicalconditionvalue);
 		softly.assertThat(BeforechangeMedicalscorevalue).as("MedicalScore").isNotEqualTo(AfterchangeMedicalscorevalue);
 		softly.assertAll();
          
     }
	
  @Test(description="Adding New Destination with the Existing one and validate medical premium before and after change")
	public void tc2() throws InterruptedException 
	{
		logger = report.createTest("Adding New Destination with the Existing one and validate medical premium before and after change");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",8, 1));
		DashBoardPage.clickSearchedPolicy();



		policyDetailsPage.clickUpdatePolicybutton();
		
		policyDetailsPage.getResume();
		
		Reporter.log("---Before Change---");
		
		String BeforechangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
		String BeforechangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
		
		 Reporter.log("Before Adding new Destination with the existing Destination AddionalPremium value " + BeforechangeMedicalconditionvalue);
	 	 Reporter.log("Before Adding new Destination with the existing Destination Medical score value: " + BeforechangeMedicalscorevalue);
	 		
		
         policyDetailsPage.cancelMedical();
         
		
         policyDetailsPage.addNewDestination(config.getDataFromConfig("MedicalRescoringAddDestination"));
         
         
         
         policyDetailsPage.acceptPremiumAfterEditing();
         
         
         
         Reporter.log("---After Change---");
  		
  		String AfterchangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
  		String AfterchangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
  		
  		 Reporter.log(AfterchangeMedicalconditionvalue);
         Reporter.log(AfterchangeMedicalscorevalue);
         
         Reporter.log("After Adding new Destination with the existing Destination AddionalPremium value " + AfterchangeMedicalconditionvalue);
 		Reporter.log("After Adding new Destination with the existing Destination Medical score value: " + AfterchangeMedicalscorevalue);
 		
 		
 		
 		SoftAssertions softly = new SoftAssertions();



 		softly.assertThat(BeforechangeMedicalconditionvalue).as("MedicalPremium").isNotEqualTo(AfterchangeMedicalconditionvalue);
 		softly.assertThat(BeforechangeMedicalscorevalue).as("Medical Score").isNotEqualTo(AfterchangeMedicalscorevalue);
 		softly.assertAll();
          
}
	@Test(description="Updating Travel plan and verifying whether the additional premium and medical score is getting changed after updating travel plan")
	public void tc3() throws InterruptedException 
	{
		logger = report.createTest("Updating Travel plan and verifying whether the additional premium and medical score is getting changed after updating travel plan");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",9, 1));
		DashBoardPage.clickSearchedPolicy();



		policyDetailsPage.clickUpdatePolicybutton();
		
		policyDetailsPage.getResume();
		
		Reporter.log("---Before Change---");
		
		String BeforechangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
		String BeforechangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
		
		 Reporter.log("Before Adding new Destination with the existing Destination AddionalPremium value " + BeforechangeMedicalconditionvalue);
	 	 Reporter.log("Before Adding new Destination with the existing Destination Medical score value: " + BeforechangeMedicalscorevalue);
	 		
		
         policyDetailsPage.cancelMedical();
         
         policyDetailsPage.edittravelCareformedicalrescoring();
         policyDetailsPage.changeCurrentPlanWithSaveChanges();
        
         policyDetailsPage.acceptPremiumAfterEditing();
         
         
         
         Reporter.log("---After Change---");
  		
  		String AfterchangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
  		String AfterchangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
  		
  		 Reporter.log(AfterchangeMedicalconditionvalue);
         Reporter.log(AfterchangeMedicalscorevalue);
         
         Reporter.log("After Adding new Destination with the existing Destination AddionalPremium value " + AfterchangeMedicalconditionvalue);
 		Reporter.log("After Adding new Destination with the existing Destination Medical score value: " + AfterchangeMedicalscorevalue);
 		
 		
 		SoftAssertions softly = new SoftAssertions();



 		softly.assertThat(BeforechangeMedicalconditionvalue).as("Medical premium").isNotEqualTo(AfterchangeMedicalconditionvalue);
 		softly.assertThat(BeforechangeMedicalscorevalue).as("Medical score").isEqualTo(AfterchangeMedicalscorevalue);
 		softly.assertAll();
          
}
  @Test(description="Updating Name, Contact details and mobile no in the Travellers Endorsement and verifying whether the additional premium and medical score is getting changed after edit.")
	public void tc4() throws InterruptedException 
	{
		logger = report.createTest("Updating Name, Contact details and mobile no in the Travellers Endorsement and verifying whether the additional premium and medical score is getting changed after edit.");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",10, 1));
		DashBoardPage.clickSearchedPolicy();



		policyDetailsPage.clickUpdatePolicybutton();
		
		policyDetailsPage.getResume();
		
		Reporter.log("---Before Change---");
		
		String BeforechangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
		String BeforechangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
		
		 Reporter.log("Before change in Name contact details and Mobile No  AddionalPremium value" + BeforechangeMedicalconditionvalue);
	 	 Reporter.log("Before change in Name contact details and Mobile No Medical score value: " + BeforechangeMedicalscorevalue);
	 		
		
         policyDetailsPage.cancelMedical();
         
         policyDetailsPage.clickTravellerEditButton();
 		
         policyDetailsPage.updateTravellersNameContactAndMobileNo();
         policyDetailsPage.saveChange();
        
         policyDetailsPage.acceptPremiumAfterEditing();
         
         
         
         Reporter.log("---After Change---");
  		
  		String AfterchangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
  		String AfterchangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
  		
  		 Reporter.log(AfterchangeMedicalconditionvalue);
         Reporter.log(AfterchangeMedicalscorevalue);
         
         Reporter.log("After change in Name contact details and Mobile No AddionalPremium value " + AfterchangeMedicalconditionvalue);
 		 Reporter.log("After change in Name contact details and Mobile No Medical score value: " + AfterchangeMedicalscorevalue);
 		
 		

 		
 		 SoftAssertions softly = new SoftAssertions();

 		

 		softly.assertThat(BeforechangeMedicalconditionvalue).as("MedicalPremium").isEqualTo(AfterchangeMedicalconditionvalue);
 		softly.assertThat(BeforechangeMedicalscorevalue).as("Medical score").isEqualTo(AfterchangeMedicalscorevalue);
 		softly.assertAll();
          
}
	
	
	@Test(description="Updating Age in the Travellers Endorsement and verifying whether the additional premium and medical score is getting changed after edit.")
	public void tc5() throws InterruptedException 
	{
		logger = report.createTest("Updating Age in the Travellers Endorsement and verifying whether the additional premium and medical score is getting changed after edit.");
		DashBoardPage.searchPolicy(excel.getStringData("PolicyNumber",7, 1));
		DashBoardPage.clickSearchedPolicy();



		policyDetailsPage.clickUpdatePolicybutton();
		
		policyDetailsPage.getResume();
		
		Reporter.log("---Before Change---");
		
		String BeforechangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
		String BeforechangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
		
		 Reporter.log("Before change in Age  AddionalPremium value" + BeforechangeMedicalconditionvalue);
	 	 Reporter.log("Before change in Age  Medical score value: " + BeforechangeMedicalscorevalue);
	 		
		
         policyDetailsPage.cancelMedical();
         
         policyDetailsPage.clickTravellerEditButton();
 		
         
         policyDetailsPage.increaseDateByYear(policyDetailsPage.PriDob);
         policyDetailsPage.saveChange();
        
         policyDetailsPage.acceptPremiumAfterEditing();
         
        
         
         Reporter.log("---After Change---");
  		
  		String AfterchangeMedicalconditionvalue=policyDetailsPage.getAddtionalPremiumValue();
  		String AfterchangeMedicalscorevalue=policyDetailsPage.getmedicalScore();
  		
  		 Reporter.log(AfterchangeMedicalconditionvalue);
         Reporter.log(AfterchangeMedicalscorevalue);
         
         Reporter.log("After change in Age AddionalPremium value " + AfterchangeMedicalconditionvalue);
 		 Reporter.log("After change in Age Medical score value: " + AfterchangeMedicalscorevalue);
 		 
 		
 		
 		SoftAssertions softly = new SoftAssertions();

        softly.assertThat(BeforechangeMedicalconditionvalue).as("Medical Premium").isNotEqualTo(AfterchangeMedicalconditionvalue);
 		softly.assertThat(BeforechangeMedicalscorevalue).as("Medical Score").isEqualTo(AfterchangeMedicalscorevalue);
 		softly.assertAll();
          
}
}
