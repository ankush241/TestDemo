package Core_Java;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Dayna");
		a.add("Rahul");
		a.add("Prasun");
		a.add("Rahul");
		a.add("Suman");
		
		a.add(0, "Xoxo");
		a.add(2, "Raja");
		a.add(4, "Varun");
		//a.remove(1);
		//System.out.println(a.contains("AAA"));
		System.out.println(a.indexOf("Prasun"));
		System.out.println(a.size());
		
		//System.out.println(a);

		for (String i : a)
		{
			System.out.println(i);
		}
	}

}