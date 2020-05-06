
public class CheckingAWordInGivenString {

	public static void main(String[] args) 
	{

		String sInput = "this is me doing qa automation testing";
	//	System.out.println("Yes given string has qa word: " +sInput.contains("qa"));
		String[] sArrInput= sInput.split(" ");
		
				for(int i=0;i<sArrInput.length;i++)
		{
			 if(sArrInput[i].matches("qa"))
			 {
				 System.out.println("Yes the word qa present in given string");
			 }
			
		}
	
	}
}

