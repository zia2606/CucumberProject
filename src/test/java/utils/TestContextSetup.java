package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManger;

public class TestContextSetup {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public PageObjectManger pageObjectManger;
	public TestBase testbase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		
		testbase = new TestBase();
		pageObjectManger=new PageObjectManger(testbase.WebDriverManager());
		genericUtils=new GenericUtils(testbase.WebDriverManager());
	}

}
