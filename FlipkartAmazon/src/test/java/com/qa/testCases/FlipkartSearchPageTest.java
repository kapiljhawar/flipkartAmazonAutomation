package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.FlipkartSearchPage;

public class FlipkartSearchPageTest extends TestBase {

	FlipkartSearchPage flipkartSearchPage;
	TestBase tb;

	public FlipkartSearchPageTest() {
		super();
	}

	@BeforeSuite
	public void setup() {
		flipkartSearchPage = new FlipkartSearchPage();
		tb = new TestBase();
	}

	@Test(priority = 1)
	public void phoneSearchTest() throws InterruptedException {
		String flipkartPhoneName = flipkartSearchPage.verifyCorrectSearch();
		Assert.assertEquals("Apple iPhone XR (White, 64 GB)", flipkartPhoneName);
	}

	@Test(priority = 2)
	public void phonePrice() throws InterruptedException {
		String flipkartPrice1 = flipkartSearchPage.getPrice();

		flipkartPrice = flipkartPrice1;
		System.out.println("Flipkart Price: " + flipkartPrice);
	}

	@AfterSuite
	public void closeBrowser() {
		tb.quitBrowser();
	}
}
