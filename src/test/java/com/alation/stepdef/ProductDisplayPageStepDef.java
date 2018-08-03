package com.alation.stepdef;

import com.alation.pages.ProductDisplayPage;

import cucumber.api.java.en.Then;

public class ProductDisplayPageStepDef {
	ProductDisplayPage productDisplayPage = new ProductDisplayPage();

	@Then("^I should be in the product page$")
	public void i_should_be_in_the_product_page() throws Throwable {
		productDisplayPage.verifyProductDispalyPageOpened();
	}

	@Then("^I should be able to validate all possible records$")
	public void i_should_be_able_to_validate_all_possible_records() throws Throwable {
		productDisplayPage.verifyProductName();
		productDisplayPage.verifyKindleCost();
		productDisplayPage.verifyPapeBackrnewCost();
		productDisplayPage.verifyPaperBackOldCost();
	}

}
