
public class AverageScoreofTwoStudInThreePapers {

	public static void main(String[] args)
	{
         int iArr[][] = {{60,55,70},{80,60,41}};
         for(int i=0;i<2;i++)
         {
              double sum=0; int count=0;
        	 for(int j=0;j<3;j++)
        	 {
        		 sum= sum+iArr[i][j];
        		 count++;
        	 }
        	 
        	 System.out.printf("Average marks of student " +(i+1)+" in three papers:  %.2f",sum/count);
        	 System.out.println();
         }


	}

}
