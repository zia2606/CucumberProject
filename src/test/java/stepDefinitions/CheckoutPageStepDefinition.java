package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Checkout;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	public Checkout checkoutPage;
	public TestContextSetup testContextSetup;

	public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManger.getCheckOutPage();
	}
	
	@Then("verify user has ability to enter promo code and place order")
	public void verify_user_has_ability_to_enter_promo() {
		
		Assert.assertTrue(checkoutPage.verifyApply());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
	}
	
	@Then("^user proceeds to Checkout Page and validate the (.+) items in checkout Page$")
	public void user_proceeds_to_Checkout(String name) {
		checkoutPage.checkOutItem();
		
		
		
	}
	
}
