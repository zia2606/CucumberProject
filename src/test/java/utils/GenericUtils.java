package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void SwitchWindowToChild() {
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		String ParentWindow=it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
	}
	
}
