Feature: Verifying the adactin login page
Scenario: Verifying the login details with valid credentials
Given User is on adactin login page
When user should enter the username and password
					|Asmajakir|aaleyah|
And User should able to click the login button
Then User is on hotel search page
Then user should able to select the location,hotel and room_type



Then user shoould able to click the search button
Then user is abl to select the hotel by clicking radio button
Then user should able to book a hotel
					|firstname|lastname|Address      |CreditNo        |Cvv|
					|Asma     |jakir   |kovilambakkam|1234567891034567|962|



