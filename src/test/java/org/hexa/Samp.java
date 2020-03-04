package org.hexa;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Samp extends BaseClass {

	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {

		launchBrowser("https://adactin.com/HotelApp");

	}

	@When("user should enter the username and password")
	public void user_should_enter_the_username_and_password(io.cucumber.datatable.DataTable data) {
		List<String> obj = data.asList();
		String m = obj.get(0);
		String n = obj.get(1);
		System.out.println(m);
		System.out.println(n);

		LoginPojo l = new LoginPojo();

		fill(l.getUser(), m);
		fill(l.getPass(), n);

	}

	@When("User should able to click the login button")
	public void user_should_able_to_click_the_login_button() {

		LoginPojo l = new LoginPojo();
		click(l.getLoginbut());

	}

	@Then("User is on hotel search page")
	public void user_is_on_hotel_search_page() {
		getTitle();
	}

	@Then("user should able to select the location,hotel and room_type")
	public void user_should_able_to_select_the_location_hotel_and_room_type() throws InterruptedException {
		SearchPojo s = new SearchPojo();
		dropdown(s.getLocation(),"London");
		dropdown(s.getHotel(),"Hotel Sunshine");
        dropdown(s.getRoom(),"Deluxe");
        dropdown(s.getNo_room(),"4");
		dropdown(s.getNo_adult(),"4");
		dropdown(s.getNo_child(),"2");
	}

	@Then("user shoould able to click the search button")
	public void user_shoould_able_to_click_the_search_button() {
		SearchPojo s = new SearchPojo();
		click(s.getSearch());
	}

	@Then("user is abl to select the hotel by clicking radio button")
	public void user_is_abl_to_select_the_hotel_by_clicking_radio_button() {
		WebElement HR = driver.findElement(By.id("radiobutton_0"));
		click(HR);
		WebElement cont = driver.findElement(By.id("continue"));
		click(cont);
	}

	@Then("user should able to book a hotel")
	public void user_should_able_to_book_a_hotel(io.cucumber.datatable.DataTable data1) throws InterruptedException {
		List<Map<String, String>> obj1 = data1.asMaps();
		String f = obj1.get(0).get("firstname");
		String l = obj1.get(0).get("lastname");
		String a = obj1.get(0).get("Address");
		String cc = obj1.get(0).get("CreditNo");
		BookingPojo b = new BookingPojo();
		// first_name
		fill(b.getFname(), f);
		
		// last_name
		fill(b.getLname(), l);
		

		// address
		fill(b.getAddress(), a);

		// credit card
		fill(b.getCreditcard(), cc);
		
		// card_type
		dropdown(b.getCt(),"AMEX");
		


		// expiry_month
		dropdown(b.getExpirymonth(),"2");
		

		// expiry_year
		dropdown(b.getCc_exp_year(),"2020");
		

		// Cvv number
		String cv = obj1.get(0).get("Cvv");
		fill(b.getCvv(), cv);
		

		// book a hotel
		click(b.getBook());
		
		Thread.sleep(6000);
		
		String id = (b.getOrder_id().getAttribute("value"));
		System.out.println(id);
	}

}
