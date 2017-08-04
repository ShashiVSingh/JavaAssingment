package Collections;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList <String> arr1 = new ArrayList<String>();
		arr1.add("Kimaya");
		arr1.add ("Vivaan");
		arr1.add("Ishan");
		arr1.add("Aryaman");
		
		System.out.println("Actual ArrayNameList :" + arr1);
		
		String[] strArr = new String [arr1.size()];
		arr1.toArray(strArr);
		System.out.println("Creat Array Name :" );
		for(String str : strArr){
			
			System.out.println(str);
		}
		

	}

}



