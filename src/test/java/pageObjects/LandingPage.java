package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	
	By search=By.xpath("//input[@type='search']");
	By productName=By.xpath("//h4[@class='product-name']");
	By topDeals=By.xpath("//a[@href='#/offers']");
	By increment=By.xpath("//a[@class='increment']");
	By addcart=By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	
	public void searchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
		
	}
	
	public void getsearchItem() {
		
		driver.findElement(search).getText();
		
	}
	
	public void addQuantity(int Quantity) {
		
		int i=Quantity-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
		
	}
	public void addTocart()
	{
		driver.findElement(addcart).click();
	}
	
	
	public String getProductName() {
		
		return driver.findElement(productName).getText();
		
	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(topDeals).click();
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
		
	}
	
}
