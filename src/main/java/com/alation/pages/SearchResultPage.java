package com.alation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.alation.bean.Bean;
import com.alation.driver.DriverFactory;

import junit.framework.Assert;

public class SearchResultPage extends DriverFactory {

	Bean bean = new Bean();
	private List<WebElement> wholeAmount;
	private List<WebElement> fractionalAmount;

	public void verifyProductDispalyPageOpened() {
		Assert.assertTrue("The search result page was not displayed.",
				driver.findElement(By.cssSelector("div.a-row.a-spacing-none")).isDisplayed());
	}

	public String firstBook() {
		WebElement firstBookElement = driver.findElement(By.cssSelector("div.a-row.a-spacing-none"));
		String firstBook= firstBookElement.getText();
		firstBookElement.click();
		return firstBook;
	}

	public void getWholeAmount() {
		wholeAmount = driver.findElements(By.cssSelector(".sx-price-whole"));
	}

	public void getFractionalAmount() {
		fractionalAmount = driver.findElements(By.cssSelector(".sx-price-fractional"));
	}

	public String getKindleCost() {
		String kindleWholeAmount = wholeAmount.get(1).getText();
		String kindleFractionalAmont = fractionalAmount.get(1).getText();
		String kidleCost = "$".concat(kindleWholeAmount).concat(".").concat(kindleFractionalAmont);
		return kidleCost;
	}

	public String getPaperBackCostNew() {
		String paperBackNewWholeAmount = wholeAmount.get(0).getText();
		String paperBackNewFractionalAmont = fractionalAmount.get(0).getText();
		String paperBackCostNew = "$".concat(paperBackNewWholeAmount).concat(".").concat(paperBackNewFractionalAmont);
		return paperBackCostNew;
	}

	public String getPaperBackCostOld() {
		WebElement paperBackCostOldElement = driver.findElement(By.cssSelector(".a-size-base.a-color-base"));
		String paperBackCostOld= paperBackCostOldElement.getText();
		return paperBackCostOld;

	}

}
