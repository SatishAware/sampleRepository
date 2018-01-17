package google.automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestOne {
	
	
	public static void main(String[] args)
	{
	
		MyTestOne obj = new MyTestOne();
		
		obj.openBroswer();
		
		
	}
	
	

	public void openBroswer()
	{
	
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\drivers\\chromedriver.exe");


	  WebDriver driver = new ChromeDriver();

	  driver.get("http://www.facebook.com");

	  System.out.println("Application title is ============="+driver.getTitle());

	  driver.close(); //This will close only current window of the browser.
	  driver.quit();  // This will close all the instance/windows of browser.
	}

}


