import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the ending number: ");
		int X=sc.nextInt();
		sc.close();
		int k,a=1,b=1;
		System.out.print("1,");
		for(k=1;k<=X;)
		{
			
			System.out.print(k+",");
			k=a+b;
			a=b;
			b=k;
		}
		
		
	}

}
