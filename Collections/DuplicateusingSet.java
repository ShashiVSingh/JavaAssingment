package Collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateusingSet {

	public static void main(String[] args) {
		
		String [] names = {"Java", "JavaScript","Ruby","Python","c","Java"};
		
		System.out.println(" Duplicate elements from array using HashSet Data Structure");
		Set<String> store = new HashSet<>();
		for (String name : names){
			if(store.add(name) == false) {
				System.out.println("Found a Duplicate element in array: =" + name);
			}
		}
	}

}
