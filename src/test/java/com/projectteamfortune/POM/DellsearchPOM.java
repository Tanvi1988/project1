package com.projectteamfortune.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsearchPOM {

	WebDriver driver;

	public DellsearchPOM(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"mh-search-input\"]")
	WebElement edit_searchbox;

	public WebElement Search() {
		return edit_searchbox;
	}

	@FindBy(xpath = "//button[@class=\"mh-search-btn mh-search-submit\"]")
	WebElement click_searchbutton;

	public WebElement searchbutton() {
		return click_searchbutton;

	}
}
