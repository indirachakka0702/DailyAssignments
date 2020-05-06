package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class S {

	public static void main(String[] args) 
	{
		LinkedList<Integer> LL = new LinkedList<>();
		LL.add(11);
		LL.add(13);
		LL.add(16);
		LL.add(12);
		LL.add(19);
		System.out.println("Linked list elements is "+LL);
		LL.add(10);
		System.out.println("After adding one more element "+LL);
		LL.removeLast();
		System.out.println("After removing last element "+LL);
		LL.removeFirst();
		System.out.println("After removing first element "+LL);
	    LL.remove(2);
		System.out.println("After removing 2nd index element "+LL);
	    Collections.sort(LL);
		System.out.println("The minimum element is "+LL.getFirst());
		System.out.println("The maximum element is "+LL.getLast());

	}

}
