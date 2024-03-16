package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	public WebDriver driver;
	
	public Checkout(WebDriver driver) {
		
		this.driver=driver;
		
	}

	
	By bag=By.xpath("//img[@alt='Cart']");
	By proceed=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By apply=By.xpath("//button[contains(text(),'Apply')]");
	By place=By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkOutItem() {
		
		driver.findElement(bag).click();
		driver.findElement(proceed).click();
		
	}
	
	
	public boolean verifyApply() {
		
		return driver.findElement(apply).isDisplayed();
		
	}
	
	public boolean verifyPlaceOrder() {
		
		return driver.findElement(place).isDisplayed();
		
	}
	
	
}
