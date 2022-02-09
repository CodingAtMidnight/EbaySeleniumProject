package com.neonsense.ebay_automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSearch {
	
	private static WebDriver driver;
	
	private void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0nort\\Desktop\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		
	}
	
	public void ebayFindItems() throws InterruptedException {
		setUp();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	// Advanced Search : ITEMS
	public void advancedSearchOnEbayMotors() throws InterruptedException {
		setUp();
        driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
		driver.quit();
	}
	
	public void advancedSearchBySeller() throws InterruptedException {
		setUp();
        driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a")).click();
        Thread.sleep(3000);
		driver.quit();
	}
	
	public void advancedSearchByItemNumber() throws InterruptedException {
		setUp();
        driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[4]/a")).click();
        Thread.sleep(3000);
		driver.quit();
	}
	
	
    // Advanced Search : STORES
	public void advancedSearchItemsInStores() throws InterruptedException {
		setUp();
        driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
		driver.quit();
	}
	
	public void advancedSearchFindStores() throws InterruptedException {
		setUp();
        driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
		driver.quit();
	}
	
	

	public void advancedSearchFindItems(String userSearch) throws InterruptedException {
		setUp();
		driver.findElement(By.id("_nkw")).sendKeys(userSearch);
		driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/fieldset[1]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
