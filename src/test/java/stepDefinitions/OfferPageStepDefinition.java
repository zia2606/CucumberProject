package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	public TestContextSetup testContextSetup;
	public LandingPage landingPage;
	public OffersPage offersPage;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.landingPage= testContextSetup.pageObjectManger.getLandingPage();
		this.offersPage= testContextSetup.pageObjectManger.getoffersPage();
	}
	
	@Then("^user searched with (.+) in offers Page and extracted actual name of product$")
	public void user_searched_with_in_offers_page_and_extracted_actual_name_of_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		switchToOfferPage();
		offersPage.searchItem(string);
		testContextSetup.offerPageProductName=offersPage.getProductName();
	}
	
	public void switchToOfferPage() {
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {
		
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();	
		
	}
	@Then("user verifies Landing Page and offers Page product name value")
	public void user_verifies_landing_page_and_offers_page_product_name_value() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(testContextSetup.landingPageProductName, testContextSetup.offerPageProductName);
		System.out.println("Landing Page and offers Page product name value matches.");
	}
	
}
