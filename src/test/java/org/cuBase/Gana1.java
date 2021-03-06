package org.cuBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClassv.BaseVikki;

public class Gana1 extends BaseVikki {

	public Gana1() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Search Hotel ']")
	private WebElement containsText;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement dropDownLocation;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement dropDownHotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement dropDownRoomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement inDate;

	@FindBy(id = "datepick_out")
	private WebElement outDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;

	public WebElement getContainsText() {
		return containsText;
	}

	public WebElement getDropDownLocation() {
		return dropDownLocation;
	}

	public WebElement getDropDownHotels() {
		return dropDownHotels;
	}

	public WebElement getDropDownRoomType() {
		return dropDownRoomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
