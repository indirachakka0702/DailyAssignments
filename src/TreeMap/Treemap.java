package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) 
	{
		Student2 s1 = new Student2("Bindu","1");
		Student2 s2 = new Student2("Priya","2");
		Student2 s3 = new Student2("Deepu","3");
		Student2 s4 = new Student2("Anu","  4");
		Student2 s5 = new Student2("Kiran","5");
		
		Library l1 = new Library(101,20);
		Library l2 = new Library(102,30);
		Library l3 = new Library(105,40);
		Library l4 = new Library(103,25);
		Library l5 = new Library(104,35);
		
		TreeMap<Library,Student2>hm = new TreeMap<>();
	     hm.put(l1,s1);
	     hm.put(l2,s2);
	     hm.put(l3,s3);
	     hm.put(l4,s4);
	     hm.put(l5,s5);
	     
	     System.out.println("LibraryNum   TotalBooks  StudentName  Semester ");
	     
	     for(Map.Entry<Library, Student2>entry:hm.entrySet())
	     {
	    	 Library lb1 = entry.getKey();
	    	 Student2 st1 = entry.getValue();
	    	 System.out.println(lb1.libNum+"           "+lb1.totalBooks+"           "+st1.name+"             "+st1.semester);
	     }
	     
	   

	}

}
