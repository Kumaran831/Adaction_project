package com.google.Adaction_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class Login_Page {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public Login_Page(WebDriver Driver) {
		
		this.driver=Driver;
		
		PageFactory.initElements(Driver, this);
		
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	


}
