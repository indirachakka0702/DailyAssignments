import java.util.Arrays;

public class CheckTwoStringsAreAnagramsOfEachOther {

	public static void main(String[] args) 
	{
		String str1 = "abcabcabcd";
		String str2 = "abcabcabcd";
		
		char[] cstr1=str1.toLowerCase().toCharArray();
		char[] cstr2= str2.toLowerCase().toCharArray();
		boolean status = false;
		if(str1.length()!=str2.length())
		{
			System.out.println("Both strings are not Anagrams: ");
	    }
		else
		{
			Arrays.sort(cstr1);
			Arrays.sort(cstr2);
			status = Arrays.equals(cstr1, cstr2);
		}
		if(status)
		{
			System.out.println("Both strings are Anagrams");
		}
		else
		{
			System.out.println("Both strings are not Anagrams");
		}

    }
}
