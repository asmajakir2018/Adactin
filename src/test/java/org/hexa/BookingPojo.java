package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPojo extends BaseClass {
	public BookingPojo() {
		PageFactory.initElements(driver, this);
	
}
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditcard;
	
	@FindBy(id="cc_type")
	private WebElement ct;
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(id="order_no")
	private WebElement order_id;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCt() {
		return ct;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getOrder_id() {
		return order_id;
	}
	
	
	
	
}

