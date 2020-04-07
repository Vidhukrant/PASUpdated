package b2cPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import RACVUtility.BrowserFactory;
import RACVUtility.Helper;

public class AllPagesMethods extends BaseB2C{

	public AllPagesMethods(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}


	// By singleTripSelect = By.xpath("//label[@class='btn btn-sm btn-light']");
	// Now By singleTripSelect = By.xpath("//label[@class='btn btn-sm btn-light
	// active']");
	// By singleTripSelect =By.xpath("//*[contains(text(),'Single Trip')]");
	By singleTripSelect = By.xpath("//*[@data-auto-id='singleTrip']");
	By annualMultiTrip = By.cssSelector("label#mlttrip");
	// England
	By travelDestination = By.cssSelector("#country");
	By travelCancel = By.xpath("//*[text()=' Single Trip ']");
	By destinationEntry = By.xpath("//*[contains(@class,'mat-option-text')]");
	//By destinationEntry = By.cssSelector("span.mat-option-text");

	By destinationDOmesticSelect = By.xpath("//*[text()=' AUSTRALIA ']");
	By departDate = By.xpath("//input[@id='departDate']");
	By returningOnDate = By.xpath("//input[@id='returnDate']");
	By AgePrimarytraveller = By.xpath("//input[@id='ageFirst']");
	By AgeSecondaryTravel = By.xpath("//input[@id='ageSecond']");
	By NoofDependants = By.xpath("//input[@id='dependantCount']");
	By State = By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']");
	By state_click = By.xpath("//span[text()='SA']");
	By AreyouanRACMember = By.xpath("//span[@class='ng-tns-c7-9 ng-star-inserted']");
	By AreyouanRACMemberNoClick = By.xpath("//span[contains(text(),'No')]");
	By Getaquote = By.xpath("//*[contains(text(),'Get a Quote')] | //*[contains(text(),'Get a quote')]");
	// message return
	By Getquotesuccessmessage = By.xpath("//h1[@class='jumbotron-heading']");
	//By DomesticInternationalMessage = By.xpath(
	//                         "//*[contains(text(),' We can not complete your request.  You cannot mix Domestic and International travel on a single policy.   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND   AUSTRALIA,LORD HOWE ISLAND,NORFOLK ISLAND')]");

	By DomesticInternationalMessage=By.xpath("//*[@data-auto-id='countryErrorSix']");
	By traveldeserrormsg = By.xpath("//*[text()='Please select the Travel Destination']");
	By LeavingDate = By.xpath("//*[contains(text(),'Please select the Departure Date')]");
	By ReturnDate = By.xpath("//*[contains(text(),'Please select the Return Date')]");
	By leavingandReturnsamedate = By
			.xpath("//*[contains(text(),'Return Date cannot be the same as the Departure Date ')]");
	By PrimaryAge = By.xpath("//*[text()=' Please enter the age of the Primary Traveller ']");
	By SingleTripAgeBelow18and110Year = By.xpath("//*[text()=' Age of Traveller must be between 18-110 ']");
	By departureDateMoreErrorMsg = By
			.xpath("//*[contains(text(),'Departure date cannot be date before the current date')]");
	By returnDateLessErrorMsg = By.xpath("//*[contains(text(),'Return Date cannot be less than the Departure Date')]");
	By Leaving548daysforbothsingleandamt = By.xpath("(//*[contains(@id,'mat-error')])[1]");
	By singletripretutndate365days = By
			.xpath("//*[contains(text(),'Return Date cannot be more than 365 days from the Departure Date')]");
	//By AMTAgebelow18and75year = By.xpath(
	//"/html[1]/body[1]/div[1]/div[1]/step-one[1]/main[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/mat-error[1]");
	By AMTAgebelow18and75year=By.xpath("//*[contains(text(),' Age of Traveller must be between 18 and 75. ')]");
	By AMTretrundate60days = By
			.xpath("//*[text()=' Return Date must be less than or equal to 60 days from the Departure Date. ']");
	By returndateAMTerrormsg = By
			.xpath("//*[contains(text(),'Return Date cannot be the same as the Departure Date ')]");
	By detailPageYesRACQ = By.xpath("//*[@data-auto-id='preMedicalConditionYes']"); 
	By departDateWhole = By.xpath("(//div[contains(@class,'row')])[4]/div[contains(@class,'col')][2]");

	By againstMedicalAdviceOrMedicalTreatmentYes=By.xpath("//*[contains(text(),'Are you/this person travelling against medical advice or for medical treatment?')]//..//..//mat-button-toggle-group[1]//mat-button-toggle[1]//button[1]//div[1]");
	By againstMedicalAdviceOrMedicalTreatmentNo=By.xpath("//*[@data-auto-id='mediclAdviceNo']");

	By awaitingSurgeryTreatmentInvestigationOfProceduresYes=By.xpath("//*[contains(text(),' Are you/this person currently awaiting surgery, treatment, investigation of procedures?')]//..//..//mat-button-toggle-group[1]//mat-button-toggle[1]//button[1]//div[1]");
	By awaitingSurgeryTreatmentInvestigationOfProceduresNo =By.xpath("//*[@data-auto-id='mediclAdviceNoOne']");

	By option3Yes=By.xpath("//*[contains(text(),'Have you/this person ever or currently have any condition that involves your heart, brain, circulatory system/blood vessels, your lung or respiratory conditions, any type of cancer, or any Mental Illness, reasonably known to you, for which treatment, medication, surgery or advice has been received or prescribed by a medical practitioner or health professional prior to your purchase of this policy?')]//..//..//mat-button-toggle-group[1]//mat-button-toggle[1]//button[1]//div[1]");
	By option3No=By.xpath("//*[@data-auto-id='mediclAdviceNoTwo']"); 

	By modalCancel=By.xpath("//div[@class='close-btn-wrap']//span[contains(text(),'×')]");


	By option4Yes=By.xpath("//*[@data-auto-id='mediclAdviceYesThree']"); 
	By option4No=By.xpath("//*[contains(text(),' Do you/this person understand that any medical condition not declared will result in having no cover for any claim exacerbated by, arising from or related to that medical condition? ')]//..//..//mat-button-toggle-group[1]//mat-button-toggle[2]//button[1]//div[1]");

	
	By continueOption=By.xpath("//*[@data-auto-id='NextTravellerBtnText']"); 
		 


	By conditionName=By.cssSelector("input.verisk-form-control");

	By condtionClick=By.xpath("//*[text()='Diabetes']");
	By conditionClick1=By.xpath("//div[contains(text(),'Diabetes insipidus')]");

	By conditionClick2=By.xpath("//div[contains(text(),'Diabetes in pregnancy')]");

	By startDeclaration=By.xpath("//button[@class='verisk-btn verisk-btn-primary verisk-right-float']");

	By noInsulin=By.xpath("//label[text()='No']");
	By selectZero=By.xpath("//div[@class='col-lg-3 col-auto']/label[text()='0']");
	By noChainSmoker=By.xpath("//label[div[div[text()='No']]]");
	By doYouHaveAnyOfTheAbove=By.xpath("//label[div[div[text()='No - none of the above']]]");
	By done=By.xpath("//button[text()='Done']");
	By advisedToTakeMedicationForBloodPressure=By.xpath("//div[@class='col-lg-3 col-auto']/label[text()='No']");

	By advisesToTakeMedicationForCholestrol=By.xpath("//div[@class='col-lg-3 col-auto']/label[text()='No']");
	By continueLast=By.xpath("//*[text()='Continue']");
	By completeDeclaration=By.cssSelector("#btnReactFinish");
	By acceptPremium=By.xpath("//button[contains(text(),'Accept')]");
	By declinePremium=By.xpath("//*[text()=' Decline ']");
	By ExtraTravelPremium=By.xpath("(//*[text()=' CHOOSE '])[1]");
	By EditTrip=By.xpath("//span[@class='textsize']");

