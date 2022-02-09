package com.neonsense.ebay_automation_project;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
private static WebDriver driver;
	
	private void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0nort\\Desktop\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
	public void ebayHome() throws InterruptedException {
		setUp();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	public void ebaySaved() throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	// Motors
	public void ebayMotors() throws InterruptedException {
       setUp();
       driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).click();
       Thread.sleep(3000);
	   driver.quit();
       
	}
	
	public void hoverEbayMotors() throws InterruptedException {
		setUp();
		WebElement motorsDropdown = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(motorsDropdown).perform();
		Thread.sleep(3000);
		driver.quit();
	}
	

	
	// Fashion
	 public void ebayFashion() throws InterruptedException {
		 setUp();
	     driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")).click();
	     Thread.sleep(3000);
		 driver.quit();
	 }
	
	 public void hoverEbayFashion() throws InterruptedException {
		    setUp();
			WebElement fashionDropdown = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(fashionDropdown).perform();
			Thread.sleep(3000);
			driver.quit();
	 }
	 
	 // Electronics
	 public void ebayElectronics() throws InterruptedException {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")).click();
		 Thread.sleep(3000);
		 driver.quit();
	 }

	 public void hoverEbayElectronics() throws InterruptedException {
		    setUp();
			WebElement electronicsDropdown = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(electronicsDropdown).perform();
			Thread.sleep(3000);
			driver.quit();
	 }
	 
		
	 
	 // Collectible and Art
	 public void ebayCollectiblesAndArt() throws InterruptedException {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")).click();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 public void hoverEbayCollectiblesAndArt() throws InterruptedException {
		    setUp();
			WebElement collectiblesAndArtDropdown = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(collectiblesAndArtDropdown).perform();
			Thread.sleep(3000);
			driver.quit();
	 }
	 
	 // Home and Garden
	 public void ebayHomeAndGarden() throws InterruptedException {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a")).click();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 public void hoverEbayHomeAndGarden() throws InterruptedException {
		 setUp();
		 WebElement homeAndGarden = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
		 Actions action = new Actions(driver);
		 action.moveToElement(homeAndGarden).perform();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 // Sporting Goods
	 public void ebaySportingGoods() throws InterruptedException {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a")).click();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 public void hoverEbaySportingGoods() throws InterruptedException {
		 setUp();
		 WebElement sportingGoods = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a"));
		 Actions action = new Actions(driver);
		 action.moveToElement(sportingGoods).perform();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 // Toys
	 public void ebayToys() throws InterruptedException {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")).click();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 public void hoverEbayToys() throws InterruptedException {
		 setUp();
		 WebElement Toys = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
		 Actions action = new Actions(driver);
		 action.moveToElement(Toys).perform();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	// Business and Industrial
	 public void ebayBusinessAndIndustrial() throws InterruptedException {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a")).click();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 public void hoverEbayBusinessAndIndustrial() throws InterruptedException {
		 setUp();
		 WebElement businessAndIndustrial = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"));
		 Actions action = new Actions(driver);
		 action.moveToElement(businessAndIndustrial).perform();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 // Music
	 public void ebayMusic() throws InterruptedException {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a")).click();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 public void hoverEbayMusic() throws InterruptedException {
		 setUp();
		 WebElement ebayMusic = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a"));
		 Actions action = new Actions(driver);
		 action.moveToElement(ebayMusic).perform();
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	 
	 // Today's Deals functionality
	 public void ebayTodayDeals() throws InterruptedException {
			setUp();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			driver.findElement(By.xpath("//*[@id=\"items_list1\"]/div[1]/div/div[2]/a")).click();
			Thread.sleep(3000);
			driver.quit();
		 
	 }
	 
	 // Search Functionality
	 public void searchEbay(String search) {
		 setUp();
		 driver.findElement(By.id("gh-ac")).sendKeys(search);
		 driver.findElement(By.id("gh-btn")).click();
	 }
	 
	 
	 // TODO Search by Category
	
	 
	 // Advanced Search
	 public void ebayAdvancedSearch() {
		 setUp();
		 driver.findElement(By.xpath("//*[@id=\"gh-as-a\"]")).click();
	 }
}
