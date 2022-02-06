package org.stepDefhook;

import java.util.concurrent.TimeUnit;

import org.cuBase.BaseClassG;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefHook extends BaseClassG {

	@Given("^user is on adacting page$")
	public void user_is_on_adacting_page() throws Exception {

		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);

	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Exception {
		findElementByXpath("//input[@id='username']").sendKeys("ganapathi12345");
		findElementByXpath("//input[@id='password']").sendKeys("I280DX");

	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Exception {

		findElementByXpath("//input[@id='login']").click();

	}

	@Given("^user enter the select page details location, no of room, check in date, check out date,adults per room$")
	public void user_enter_the_select_page_details_location_no_of_room_check_in_date_check_out_date_adults_per_room()
			throws Exception {

		findElementByXpath("//select[@id='location']").sendKeys("London");
		findElementByXpath("//select[@id='room_nos']").sendKeys("1 - One");
		WebElement dateIN = findElementById("datepick_in");
		dateIN.clear();
		dateIN.sendKeys("14/02/2022");
		WebElement dateOut = findElementById("datepick_out");
		dateOut.clear();
		dateOut.sendKeys("15/02/2022");
		findElementByXpath("//select[@id='adult_room']").sendKeys("3 - Three");

	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Exception {

		findElementByXpath("//input[@id='Submit']").click();

	}

	@Then("^user filling the select hotel page select hotel$")
	public void user_filling_the_select_hotel_page_select_hotel() throws Exception {

		findElementById("radiobutton_3").click();

	}

	@Then("^user click on select hotel button$")
	public void user_click_on_select_hotel_button() throws Exception {

		findElementById("continue").click();
	}

	@When("^user filling the Book hotel page firstname, lastname, address, cardno, cardtype,expairymonth, expairyyear, cvvno$")
	public void user_filling_the_Book_hotel_page_firstname_lastname_address_cardno_cardtype_expairymonth_expairyyear_cvvno()
			throws Exception {

		findElementByXpath("//input[@id='first_name']").sendKeys("ganapathi");
		findElementByXpath("//input[@id='last_name']").sendKeys("manoharan");
		findElementByXpath("//textarea[@id='address']").sendKeys("Greens tech");
		findElementByXpath("//input[@id='cc_num']").sendKeys("9988998899889988");
		findElementByXpath("//select[@id='cc_type']").sendKeys("American Express");
		findElementById("cc_exp_month").sendKeys("May");
		findElementById("cc_exp_year").sendKeys("2022");
		findElementByXpath("//input[@id='cc_cvv']").sendKeys("8899");

	}

	@When("^user click the booknow button$")
	public void user_click_the_booknow_button() throws Exception {

		findElementById("book_now").click();
	}

	@Given("^user enter the details hotel, roomtype,childperroom$")
	public void user_enter_the_details_hotel_roomtype_childperroom() throws Exception {

		findElementByXpath("//select[@id='hotels']").sendKeys("Hotel Creek");
		findElementByXpath("//select[@id='room_type']").sendKeys("Standard");
		findElementByXpath("//select[@id='child_room']").sendKeys("3 - Three");

	}

	@Given("^user click the book now button$")
	public void user_click_the_book_now_button() throws Exception {

		findElementByXpath("//input[@id='Submit']").click();
		Assert.assertTrue(false);
		
	}

	@When("^user enter the details in search hote page location, hotels, roomtype, roomnos, adultroom,childroom$")
	public void user_enter_the_details_in_search_hote_page_location_hotels_roomtype_roomnos_adultroom_childroom()
			throws Exception {

		findElementByXpath("//select[@id='location']").sendKeys("London");
		findElementByXpath("//select[@id='hotels']").sendKeys("Hotel Creek");
		findElementByXpath("//select[@id='room_type']").sendKeys("Standard");
		findElementByXpath("//select[@id='room_nos']").sendKeys("1 - One");
		WebElement dateIN = findElementById("datepick_in");
		dateIN.clear();
		dateIN.sendKeys("14/02/2022");
		WebElement dateOut = findElementById("datepick_out");
		dateOut.clear();
		dateOut.sendKeys("15/02/2022");
		findElementByXpath("//select[@id='adult_room']").sendKeys("3 - Three");
		findElementByXpath("//select[@id='child_room']").sendKeys("3 - Three");
	}

	@When("^user click the search button$")
	public void user_click_the_search_button() throws Exception {

		findElementByXpath("//input[@id='Submit']").click();
	}

	@Then("^user check select hotel page visible or not$")
	public void user_check_select_hotel_page_visible_or_not() throws Exception {

		WebElement element29 = findElementByXpath("//td[text()='Select Hotel ']");
		String text3 = element29.getText();
		boolean c = text3.contains("Select Hotel");
		Assert.assertTrue("Verify Tittle", c);
		sysout(text3);
	}

	@Then("^user select the hotel and click the search button$")
	public void user_select_the_hotel_and_click_the_search_button() throws Exception {

		findElementById("radiobutton_0").click();
		findElementById("continue").click();
	}

	@Then("^user check booking page visible or not$")
	public void user_check_booking_page_visible_or_not() throws Exception {

		WebElement element30 = findElementByXpath("//td[text()='Book A Hotel ']");
		String text4 = element30.getText();
		boolean d = text4.contains("Book A Hotel");
		Assert.assertTrue("Verify Tittle", d);
		sysout(text4);
	}

	@When("^user enter the details in booking page firstName,lastName,address,cardno,cardtype,expmonth,expyear,cvvno$")
	public void user_enter_the_details_in_booking_page_firstName_lastName_address_cardno_cardtype_expmonth_expyear_cvvno()
			throws Exception {

		findElementByXpath("//input[@id='first_name']").sendKeys("ganapathi");
		findElementByXpath("//input[@id='last_name']").sendKeys("manoharan");
		findElementByXpath("//textarea[@id='address']").sendKeys("Greens tech");
		findElementByXpath("//input[@id='cc_num']").sendKeys("9988998899889988");
		findElementByXpath("//select[@id='cc_type']").sendKeys("American Express");
		findElementById("cc_exp_month").sendKeys("May");
		findElementById("cc_exp_year").sendKeys("2022");
		findElementByXpath("//input[@id='cc_cvv']").sendKeys("8899");
	}

	@When("^user click the booking button$")
	public void user_click_the_booking_button() throws Exception {

		findElementById("book_now").click();

	}

	@When("^user cancel the booking$")
	public void user_cancel_the_booking() throws Exception {

		String attribute = findElementById("order_no").getAttribute("value");
		sysout(attribute);

		findElementByXpath("//a[text()='Booked Itinerary']").click();
		findElementByXpath("//input[@name='order_id_text']").sendKeys(attribute);
		findElementById("search_hotel_id").click();
		findElementByXpath("//input[contains(@name,'btn_id_')]").click();

		alert();
		
		sysout("done");

	}

}
