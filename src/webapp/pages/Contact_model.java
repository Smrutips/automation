package webapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact_model {
	WebDriver driver;
	By new_tattoobtn=By.xpath("/html/body/ui-view/ui-view/intermediate-screen/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/img");
	By viewexprt_btn=By.xpath("/html/body/ui-view/ui-view/intermediate-screen/div[1]/div[2]/div/div[2]/div[4]/div/div/div/div/button");
	By date_btn=By.xpath("/html/body/ui-view/requirement-screen/div[2]/div/div/div[1]/md-card/div[2]/div/button[1]");
	By chooseexprt_btn=By.xpath("/html/body/ui-view/requirement-screen/div[2]/div/div/div[2]/div[2]/button");
	By get_cntct=By.xpath("/html/body/ui-view/vendor-list-screen/div[1]/div/div/div[2]/md-card[1]/div/div[2]/div[2]/div[2]/md-card-actions/button[2]");
	
	public Contact_model(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		this.driver=driver;
	}
	public void new_tattoobtn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(new_tattoobtn).click();
	}
	public void viewexprt_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(viewexprt_btn).click();
	}
	public void date_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(date_btn).click();
	}
	public void chooseexprt_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(chooseexprt_btn).click();
	}
	public void get_cntct() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(get_cntct).click();
	}
	

}

