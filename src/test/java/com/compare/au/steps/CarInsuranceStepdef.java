package com.compare.au.steps;

import com.compare.au.common.TestBase;
import com.compare.au.pages.CarInsurancePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarInsuranceStepdef extends TestBase {

    public CarInsurancePage carInsurancePage;

    public CarInsuranceStepdef() {
        carInsurancePage = new CarInsurancePage(driver);
    }

    @Given("I navigate to comparethemarket website")
    public void i_navigate_to_comparethemarket_website() {
        driver.get(getWebEndPoint());
    //    Assert.assertEquals("comparethemarket", carInsurancePage.getPageTitle());
    }

    @When("I click on car insurance button")
    public void i_click_on_car_insurance_button() {
        carInsurancePage.carInsurance();
    }

    @When("I click on compare button")
    public void i_click_on_compare_button() {
        carInsurancePage.compareNow();
    }

    @Then("Website allows to enter Rego number of the car as {string}")
    public void website_allows_to_enter_Rego_number_of_the_car_as(String regoNum) {
        carInsurancePage.enterRegoNum(regoNum);
    }

    @Then("I select {string} after I click next button")
    public void i_select_after_I_click_next_button(String string) {
        carInsurancePage.nextButton();
        carInsurancePage.selectState();
    }

    @Then("I select insurance type as {string}")
    public void i_select_insurance_type_as(String string) {
        carInsurancePage.selectInsuranceType();
    }

    @Then("I select the {string} for the question related to  factory options and non standard accessories")
    public void i_select_the_for_the_question_related_to_factory_options_and_non_standard_accessories(String string) {
        carInsurancePage.noFactorySettings();
    }

    @Then("I select the {string} for the question car modifications")
    public void i_select_the_for_the_question_car_modifications(String string) {
        carInsurancePage.noModifications();
    }

    @Then("I select the {string} for the question car accidental repairs")
    public void i_select_the_for_the_question_car_accidental_repairs(String string) {
        carInsurancePage.noUnrepairedAccidents();
    }

    @Then("I select the {string} for the question car finance")
    public void i_select_the_for_the_question_car_finance(String string) {
        carInsurancePage.noFinanceOnCar();
    }

    @Then("I select the private as an option for usage type")
    public void i_select_the_private_as_an_option_for_usage_type() {
        carInsurancePage.usagePrivate();
    }

    @Then("I select the {string} as an option for usage type")
    public void i_select_the_as_an_option_for_usage_type(String string) {
        carInsurancePage.isInsuredNo();
    }

    @Then("I enter the {string} per year to travel before clicking next button")
    public void i_enter_the_per_year_to_travel_before_clicking_next_button(String noOFKms) {
        carInsurancePage.noOfKmsEnter(noOFKms);
        carInsurancePage.clickNextNoOfKms();
    }

    @Then("I enter the {string} where the car usually park")
    public void i_enter_the_where_the_car_usually_park(String postCode) {
        carInsurancePage.postCodeDetails(postCode);
    }

    @Then("I enter the {string} for the car usually park")
    public void i_enter_the_Campbell_Street_Parramatta_NSW_for_the_car_usually_park(String address) {
        carInsurancePage.addressDetails(address);
        carInsurancePage.nexBtnAddress();
    }

    @Then("I select the car parking type as carpark")
    public void i_select_the_car_parking_type_as_carpark() {
        carInsurancePage.selectCarParkTypeAsCarpark();
    }

    @Then("I select the regular driver's gender as Male before entering the date of birth")
    public void i_select_the_regular_driver_s_gender_as_Male_before_entering_the_date_of_birth() {
        carInsurancePage.coverTypeGender();
        carInsurancePage.enterDOB();
        carInsurancePage.nextBtnDob();
    }

    @Then("I select the employment status before proceed further")
    public void i_select_the_employment_status_before_proceed_further() {
        carInsurancePage.empFullTime();
    }

    @Then("I enter the age before clicking the next button")
    public void i_enter_the_age_before_clicking_the_next_button() {
        String age = "26";
        carInsurancePage.enterAge(age);
        carInsurancePage.clickNextBtnAge();
    }

    @Then("I select the options for claims in last {int} years, owning another car and young driver")
    public void i_select_the_options_for_claims_in_last_years_owning_another_car_and_young_driver(Integer int1) {
        carInsurancePage.claimsNoBtn();
        carInsurancePage.nCDRatingAsFive();
        carInsurancePage.selectNoOtherCar();
        carInsurancePage.selectNoYoungers();
    }

    @Then("I select the option as No Restrictions on the policy for drivers")
    public void i_select_the_option_as_No_Restrictions_on_the_policy_for_drivers() {
        carInsurancePage.selectNoRestrictions();
    }

    @Then("I enter the personal details before proceeding further")
    public void i_enter_the_personal_details_before_proceeding_further() {
        carInsurancePage.enterFirstNameInsurer("Srini");
        carInsurancePage.enterLastNameInsurer("Jak");
        carInsurancePage.enterMobileNoInsurer("0411111111");
        carInsurancePage.enterEmailInsurer("Srinivas422@gmail.com");
        carInsurancePage.clickNextBtn();
    }

    @Then("i select the default date and accept button for all terms and conditions before clicking the getQuotes button")
    public void i_select_the_default_date_and_accept_button_for_all_terms_and_conditions_before_clicking_the_getQuotes_button() {
        carInsurancePage.selectTermsConditions();
        carInsurancePage.getQuote();
    }

    @Then("I capture the displayed quote results from different companies")
    public void i_capture_the_displayed_quote_results_from_different_companies() {
        carInsurancePage.quoteDetails();
    }


}
