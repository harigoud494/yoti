package com.CucumberRunner;

import org.openqa.selenium.WebDriver;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.MyAccountPage;
import com.Pages.ProductDetailsPage;
import com.Pages.RegisterPage;
import com.Pages.SearchResultsPage;

public class AbstractMain {
	public static WebDriver driver;
	public static HomePage homepage=new HomePage();
	public static SearchResultsPage searchresultspage=new SearchResultsPage();
	public static RegisterPage register=new RegisterPage();
	public static ProductDetailsPage productdetailspage=new ProductDetailsPage();
	public static LoginPage loginpage=new LoginPage();
	public static MyAccountPage myAccountPage=new MyAccountPage();
	
	

}
