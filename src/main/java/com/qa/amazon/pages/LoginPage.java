package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.amzon.base.BasePage;

public class LoginPage extends BasePage{
	
	private WebDriver driver;
	
	By signinHeader =  By.linkText("Sign Up");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean signinHeaderLink() {
		
		return driver.findElement(signinHeader).isDisplayed();
		
	}
	
public void signinButton() {
		
	driver.findElement(signinHeader).click();
}
			

}
