package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.CucumberRunner.AbstractMain;

public class SearchResultsPage extends AbstractMain {

	private static By CLICK_PRODUCT = By.cssSelector(".right-block .product-name");
	private static By PRODUCT_PAGE_DISPLAYED = By.cssSelector("h1");

	private static By ADD_PRODUCT_BUTTON = By.cssSelector(".button.ajax_add_to_cart_button");
	private static By CONTINUE_SHOPPING_BUTTON = By.cssSelector(".cross");

	public void select_product() {
		driver.findElements(CLICK_PRODUCT).get(0).click();

	}

	public void select_product(int numberOfProdcuts) throws InterruptedException {
		for (int i = 0; i < numberOfProdcuts; i++) {
			WebElement addCartButton = driver.findElements(CLICK_PRODUCT).get(i);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addCartButton);
			Thread.sleep(500);
			Actions builder = new Actions(driver);
			WebElement element = driver.findElements(CLICK_PRODUCT).get(i);
			builder.moveToElement(element).build().perform();
			driver.findElements(ADD_PRODUCT_BUTTON).get(i).click();
			Thread.sleep(2000);
			driver.findElement(CONTINUE_SHOPPING_BUTTON).click();
			Thread.sleep(2000);
		}

	}

	public boolean isproductpagedisplayed() {
		return driver.findElement(PRODUCT_PAGE_DISPLAYED).isDisplayed();
	}

	public void product1(String searchterm) {
		driver.findElement(By.cssSelector("#search_query_top")).sendKeys(searchterm);
	}

}
