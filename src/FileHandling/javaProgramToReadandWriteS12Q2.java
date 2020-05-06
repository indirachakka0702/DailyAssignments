package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class javaProgramToReadandWriteS12Q2 {

	public static void main(String[] args) 
	{
		String sPath   =System.getProperty("user.dir")+"\\plain.txt";
		String sPathToWrite="C:\\Users\\chapa004\\Documents\\Indu\\Workspaces\\Eclipse\\JavaTraining\\Daily Assignments\\plain.txt" ;
		readTextFile(sPath);
	    //writeTextFile(sPathToWrite);
	}

	private static void writeTextFile(String sPath)
	{
		try {
		FileWriter fw = new FileWriter(sPath,true);
		BufferedWriter br = new BufferedWriter(fw);
		br.newLine();
		br.write("Hi google");
		br.write("\nBrowser");
		br.close();
		}catch(Exception a)
		{
			System.out.println(a);
		}
		System.out.println("Success");
	}
	
	private static void readTextFile(String sPath)
	{
		
	       String sLine;
       try
       {
    	   FileReader fr = new FileReader(sPath);
    	   BufferedReader br = new BufferedReader(fr);
    	   // sLine = br.readLine() ;
    	   while((sLine = br.readLine())!= null)
    	   {
    		   System.out.println(sLine);
    		   if(sLine.contains("Priya"))
    		   {
    			   System.out.println("I Found");
    		   }
    	   }
       
          br.close();
       }catch(Exception a)
       {
    	   System.out.println(a);
       }
	}  
}
