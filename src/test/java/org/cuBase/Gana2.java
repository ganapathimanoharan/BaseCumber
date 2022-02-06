package org.cuBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClassv.BaseVikki;

public class Gana2 extends BaseVikki{
	
	public Gana2() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement containsText;

	@FindBy(id = "radiobutton_0")
	private WebElement click1;

	@FindBy(id = "continue")
	private WebElement click2;

	public WebElement getContainsText() {
		return containsText;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

}
