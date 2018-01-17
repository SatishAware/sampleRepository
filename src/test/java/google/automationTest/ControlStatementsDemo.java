package google.automationTest;

public class ControlStatementsDemo {

	public static void main(String[] args) {

		int number=13;  
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  

    String str1 ="satish";
    String str2 ="SATISH";
    if(str1.equalsIgnoreCase(str2))
    {
    	System.out.println("True: Both Strings are same.");
    }
    else {
    	System.out.println("Both Strings are not same.");
    }
    
    
    
    System.out.println("Switch... Statement:");
    int num=10;      
    switch(num){   
    
    case 10: System.out.println("TEN"); break;
    case 40: System.out.println("FOURTY"); break;
    case 20: System.out.println("TWENTY");break;  
    case 30: System.out.println("THIRTY");break;  
    default:System.out.println("Not in 10, 20 or 30"); 
    
    }  
    System.out.println("After Switch...");
    

	}

	
	
	
}
