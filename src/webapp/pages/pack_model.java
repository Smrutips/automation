package webapp.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pack_model {
WebDriver driver;
	
	By carwash_btn=By.xpath("/html/body/ui-view/ui-view/intermediate-screen/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/img ");
	By booknw_btn=By.xpath("/html/body/ui-view/ui-view/intermediate-screen/div[1]/div[2]/div/div[2]/div[4]/div/div/div/div/button");
	By hatchback_btn=By.xpath("//*[@id=\"radio_10\"]/div[1]");
	By day_btn=By.xpath("/html/body/ui-view/requirement-screen/div[4]/div/div/div[1]/md-card/div[2]/div/button");
	By proceed_btn=By.xpath("/html/body/ui-view/requirement-screen/div[4]/div/div/div[2]/div[2]/button");
	
	public pack_model(WebDriver driver) {
		this.driver=driver;
	}
	public void carwash_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(carwash_btn).click();
	}
	public void booknw_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(booknw_btn).click();
	}
	public void hatchback_btn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(hatchback_btn).click();
	}
	public void day_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(day_btn).click();
	}
	public void proceed_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(proceed_btn).click();
	}
}