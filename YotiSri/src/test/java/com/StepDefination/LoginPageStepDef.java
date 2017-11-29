package com.StepDefination;

import com.CucumberRunner.AbstractMain;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Map;

public class LoginPageStepDef extends AbstractMain {
	@When("^I should see the loginpage$")
	public void i_should_see_the_loginpage(String expexted) throws Throwable {
		assertThat("This is not LoginPage" + "Actual:", loginpage.isloginpagedisplayed().contains(expexted));

	}

	@When("^I enter the login details$")
	public void i_enter_the_login_details(DataTable logindetails) throws Throwable {
		Map<String, String> data = logindetails.asMap(String.class, String.class);
		String email_id = data.get("Email address");
		String password = data.get("Password");
		loginpage.enter_login_details(email_id, password);

	}

	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		loginpage.click_on_login_button();

	}
	
	@When("^I enter Invalid Details$")
	public void i_enter_Invalid_Details(DataTable invaliddata) throws Throwable {
		Map<String,String> data=invaliddata.asMap(String.class, String.class);
		String email_id=data.get("Email address");
		String password=data.get("Password");
		loginpage.enter_in_valid_details(email_id, password);
	    
	}

	@Then("^I should see error message$")
	public void i_should_see_error_message() throws Throwable {
		String expected="Authentication failed.";
		assertThat("Error message not displayed"+"Actual:",loginpage.geterrormessagedisplayed().contains(expected));
	    
	}

}
