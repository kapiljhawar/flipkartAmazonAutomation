package com.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.FlipkartSearchPage;
import com.qa.util.TestUtil;

public class FlipkartSearchPageTest extends TestBase {

	FlipkartSearchPage flipkartSearchPage;
	TestBase tb;
	TestUtil testUtil;
	WebDriver switchTab;

	int fprice;

	public FlipkartSearchPageTest() {
		super();
	}

	@BeforeSuite
	public void setup() {
		flipkartSearchPage = new FlipkartSearchPage();
		tb = new TestBase();
		testUtil = new TestUtil();
	}

	@Test(priority = 1)
	public void phoneSearchTest() throws InterruptedException {
		String flipkartPhoneName = flipkartSearchPage.verifyCorrectSearch();
		Assert.assertEquals("Apple iPhone XR (Blue, 64 GB)", flipkartPhoneName);
	}

	@Test(priority = 2)
	public void getPrice() throws InterruptedException {
		String flipkartPrice1 = flipkartSearchPage.getPrice();
		flipkartPrice1 = flipkartPrice1.replace("₹", "");
		flipkartPrice1 = flipkartPrice1.replace(",", "");
		fprice = Integer.parseInt(flipkartPrice1);
	}

	@Test(priority = 3)
	public void comparePrice() {
		System.out.println("Flipkart Price: " + fprice);
		AmazonSearchPageTest amazon = new AmazonSearchPageTest();
		int amazonPrice = amazon.price;
		System.out.println("Amazon Price: " + amazonPrice);

		if (amazonPrice == fprice) {
			System.out.println("Amazon Price and Flipkart Prcie are equal which is: " + amazonPrice);
		}

		if (fprice > amazonPrice) {
			System.out.println("Price of Amazon is less: " + amazonPrice);
		}

		if (amazonPrice > fprice) {
			System.out.println("Price of Flipkart is less: " + fprice);
		}
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}