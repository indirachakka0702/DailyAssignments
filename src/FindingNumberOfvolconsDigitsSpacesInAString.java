import java.util.Scanner;

public class FindingNumberOfvolconsDigitsSpacesInAString {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String: ");
       String sInput = sc.nextLine();
        sInput= sInput.toLowerCase();
       int vowels = 0, consonants = 0, digits = 0, spaces = 0; 
       
       for(int k=0;k<sInput.length();k++)
       {
    	   char ch=sInput.charAt(k);
    	   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
    	   {
    		   ++vowels;
    	   }
    	   else if (ch >= 'a' && ch <= 'z')
    	   {
    		   ++consonants;
    	   }
    	   
    	   else if(ch >= '0' && ch <= '9')
    	   {
    		   ++digits;
    	   }
    	   else if(ch == ' ')
    	   {
    		   ++spaces;
    	   }
    	
       }
       System.out.println("Number of vowels in given string is : "+ vowels);
       System.out.println("Number of consonants in given string is : "+ consonants);
       System.out.println("Number of digits in given string is: "+ digits);
       System.out.println("Number of spaces in given string is: "+ spaces);
        sc.close();

	}

}
