package coreJavaTraining;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		/**
		 * Hashset treeset LinkedHashset implements Set interface
		 * Set interface does not accept duplicate values
		 *  Recharge mobile scenario, u can't recharge two things at a time
		 *  There is no gurantee that elements stored in sequential order, it will be in random order
		 */
		
		
			HashSet<String> hs= new HashSet<String>();
			hs.add("USA");
			hs.add("UK");
			hs.add("India");
			hs.add("India"); //Set will reject this as this is duplicate
			
			
			System.out.println(hs);
			
			hs.remove("India");
			
			System.out.println(hs);
			
		System.out.println(hs.size());
		
		System.out.println(hs.isEmpty());
		hs.add("first object");
		
		System.out.println(hs.size());
		
		//Iterator, this is an interface
		
		/**
		 * If u want to iterate through each and every string present in the hash set, there
		 * is an iterator that will help to traverse through each and every object present in the set
		 */
		
		Iterator<String> i=hs.iterator();	
		/*System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());*/
		
		/* Instead of writing many times for getting the 
		next element as shown above we can use while loop and
		hasnext();*/
		
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
			
		
		
		

	}

}
