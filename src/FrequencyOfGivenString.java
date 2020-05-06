
public class FrequencyOfGivenString 
{
	public static void main(String[] args) 
	{
	    String sInput = "Java is an object oriented programming language";
	    sInput = sInput.toLowerCase();
	    char[] c = sInput.toCharArray();
	    for(int f1=0;f1<c.length;f1++)
	    {
    		int count = 1;
    		boolean bDupfound = false;
    		if(c[f1]!=0)
    		{		
	    	for(int f2=f1+1;f2<c.length;f2++)
	    	{
	    		if(c[f1] == c[f2])
	    		{
                   c[f2] = 0;
	    			bDupfound = true;
	    			count++;
	    		}
	    	}
    		}
	    
	    	if(bDupfound)
	    		  System.out.println("Duplicate count of character :: "+ c[f1]+" == "+count);
	  	   
	    }
	    

	}

}


