 package coreJavaTraining;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 *
		 */

		//HashMap<IndexLocation/KeyValue, Value can be string or integer> hm= new HashMap<Integer, Integer>();
		/*HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(0,"Hello");
		hm.put(1,"Hi");
		hm.put(2,"Hola");
		hm.put(3,"Hula");
		System.out.println(hm.get(2));*/
		
		Hashtable<String, String> hm= new Hashtable<String, String>();
		hm.put("Place","Hello");
		hm.put("Place 1","Hi");
		hm.put("Place 2","Hola");
		//hm.put(3,"Hula");
		//System.out.println(hm.get(""));
		Set sn=hm.entrySet();
		
		/**
		 * Q What is the difference between HashMap and HashTable?
		 * Synchronization or Thread Safe: This is the most importent difference between the two.
		 * HashMap is non synchronized and not thread safe. On the other hand, 
		 * HashTable is thread safe and synchronized.
		 * 
		 * Q When to use HashMap?
		 * If your application do not require any multi-threading task, in other words HashMap is 
		 * better for non-threading applications. HashTable should be used in multi-threading applications.
		 * As it does not relase it's object to other program until current program has not finished the work.
		 * 
		 * Null Keys and Values: HashMap allows one null key and any number of null values.
		 * HashTable  does not allow null keys and null values in the HashTable object.
		 * 
		 * Iterating the values: HashMap object values are iterated using iterator . HashTable is the only 
		 * classother than vector which uses enumerator to iterate  the values of HashTable object.
		 * 
		 * 
		 */
		
		Iterator i= sn.iterator();
	
		while(i.hasNext()){
			
			Map.Entry mp=(Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}
	}


