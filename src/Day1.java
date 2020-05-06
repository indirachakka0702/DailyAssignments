import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) 
	{
	  	Scanner sc= new Scanner(System.in);
	  	System.out.println("Enter the first input: ");
	  	int a= sc.nextInt();
	  	System.out.println("Enter the second input: ");
	  	int b= sc.nextInt();
	  	System.out.println("Enter the conditionType(for Addition press '1', Subtraction press '2', Multiplication press '3', Division press '4':   ");
	      int ConditionType = sc.nextInt();
	      sc.close();
	  	switch(ConditionType)
	  	{
	  	   case 1: System.out.println("Addition of given two number is: "+ (a+b));
	  	    break;
	  	   case 2: System.out.println("Subtraction of given two numbers is: "+ (a-b));
	  	    break;
	  	   case 3: System.out.println("Multiplication of two given numbers is: "+ (a*b));
	  	    break;
	  	   case 4: System.out.println("Division of two given numbers is: "+ (a/b));
	  	    break;
	  	   default: System.out.println("Sorry!! given number is Invalid");
	  	    break;
	  	}

	}

}
