package com.alation.stepdef;

import com.alation.pages.SearchResultPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchResultStepdef {
	SearchResultPage searchResultPage = new SearchResultPage();
	
	@Then("^I should be in product listing page for data catalog$")
	public void i_should_be_in_product_listing_page_for_data_catalog() throws Throwable {
		searchResultPage.getWholeAmount();
		searchResultPage.getFractionalAmount();
		searchResultPage.getKindleCost();
		searchResultPage.getPaperBackCostNew();
		searchResultPage.getPaperBackCostOld();
	  
	}

	@When("^I click on the first product available in the product listing page$")
	public void i_click_on_the_first_product_available_in_the_product_listing_page() throws Throwable {
		searchResultPage.firstBook();
	}
}
