package com.qa.testCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AmazonHomePage;
import com.qa.pages.AmazonSearchPage;

public class AmazonHomePageTest extends TestBase{
	
	AmazonHomePage amazonHomePage;
	AmazonSearchPage amazonSearchPage;
	
	public AmazonHomePageTest() {
		super();
	}
	
	@BeforeSuite
	public void setup() {
		initialization(prop.getProperty("amazonUrl"));
		amazonHomePage = new AmazonHomePage();
	}
	
	@Test(priority = 1)
	public void mobileSearchItemTest() {
		amazonHomePage.searchBar(prop.getProperty("mobileSearchItem"));
	}

}
