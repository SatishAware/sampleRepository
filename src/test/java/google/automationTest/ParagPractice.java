package google.automationTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParagPractice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.makemytrip.com/");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String handle = driver.getWindowHandle();
		System.out.println("Home : "+handle);
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("The title of the page is: " +driver.getTitle());
		
		//Flipcart X button not found
		WebElement xButton = driver.findElement(By.xpath("//*[@class='_3Njdz7']/button[1]"));
		
		/*xButton.click();*/
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", xButton);
		
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("All "+handles);
		Thread.sleep(10000);
		System.out.println("Login alert handled");
				
		driver.close();

	}

}
