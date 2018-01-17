package google.automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeDemo {

	

public static void main(String args[])
{

  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");


  WebDriver driver = new ChromeDriver();

  driver.get("http://www.facebook.com");

  System.out.println("Application title is ============="+driver.getTitle());

  driver.quit();
}
}