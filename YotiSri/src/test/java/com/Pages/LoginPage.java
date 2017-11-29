package com.Pages;

import org.openqa.selenium.By;

import com.CucumberRunner.AbstractMain;

public class LoginPage extends AbstractMain {

	private static By BUTTON_CLICK = By.cssSelector("#SubmitLogin");
	private static By LOGIN_PAGE_DISPLAYED = By.cssSelector(".page-subheading h3");

	public String isloginpagedisplayed() {
		return driver.findElement(LOGIN_PAGE_DISPLAYED).getText();

	}

	public void enter_login_details(String email_id, String password) {
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys(email_id);
		driver.findElement(By.cssSelector("#passwd")).clear();
		driver.findElement(By.cssSelector("#passwd")).sendKeys(password);
	}

	public void click_on_login_button() {
		driver.findElement(BUTTON_CLICK).click();
		
	}
	public void enter_in_valid_details(String email_id,String password){
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys(email_id);
		driver.findElement(By.cssSelector("#passwd")).clear();
		driver.findElement(By.cssSelector("#passwd")).sendKeys(password);
		
	}
	public String geterrormessagedisplayed() {
		
		return driver.findElement(By.cssSelector(".alert.alert-danger li")).getText();
	}

}
