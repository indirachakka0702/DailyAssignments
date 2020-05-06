package tryCatch;

public class AssiTryCatch {

	public static void main(String[] args) 
	{
		String[] iArr = {"priya","Rina","Gowri","Gopal","Teena"};
		String s =null;
		try
		{
			//System.out.println(iArr[6]);
			System.out.println(s.charAt(0));
	     }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array length: "+iArr.length);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exceptioncalling: ");
		}
		catch(Exception a)
		{
			System.out.println("Good Day");
		}
		finally
		{
			System.out.println("Last line of the code");
		}
		
	}

}
