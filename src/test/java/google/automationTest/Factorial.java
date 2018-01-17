package google.automationTest;

public class Factorial {

	public static void main(String[] args) {
		 int factorial = 1;
	        int number = 6;

	        for(int i = 1; i <= number; i++)
	        {
	            factorial = factorial*i;
	        }

	        System.out.println("Factorial of number " + number + " is " + factorial);

	}

}
