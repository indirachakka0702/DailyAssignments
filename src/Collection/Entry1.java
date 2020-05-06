package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Entry1 {

	public static void main(String[] args) 
	{
		ArrayList<Student1> AL = new ArrayList<>();
		AL.add(new Student1("Priya",20));
		AL.add(new Student1("Kavitha",25));
		AL.add(new Student1("Reena",30));
		AL.add(new Student1("Giri",40));
		AL.add(new Student1("Sirisha",10));
		
		Iterator<Student1> IT = AL.iterator();
		while(IT.hasNext())
		{
			Student1 s = IT.next();
			System.out.println("I Found Name ::"+s.name+"\t RegNo ::"+ s.RegNo);
		}
	     System.out.println("");
		Collections.sort(AL);
		Iterator<Student1> IT1 = AL.iterator();
		while(IT1.hasNext())
		{
			Student1 s = IT1.next();
			System.out.println("I Found Name ::"+s.name+"\t RegNo ::"+ s.RegNo);
		}

	}

}
