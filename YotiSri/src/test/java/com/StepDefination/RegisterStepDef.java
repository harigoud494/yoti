package com.StepDefination;

import com.CucumberRunner.AbstractMain;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Map;

public class RegisterStepDef extends AbstractMain {
	@When("^I click on SignIn link$")
	public void i_click_on_SignIn_link() throws Throwable {
		register.click_on_sign_in_link();

	}

	@When("^I should see Register page$")
	public void i_should_see_Register_page() throws Throwable {
		register.isRegisterPageDisplayed();
		assertThat("This is not RegisterPage:", register.isRegisterPageDisplayed());

	}

	@When("^I enter E-mail id and continue as guest$")
	public void i_enter_E_mail_id() throws Throwable {
		register.enter_Email_Id();
	}

	@When("^I enter the Details$")
	public void i_enter_the_Details(DataTable details) throws Throwable {
		Map<String, String> data = details.asMap(String.class, String.class);

		String password = data.get("Password");
		String dob = data.get("DOB");
		String address = data.get("Address");
		String city = data.get("City");
		String postcode = data.get("Postcode");
		String mobilephone = data.get("MobilePhone");

		register.details(password, dob, address, city, postcode, mobilephone);

	}

}
