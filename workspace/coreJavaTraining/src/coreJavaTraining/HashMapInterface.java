package coreJavaTraining;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInterface {

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
		
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("Place","Hello");
		hm.put("Place 1","Hi");
		hm.put("Place 2","Hola");
		//hm.put(3,"Hula");
		//System.out.println(hm.get(""));
		Set sn=hm.entrySet();
		
		/**
		 * Create a hash table and pass the table to the set collection and print 
		 * the key and value separately using the iterator
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
