package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class FlipkartSearchPage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),\"Apple iPhone XR (White, 64 GB)\")]/../../div[2]/div/div/div")
	WebElement price;

	public FlipkartSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyCorrectSearch() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(By.xpath("//div[contains(text(), \"Apple iPhone XR (Blue, 64 GB)\")]")).getText();
	}

	public String getPrice() throws InterruptedException {
		String fp = driver.findElement(By.xpath("//div[contains(text(),\"Apple iPhone XR (Blue, 64 GB)\")]/../../div[2]/div/div/div")).getText();
		return fp;
	}
}