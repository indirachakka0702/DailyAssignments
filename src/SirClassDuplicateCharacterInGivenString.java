
public class SirClassDuplicateCharacterInGivenString {

	public static void main(String[] args) 
	{
	    String sInputDuplicateString = "abc abc abcf";
	    char[] cDupeString = sInputDuplicateString.toCharArray();
	    for(int firstloop=0;firstloop<cDupeString.length;firstloop++)
	    {
    		int dupcount = 1;
    		boolean bDupvaluefound = false;
    		if(cDupeString[firstloop]!=0)
    		{		
	    	for(int secloop=firstloop+1;secloop<cDupeString.length;secloop++)
	    	{
	    		if(cDupeString[firstloop] == cDupeString[secloop])
	    		{
	    			cDupeString[secloop] = 0;
	    			bDupvaluefound = true;
	    			dupcount++;
	    		}
	    	}
    		}
	    
	    	if(bDupvaluefound)
	    		  System.out.println("Duplicate count of character :: "+ cDupeString[firstloop]+" == "+ dupcount);
	  	   
	    }
	    

	}

}
