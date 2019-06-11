package webapp.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import webapp.pages.Contact_model;

public class Contact {
	@Test
	public void verifycontact() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
  		WebDriver driver=new ChromeDriver(options);
		driver.get("http://v2.20160301.testing.bro4u.com/v2/bro4u-webapp-v2/tattoo-artists-bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header_loc_btn\"]/label")).click();
		Thread.sleep(500);
		 WebElement loc = driver.findElement(By.xpath("//*[@id=\"dialogContent_5\"]/div/div[4]/input"));
		 loc.click();
		 Thread.sleep(500);
		 loc.sendKeys("Rajajinagar");
		 Thread.sleep(500);
		 loc.sendKeys(Keys.DOWN);
		 loc.sendKeys(Keys.RETURN);	
		 
		 Thread.sleep(1000);
		 Contact_model contact=new Contact_model(driver);
		 contact.new_tattoobtn();
		 Thread.sleep(1000);
		 contact.viewexprt_btn();
		 contact.date_btn();
		 contact.chooseexprt_btn();
		 contact.get_cntct();
		 
	}

}