package coreJavaTraining;

import java.util.ArrayList;

public class ArrayListDemo {
	
	/**
	 * All classes which implement List interface can accept duplicate values
	 * Classes which extend List in collection interface:
	 * Array List, Linked List, Vector Implement List interface
	 * Array has fixed size, where as Array list can grow dynamically
	 * we can access and insert any value in any index
	 * @param args
	 */

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();// Here we have to add the type arguments
		al.add("Rahul");
		al.add("Raj");
		al.add(0, "student");

		System.out.println(al);

		/*al.remove(1);
		System.out.println(al);

		al.remove("Raj");
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);*/

		// In arrays we need to define the size, in array list you can add or delete elements from the list.

		//it is dynamic size array

		System.out.println(al.get(2));

		// Verify whether testing is present in array list or not

		System.out.println(al.contains("raj"));

		System.out.println(al.indexOf("Raj"));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.size());
		
		System.out.println("");
		
		







	}

}
