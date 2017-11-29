package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CucumberRunner.AbstractMain;

public class HomePage extends AbstractMain {
	private static String BASE_URL="http://automationpractice.com/index.php";
	private static By SEARCH_PRODUCT=By.cssSelector("#search_query_top");
	private static By CLICK_SEARCH_BUTTON=By.cssSelector(".button-search");
	
	public void start(){
		System.setProperty("webdriver.gecko.driver","C:/Users/AJ/workspace/YotiSri/src/test/resources/drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(BASE_URL);
		
	}

	public void enter_product(String productname){
		driver.findElement(SEARCH_PRODUCT).clear();
		driver.findElement(SEARCH_PRODUCT).sendKeys(productname);
		driver.findElement(CLICK_SEARCH_BUTTON).click();
		
	}
	
	

}
