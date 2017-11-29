package com.Pages;

import org.openqa.selenium.By;

import com.CucumberRunner.AbstractMain;

public class MyAccountPage extends AbstractMain{

	public String getMyAccountTitle(){
		return driver.getTitle();
	}
	public String getCustomerName(){
		return driver.findElement(By.cssSelector(".header_user_info span")).getText();
	}
}
