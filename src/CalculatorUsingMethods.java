import java.util.Scanner;

public class CalculatorUsingMethods {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b= sc.nextInt();
		System.out.println("Enter the number for operation(1-Addition, 2-Subtraction, 3-Multiplication, 4-Division: ");
		int ConditionType= sc.nextInt();
		sc.close();
		switch(ConditionType)
		{
		case 1:  System.out.println("Addition of two given numbers is: "+ add(a,b));
		 break;
		case 2:  System.out.println("Subtraction of two given numbers is: "+ sub(a,b));
		 break;
		case 3:  System.out.println("Multiplication of two given numbers is: "+ mul(a,b));
		 break;
		case 4:  System.out.println("Division of two given numbers is: "+ divi(a,b));
		 break;
		 default: System.out.println("sorry!! Given ConditionType is invalid");
		}

	}

   static int  add(int num1,int num2)
  {
	  return num1+num2;
  }
   static int sub(int num1, int num2)
   {
	   return num1-num2;
   }
   static int mul(int num1, int num2)
   {
	   return num1*num2;
   }
   static int divi(int num1, int num2)
   {
	   return num1/num2;
   }
   }