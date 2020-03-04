package com.stepdefinition;
//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.step.LibGlobal;

import cucumber.api.java.en.*;




public class LoginStepDef extends LibGlobal {
	WebDriver driver;
	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {
		lanch();
		
		
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(io.cucumber.datatable.DataTable data) {
	  /*  List<String> username= data.asList();
	    String s=username.get(0);
	    System.out.println(s);
	    
	    List<String> password= data.asList();
	    String s1=password.get(0);
	    System.out.println(s1);*/
	    
	    
	}

	@When("useer should click the login button")
	public void useer_should_click_the_login_button() {
	   
	}

	@Then("user should verify the message")
	public void user_should_verify_the_message() {
	   
	}
	
	}



	