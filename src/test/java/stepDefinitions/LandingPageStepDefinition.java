package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	
	public TestContextSetup testContextSetup;
	public LandingPage landingPage;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.landingPage= testContextSetup.pageObjectManger.getLandingPage();
	}
	
	@Given("User is on Mart Landing Page")
	public void user_is_on_mart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertTrue(landingPage.getPageTitle().contains("GreenKart"));
		
	}
	@When("^user searched with (.+) in Landing page and extracted actual name of product$")
	public void user_searched_with_in_landing_page_and_extracted_actual_name_of_product(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		landingPage.searchItem(string);
		Thread.sleep(2000);
		testContextSetup.landingPageProductName=landingPage.getProductName().split("-")[0].trim();
		System.out.println("Landing page product name - "+testContextSetup.landingPageProductName);
	}
	
	@When("Added {string} items of the selected product in cart")
	public void Add_Items(String Quantity) {
		landingPage.addQuantity(Integer.parseInt(Quantity));
		landingPage.addTocart();
	}
	
}
