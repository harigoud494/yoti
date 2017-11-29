package com.StepDefination;

import com.CucumberRunner.AbstractMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef extends AbstractMain {
	@Given("^I am in Homepage$")
	public void i_am_in_Homepage() throws Throwable {
		homepage.start();

	}

	@When("^I enter multiple product from search \"([^\"]*)\"$")
	public void i_enter_multiple_product_from_search(String searchterm) throws Throwable {
		homepage.enter_product(searchterm);
	}

}
