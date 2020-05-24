package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AmazonSearchPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),\"Apple iPhone XR (64GB) - Blue\")]/../../../../../../../div[2]/div/div/div/div/div/a/span/span/span[2]")
	WebElement price;

	public AmazonSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyCorrectSearch(String searchName) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(By.xpath("(//span[contains(text(),\"Apple iPhone XR (64GB) - Blue\")])[1]")).getText();
	}

	public String getPrice() {
		String amazonPrice = price.getText();
		return amazonPrice;
	}
}