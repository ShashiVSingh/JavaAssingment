package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListUsingIteration {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList<String> list =new ArrayList();   //Creat an ArrayList Object
		
		list.add("rose");    //Add elements to Arraylist
		list.add("Lily");
		list.add("Jasmin");
		list.add("Daisy");
		
		// Search for elements
		
		int index = list.indexOf("Lily");
		int lastIndex = list.lastIndexOf("Daisy");
		int notFound = list.indexOf("Gold");
		
		// Display results.
        System.out.println(index);     //1
        System.out.println(lastIndex); //3
        System.out.println(notFound);  //-1
		
		
	Iterator itr = list.iterator();   //get an Iterator object for ArrayList using iterator() method.
		
		//use hasNext() and next() methods of Iterator to iterate through the elements
		 
		System.out.println("Iterating through ArrayList elements...");  
	    while(itr.hasNext())
	      System.out.println(itr.next());
	    
	    System.out.println("Before reversing:" + list);
	    Collections.reverse(list);
	    System.out.println("After Reversing :"+list);
        
    /*    //Get Size & Display
        int count = list.size();
        System.out.println("Count" + count);
        
        //Loop through Elements 
        
        for(int i = 0; i<list.size();i++){
        	String name = list.get(i);
        	System.out.println("List of Flowers :" + name);
        }*/
        
	}

}
