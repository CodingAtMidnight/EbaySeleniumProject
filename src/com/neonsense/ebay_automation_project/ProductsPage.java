package com.neonsense.ebay_automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends EbayBaseClass {
  
	private static WebDriver driver;
	
	public void ebayAllListings(String search) {
		setUp();
		searchEbay(search);
        driver.findElement(By.xpath("//*[@id=\"s0-14-11-5-3[0]\"]/div[2]/div[1]/div/ul/li[1]/span")).click();
	}
	
	public void ebayAcceptOffers(String search) {
		setUp();
		searchEbay(search);
        driver.findElement(By.xpath("//*[@id=\"s0-14-11-5-3[0]\"]/div[2]/div[1]/div/ul/li[2]/span")).click();
	}
	
	public void ebayAuction(String search) {
		setUp();
		searchEbay(search);
        driver.findElement(By.xpath("//*[@id=\"s0-14-11-5-3[0]\"]/div[2]/div[1]/div/ul/li[3]/span")).click();
	}
	
	public void ebayBuyItNow(String search) {
		setUp();
		searchEbay(search);
        driver.findElement(By.xpath("//*[@id=\"s0-14-11-5-3[0]\"]/div[2]/div[1]/div/ul/li[4]/span")).click();
	}
	
	// Price, Type functionality
	// Check product price, check product description, etc
	// Buy it now functionality
	
}
