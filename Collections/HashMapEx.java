package Collections;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hmap = new HashMap<Integer,String>(); //Creat HashMap
		
	//Add Elements to HashMap
		hmap.put(1,"Java");
		hmap.put(2,"Python");
		hmap.put(3,"JSON");
		hmap.put(4,"Ruby");
		
		//Getting Values From hashMap
		
		String value = hmap.get(3);
		
		System.out.println("The Value mapped to Key 4 is:"+ value);
		
		// Here Key "5" is not mapped to any value so this operation will return null
		
		String value2 = hmap.get(5);
		System.out.println("The Value mapped to Key 5 is:"+ value2);

	}

}
