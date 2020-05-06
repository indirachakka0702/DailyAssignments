package Collection;

import java.util.LinkedList;

public class P {

	public static void main(String[] args)
	{
		LinkedList<String> LL = new LinkedList<>();
		LL.add("Hari");
		LL.add("Rani");
		LL.add("Kavya");
		LL.add("Nani");
		System.out.println(LL.get(2));
		System.out.println(LL.indexOf("Kavya"));
	}

}
