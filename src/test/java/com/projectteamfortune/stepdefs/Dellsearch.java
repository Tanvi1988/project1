package com.projectteamfortune.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.projectteamfortune.POM.DellsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Dellsearch {

	WebDriver driver;

	@Given("^user visits dell home page$")
	public void user_visits_dell_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
		Thread.sleep(3000);
	}

	@Given("^user will search by \"([^\"]*)\"$")
	public void user_will_search_by(String arg1) throws Throwable {

		DellsearchPOM DS = new DellsearchPOM(driver);
		DS.Search().sendKeys(arg1);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);

	}

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		DellsearchPOM DS = new DellsearchPOM(driver);
		DS.searchbutton().click();
		Thread.sleep(3000);
		driver.quit();
	}
}
