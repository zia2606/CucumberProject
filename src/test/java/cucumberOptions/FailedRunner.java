package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/Failed.txt",
glue="stepDefinitions",monochrome=true, tags="@Placeorder or @OffersPage",
plugin={"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})
public class FailedRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
		public Object[][] scenarios(){
			return super.scenarios();
		}
	
	
}
