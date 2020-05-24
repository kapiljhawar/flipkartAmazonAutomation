package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AmazonSearchPage;
import com.qa.pages.FlipkartHomePage;

public class AmazonSearchPageTest extends TestBase {
	AmazonSearchPage amazonSearchPage;
	FlipkartHomePage flipkartHomePage;
	TestBase tb;
	int price;

	public AmazonSearchPageTest() {
		super();
	}

	@BeforeSuite
	public void setup() {
		amazonSearchPage = new AmazonSearchPage();
		tb = new TestBase();
	}

	@Test(priority = 1)
	public void amazonPhoneSearch() throws InterruptedException {
		String phone = amazonSearchPage.verifyCorrectSearch(prop.getProperty("mobileSearchItem"));
		Assert.assertEquals("Apple iPhone XR (64GB) - Blue", phone);
	}

	@Test(priority = 2)
	public void getPrice() {
		String aPrice = amazonSearchPage.getPrice();
		aPrice = aPrice.replace("₹", "");
		aPrice = aPrice.replace(",", "");
		price = Integer.parseInt(aPrice);
		System.out.println("Amazon Price: " + price);
//		driver.close();
	}
	public int pricevalue() {
		return price;
	}
}