package staticMethod;

public class Student {

  Student()
  {
   System.out.println("unknown"); 
  }
  Student (String s)
  {
	  System.out.println(s);
  }
  public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student("Google");
	}
}
