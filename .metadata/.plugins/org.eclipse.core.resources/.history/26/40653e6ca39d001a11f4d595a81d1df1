package com.qa.testCases;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartSearchPage;

public class FlipkartHomePageTest extends TestBase {

	FlipkartHomePage flipkartHomePage;
	FlipkartSearchPage flipkartSearchPage;

	public FlipkartHomePageTest() {
		super();
	}

	@Test(priority = 1)
	public void setup() {
		initialization(prop.getProperty("flipkartUrl"));
		flipkartHomePage = new FlipkartHomePage();
		flipkartSearchPage = new FlipkartSearchPage();
	}

	@Test(priority = 2)
	public void mobileSearchItemTest() throws InterruptedException {
		flipkartHomePage.mobileSearchItem(prop.getProperty("mobileSearchItem"));
	}

	@Test(priority = 3)
	public void searchClickTest() throws InterruptedException {
		Thread.sleep(2000);
		flipkartSearchPage = flipkartHomePage.searchClick();
	}
}