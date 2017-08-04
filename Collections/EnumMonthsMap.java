package Collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumMonthsMap {
	
	public enum Months {
		January,February,March,April,May,June,July,August,September,October,November,December
	}

	public static void main(String[] args) {
		
		for( Months m : Months.values()){
		System.out.println(m);
	}
		
		System.out.println("***************************");
		
		Set<Months> set = EnumSet.of(Months.February, Months.August);  
		// Traversing elements  
		
		Iterator<Months> iter = set.iterator();  
	    while (iter.hasNext())  
	      System.out.println(iter.next());
	    
	    
	    System.out.println("*********************************");
	    
	    //Java EnumSet Example: allOf() and noneOf()
	    
	    Set<Months> set1 = EnumSet.allOf(Months.class);  
	      System.out.println("Months of year:"+set1);  
	      Set<Months> set2 = EnumSet.noneOf(Months.class);  
	      System.out.println("Months of year:"+set2);     
		
  }
	
}

