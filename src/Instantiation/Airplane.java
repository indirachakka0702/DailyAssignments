package Instantiation;

public class Airplane {

	public static void main(String[] args)
	{
		Boeing B = new Boeing();
		B.takeOff();
		B.takeDown();
		Airbus A = new Airbus();
		A.takeOff();
		A.takeDown();
		
	}

}
class Boeing  extends Airplane implements Flight 
{
	 public void takeOff()
	 {
		 System.out.println("Boeing class takeOff method running..");
	 }
	 public void takeDown()
	 {
		 System.out.println("Boeing class takeDown method running..");
	 }
	   	
}
class Airbus  extends Airplane implements Flight
{
	 public void takeOff()
	 {
		 System.out.println("Airbus class takeoff method running..");
	 }
	 public void takeDown()
	 {
		System.out.println("Airbus class takeDown method running.."); 
	 }
	   
}