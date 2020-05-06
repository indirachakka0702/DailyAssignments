package staticMethod;

public class MethodOverride {
	public static void main(String[] args)
	{
		// display();
	}
    
}

//we can't override static methods in java 
// because, if parent is static and child class also static then 
// child class override the parent class and parent class not exist
// so no need object creation we can't call parent method
// compiler won't allow you to call