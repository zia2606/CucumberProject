package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManger {
	
	public LandingPage landingPage;
	public OffersPage offersPage;
	public Checkout checkoutPage;
	public WebDriver driver;
	
	public PageObjectManger(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
		
	}

	
	public OffersPage getoffersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
		
	}
	
	public Checkout getCheckOutPage() {
		checkoutPage = new Checkout(driver);
		return checkoutPage;
		
	}

}
