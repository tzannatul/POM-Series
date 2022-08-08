package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

private WebDriver driver;	
	
//1. By locators
private By emailId = By.id("email");
private By passWord = By.id("passwd");
private By signInButton = By.id("SubmitLogin");
private By forgotPwdLink = By.linkText("Forgot your password?111");

//2. constructor of the page class:
public LoginPage (WebDriver driver) {
	this.driver = driver;
}

//3. page actions: features of the page and forming of methods

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean forgotPasswordLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(passWord).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

}
