package com.alation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.alation.bean.Bean;
import com.alation.driver.DriverFactory;

public class HomePage extends DriverFactory {

	Bean bean = new Bean();

	public void openUrl() {
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	}

	public void choosingBook() {
		Select sel = new Select(driver.findElement(By.cssSelector(".nav-search-dropdown.searchSelect")));
		sel.selectByVisibleText("Books");
	}

	public void enteringBookName() {
		driver.findElement(By.name("field-keywords")).sendKeys("Data Catalog");
	}
	
	public void clickSearchButton() {
		driver.findElement(By.cssSelector("div.nav-search-submit.nav-sprite")).click();
		
	}

}
