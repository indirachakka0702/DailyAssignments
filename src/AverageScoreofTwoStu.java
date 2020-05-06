
public class AverageScoreofTwoStu {

	public static void main(String[] args) 
	{
		/*int  iArray[][] = {{60,55,70},{80,60,41}};
         
		for(int i=0;i<3;i++)
		{
			double sum = iArray[0][i] + iArray[1][i];
			System.out.println("Avarage of "+(i+1)+"paper is: "+sum/2);
		}*/
		
		
		int A[] = {60,55,70};
		int B[] = {80,60,41};
		
		int C[] = new int[3];
		 int count=2;
		for(int i=0;i<3;i++)
		{
			C[i] = A[i]+B[i];
			
			int sum=C[i]/count;
			 
			System.out.print(sum+",");
		}
	}

}
