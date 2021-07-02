package com.Adaction.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.Adaction_Project.Book_A_Hotel;
import com.google.Adaction_Project.Check_Box;
import com.google.Adaction_Project.Login_Page;
import com.google.Adaction_Project.Logout;
import com.google.Adaction_Project.Search_Hotel;

import BaseClass.Base_Class;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	
	public static Login_Page login = new Login_Page(driver);
	
	public static Search_Hotel SH = new Search_Hotel(driver);
	
	public static Check_Box CB = new Check_Box(driver);
	
	public static Book_A_Hotel BH = new Book_A_Hotel(driver);
	
	public static Logout LG = new Logout(driver);
	
	@Given("^user Launch The Adaction Application$")
	public void user_Launch_The_Adaction_Application() throws Throwable {
	 
		launchSite("http://adactinhotelapp.com/");
		
	}

	@When("^user Enters The Username In The User name Input Box$")
	public void user_Enters_The_Username_In_The_User_name_Input_Box() throws Throwable {
		
		Thread.sleep(2000);
		sendValues(login.getUsername(), "kumaranjohn831");
	}

	@When("^user Enters The Password In The Password Input Box$")
	public void user_Enters_The_Password_In_The_Password_Input_Box() throws Throwable {
	    sendValues(login.getPassword(), "Kuma@831");
	}

	@Then("^user Clicks The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	   
		clickOnElement(login.getLogin());
	}

	@When("^user Selects The Location From The Dropdown box$")
	public void user_Selects_The_Location_From_The_Dropdown_box() throws Throwable {
	    
		Thread.sleep(2000);
		selectSingle(SH.getLocation(), "Sydney");
	}

	@When("^user Selects The Hotel From the Dropdown$")
	public void user_Selects_The_Hotel_From_the_Dropdown() throws Throwable {
	    selectSingle(SH.getHotels(), "Hotel Creek");
	}

	@When("^user Selects The Room Type From The Dropdown$")
	public void user_Selects_The_Room_Type_From_The_Dropdown() throws Throwable {
	    selectSingle(SH.getRoom_type(), "Deluxe");
	}

	@When("^user Selects The Number of Rooms From The Dropdown$")
	public void user_Selects_The_Number_of_Rooms_From_The_Dropdown() throws Throwable {
	    selectSingle(SH.getRoom_nos(),"1");
	}

	@When("^user Enter The Check In Date In The Date Input Box$")
	public void user_Enter_The_Check_In_Date_In_The_Date_Input_Box() throws Throwable {
	    sendValues(SH.getDatepick_in(), "28/06/2021");
	}

	@When("^user Enter The Check Out Date In The Date Input Box$")
	public void user_Enter_The_Check_Out_Date_In_The_Date_Input_Box() throws Throwable {
	    sendValues(SH.getDatepick_out(), "29/06/2021");

	}

	@When("^user Selects The Adults Per Room From The Dropdown$")
	public void user_Selects_The_Adults_Per_Room_From_The_Dropdown() throws Throwable {
	  selectSingle(SH.getAdult_room(), "1");
	}

	@When("^user Selects The Child Per Room From The Dropdown$")
	public void user_Selects_The_Child_Per_Room_From_The_Dropdown() throws Throwable {
	   selectSingle(SH.getChild_room(), "0");
	}

	@Then("^user Click the Search Button And It Navigates To The Selected Hotel Page$")
	public void user_Click_the_Search_Button_And_It_Navigates_To_The_Selected_Hotel_Page() throws Throwable {
	    clickOnElement(SH.getSubmit());
	}

	@When("^user Selects The Hotel By Clicking The Radio Button$")
	public void user_Selects_The_Hotel_By_Clicking_The_Radio_Button() throws Throwable {
		
		Thread.sleep(2000);
	    clickOnElement(CB.getRadiobutton_0());
	}

	@Then("^user Clicks The Continue And It Navigates To The Book A Hotel Page$")
	public void user_Clicks_The_Continue_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
	    clickOnElement(CB.getCon());
	}

	@When("^user Enters The First Name In The Input Box$")
	public void user_Enters_The_First_Name_In_The_Input_Box() throws Throwable {
	    sendValues(BH.getFirst_name(), "Kumaran");
	}

	@When("^user Enters The Last Name In The Input Box$")
	public void user_Enters_The_Last_Name_In_The_Input_Box() throws Throwable {
	    sendValues(BH.getLast_name(), "M");
	}

	@When("^user Enters The Billing Address In The Input Box$")
	public void user_Enters_The_Billing_Address_In_The_Input_Box() throws Throwable {
	   sendValues(BH.getAddress(), "Lvl6/ 180 Phillip St, Sydney, NSW 2000");
	}

	@When("^user Enters The Credit Card No In The Input Box$")
	public void user_Enters_The_Credit_Card_No_In_The_Input_Box() throws Throwable {
	   sendValues(BH.getCc_num(), "4485741262708857");
	}

	@When("^user Selects The Credit Card Type From the Dropdown$")
	public void user_Selects_The_Credit_Card_Type_From_the_Dropdown() throws Throwable {
	    selectSingle(BH.getCc_type(), "VISA");
	}

	@When("^user Selects The Expiry Month From The Dropdown$")
	public void user_Selects_The_Expiry_Month_From_The_Dropdown() throws Throwable {
	    selectSingle(BH.getCc_exp_month(), "11");
	}

	@When("^user Selects The Expiry Year From The Dropdown$")
	public void user_Selects_The_Expiry_Year_From_The_Dropdown() throws Throwable {
	   selectSingle(BH.getCc_exp_year(), "2022");
	}

	@When("^user Enters The Credot Card CVV Number In The Input Box$")
	public void user_Enters_The_Credot_Card_CVV_Number_In_The_Input_Box() throws Throwable {
		sendValues(BH.getCc_cvv(), "351");
	}

	@Then("^user Clicks The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Clicks_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
	    clickOnElement(BH.getBook_now());
	}

	@Then("^user Clicks The Logout Button And It Navigates To The Logout Page$")
	public void user_Clicks_The_Logout_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
	    Thread.sleep(5000);
	    
	    clickOnElement(LG.getLogout());
	}
	

}
