$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/compareCarInsurance.feature");
formatter.feature({
  "name": "Web :: User Car Insurance Comparison journey",
  "description": "  In order to collate the information required to get quotes from companies that provide the car insurance\n  As a user\n  I want a website which will allow me to search with different options to compare and find the best price for my car insurance",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CarInsuranceCompare"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User Car Insurance Comparison journey",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ComprehensiveCarInsuranceCompare"
    }
  ]
});
formatter.step({
  "name": "Website allows to enter Rego number of the car as \"\u003cregoNum\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I select \"\u003cstate\u003e\" after I click next button",
  "keyword": "And "
});
formatter.step({
  "name": "I select insurance type as \"\u003cinsuranceType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select the \"\u003caccessoriesAnswer\u003e\" for the question related to  factory options and non standard accessories",
  "keyword": "And "
});
formatter.step({
  "name": "I select the \"\u003cModificationsAnswer\u003e\" for the question car modifications",
  "keyword": "And "
});
formatter.step({
  "name": "I select the \"\u003crepairsAnswer\u003e\" for the question car accidental repairs",
  "keyword": "And "
});
formatter.step({
  "name": "I select the \"\u003cfinanceAnswer\u003e\" for the question car finance",
  "keyword": "And "
});
formatter.step({
  "name": "I select the private as an option for usage type",
  "keyword": "And "
});
formatter.step({
  "name": "I select the \"\u003cinsuredAnswer\u003e\" as an option for usage type",
  "keyword": "And "
});
formatter.step({
  "name": "I enter the \"\u003cnoOFKms\u003e\" per year to travel before clicking next button",
  "keyword": "And "
});
formatter.step({
  "name": "I enter the \"\u003cpostCode\u003e\" where the car usually park",
  "keyword": "And "
});
formatter.step({
  "name": "I enter the \"\u003caddress\u003e\" for the car usually park",
  "keyword": "And "
});
formatter.step({
  "name": "I select the car parking type as carpark",
  "keyword": "And "
});
formatter.step({
  "name": "I select the regular driver\u0027s gender as Male before entering the date of birth",
  "keyword": "And "
});
formatter.step({
  "name": "I select the employment status before proceed further",
  "keyword": "And "
});
formatter.step({
  "name": "I enter the age before clicking the next button",
  "keyword": "And "
});
formatter.step({
  "name": "I select the options for claims in last 5 years, owning another car and young driver",
  "keyword": "And "
});
formatter.step({
  "name": "I select the option as No Restrictions on the policy for drivers",
  "keyword": "And "
});
formatter.step({
  "name": "I enter the personal details before proceeding further",
  "keyword": "Then "
});
formatter.step({
  "name": "i select the default date and accept button for all terms and conditions before clicking the getQuotes button",
  "keyword": "And "
});
formatter.step({
  "name": "I wait for \"10\" seconds",
  "keyword": "And "
});
formatter.step({
  "name": "I capture the displayed quote results from different companies",
  "keyword": "Then "
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "regoNum",
        "state",
        "insuranceType",
        "accessoriesAnswer",
        "ModificationsAnswer",
        "financeAnswer",
        "repairsAnswer",
        "insuredAnswer",
        "noOFKms",
        "postCode",
        "address"
      ]
    },
    {
      "cells": [
        "CU91EW",
        "New South Wales",
        "Comprehensive",
        "No",
        "No",
        "No",
        "No",
        "Yes",
        "6000",
        "2150",
        "23 Campbell Street, Parramatta, NSW, 2150"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to comparethemarket website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_navigate_to_comparethemarket_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for \"3\" seconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CommonStepDef.i_wait_for_seconds(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on car insurance button",
  "keyword": "When "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_click_on_car_insurance_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on compare button",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_click_on_compare_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Car Insurance Comparison journey",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CarInsuranceCompare"
    },
    {
      "name": "@ComprehensiveCarInsuranceCompare"
    }
  ]
});
formatter.step({
  "name": "Website allows to enter Rego number of the car as \"CU91EW\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.website_allows_to_enter_Rego_number_of_the_car_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"New South Wales\" after I click next button",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_after_I_click_next_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select insurance type as \"Comprehensive\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_insurance_type_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"No\" for the question related to  factory options and non standard accessories",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_for_the_question_related_to_factory_options_and_non_standard_accessories(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"No\" for the question car modifications",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_for_the_question_car_modifications(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"No\" for the question car accidental repairs",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_for_the_question_car_accidental_repairs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"No\" for the question car finance",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_for_the_question_car_finance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the private as an option for usage type",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_private_as_an_option_for_usage_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"Yes\" as an option for usage type",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_as_an_option_for_usage_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the \"6000\" per year to travel before clicking next button",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_enter_the_per_year_to_travel_before_clicking_next_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the \"2150\" where the car usually park",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_enter_the_where_the_car_usually_park(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the \"23 Campbell Street, Parramatta, NSW, 2150\" for the car usually park",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_enter_the_Campbell_Street_Parramatta_NSW_for_the_car_usually_park(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument\nfrom invalid argument: \u0027element\u0027 is missing\n  (Session info: chrome\u003d84.0.4147.105)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-M8LV8NU\u0027, ip: \u0027192.168.215.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}), userDataDir\u003dC:\\Users\\srini\\AppData\\Local\\Temp\\scoped_dir20348_719932608}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:55667}, acceptInsecureCerts\u003dfalse, browserVersion\u003d84.0.4147.105, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 84897b9be4a266086a49720c71f7e1aa\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:703)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:631)\r\n\tat com.compare.au.pages.CarInsurancePage.addressDetails(CarInsurancePage.java:257)\r\n\tat com.compare.au.steps.CarInsuranceStepdef.i_enter_the_Campbell_Street_Parramatta_NSW_for_the_car_usually_park(CarInsuranceStepdef.java:93)\r\n\tat ✽.I enter the \"23 Campbell Street, Parramatta, NSW, 2150\" for the car usually park(file:///C:/Automation/CompareMarketUIAutomation/src/test/resources/features/compareCarInsurance.feature:37)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I select the car parking type as carpark",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_car_parking_type_as_carpark()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select the regular driver\u0027s gender as Male before entering the date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_regular_driver_s_gender_as_Male_before_entering_the_date_of_birth()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select the employment status before proceed further",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_employment_status_before_proceed_further()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter the age before clicking the next button",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_enter_the_age_before_clicking_the_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select the options for claims in last 5 years, owning another car and young driver",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_options_for_claims_in_last_years_owning_another_car_and_young_driver(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select the option as No Restrictions on the policy for drivers",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_option_as_No_Restrictions_on_the_policy_for_drivers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter the personal details before proceeding further",
  "keyword": "Then "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_enter_the_personal_details_before_proceeding_further()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "i select the default date and accept button for all terms and conditions before clicking the getQuotes button",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_select_the_default_date_and_accept_button_for_all_terms_and_conditions_before_clicking_the_getQuotes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for \"10\" seconds",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CommonStepDef.i_wait_for_seconds(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I capture the displayed quote results from different companies",
  "keyword": "Then "
});
formatter.match({
  "location": "com.compare.au.steps.CarInsuranceStepdef.i_capture_the_displayed_quote_results_from_different_companies()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.compare.au.steps.CommonStepDef.i_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});