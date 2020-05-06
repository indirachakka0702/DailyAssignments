import java.util.Scanner;

public class sumOfTenArrayElements {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		  int a[] = new int [10];
		  int sum=0;
		  
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("Enter the element of the Array"+(i+1)+":");
			  a[i]= sc.nextInt();
		  }
		  for(int i=0;i<10;i++)
		  {
		     sum = sum+a[i];
			  
		  }
		  sc.close();
			  
		  System.out.println("Sum of given 10 elements is: "+ sum);
	}

}
