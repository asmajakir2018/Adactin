package org.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass {
	public SearchPojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement No_room;
	
	@FindBy(id="adult_room")
	private WebElement No_adult;
	
	@FindBy(id="child_room")
	private WebElement No_child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNo_room() {
		return No_room;
	}

	public WebElement getNo_adult() {
		return No_adult;
	}

	public WebElement getNo_child() {
		return No_child;
	}

	public WebElement getSearch() {
		return search;
	}
	
}
