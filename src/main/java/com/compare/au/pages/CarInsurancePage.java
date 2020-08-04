package com.compare.au.pages;

import lombok.extern.flogger.Flogger;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarInsurancePage {

	private WebDriver driver;
	public static Logger log = null;

	@FindBy(css = "h2.main-heading")
	private WebElement energyUsagePageTitle;

	@FindBy(xpath = "//*[@id='your-energy']/h1")
	private WebElement compareMarketPageTitle;

	@FindBy(linkText = "Car Insurance")
	private WebElement carInsuranceBtn;

	@FindBy(linkText = "Compare Now")
	private WebElement compareNowBtn;

	@FindBy(xpath = "//*[@id='helpers.regoLabel']")
	private WebElement enterRegoinTextField;

	@FindBy(id = "start.nextButton")
	private WebElement nextBtn;

	@FindBy(xpath = "//span[contains(text(),'New South Wales')]")
	private WebElement stateSelection;

	@FindBy(xpath = "//div[@id='COMPREHENSIVE']/span")
	private WebElement insuranceType;

	@FindBy(xpath = "//input[@id='coverDetail.vehicle.hasOtherAccessories.NO']")
	private WebElement noBtnFactorySettings;

	@FindBy(xpath = "//input[@id='coverDetail.vehicle.modified.N']")
	private WebElement noBtnModified;

	@FindBy(xpath = "//input[@id='coverDetail.vehicle.damaged.N']")
	private WebElement noAccidentalDamage;

	@FindBy(xpath = "//input[@id='coverDetail.financeType.NONE']")
	private WebElement financeNoBtn;

	@FindBy(xpath = "//div[@id='PRIVATE_AND_COMMUTING_TO_WORK']/span")
	private WebElement usageType;

	@FindBy(xpath = "//input[@id='coverDetail.currentlyInsured.N']")
	private WebElement currentlyInsured;

	@FindBy(xpath = "//input[@id='coverDetail.annualKilometres']")
	private WebElement coverDetailsAnnualkms;

	@FindBy(id = "annual_kms.nextButton")
	private WebElement nextButtonAnnualKms;

	@FindBy(id = "helpers.overnightParkingPostcode")
	private WebElement enterPostCode;

	@FindBy(id = "helpers.overnightParkingAddressLabel")
	private WebElement enterAddress;

	@FindBy(xpath = "//div[@id='//div[@id='react-autowhatever-1']']")
	private WebElement selectAddress;

	@FindBy(id = "car_address.nextButton")
	private WebElement addressNextBtn;

	@FindBy(xpath = "//div[@id='CAR_PARK']/span")
	private WebElement carParkType;

	@FindBy(id = "coverDetail.driver.gender.MALE")
	private WebElement coverGenderType;

	@FindBy(xpath = "//select[@id='coverDetail.driver.dob_day']")
	private WebElement selectDOBDate;

	@FindBy(xpath = "//select[@id='coverDetail.driver.dob_month']")
	private WebElement selectDOBMonth;

	@FindBy(xpath = "//select[@id='coverDetail.driver.dob_year']")
	private WebElement selectDOBYear;

	@FindBy(id = "regular_driver_dob.nextButton")
	private WebElement dobNextBtn;

	@FindBy(xpath = "//div[@id='EMPLOYED_FULL_TIME']/span")
	private WebElement empTypeFullTime;

	@FindBy(id = "coverDetail.driver.licenceAge")
	private WebElement ageLicence;

	@FindBy(id = "regular_driver_licence_age.nextButton")
	private WebElement ageNextBtn;

	@FindBy(id = "coverDetail.driver.anyPreviousClaims.NO")
	private WebElement noClaimsBtn;

	@FindBy(xpath = "//div[@id='RATING_1']/span")
	private WebElement nCDRating;

	@FindBy(id = "coverDetail.ownsAnotherCar.N")
	private WebElement havingAnotherCarNo;

	@FindBy(id = "coverDetail.hasYoungerDriver.N")
	private WebElement havingNoYoungers;

	@FindBy(id = "coverDetail.driverOption.NO_RESTRICTION")
	private WebElement noRestrictions;

	@FindBy(id = "applicant.firstName")
	private WebElement enterFirstName;

	@FindBy(id = "applicant.lastName")
	private WebElement enterLastName;

	@FindBy(id = "applicant.mobile")
	private WebElement enterMobileNo;

	@FindBy(id = "applicant.email")
	private WebElement enterEmailId;

	@FindBy(id = "applicant_details.nextButton")
	private WebElement nextBtnDetails;

	@FindBy(xpath = "//div[@class='checkbox__checkbox_container__3P1zD flex__flex_shrink_0__3JgL3']/span")
	private WebElement acceptTermsConditions;

	@FindBy(id = "commencement_date.nextButton")
	private WebElement nextBtnCommenceDate;

	@FindBy(id = "welcome_message__message__1Nszt")
	private WebElement welcomeMessage;

	@FindBy(xpath = "//div[@id='result-row-0']//img")
	private WebElement quote0;

	@FindBy(xpath = "//div[@id='result-row-1']//img")
	private WebElement quote1;


	public CarInsurancePage(WebDriver driver) {
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}

	private void waitForVisibility(WebElement element) throws Error{
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOf(element));
	}

	private void isClicable(WebElement element) throws Error{
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.elementToBeClickable(element));
	}

	public String getPageTitle() {
		return compareMarketPageTitle.getText();
	}

	public String getUsagePageTitle() {
		return energyUsagePageTitle.getText();
	}

	public void carInsurance() {
		carInsuranceBtn.click();
	}

	public void compareNow() {
		compareNowBtn.click();
	}

	public void enterRegoNum(String rego) {
		waitForVisibility(enterRegoinTextField);
		isClicable(enterRegoinTextField);
		enterRegoinTextField.sendKeys(rego);
	}

	public void nextButton() {
		nextBtn.click();
	}

	public void selectState() {
		try {
			stateSelection.click();
		} catch (Exception e) {
			log.info("the state was not displayed, might have been taken in the details");
		}
	}

	public void selectInsuranceType() {
		waitForVisibility(insuranceType);
		isClicable(insuranceType);
		//insuranceType.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", insuranceType);
	}

	public void noFactorySettings() {
		noBtnFactorySettings.click();
	}

	public void noModifications() {
		noBtnModified.click();
	}

	public void noUnrepairedAccidents() {
		noAccidentalDamage.click();
	}

	public void noFinanceOnCar() {
		financeNoBtn.click();
	}

	public void usagePrivate() {
		waitForVisibility(usageType);
		isClicable(usageType);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", usageType);
	}

	public void isInsuredNo() {
		currentlyInsured.click();
	}

	public void noOfKmsEnter(String kms) {
		coverDetailsAnnualkms.sendKeys(kms);
	}

	public void clickNextNoOfKms() {
		nextButtonAnnualKms.click();
	}

	public void postCodeDetails(String postCode) {
		enterPostCode.sendKeys(postCode);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", enterPostCode);
	}

	public void addressDetails(String address) {
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(enterAddress)
				.click()
				.sendKeys(enterAddress, address)
				.doubleClick(enterAddress)
				.contextClick()
				.build();

		seriesOfActions.perform() ;
	}

	public void nexBtnAddress() {
		addressNextBtn.click();
	}

	public void selectCarParkTypeAsCarpark() {
		waitForVisibility(carParkType);
		isClicable(carParkType);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", carParkType);
	}

	public void coverTypeGender() {
		coverGenderType.click();
	}

	public void enterDOB() {
		Select selectDate = new Select(selectDOBDate);
		selectDate.selectByValue("1");

		Select selectMonth = new Select(selectDOBMonth);
		selectMonth.selectByValue("Jan");

		Select selectYear = new Select(selectDOBYear);
		selectYear.selectByValue("1980");
	}

	public void nextBtnDob() {
		dobNextBtn.click();
	}

	public void empFullTime() {
		waitForVisibility(empTypeFullTime);
		isClicable(empTypeFullTime);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", empTypeFullTime);
	}

	public void enterAge(String age) {
		ageLicence.sendKeys(age);
	}

	public void clickNextBtnAge() {
		ageNextBtn.click();
	}

	public void claimsNoBtn() {
		noClaimsBtn.click();
	}

	public void nCDRatingAsFive() {
		waitForVisibility(nCDRating);
		isClicable(nCDRating);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", nCDRating);
	}

	public void selectNoOtherCar() {
		havingAnotherCarNo.click();
	}

	public void selectNoYoungers() {
		havingNoYoungers.click();
	}

	public void selectNoRestrictions() {
		noRestrictions.click();
	}

	public void enterFirstNameInsurer(String firstName) {
		enterFirstName.sendKeys(firstName);
	}

	public void enterLastNameInsurer(String lastName) {
		enterLastName.sendKeys(lastName);
	}

	public void enterMobileNoInsurer(String mobile) {
		enterMobileNo.sendKeys(mobile);
	}

	public void enterEmailInsurer(String email) {
		enterEmailId.sendKeys(email);
	}

	public void clickNextBtn() {
		nextBtnDetails.click();
	}

	public void selectTermsConditions() {
		waitForVisibility(acceptTermsConditions);
		isClicable(acceptTermsConditions);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", acceptTermsConditions);
	}

	public void getQuote() {
		nextBtnCommenceDate.click();
	}

	public void quoteDetails() {
		welcomeMessage.getText().trim();
		log.info(welcomeMessage.getText().trim());
		quote0.getText().trim();
		quote1.getText().trim();
		//need to improve with more accurate reading of data from the screen
	}
}

