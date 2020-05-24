package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AmazonHomePage extends TestBase {

	@FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
	WebElement SearchBar;

	@FindBy(xpath = "(//input[@type=\"submit\"])[1]")
	WebElement searchButton;
	
	public AmazonHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public AmazonSearchPage searchBar(String mobileSearchItem) {
		SearchBar.sendKeys(mobileSearchItem);
		searchButton.click();
		return new AmazonSearchPage();
	}
}
