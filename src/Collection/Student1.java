package Collection;

public class Student1 implements Comparable<Student1>
{
	String name ;
	  int RegNo;
	  
	  Student1(String Name, int RegNo)
	  {
		  this.name = Name;
		  this.RegNo = RegNo;
	  }

	public int compareTo(Student1 obj) {
		
		return this.name.compareTo(obj.name);
	}
  
}
