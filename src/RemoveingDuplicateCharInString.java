import java.util.Scanner;

public class RemoveingDuplicateCharInString {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String: ");
	   String input = sc.nextLine();
	       char[] ch = input.toLowerCase().toCharArray();
	    for(int i=0;i<ch.length;i++)
	   {
		   for(int j=i+1;j<ch.length;j++)
		   {
			   if(ch[i]==ch[j])
			   {
				   ch[j] = 0;
			   }
		   }
		  
	   }
	    System.out.println("After removing duplicate character: ");
	     for(int i=0;i<ch.length;i++)
	     {
	    	 if(ch[i]!=0)
	    	 {
	    		 System.out.print(ch[i]);
	    	 }
	     }
	     sc.close();
	}

}
