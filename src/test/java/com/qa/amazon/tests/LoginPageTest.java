package com.qa.amazon.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.amazon.pages.LoginPage;
import com.qa.amzon.base.BasePage;

public class LoginPageTest   {


	WebDriver driver;
	Properties prop;
	BasePage basePage;
	LoginPage loginPage;
	
	@BeforeTest
	public void setup() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		loginPage = new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void verifyTitle() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("Title is " + title);
	}
	
	@Test(priority=2)
	public void verifySigninHeader() {
		Assert.assertEquals(loginPage.signinHeaderLink(), true);
		System.out.println("Signin header link exists ");
	}
	
	@Test(priority=3)
	public void doClick() {
		loginPage.signinButton();
	}
	
	
//	@AfterTest
//	public void teardown() { 
//		driver.quit();
//	}
	
}
