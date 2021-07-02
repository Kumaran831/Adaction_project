package com.google.Adaction_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public static WebDriver driver;

	
	public static WebDriver getDriver() {
		return driver;
	}

public Logout(WebDriver Driver4) {
		
		this.driver=Driver4;
		
		PageFactory.initElements(Driver4, this);
		
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id="logout")
	private WebElement logout;
	
	

}
