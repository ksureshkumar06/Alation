package com.alation.stepdef;

import com.alation.driver.DriverFactory;
import com.alation.driver.YmlFileReader;
import com.alation.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepdef {
	DriverFactory driver = new DriverFactory();
	HomePage homepage = new HomePage();
	YmlFileReader ymlFileReader = new YmlFileReader();
	
	@Given("^I am in home page of Amazon$")
	public void i_am_in_home_page_of_Amazon() throws Throwable {
		driver.driverFactory();
		ymlFileReader.yamlFileReader();
		homepage.openUrl();
	}

	@When("^I choose Book in department dropdown$")
	public void i_choose_Book_in_department_dropdown() throws Throwable {
	  homepage.choosingBook();
	}

	@When("^I search for data catalog in book department$")
	public void i_search_for_data_catalog_in_book_department() throws Throwable {
	   homepage.enteringBookName();
	   homepage.clickSearchButton();
	}

}
