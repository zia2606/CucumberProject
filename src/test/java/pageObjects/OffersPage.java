package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	
	private By search=By.xpath("//input[@id='search-field']");
	private By productName=By.xpath("//tr/td[1]");
	
	public void searchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
		
	}
	
	public void getsearchItem() {
		
		driver.findElement(search).getText();
		
	}
	
	public String getProductName() {
		
		return driver.findElement(productName).getText();
		
	}
}
