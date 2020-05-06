
public class FindingOddNumbersGivenArray {

	
	public static void main(String[] args)
	{
	  int iArray[] = {3,8,6,14,5,17,19};
	  
	  for(int i=0;i<7;i++)
	  {
		 int k= iArray[i];
		 if (k%2 != 0)
		 {
			 System.out.println("Odd Numbers of given Array is: "+iArray[i]);
		 }
		 
	  }

	}
	
	
}
