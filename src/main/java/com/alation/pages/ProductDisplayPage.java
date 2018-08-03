package com.alation.pages;

import org.openqa.selenium.By;

import com.alation.bean.Bean;
import com.alation.driver.DriverFactory;

import junit.framework.Assert;

public class ProductDisplayPage extends DriverFactory {

	Bean bean = new Bean();
	SearchResultPage searchResultPage = new SearchResultPage();
	
	public void verifyProductDispalyPageOpened() {
		Assert.assertTrue("The product display page was not displayed.", driver.findElement(By.id("productTitle")).isDisplayed());
	}

	public void verifyProductName() {
		Assert.assertEquals("The product name is not as expected",searchResultPage.firstBook(),
				driver.findElement(By.id("productTitle")).getText());
	}

	public void verifyKindleCost() {
		Assert.assertEquals("The kindle cost is not as expected",searchResultPage.getKindleCost() ,
				driver.findElement(By.cssSelector(".a-size-base.mediaTab_subtitle")).getText());

	}

	public void verifyPapeBackrnewCost() {
		Assert.assertEquals("The paper back new cost is not as expected", searchResultPage.getPaperBackCostNew(),
				driver.findElement(By.cssSelector(".a-size-medium.a-color-price.header-price")).getText());
	}

	public void verifyPaperBackOldCost() {
		Assert.assertEquals("The paper back old cost is not as expected", searchResultPage.getPaperBackCostOld(),
				driver.findElement(By.cssSelector(".a-size-medium.a-color-secondary.header-price")).getText());
	}

}
