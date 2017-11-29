package com.StepDefination;

import com.CucumberRunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDetailsStepDef extends AbstractMain {
	
	@When("^I add product into Basket$")
	public void i_add_product_into_Basket() throws Throwable {
		productdetailspage.add_product();
	}
	@Then("^I click on proceed to checkout$")
	public void i_click_on_proceed_to_checkout() throws Throwable {
		Thread.sleep(2000);

		productdetailspage.proceed_to_checkout();

	}
		
		

}
