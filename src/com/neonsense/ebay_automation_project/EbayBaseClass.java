package com.neonsense.ebay_automation_project;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayBaseClass {
	
	private static WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0nort\\Desktop\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
	}
	
	// Register Method
	public void userRegister(String firstName, String lastName, String userEmail, String userPassword) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/span/a")).click();
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		driver.findElement(By.id("lastname")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(userEmail);
		driver.findElement(By.id("password")).sendKeys(userPassword);
		driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	// Sign-In Method
	public void userSignIn(String userNameOrEmail, String userPassword) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/a")).click();
		driver.findElement(By.id("userid")).sendKeys(userNameOrEmail);
		driver.findElement(By.id("signin-continue-btn")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/form[1]/div[2]/div/div/div/input")).sendKeys(userPassword);
		driver.findElement(By.id("sgnBt")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	// Daily Deals
	public void dailyDeals() throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[2]/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Brand Outlet
	public void brandOutlet() throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//*[@id=\"gh-p-4\"]/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Help & Contact
	public void helpAndContact() throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Sell
	public void ebaySell() throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//*[@id=\"gh-p-2\"]/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Watchlist
	public void ebayWatchlist() throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//*[@id=\"gh-wl-click\"]/div/a[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// My Ebay
	public void myEbay() throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Notification Cart
	public void ebayNotificationCart() throws InterruptedException {
		setUp();
		driver.findElement(By.id("gh-Alerts-i")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// About Ebay :: Footer methods
	public void aboutEbay() throws InterruptedException {
		setUp();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[1]/h3/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Community
	public void ebayCommunity() throws InterruptedException {
		setUp();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[5]/h3/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	public void searchEbay(String searchEbay) {
		setUp();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(searchEbay);
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
	}
	
	
	
	
	
	
	
	
}
