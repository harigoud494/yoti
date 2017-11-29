package com.Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.CucumberRunner.AbstractMain;

public class RegisterPage extends AbstractMain {
	private static By SIGN_IN = By.cssSelector(".login");
	private static By PAGE_DISPLAY = By.cssSelector(".page-heading");
	private static By CREATE_AN_ACCOUNT = By.cssSelector("#SubmitCreate");
	public String firstname=null;
	public String lastname=null;

	public void click_on_sign_in_link() {
		driver.findElement(SIGN_IN).click();
	}

	public boolean isRegisterPageDisplayed() {
		return driver.findElement(PAGE_DISPLAY).isDisplayed();
	}

	public void enter_Email_Id() {
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String Email_Id = generateRandomChars(candidateChars, 9) + "@gmail.com";
		System.out.println(Email_Id);
		driver.findElement(By.cssSelector("#email_create")).clear();
		driver.findElement(By.cssSelector("#email_create")).sendKeys(Email_Id);
		driver.findElement(CREATE_AN_ACCOUNT).click();
	}

	public void details(String password, String dob, String address, String city, String postcode, String mobilephone)
			throws InterruptedException {
		String[] arrValues = dob.split("/");
		 firstname = generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10);
		 lastname = generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 9);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#id_gender1")).click();
		driver.findElement(By.cssSelector("#customer_firstname")).clear();
		driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(firstname);
		System.out.println(firstname);
		driver.findElement(By.cssSelector("#customer_lastname")).clear();
		driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(lastname);
		System.out.println(lastname);
		driver.findElement(By.cssSelector("#passwd")).clear();
		driver.findElement(By.cssSelector("#passwd")).sendKeys(password);
		Select daydropdown = new Select(driver.findElement(By.cssSelector("#days")));
		daydropdown.selectByValue(arrValues[0]);
		Select monthdropdown = new Select(driver.findElement(By.cssSelector("#months")));
		monthdropdown.selectByValue(arrValues[1]);
		Select yeardropdown = new Select(driver.findElement(By.cssSelector("#years")));
		yeardropdown.selectByValue(arrValues[2]);

		driver.findElement(By.cssSelector("#firstname")).clear();
		driver.findElement(By.cssSelector("#firstname")).sendKeys(firstname);
		System.out.println(firstname);
		driver.findElement(By.cssSelector("#lastname")).clear();
		driver.findElement(By.cssSelector("#lastname")).sendKeys(lastname);
		System.out.println(lastname);
		driver.findElement(By.cssSelector("#address1")).clear();
		driver.findElement(By.cssSelector("#address1")).sendKeys(address);
		driver.findElement(By.cssSelector("#city")).clear();
		driver.findElement(By.cssSelector("#city")).sendKeys(city);
		Select country = new Select(driver.findElement(By.cssSelector("#id_country")));
		country.selectByVisibleText("United States");
		Thread.sleep(2000);
		Select state = new Select(driver.findElement(By.cssSelector("#id_state")));
		state.selectByIndex(1);
		driver.findElement(By.cssSelector("#postcode")).clear();
		driver.findElement(By.cssSelector("#postcode")).sendKeys(postcode);
		driver.findElement(By.cssSelector("#phone_mobile")).clear();
		driver.findElement(By.cssSelector("#phone_mobile")).sendKeys(mobilephone);
		driver.findElement(By.cssSelector("#submitAccount span")).click();

	}

	public static String generateRandomChars(String candidateChars, int length) {

		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
		}

		return sb.toString();
	}

}
