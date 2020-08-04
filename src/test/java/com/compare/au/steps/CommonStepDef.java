package com.compare.au.steps;

import com.compare.au.common.TestBase;
import com.compare.au.pages.CarInsurancePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriverException;

public class CommonStepDef extends TestBase {

	public CarInsurancePage carInsurancePagePage;

	public CommonStepDef() {
		carInsurancePagePage = new CarInsurancePage(driver);
	}

	@When("^I wait for \"([^\"]*)\" seconds$")
	public void i_wait_for_seconds(String seconds) throws Throwable {

	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.close();
	}

	@Before
	public void deleteCookies() {
		try {
			driver.manage().deleteAllCookies();
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@After
	public void testShutdown() {
		driver.close();
		driver = null;
	}
}
