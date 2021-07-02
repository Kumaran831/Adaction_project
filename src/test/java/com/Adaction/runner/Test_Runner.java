package com.Adaction.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import BaseClass.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mmkumra\\eclipse-workspace\\Adaction_Project\\src\\test\\java\\com\\Adaction\\feature\\Adaction.feature",
glue = "com.Adaction.stepdefinition")

public class Test_Runner extends Base_Class{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		driver = Base_Class.browserLaunch();
	}
	
	@AfterClass
	public static void tear_Down() throws Throwable
	{
		
		printScreen();		
		Thread.sleep(3000);
		Base_Class.close();
	}
}
