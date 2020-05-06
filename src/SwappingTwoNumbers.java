import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a= sc.nextInt();
		System.out.println("Enter the second number: ");
		int b= sc.nextInt();
		sc.close();
		int temp;
		temp=a;
		 a=b;
		 b=temp;
		 System.out.println("Value of First number a: "+ a);
		 System.out.println("Value of second number b: "+b);

	}

}
