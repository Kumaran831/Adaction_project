package com.google.Adaction_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Box {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getCon() {
		return con;
	}
	
public Check_Box(WebDriver Driver2) {
		
		this.driver=Driver2;
		
		PageFactory.initElements(Driver2, this);
		
	}

	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement con;
	
	

}
