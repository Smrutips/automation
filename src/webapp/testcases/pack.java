package webapp.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import webapp.pages.pack_model;

public class pack {
	@Test
	public void verifypack() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
  		WebDriver driver=new ChromeDriver(options);
  		driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/mobile-car-wash-bangalore");
  		Thread.sleep(1000);
  		driver.findElement(By.id("header_loc_btn")).click();
  		Thread.sleep(500);
  		WebElement loc = driver.findElement(By.xpath("//*[@id=\"dialogContent_7\"]/div/div[4]/input"));
  		loc.click();
  		Thread.sleep(500);
  		loc.sendKeys("Rajajinagar");
  		Thread.sleep(500);
  		loc.sendKeys(Keys.DOWN);
  		loc.sendKeys(Keys.RETURN);
  		pack_model pack=new pack_model(driver);
  		pack.carwash_btn();
  		pack.booknw_btn();
  		Thread.sleep(500);
  		pack.hatchback_btn();
  		pack.day_btn();
  		pack.proceed_btn();
 }

}
