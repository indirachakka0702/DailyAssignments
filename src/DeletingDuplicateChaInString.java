import java.util.Scanner;

public class DeletingDuplicateChaInString {

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String: ");
	    String str = sc.nextLine();
	    char[] cstr = str.toCharArray();
	    
	    for(int i=0;i<cstr.length;i++)
	    {
	    	for(int j=i+1;j<cstr.length;j++)
	    	{
	    		if(cstr[i]==cstr[j])
	    		{
	    			//str = str.replace(Character.toString(cstr[i]), "" );
	    			cstr[j]=0;
                }
	    		
	    	}
	    	
	    }
	    System.out.println("after deleting duplicate character: ");
	    for(int i=0;i<cstr.length;i++)
	    {
	    	if(cstr[i]!=0)
	    	{
	    		System.out.print(cstr[i]);
	    	}
	    }
            
            sc.close();
	}

}
