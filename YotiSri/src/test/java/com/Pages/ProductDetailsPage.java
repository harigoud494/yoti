package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.CucumberRunner.AbstractMain;

public class ProductDetailsPage extends AbstractMain {

	private static By QUANITITY = By.cssSelector(".icon-plus");
	private static By DROP_DOWN = By.cssSelector("#group_1");
	private static By ADD_TO_CART = By.cssSelector("#add_to_cart");
	private static By BUTTON_CLICK = By.cssSelector(".button-container .button-medium span");

	public void add_product() {
		driver.findElement(QUANITITY).click();
		Select dropdown = new Select(driver.findElement(DROP_DOWN));
		dropdown.selectByIndex(1);
		driver.findElement(ADD_TO_CART).click();
	}
	public void proceed_to_checkout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(BUTTON_CLICK).click();
	}

}
