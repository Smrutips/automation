package webapp.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import webapp.pages.quick_model;

public class quick {
	@Test
	public void verifyquick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
  		WebDriver driver=new ChromeDriver(options);
		driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/carpenter-services-bangalore");
		driver.findElement(By.id("header_loc_btn")).click();
		Thread.sleep(500);
		 WebElement loc = driver.findElement(By.xpath("//*[@id=\"dialogContent_9\"]/div/div[4]/input"));
		 loc.click();
		 loc.sendKeys("Rajajinagar");
		 Thread.sleep(500);
		 loc.sendKeys(Keys.DOWN);
		 loc.sendKeys(Keys.RETURN);
		 quick_model quick=new quick_model(driver);
		 Thread.sleep(1000);
		 quick.booknow_btn();
		 Thread.sleep(1000);
		 quick.date_btn();
		 Thread.sleep(500);
		 quick.proceed_btn();
		 
		
		
		
		
	}

}
