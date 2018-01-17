package google.automationTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Order {
	
	@Test
	public void testngMeth1()
	{
		System.out.println("Test Method 1");
	}
	
	
	@Test
	public void testngMeth2()
	{
		System.out.println("Test Method 2");
	}

	@BeforeClass
	public void beforeClasss()
	{
		System.out.println("before Class");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test......");
	}
	
	@BeforeMethod
	public void beforeMeth()
	{
		System.out.println("before Methods");
	}
	
}
