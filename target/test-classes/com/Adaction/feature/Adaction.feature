Feature: Hotel Booking Application

Scenario: 
Given user Launch The Adaction Application 
When user Enters The Username In The User name Input Box
And user Enters The Password In The Password Input Box
Then user Clicks The Login Button And It Navigates To The Search Hotel Page

Scenario:
When user Selects The Location From The Dropdown box
And user Selects The Hotel From the Dropdown
And user Selects The Room Type From The Dropdown
And user Selects The Number of Rooms From The Dropdown
And user Enter The Check In Date In The Date Input Box
And user Enter The Check Out Date In The Date Input Box
And user Selects The Adults Per Room From The Dropdown
And user Selects The Child Per Room From The Dropdown
Then user Click the Search Button And It Navigates To The Selected Hotel Page

Scenario:
When user Selects The Hotel By Clicking The Radio Button
Then user Clicks The Continue And It Navigates To The Book A Hotel Page

Scenario:
When user Enters The First Name In The Input Box
And user Enters The Last Name In The Input Box
And user Enters The Billing Address In The Input Box
And user Enters The Credit Card No In The Input Box
And user Selects The Credit Card Type From the Dropdown
And user Selects The Expiry Month From The Dropdown
And user Selects The Expiry Year From The Dropdown
And user Enters The Credot Card CVV Number In The Input Box
Then user Clicks The Book Now Button And It Navigates To The Booking Confirmation Page

Scenario:
Then user Clicks The Logout Button And It Navigates To The Logout Page

