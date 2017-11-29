package com.StepDefination;

import com.CucumberRunner.AbstractMain;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Map;

public class SearchResultsPageStepDef extends AbstractMain {
	@Given("^I am in HomePage$")
	public void i_am_in_HomePage() throws Throwable {
		homepage.start();

	}

	@When("^I enter product into search \"([^\"]*)\"$")
	public void i_enter_product_into_search(String productname) throws Throwable {
		homepage.enter_product(productname);

	}

	@When("^I select product from search result page$")
	public void i_select_product_from_search_result_page() throws Throwable {
		searchresultspage.select_product();

	}

	@When("^I should see product descrption page$")
	public void i_should_see_product_descrption_page() throws Throwable {
		assertThat("This is not productdescriptionpage:", searchresultspage.isproductpagedisplayed());

	}

	@When("^I add (\\d+) product to basket from search$")
	public void i_add_product_to_basket_from_search(int numberofProducts, DataTable productname) throws Throwable {
		Map<String, String> keyvalue = productname.asMap(String.class, String.class);
		String productvalue1 = keyvalue.get("product1");
		String productvalue2 = keyvalue.get("product2");

		homepage.enter_product(productvalue1);
		searchresultspage.select_product(numberofProducts);
		homepage.enter_product(productvalue2);
		searchresultspage.select_product(numberofProducts);

	}

}
