package com.StepDefination;

import com.CucumberRunner.AbstractMain;

import cucumber.api.java.en.Then;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyAccountStepDef extends AbstractMain{
	
	@Then("^I should see user registered$")
	public void i_should_see_user_registered() throws Throwable {
		String expectedCustomerName=register.firstname+" "+register.lastname;
	   assertThat("Its not my account page",myAccountPage.getMyAccountTitle().equals("My account - My Store"));
	   assertThat("Customer Name displayed wrong",myAccountPage.getCustomerName().equals(expectedCustomerName));
	   
	}

}