	By Continue = By.xpath("//button[contains(text(),'CONTINUE')]");
	By Show_Benefit = By.xpath("//*[@id=\"headingOne\"]/h2/button");
	By ChooseExcess = By.xpath("//*[@id=\"mat-select-7\"]/div/div[2]");
	//By Going_On_CruiseNo = By.xpath("//*[@id=\"mat-button-toggle-25-button\"]/div");
	By Going_On_CruiseNo = By.xpath("//td[contains(text(),'Going on a Cruise?~')]//..//div[contains(text(),'Yes')]");
	By Ski_Winter_No = By.xpath("//*[@id=\"mat-button-toggle-27-button\"]/div");
	//By Edit = By.xpath("//*[@id=\"Capa_1\"]");
	By Edit=By.xpath("//span[contains(text(),'Edit trip details')]");

	By primaryFirstName = By.id("userFirstName");
	By primaryLastName = By.cssSelector("#userLastName");
	By primaryDOB = By.id("PrimaryTravelerDateOfBirth");
	By secondaryFirstName = By.id("adUserFirstName");
	By secondaryFirstName2 = By.xpath("//input[@id='adUserFirstName']");
	By secondaryLastName = By.id("adUserLastName");
	By secondaryDOB = By.id("adTravelerDateOfBirth");
	By dobDialogBoxYesErrorMessage = By
			.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'Yes')]]");
	By dobDialogBoxNoErrorMessage = By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'No')]]");
	By streetAddress = By.id("userStreetAddress");
	By suburb = By.id("userSubUrb");
	By stateDropdown = By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-value']");
	By stateSelect = By.xpath("//span[text()='SA']");
	By postCode = By.id("userPostcode");
	By emailAddress = By.id("userEmailAddress");
	By confirmEmailAddress = By.id("userConfirmEmailAddress");
	By mobilePhoneNo = By.xpath("//input[@id='userPhoneNumber']");
	//By addDependent = By.xpath("//i[@class='fa fa-plus-circle pl-3']");
	By addDependent=By.xpath("//span[contains(text(),'Add Dependents')]");
	By deleteDependents = By.xpath("//*[@class='fa fa-times remove-dependents']");
	By dependentFirstName = By.xpath("//input[@id='dependentFirstName0']");
	By dependentLastName = By.xpath("//input[@id='dependentLastName0']");
	By dependentDOB = By.xpath("//input[@id='dependentAgeId0']");
	By detailPageYes = By.xpath("//*[@data-auto-id='preMedicalConditionYes']");
	By detailPageRACYes=By.xpath("(//div[contains(text(),'Yes')])[3]");

	// for Racv USe //*[contains(text(),' Confirm your details > ')]

	By confirmAndFinaliseQuote = By.xpath("//button[@data-auto-id='ConfirmBtnText']");
	/*By confirmAndFinaliseQuote = By.xpath("//*[contains(text(),' Confirm your details > ')]");*/

	By confirmAndFinalizeQuoteRAC=By.xpath("//*[text()=' Confirm & Finalize Quote ']");
	By confirmAndFinalizeQuoteRACV=By.xpath("//*[text()=' CONFIRM & FINALISE QUOTE ']");
	By step3No=By.xpath("(//div[contains(text(),'No')])[3]");
	By detailPageNo = By.xpath("//*[@data-auto-id='preMedicalConditionNo']");
	By detailPageForRACNO=By.xpath("(//div[contains(text(),'No')])[4]");
	By detailPageForRACVNO=By.xpath("(//div[contains(text(),'No')])");
	By quoteSummaryEdit = By.xpath("//*[contains(text(),'Edit quote details')]");
	By returnTrip1 =By.xpath("//span[@class='num-text'] [contains(text(),'1')]");
	By cancelDialogBoxModel = By.xpath(
			"//div[@class='modal-dialog modal-dialog-centered modal-lg']//div[@class='modal-header']//span[contains(text(),'×')]");
	By sendACopyEmail = By.xpath("//input[@id='email']");
	By saveAndSend = By.xpath("//*[contains(text(),'SAVE AND SEND')]");


	By PDS_Condition=By.xpath("//*[@data-auto-id='privacyDisclaimerIDYes']");
	//By Marketing_Consent=By.xpath("(//button[@id='marketingConsentCondition-button'])[1]"); @Change
	By Marketing_Consent=By.xpath("(//button[@id='marketingConsentCondition-button'])[1]");

	// message

	//By primaryFirstNameFieldBlankErrorMessage = By.xpath("//mat-error[@id='mat-error-0']");
	By primaryFirstNameFieldBlankErrorMessage=By.xpath("//*[text()='Please enter the First Name of the Primary Traveller']");
	By primaryLastNameFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter the Last Name of the Primary Traveller ']");
	By primaryDOBFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter Date of Birth ']");
	By secondaryFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),' Please enter the First Name of the Secondary Traveller ')]");
	By secondaryLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Secondary Traveller')]");
	By secondaryDOBFieldBlankErrorMessage = By.xpath("//*[text()=' Please enter Date of Birth ']");
	By streetFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Street Address')]");
	By suburbFieldBlankErrorMessage = By.xpath("//*[contains(text(),'Please enter the Suburb')]");
	By stateBlankeErrorMessage = By.xpath("//*[contains(text(),'Please select the State you reside in')]");
	By postcodeFieldBlankErrrorMessage = By.xpath("//*[contains(text(),' Please enter the Postcode ')]");
	By postcodeInValidErrorMessage = By.xpath("//*[text()=' Please enter a valid Postcode that matches the state ']");
	By emailFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Email Address')]");
	By emailInValidErrorMessage = By.xpath("//*[contains(text(),' Please enter a valid Email address ')]");
	By confirmFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter the Confirm Email Address ')]");
	By confirmEmailInValidErrorMessage = By.xpath("//*[contains(text(),' Confirm Email address does not match with email Address ')]");
	By confirmEmailmismatchErrorMessage = By
			.xpath("//*[contains(text(),' Confirm Email address does not match with email Address ')]");

	By phoneNoFieldBlankErrorMessage = By.xpath("//*[contains(text(),' Please enter a valid Phone number ')]");
	By phoneNoValidationErrorMessage = By.xpath("//*[contains(text(),'Phone number cannot be less than 10 digits.')]");
	By dependentFirstNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the First Name of the Dependent')]");
	By dependentLastNameFieldBlankErrorMessage = By
			.xpath("//*[contains(text(),'Please enter the Last Name of the Dependent')]");
	By dependentDOBErrorMessage = By.xpath("//mat-error[@id='mat-error-58']");
	//By primaryDOBAgeBetween18and85ErrorMessage = By
	//.xpath("//*[contains(text(),'Age of Traveler must be between 18-85 if Ski/Winter Sports is opted')]");

	By primaryDOBAgeBetween18and85ErrorMessage=By.xpath("//*[contains(text(),'Age of Traveler must be between 18-110')]");
	By secondaryDOBAgeBetween18and85ErrorMessage=By.xpath("//*[contains(text(),'Age of Traveler must be between 18-110')]");


	By primaryDOBMismatchWithQuoteErrorMessage = By.xpath("//*[contains(text(),' Date of Birth entered does not match the age entered. Premium may be recalculated based on the Date of Birth entered. ')]");

	By dobDialogBoxMismatchYes=By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'Yes')]]");
	By dobDialogBoxMismatchNo=By.xpath("//div[@class='mat-dialog-actions']/button[span[contains(text(),'No')]]");

	By sendingEmailVerify = By.xpath("//div[contains(text(),' Email sent successfully ')]");
	By medicalNoConditionMessage = By.xpath("//div[@class='para-left medical-notification ng-star-inserted']");
	By navigateToPaymentPageIfNo = By.xpath("//h1[@class='jumbotron-heading']");
	//Irfan Change Continue xpath.
	/*By continueinpage2foredit = By.xpath(
                                 "//button[@class='btn btn-sm font-weight-bold continue-policy continueBG border0 btn-turqoise-color custom-theme-group-two']");
	 */
	By continueinpage2foredit = By.xpath("//*[contains(text(),'CONTINUE')]");
	By detailsTitle = By.xpath("//h1[@class='jumbotron-heading ng-star-inserted']");
	By PromoCode = By.xpath("//a[@class='text-link pl-3 pr-3 pr-sm-0 hyperlink promo-btn']");
	By EnterPromoCode = By.xpath("//input[@id='promoCode']");
	By PromoApply = By.xpath("//button[@class='btn btn-secondary']");
	By ClosePromo = By.xpath("//a[@class='close']//span[contains(text(),'×')]");
	By InvalidPromoError = By.xpath("//mat-error[@id='mat-error-1']");
	By SaveAndSend =By.xpath("//*[text()='SAVE AND SEND']");
	// By
	// CName=By.xpath("//*[@id='braintree__card-view-input__cardholder-name']");
	By CName = By.id("braintree__card-view-input__cardholder-name");
	By CCNumber = By.xpath("//*[@id='credit-card-number']");
	By ExpDate = By.xpath("//*[@id='expiration']");
	By CVV = By.xpath("//*[@id='cvv']");
	By CnfPay = By.xpath("//button[@data-auto-id='paymentBtn']");
	By CancelPay = By.xpath("//button[@class='btn btn-cancel']");
	By ErrCCName = By.xpath("//*[@data-braintree-id='cardholder-name-field-error']");
	By ErrCardNum = By.xpath("//*[contains(text(),'Please fill out a card number.')]");
	By ErrExpDate = By.xpath("//*[contains(@data-braintree-id,'expiration-date-field-error')]");
	By errCVVNumber = By.xpath("//div[contains(text(),'Please fill out a CVV.')]");
	By errInvalidCardNum = By.xpath("//div[contains(text(),'This card number is not valid.')]");
	By errInvalidExpDate = By.xpath("//div[contains(text(),'This expiration date is not valid.')]");
	By errInvalidCVVNumber = By.xpath("//div[contains(text(),'This security code is not valid.')]");

	By primaryTravellerYesClick=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/div[1]/mat-button-toggle-group[1]/mat-button-toggle[1]/button[1]/div[1]");
	By primaryTravellerNoClick=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/div[1]/mat-button-toggle-group[1]/mat-button-toggle[2]/button[1]/div[1]");
	By primaryTravellerYesAccess=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/button[1]");

	By secondaryTravellerYesClick=By.xpath("//div[@class='row pt-5 mat-custom-error']//div[2]//div[2]//div[1]//mat-button-toggle-group[1]//mat-button-toggle[1]//button[1]//div[1]");
	By secondaryTravellerNoClick=By.xpath("//div[@class='row pt-5 mat-custom-error']//div[2]//div[2]//div[1]//mat-button-toggle-group[1]//mat-button-toggle[2]//button[1]//div[1]");
	By secondaryTravellerYesAccessClick=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[2]/div[2]/button[1]");

	By dependantTravellerYesClick=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//div[@class='mat-button-toggle-label-content'][contains(text(),'Yes')]");
	By dependentTravellerNoClick=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//div[@class='mat-button-toggle-label-content'][contains(text(),'No')]");
	By dependentTravellerYesAccessClick=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//button[@class='btn btn-secondary assess-btn custom-theme-group-two ng-star-inserted'][contains(text(),'Assess')]");

	By continueClick=By.xpath("//button[contains(text(),'Continue')]");


	By primaryTravellerYesClickRAC=By.xpath("(//div[contains(text(),'Yes')])[1]");
	By primaryTravellerYesAccessRAC=By.xpath("(//*[contains(text(),'Assess')])[1]");

	//Message

	By primaryNMCErrorMessage=By.xpath("//body[contains(@class,'sitecoreTheme')]/div/div[@id='quote']/step-three/section[@class='step3']/div[@class='container']/div[@class='row pt-5 mat-custom-error']/div[@class='col-md-8 col-xl-9']/div[@class='row ng-star-inserted']/div[@class='col-md-12']/div[@class='box-panel mt-4']/div[1]/div[2]/p[1]");
	By secondaryNMCErrorMessage=By.xpath("//div[@class='row pt-5 mat-custom-error']//div[2]//div[2]//p[1]");
	By dependentNMCErrorMessage=By.xpath("//div[@class='col-lg-5 col-xl-4 ng-star-inserted']//p[@class='ng-star-inserted'][contains(text(),'No Medical Conditions Declaration')]");

	/*
	 * if
	 * (d.findElement(pageHeading).getText().contains("Travel Insurance")) {
	 * throw new IllegalStateException("Not on the Get A Quote page!"); }
	 */

	/*public void openurlAgain() {
                   d.
      d.ExecuteScript("window.open('https://racvqa.tmmatravel.com/','_blank');");
                   String d =Keys.chord(Keys.CONTROL,Keys.RETURN);
                   String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
    d.findElement(By.linkText("https://racvqa.tmmatravel.com/")).sendKeys(selectLinkOpeninNewTab);
                   d.get("https://racvqa.tmmatravel.com/");*/
	/*}*/
	/*public void closeURL() {
                   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
                   d = new ChromeDriver();

                   ngd = new NgWebDriver((JavascriptExecutor) d);
                   ngd.waitForAngularRequestsToFinish();

                   // d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                   d.manage().window().maximize();

                   d.close();
                   waitFor(10);
                   System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
                   WebDriver driver = new ChromeDriver();

    }*/

	public void getSingleTripClickContinue() {
		waitForLoader();
		scrollBy("1000");
		BrowserFactory.explicitWait(d, d.findElement(Continue));
		WebElement element=d.findElement(Continue);
		BrowserFactory.click(element, d);

	}
	public void getSingleTripClickContinueAfterUpdate() {

		//waitForLoader();
		//scrollBy("1000");
		waitFor(4);
		d.findElement(Continue).click();

	}

	public void getAMTClickContinue() {

		waitForLoader();
		scrollBy("1000");
		BrowserFactory.explicitWait(d, d.findElement(Continue));
		WebElement element=d.findElement(Continue);
		BrowserFactory.click(element, d);

	}


	public void getValidateAllBenefit() {

		// Call first page get quote method here JSWaiter.waitUntilJSReady();
		waitFor(3);
		scrollBy("1000"); 
		d.findElement(Show_Benefit).click();


	}

	public void getChooseYourExcess()  {  

		waitFor(3);
		scrollBy("300"); d.findElement(ChooseExcess).click();

	}

	public void getGoingOnCruiseNo() {

		// Call first page get method here scrollBy("300");
		d.findElement(Going_On_CruiseNo).click();

	}

	public void getSkiWinterNo() {

		// Call first page get method here

		waitFor(3); 
		scrollBy("300"); 
		d.findElement(Ski_Winter_No).click(); }

	public void getEditFunctionality() {

		// Call first page get method here waitFor(3); scrollBy("300");
		waitFor(3); 
		d.findElement(Edit).click();


	}


	public void switchToSingleTrip() {
		waitForVisible(singleTripSelect);
		d.findElement(singleTripSelect).click();
	}

	public String switchToSingleTripTitl() {
		waitFor(3);
		waitForVisible(singleTripSelect);
		return d.findElement(singleTripSelect).getText();

	}

	public void switchToAMTtrip(WebDriver driver) {
		waitFor(4);
		BrowserFactory.explicitWait(driver, d.findElement(annualMultiTrip));
		BrowserFactory.click(d.findElement(annualMultiTrip), driver);

	}

	public String switchToAMTtripTitle() {
		return d.findElement(annualMultiTrip).getText();

	}


	// getaquotesuccessmesssage
	/*public void getSingleTripGetQuote(String traveldestination, String leavingOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) throws InterruptedException {

		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(4);
		d.findElement(By.xpath("//span[contains(text(),'"+traveldestination+"')]")).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(AreyouanRACMember).click();
		d.findElement(AreyouanRACMemberNoClick).click();
		Thread.sleep(5000);
		BrowserFactory.click(d.findElement(Getaquote), d);
		waitFor(5);
		Helper.waitForLoader(d);
		// waitForVisible(Getquotesuccessmessage);
	}
*/
	
	 public void getSingleTripGetQuote(String traveldestination, String leavingOn, String agePrimarytraveller,
				String agesecondaryTravel, String noofDependants) {

			waitForVisible(travelDestination);
			scrollBy("200");
			/*waitFor(10);*/
			d.findElement(travelDestination).sendKeys(traveldestination);
			waitFor(4);
			d.findElement(destinationEntry).click();
			waitFor(5);
			d.findElement(departDate).sendKeys(leavingOn);
			// waitFor(2);
			waitFor(2);
			d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		    waitFor(2);
			d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
			 waitFor(2);
			d.findElement(NoofDependants).sendKeys(noofDependants);
			 waitFor(6);
			 d.findElement(State).click();
			 d.findElement(state_click).click();
			d.findElement(AreyouanRACMember).click();
			d.findElement(AreyouanRACMemberNoClick).click();
			d.findElement(Getaquote).click();
			waitForLoader();
			// waitForVisible(Getquotesuccessmessage);
		}

	 public void getSingleTripGetQuoteRAA(String traveldestination, String leavingOn, String agePrimarytraveller,
				String agesecondaryTravel, String noofDependants) {

			waitForVisible(travelDestination);
			scrollBy("200");
			/*waitFor(10);*/
			d.findElement(travelDestination).sendKeys(traveldestination);
			waitFor(4);
			d.findElement(destinationEntry).click();
			waitFor(5);
			d.findElement(departDate).sendKeys(leavingOn);
			// waitFor(2);
			waitFor(2);
			d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		    waitFor(2);
			d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
			 waitFor(2);
			d.findElement(NoofDependants).sendKeys(noofDependants);
			 waitFor(6);
			// d.findElement(State).click();
			// d.findElement(state_click).click();
			d.findElement(AreyouanRACMember).click();
			d.findElement(AreyouanRACMemberNoClick).click();
			d.findElement(Getaquote).click();
			waitForLoader();
			// waitForVisible(Getquotesuccessmessage);
		}


	public void getdomesticinternationalcountry(String traveldestination1, String traveldestination2) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination1);
		waitFor(2);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination2);
		d.findElement(destinationEntry).click();
		// return new GetAQuotePage(d);

	}

	public String errorMsgDomesticInternational() {
		waitForVisible(DomesticInternationalMessage);
		return d.findElement(DomesticInternationalMessage).getText();
	}

	// travelfieldblank
	public void getTravelDestinationFieldBlank(String leavingOn, String returningOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {

		d.findElement(travelDestination).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		// d.findElement(returningOnDate).sendKeys(returningOn);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(2);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		waitFor(2);
		d.findElement(state_click).click();
		waitFor(3);
		d.findElement(Getaquote).click();

	}

	public String gettravelerrormsg() {
		waitFor(2);

		return d.findElement(traveldeserrormsg).getText();
	}

	// #### leavingonblank
	public void getleavingonfieldblank(String traveldestination, String returningOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(3);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		waitFor(3);
		d.findElement(state_click).click();
		d.findElement(Getaquote).click();

	}

	public String getleavingserrorms() {
		waitFor(2);
		return d.findElement(LeavingDate).getText();
	}

	// returning onblank
	public void getreturningfieldblank(String traveldestination, String leavingOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(3);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		waitFor(3);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(Getaquote).click();

	}

	public String getreturnserrormsg() {
		return d.findElement(ReturnDate).getText();
	}

	public void getleavingandreturndatesame(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		WebElement Retdate = d.findElement(returningOnDate);
		// Retdate.click();
		waitFor(3);
		Retdate.sendKeys(Keys.CONTROL + "a");
		Retdate.sendKeys(Keys.BACK_SPACE);
		waitFor(3);
		Retdate.sendKeys("22/02/2020");
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(Getaquote).click();

	}

	public void getleavingandreturndateAMT(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		// Retdate.click();
		waitFor(3);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(Getaquote).click();
	}

	public String getAMTleaveandreturnerrormsg() {
		waitFor(2);
		return d.findElement(returndateAMTerrormsg).getText();
	}

	public String getleaveandreturnserrormsg() {
		return d.findElement(leavingandReturnsamedate).getText();
	}

	// primaryblankvalidation
	public void getSTagePrimarytravellerfieldblank(String traveldestination, String leavingOn,
			String agesecondaryTravel, String noofDependants) {
		waitFor(7);
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(4);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		waitFor(4);
		d.findElement(state_click).click();
		waitFor(2);
		d.findElement(Getaquote).click();
	}

	public String getage_errormsg() {
		waitFor(2);
		return d.findElement(PrimaryAge).getText();
	}

	public void getAMTagePrimarytravellerfieldblank(String traveldestination, String leavingOn, String returningOn,
			String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		d.findElement(State).click();
		waitFor(2);
		d.findElement(state_click).click();
		waitFor(2);
		d.findElement(Getaquote).click();
	}

	public void getagesingletriptraveller_agebelow18andmore110(String traveldestination, String leavingOn,
			String returningOn, String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		d.findElement(departDate).sendKeys(leavingOn);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(5);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(5);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(5);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		waitFor(5);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(Getaquote).click();

	}

	public String getSingleTripage_errormsgforbelow18and110() {
		return d.findElement(SingleTripAgeBelow18and110Year).getText();
	}

	public void getpastdate(String traveldestination, String leavingOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		waitFor(2);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).click();
	}

	public String getpastdateerrormsg()

	{
		waitFor(2);
		return d.findElement(departureDateMoreErrorMsg).getText();
	}

	public void getsingletrip_leavingdate_548days(String traveldestination, String leavingOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		waitFor(2);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).click();

	}

	public String getsingletrip_leavingdate_548dayserrormsg()

	{
		return d.findElement(Leaving548daysforbothsingleandamt).getText();
	}

	public void getsingletrip365days(String traveldestination, String leavingOn, String returningOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		waitFor(2);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		WebElement Retdate = d.findElement(returningOnDate);
		// Retdate.click();
		waitFor(2);
		Retdate.sendKeys(Keys.CONTROL + "a");
		Retdate.sendKeys(Keys.BACK_SPACE);
		waitFor(3);
		Retdate.sendKeys("22/02/2022");
	}

	public String getsingletrip365daysfromdeparterrormsg()

	{
		return d.findElement(singletripretutndate365days).getText();
	}

	public void getAMT_leavingdate_548days(String traveldestination, String leavingOn) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		d.findElement(departDate).sendKeys(leavingOn);

	}

	public String getAMTtrip_leavingdate_548dayserrormsg()

	{
		return d.findElement(Leaving548daysforbothsingleandamt).getText();
	}

	public void getageAMTtraveller_agebelow18andmore75(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants) {
		waitForVisible(travelDestination);
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		d.findElement(destinationEntry).click();
		waitFor(3);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(3);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(3);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		waitFor(3);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		waitFor(3);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		waitFor(3);
		d.findElement(State).click();
		d.findElement(state_click).click();
		waitFor(3);
		d.findElement(Getaquote).click();

	}

	public String getAMTage_errormsgforbelow18andmore75() {
		waitFor(3);
		return d.findElement(AMTAgebelow18and75year).getText();
	}

	public void getAMTtrip60daysfromdepart(String traveldestination, String leavingOn, String returningOn) {
		d.findElement(travelDestination).sendKeys(traveldestination);
		d.findElement(destinationEntry).click();
		d.findElement(departDate).sendKeys(leavingOn);
		d.findElement(returningOnDate).sendKeys(returningOn);

	}

	public String getAMTtrip60daysfromdeparterrormsg()

	{
		return d.findElement(AMTretrundate60days).getText();
	}

	public String getPageHeading() {
		waitFor(4);
		waitForVisible(Getquotesuccessmessage);
		return d.findElement(Getquotesuccessmessage).getText();
	}

	public void getMultiTripGetAQuote(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants,WebDriver driver) throws InterruptedException {
		switchToAMTtrip(driver);
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(2);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(3);
		waitForVisible(destinationEntry);
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(AreyouanRACMember).click();
		d.findElement(AreyouanRACMemberNoClick).click();
		d.findElement(Getaquote).click();
		Helper.waitForLoader(d);
		// waitForVisible(Getquotesuccessmessage);
	}
	public void refreshPage()
	{
		waitFor(10);
		/*          d.navigate().refresh();
                   d.get("https://racvqa.tmmatravel.com/");                         
                   d.get(d.getCurrentUrl());
                   JavascriptExecutor jse = (JavascriptExecutor) d;
                   jse.executeScript("history.go(0)");
                   jse.executeScript("location.reload()")*/;
	}

	public void getMultiTripDomestic(String traveldestination, String leavingOn, String returningOn,
			String agePrimarytraveller, String agesecondaryTravel, String noofDependants,WebDriver driver) {

		switchToAMTtrip(driver);
		waitForVisible(travelDestination);
		scrollBy("400");
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(2);
		d.findElement(destinationDOmesticSelect).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		d.findElement(returningOnDate).sendKeys(returningOn);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(AreyouanRACMember).click();
		d.findElement(AreyouanRACMemberNoClick).click();
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}

	public void getSingleTripDomestic(String traveldestination, String leavingOn, String agePrimarytraveller,
			String agesecondaryTravel, String noofDependants) {
		//waitForLoader();
		waitForVisible(travelDestination);
		scrollBy("400");
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(6);
		Boolean flag=  BrowserFactory.isElementPresent(d, d.findElement(destinationEntry));
		// BrowserFactory.explicitWait(d, d.findElement(destinationEntry));
		if(flag==false)
		{
			d.findElement(travelDestination).clear();
			waitFor(2);
			d.findElement(travelDestination).sendKeys(traveldestination);
			waitFor(2);
		}
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		// waitFor(2);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(NoofDependants).sendKeys(noofDependants);
		// waitFor(2);
		d.findElement(State).click();
		d.findElement(state_click).click();
		d.findElement(AreyouanRACMember).click();
		d.findElement(AreyouanRACMemberNoClick).click();
		d.findElement(Getaquote).click();
		waitFor(10);
		// waitForVisible(Getquotesuccessmessage);
	}

	public void getClearGetAQuote() {


		waitForVisible(travelDestination);
		//scrollBy("400");
		waitFor(8);
		d.findElement(travelCancel).click();
		waitFor(4);
		WebElement Departdate = d.findElement(departDate);
		waitFor(2);
		Departdate.sendKeys(Keys.CONTROL + "a");
		Departdate.sendKeys(Keys.BACK_SPACE);
		WebElement Retdate = d.findElement(returningOnDate);
		// Retdate.click();
		waitFor(2);
		Retdate.sendKeys(Keys.CONTROL + "a");
		Retdate.sendKeys(Keys.BACK_SPACE);
		waitFor(3);
		d.findElement(AgePrimarytraveller).clear();
		waitFor(2);
		d.findElement(AgeSecondaryTravel).clear();
	}

	public void getEditForPage3GetQuote(String traveldestination, String leavingOn, String returningdate,
			String agePrimarytraveller, String agesecondaryTravel) {

		waitFor(3);
		waitForVisible(travelDestination);
		scrollBy("400");
		waitFor(3);
		d.findElement(travelDestination).sendKeys(traveldestination);
		waitFor(4);
		d.findElement(destinationEntry).click();
		waitFor(5);
		d.findElement(departDate).sendKeys(leavingOn);
		waitFor(2);
		d.findElement(returningOnDate).sendKeys(returningdate);
		waitFor(2);
		d.findElement(AgePrimarytraveller).sendKeys(agePrimarytraveller);
		// waitFor(2);
		d.findElement(AgeSecondaryTravel).sendKeys(agesecondaryTravel);
		// waitFor(2);
		d.findElement(Getaquote).click();
		// waitForVisible(Getquotesuccessmessage);
	}

	public String getDepartError() {
		return d.findElement(departDateWhole).getText();
	}

	public void enterCountry(String string) {
		// TODO Auto-generated method stub

	}

	public void enterDepartureDate(String string) {
		// TODO Auto-generated method stub

	}

	public void clickGetAQuote() {
		// TODO Auto-generated method stub

	}

	public void getPrimaryTravellerFirstName(String pFirstName) {
		d.findElement(primaryFirstName).sendKeys(pFirstName);
	}

	public void getPrimaryTravellerLastName(String pLastName) {
		d.findElement(primaryLastName).sendKeys(pLastName);
	}

	public void getPrimaryTravellerDOB(String pDOB) {
		d.findElement(primaryDOB).sendKeys(pDOB);
	}

	public void getSecondaryTravellerFirstName(String sFirstName) {
		d.findElement(secondaryFirstName).sendKeys(sFirstName);
	}

	public void getSecondaryTravellerLasttName(String sLastName) {
		d.findElement(secondaryLastName).sendKeys(sLastName);
	}

	public void getSecondaryTravellerDOB(String sDOB) {
		d.findElement(secondaryDOB).sendKeys(sDOB);
	}

	public void getStreetAddress(String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo) {
		waitFor(4);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(8);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(4);
		d.findElement(stateDropdown).click();
		d.findElement(stateSelect).click();
		waitFor(3);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(3);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(3);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(6);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
	}

	public void addDependent() {
		waitForVisible(addDependent);
		waitFor(8);
		d.findElement(addDependent).click();
	}

	public boolean validateAddDependentIsEnabled()
	{
		waitForVisible(addDependent);
		waitFor(3);
		return d.findElement(addDependent).isDisplayed();
	}

	public boolean validateDeleteIsEnabled()
	{
		waitForVisible(deleteDependents);
		waitFor(7);
		return d.findElement(deleteDependents).isDisplayed();
	}

	public void getDependentDetails(String depFirstName, String depLastName, String depDOBName) {
		waitFor(5);
		d.findElement(dependentFirstName).sendKeys(depFirstName);
		d.findElement(dependentLastName).sendKeys(depLastName);
		waitFor(3);
		d.findElement(dependentDOB).sendKeys(depDOBName);
	}

	public void deleteDependent() {
		waitForVisible(deleteDependents);
		waitFor(5);
		d.findElement(deleteDependents).click();
	}

	public void getEditQuoteSummaryClick() {
		waitForVisible(quoteSummaryEdit);
		waitFor(5);
		d.findElement(quoteSummaryEdit).click();
		waitFor(5);
		d.findElement(returnTrip1).click();
		waitFor(5);
		//WebDriverWait wait = new WebDriverWait(d, 10); 
		//WebElement editquote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("quoteSummaryEdit")));
		//editquote.click();
	}

	public boolean validateEditQuoteIsEnabled()
	{
		waitForVisible(quoteSummaryEdit);
		waitFor(3);
		return d.findElement(quoteSummaryEdit).isDisplayed();
	}

	/*public void getToDetailsPageAfterEdit() {
                   d.findElement(continueinpage2foredit).click();
    }*/

	public void getEditQuoteSummaryCancel() {
		waitFor(3);
		d.findElement(cancelDialogBoxModel).click();
	}
	public boolean validateEditQuoteSummaryCancel() {
		waitFor(3);
		return d.findElement(cancelDialogBoxModel).isDisplayed();
	}

	public String getDetailsPageTitle() {
		return d.findElement(detailsTitle).getText();
	}

	public void sendACopyOfQuoteEmail(String sendACpyEmail) {
		scrollBy("700");
		waitFor(8);
		waitForVisible(sendACopyEmail);
		d.findElement(sendACopyEmail).sendKeys(sendACpyEmail);
		d.findElement(saveAndSend).click();
	}

	public String getEmailSuccessMsg() {
		waitForVisible(sendingEmailVerify);
		waitFor(7);
		return d.findElement(sendingEmailVerify).getText();
	}
	public void getNoMedicalCondition_RAC() {
		waitFor(3);
		d.findElement(step3No).click();
	}
	public void getNoMedicalCondition_AANT() {
		waitFor(3);
		d.findElement(detailPageForRACNO).click();
	}
	public void getNoMedicalCondition() {
		waitFor(3);
		d.findElement(detailPageNo).click();
	}
	public void getNoMedicalCondition2() {
		waitFor(20);
		d.findElement(detailPageNo).click();
	}

	public void getYesMedicalCondition() {
		waitFor(8);
		d.findElement(detailPageYes).click();
	}
	public void getYesMedicalCondition_AANT() {
		waitFor(8);
		d.findElement(detailPageRACYes).click();
	}

	public void getYesMedicalCondition2()
	{
		waitFor(22);
		scrollBy("1400");
		d.findElement(detailPageYes).click();
	}

	public void confirmAndFinaliseQuote() {
        waitFor(5);
        d.findElement(confirmAndFinaliseQuote).click();
        waitFor(5);
}

	public void getNoMedicalConditionWithoutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) throws InterruptedException {
		//waitForLoader();
		waitFor(18);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);

	}
	public void getMedicalAssessmentRACQ()
	{
		waitFor(9);
		scrollBy("300");
		d.findElement(againstMedicalAdviceOrMedicalTreatmentNo).click();
		waitFor(4);
		d.findElement(awaitingSurgeryTreatmentInvestigationOfProceduresNo).click();
		waitFor(4);
		d.findElement(option3No).click();
		waitFor(4);
		d.findElement(option4Yes).click();
		waitFor(4);
		d.findElement(continueOption).click();

	} 
	public void RACQgetYesMedicalCondition()
	{
		waitFor(3);
		scrollBy("800");
		waitFor(3);
		d.findElement(detailPageYesRACQ).click();
	} 



	public void getNoMedicalConditionWithDependent(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName)
					throws InterruptedException {

		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);

	}

	public void getYesMedicalConditionWithDependent(String pFirstName, String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
	}

	public void getYesMedicalConditionWithOutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);

	}

	public String getNoMedicalConditionErrorMessage() {
		return d.findElement(medicalNoConditionMessage).getText();
	}

	public String getToPaymaentPage() {
		waitFor(4);
		return d.findElement(navigateToPaymentPageIfNo).getText();
	}

	public void getPrimaryFirstNameBlankFieldWithDependent(String pLastName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(10);
		getPrimaryTravellerLastName(pLastName);

		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		waitFor(2);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		waitFor(2);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(2);
		getYesMedicalCondition();
		waitFor(2);
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public void validateDOB() {
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).click();
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		//d.findElement(secondaryFirstName).click();
	} 
	public void validateSecondryFirstName() {
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("03/01/2000");
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryFirstName).click();
		d.findElement(secondaryFirstName).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryLastName).click();
		waitFor(2);
		d.findElement(secondaryLastName).sendKeys(Keys.TAB);
		d.findElement(secondaryDOB).sendKeys("03/01/1995");
		waitFor(2);
		d.findElement(secondaryDOB).sendKeys(Keys.TAB);
		waitFor(5);                       
	} 
	public void validateSecondryLastName() {
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("03/01/2000");
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryFirstName).sendKeys("Rajan");
		d.findElement(secondaryFirstName).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryLastName).click();
		waitFor(2);
		d.findElement(secondaryLastName).sendKeys(Keys.TAB);
		d.findElement(secondaryDOB).click();
		waitFor(2);
		d.findElement(secondaryDOB).sendKeys(Keys.TAB);
		d.findElement(secondaryFirstName).sendKeys("Rajan");
		waitFor(5);         

	} 
	public void validateSecondryStreetAdd() 
	{
		waitFor(5);
		d.findElement(primaryFirstName).sendKeys("test");
		waitFor(2);
		d.findElement(primaryLastName).sendKeys("validation");
		waitFor(2);
		d.findElement(primaryDOB).sendKeys("03/01/2000");
		d.findElement(primaryDOB).sendKeys(Keys.TAB);
		waitFor(4);                       
		d.findElement(secondaryFirstName).sendKeys("Rajan");               
		d.findElement(secondaryFirstName).sendKeys(Keys.TAB);
		waitFor(4);
		d.findElement(secondaryLastName).sendKeys("Swami");
		waitFor(2);
		d.findElement(secondaryLastName).sendKeys(Keys.TAB);
		d.findElement(secondaryDOB).click();
		waitFor(2);
		d.findElement(secondaryDOB).sendKeys("03/01/1995");
		waitFor(2);
		d.findElement(streetAddress).click();
		d.findElement(streetAddress).sendKeys(Keys.TAB);
		waitFor(5);
		d.findElement(primaryFirstName).click();

		waitFor(5);         

	} 

	public void validateFname() {
		waitFor(5);
		d.findElement(primaryFirstName).click();
		waitFor(2);
		d.findElement(primaryLastName).click();
	}
	public void validateLname() {
		waitFor(5);
		d.findElement(primaryLastName).click();

		waitFor(2);
		d.findElement(primaryFirstName).click();
	}

	public String getPrimaryFirstNameBlankFieldErrorMsg() {
		waitFor(7);
		return d.findElement(primaryFirstNameFieldBlankErrorMessage).getText();
	}

	public void getPrimaryLastNameBlankFieldWithDependent(String pFirstName, String pDOB, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getPrimaryLastNameBlankFieldErrorMsg() {
		waitFor(7);
		return d.findElement(primaryLastNameFieldBlankErrorMessage).getText();
	}

	public void getPrimaryDOBBlankFieldWithDependent(String pFirstName, String pLastName, String sFirstName,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getPrimaryDOBBlankFieldErrorMsg() {
		waitFor(7);
		return d.findElement(primaryDOBFieldBlankErrorMessage).getText();
	}

	public void getSecondaryFirstNameBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sLastName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(3);
		getPrimaryTravellerLastName(pLastName);
		waitFor(3);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(3);
		getSecondaryTravellerDOB(sDOB);
		waitFor(3);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		waitFor(3);
		confirmAndFinaliseQuote();
	}

	public String getSecondaryFirstNameBlankFieldErrorMsg() {
		waitFor(8);
		return d.findElement(secondaryFirstNameFieldBlankErrorMessage).getText();
	}

	public void getSecondaryLastNameBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sDOB, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getSecondaryLastNameBlankFieldErrorMsg() {
		waitFor(8);
		return d.findElement(secondaryLastNameFieldBlankErrorMessage).getText();
	}

	public void getSecondaryDOBBlankFieldWithDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String strtAddress, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getSecondaryDOBBlankFieldErrorMsg() {
		waitFor(7);
		return d.findElement(secondaryDOBFieldBlankErrorMessage).getText();
	}

	public void getStreetAdressFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String sburb, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(3);
		getPrimaryTravellerLastName(pLastName);
		waitFor(3);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(3);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(3);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(3);
		d.findElement(stateDropdown).click();
		waitFor(3);
		d.findElement(stateSelect).click();
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(3);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(3);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
		waitFor(5);
	}

	public String getStreetFieldBlankErrorMsg()
	{
		waitFor(7);
		return d.findElement(streetFieldBlankErrorMessage).getText();
	}
	public void getSuburbAddressFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String pstCode, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(5);
		addDependent();
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(5);
		getYesMedicalCondition();
		waitFor(5);
		confirmAndFinaliseQuote();
		scrollBy("-800");
		waitFor(5);
	}
	public String getSuburbFieldBlankErrorMsg()
	{
		waitFor(7);
		return d.findElement(suburbFieldBlankErrorMessage).getText();
	}
	public void getPincodeFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String emilAddress,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(3);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(3);
		d.findElement(suburb).sendKeys(sburb);
		d.findElement(stateDropdown).click();
		waitFor(3);
		d.findElement(stateSelect).click();
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(3);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	public String getPincodeFieldBlankErrorMsg()
	{
		waitFor(10);
		return d.findElement(postcodeFieldBlankErrrorMessage).getText();
	}

	public void getPincodeInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB,String strtAddress, String sburb, String pstCode) {
		waitFor(10);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		d.findElement(stateSelect).click();
		waitFor(3);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(3);
		d.findElement(emailAddress).click();
		scrollBy("-800");

	}
	public String getPincodeInValidErrorMsg()
	{
		waitFor(3);
		return d.findElement(postcodeInValidErrorMessage).getText();
	}
	public void getEmailFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String confirmEmilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		waitFor(8);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(3);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		waitFor(3);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}
	public String getEmailFieldBlankErrorMsg()
	{
		waitFor(5);
		return d.findElement(emailFieldBlankErrorMessage).getText();
	}
	public void getEmailInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(3);
		d.findElement(confirmEmailAddress).click();
		scrollBy("-800");
	}
	public String getEmailInValidErrorMsg()
	{
		waitFor(5);
		return d.findElement(emailInValidErrorMessage).getText();
	}


	public void getConfirmEmailFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String mblPhoneNo, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(5);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getConfirmEmailFieldBlankErrorMsg()
	{
		waitFor(10);
		return d.findElement(confirmFieldBlankErrorMessage).getText();
	}

	public void getConfirmEmailInValid(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress) {
		waitFor(10);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).click();
		scrollBy("-800");
	}
	public String getConfirmEmailInValidErrorMsg()
	{
		waitFor(5);
		return d.findElement(confirmEmailInValidErrorMessage).getText();

	}

	public void getEmailMismatch(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(3);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).click();
		scrollBy("-800");
	}
	public String getEmailMismatchErrorMsg()
	{
		waitFor(5);
		return d.findElement(confirmEmailmismatchErrorMessage).getText();
	}
	public void getMobileFieldBlank(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress, String depFirstName, String depLastName, String depDOBName) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		d.findElement(emailAddress).sendKeys(emilAddress);
		waitFor(5);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		waitFor(3);
		addDependent();
		waitFor(3);
		getDependentDetails(depFirstName, depLastName, depDOBName);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
	}
	public String getMobileFieldBlankErrorMsg()
	{
		waitFor(5);
		return d.findElement(phoneNoFieldBlankErrorMessage).getText();
	}

	public void getMobileInvalidNo(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress,String confirmEmilAddress,String mblPhoneNo) {
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		getSecondaryTravellerDOB(sDOB);
		d.findElement(streetAddress).sendKeys(strtAddress);
		waitFor(5);
		d.findElement(suburb).sendKeys(sburb);
		waitFor(5);
		d.findElement(stateDropdown).click();
		waitFor(5);
		d.findElement(stateSelect).click();
		waitFor(5);
		d.findElement(postCode).sendKeys(pstCode);
		waitFor(5);
		d.findElement(emailAddress).sendKeys(emilAddress);
		d.findElement(confirmEmailAddress).sendKeys(confirmEmilAddress);
		d.findElement(mobilePhoneNo).sendKeys(mblPhoneNo);
		getYesMedicalCondition();
		confirmAndFinaliseQuote();
		scrollBy("-800");
	}

	public String getMobileInvalidNoErrorMsg()
	{
		waitFor(5);
		return d.findElement(phoneNoValidationErrorMessage).getText();
	}

	public void getPrimaryBtwn18And85Validation(String pFirstName, String pLastName, String pDOB) 
	{
		waitFor(8);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
	}

	public String getPrimaryAgeBetween18and85ErrorMsg()
	{
		waitForVisible(primaryDOBAgeBetween18and85ErrorMessage);
		waitFor(7);
		return d.findElement(primaryDOBAgeBetween18and85ErrorMessage).getText();
	}
	public void getSecondaryAgeBtwn18And85Validation(String pFirstName, String pLastName, String pDOB,String sFirstName,String sLastName,String sDOB) 
	{
		waitFor(8);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		waitFor(5);
		getPrimaryTravellerDOB(pDOB);
		waitFor(3);
		getSecondaryTravellerFirstName(sFirstName);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(5);
		getSecondaryTravellerDOB(sDOB);

	}
	public String getSecondaryAgeBetween18and85ErrorMsg()
	{
		waitForVisible(secondaryDOBAgeBetween18and85ErrorMessage);
		waitFor(7);
		return d.findElement(secondaryDOBAgeBetween18and85ErrorMessage).getText();
	}

	public void getPrimaryMismatchWithPremium(String pFirstName, String pLastName, String pDOB) 
	{
		waitFor(10);
		getPrimaryTravellerFirstName(pFirstName);
		getPrimaryTravellerLastName(pLastName);
		getPrimaryTravellerDOB(pDOB);
	}

	public String getPrimaryMismatchWithPremiumErrorMsg()
	{   
		waitFor(10);
		waitForVisible(primaryDOBMismatchWithQuoteErrorMessage); 
		return d.findElement(primaryDOBMismatchWithQuoteErrorMessage).getText();
	}

	public void getPrimaryMismatchWithPremiumYes()
	{
		d.findElement(dobDialogBoxMismatchYes).click();
	}

	public void getPrimaryMismatchWithPremiumNo()
	{
		d.findElement(dobDialogBoxMismatchNo).click();
	}

	public void pdsCondition()
	{
		waitFor(6);
		scrollBy("600");
		waitFor(10);
		d.findElement(PDS_Condition).click();
		waitFor(5);
	}

	public void marketCondition()
	{
		//scrollBy("300");
		waitFor(10);
		d.findElement(Marketing_Consent).click();          
	}
	public void getRACNoMedicalConditionWithoutDependent(String pFirstName, String pLastName, String pDOB,
			String sFirstName, String sLastName, String sDOB, String strtAddress, String sburb, String pstCode,
			String emilAddress, String confirmEmilAddress, String mblPhoneNo) throws InterruptedException {
		//waitForLoader();
		waitFor(10);
		scrollBy("300");
		getPrimaryTravellerFirstName(pFirstName);
		waitFor(2);
		getPrimaryTravellerLastName(pLastName);
		waitFor(2);
		getPrimaryTravellerDOB(pDOB);
		waitFor(2);
		getSecondaryTravellerFirstName(sFirstName);
		waitFor(2);
		getSecondaryTravellerLasttName(sLastName);
		waitFor(2);
		getSecondaryTravellerDOB(sDOB);
		getStreetAddress(strtAddress, sburb, pstCode, emilAddress, confirmEmilAddress, mblPhoneNo);
		waitFor(10);
		scrollBy("150");
		pdsCondition();
		waitFor(5);
		scrollBy("100");
		marketCondition();
		waitFor(4);
		scrollBy("500");

	}
	public void getNoRACMedicalCondition() {
		waitFor(3);
		d.findElement(detailPageForRACVNO).click();
	}

	public void getYesRACMedicalCondition() {
		d.findElement(detailPageRACYes).click();
	}

	//Irfan Change Xpath Name.
	public void confirmAndFinaliseQuoteRAC() {
		scrollBy("100");
		waitFor(4);
		d.findElement(confirmAndFinalizeQuoteRACV).click();
	}

	public String getDetailsPageHeading()
	{
		waitFor(3);
		return d.findElement(detailsTitle).getText();
	}

	public void getCard(String CCName, String Number, String ExpDate1, String CVV1) {
        waitFor(7);
        scrollBy("250");
        new WebDriverWait(d, 40).until(ExpectedConditions.elementToBeClickable(CName));
        d.findElement(CName).sendKeys(CCName);
        new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                                     By.cssSelector("iframe#braintree-hosted-field-number[src*='hosted-fields-frame']")));
        d.findElement(CCNumber).sendKeys(Number);
        d.switchTo().defaultContent();
        waitFor(3);
        new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                                     By.cssSelector("iframe#braintree-hosted-field-expirationDate[src*='hosted-fields-frame']")));
        d.findElement(ExpDate).sendKeys(ExpDate1);
        d.switchTo().defaultContent();
        waitFor(3);
        new WebDriverWait(d, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                                     By.cssSelector("iframe#braintree-hosted-field-cvv[src*='hosted-fields-frame']")));
        d.findElement(CVV).sendKeys(CVV1);
        d.switchTo().defaultContent();
        scrollBy("150");
        waitFor(4);
        d.findElement(CnfPay).click();
        waitFor(3);

}
	public void getMedicalAssessment_AANT()
	{
		waitFor(9);
		scrollBy("300");
		List<WebElement>list=  d.findElements(By.xpath("//div[contains(text(),'No')]"));
		List<WebElement>list2=  d.findElements(By.xpath("//div[contains(text(),'Yes')]"));
		list.get(0).click();
		waitFor(4);
		list.get(1).click();
		waitFor(4);
		list.get(2).click();
		waitFor(4);
		list2.get(3).click();
		waitFor(10);
		d.findElement(continueOption).click();

	}
	public void getMedicalAssessment()
	{
		waitFor(9);
		scrollBy("300");
		d.findElement(againstMedicalAdviceOrMedicalTreatmentNo).click();
		waitFor(4);
		d.findElement(awaitingSurgeryTreatmentInvestigationOfProceduresNo).click();
		waitFor(4);
		d.findElement(option3No).click();
		waitFor(4);
		d.findElement(option4Yes).click();
		waitFor(10);
		d.findElement(continueOption).click();

	}

	public void getMedicalAssessmentSearch(String cname,WebDriver driver)
	{
		waitFor(18);
		BrowserFactory.explicitWait(driver, d.findElement(conditionName));
		d.findElement(conditionName).sendKeys(cname);
		waitFor(5);
		d.findElement(condtionClick).click();
		waitFor(4);
		d.findElement(startDeclaration).click();
		waitFor(4);
		d.findElement(noInsulin).click();
		waitFor(4);
		d.findElement(selectZero).click();
		waitFor(4);
		d.findElement(noChainSmoker).click();
		waitFor(4);
		scrollBy("150");
		d.findElement(doYouHaveAnyOfTheAbove).click();
		waitFor(4);
		d.findElement(done).click();
		waitFor(4);
		d.findElement(advisedToTakeMedicationForBloodPressure).click();
		waitFor(4);
		d.findElement(advisesToTakeMedicationForCholestrol).click();
		waitFor(4);
		d.findElement(continueLast).click();
		waitFor(5);
		scrollBy("300");
		d.findElement(completeDeclaration).click();
		waitFor(25);
		scrollBy("500");
		d.findElement(acceptPremium).click();

	}

	public void reScoreMedical1(String cname){

		waitFor(18);
		d.findElement(conditionName).sendKeys(cname);
		waitFor(5);
		d.findElement(condtionClick).click();
		waitFor(4);
		d.findElement(startDeclaration).click();
		waitFor(4);
		d.findElement(noInsulin).click();
		waitFor(4);
		d.findElement(selectZero).click();
		waitFor(4);
		d.findElement(noChainSmoker).click();
		waitFor(4);
		scrollBy("150");
		d.findElement(doYouHaveAnyOfTheAbove).click();
		waitFor(4);
		d.findElement(done).click();
		waitFor(4);
		d.findElement(advisedToTakeMedicationForBloodPressure).click();
		waitFor(4);
		d.findElement(advisesToTakeMedicationForCholestrol).click();
		waitFor(4);
		d.findElement(continueLast).click();
		waitFor(5);
		scrollBy("300");
		d.findElement(completeDeclaration).click();
		waitFor(15);
		d.findElement(EditTrip).click();
		waitFor(13);
		scrollBy("650");
		waitFor(3);
		d.findElement(ExtraTravelPremium).click(); 

		/*waitFor(25);
    scrollBy("500");
    d.findElement(acceptPremium).click();*/
	}
	public void getYesMedicalConditionDeclaration()
	{
		waitFor(20);
		scrollBy("150");
		d.findElement(primaryTravellerYesClick).click();

	}

	public void getAccessMedicalConditionDeclaration()
	{
		waitFor(5);
		d.findElement(primaryTravellerYesAccess).click();

	}

	public void getNoMedicalConditionDeclaration()
	{
		waitFor(5);
		scrollBy("300");
		d.findElement(primaryTravellerNoClick).click();
		d.findElement(secondaryTravellerNoClick).click();
		d.findElement(continueClick).click();

	}

	public void getMedicalConditionCOntinueLaststage()
	{
		waitFor(20);
		scrollBy("350");          
		d.findElement(continueClick).click();    

	}

	public void getRACYesMedicalConditionDeclaration()
	{
		waitFor(10);
		scrollBy("150");
		d.findElement(primaryTravellerYesClickRAC).click();

	}

	public void getRACAccessMedicalConditionDeclaration()
	{
		waitFor(5);
		d.findElement(primaryTravellerYesAccessRAC).click();

	}

	public void getRACNoMedicalConditionDeclaration()
	{
		waitFor(5);
		scrollBy("300");
		d.findElement(primaryTravellerNoClick).click();
		d.findElement(secondaryTravellerNoClick).click();
		d.findElement(continueClick).click();

	}



}




