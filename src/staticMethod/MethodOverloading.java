package staticMethod;

public class MethodOverloading {
	
	public static void add(int i)
	{
		System.out.println(i+3);
	}
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}

	public static void main(String[] args) 
	{
		MethodOverloading.add(10);
		MethodOverloading m1 = new MethodOverloading();
		m1.add(10,20);
	}	

}
//we can overload static and non-static method methods in java 
//if they differ only by type of method 
// in top example one is static method and one is non-static methods
