package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class FlipkartHomePage extends TestBase {
	
	@FindBy(xpath = "//button[contains(text(),\"✕\")]")
	WebElement closeLogin;

	@FindBy(xpath = "//input[@class=\"LM6RPg\"]")
	WebElement searchBar1;

	@FindBy(xpath = "//button[@class=\"vh79eN\"]")
	WebElement searchClick;

	public FlipkartHomePage() {
		PageFactory.initElements(driver, this);
	}

	public void mobileSearchItem(String mobileSearchItem) {
		closeLogin.click();
		searchBar1.sendKeys(mobileSearchItem);
	}

	public FlipkartSearchPage searchClick() {
		searchClick.click();
		return new FlipkartSearchPage();
	}

}
