package google.automationTest;

public class StaticDemo {
	
	
	public static void main(String args[])
	{
		SampleClass.myMethod();
		
		SampleClass abc = new SampleClass();
		System.out.println("Season = "+abc.getSeason());
		System.out.println(" Value of i ="+abc.i);
	}
	
	
	


}
