package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	public TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testbase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testContextSetup.testbase.WebDriverManager();
		if(scenario.isFailed()){
			//System.out.println("Screenshot inprogress");
			
			File imgfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent= FileUtils.readFileToByteArray(imgfile);
			scenario.attach(filecontent, "image/png", "image");
			//System.out.println("Screenshot completed");
		}
	}

}
