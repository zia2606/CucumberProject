package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		// TODO Auto-generated method stub
		
		
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//config.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String url=prop.getProperty("QAUrl");
			System.out.println("URL-"+url);
		
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				System.out.println("Driver Setup completed");
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		
		}
		return driver;
		
	}

}
