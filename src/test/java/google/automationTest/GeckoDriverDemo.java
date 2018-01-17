package google.automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoDriverDemo {
	
	public static void main(String args[])
	{

	    System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Drivers\\geckodriver.exe");

	  WebDriver driver = new FirefoxDriver();

	  driver.get("http://www.facebook.com");

	  System.out.println("Application title is ============="+driver.getTitle());

	 
	  driver.quit();
	}


}
