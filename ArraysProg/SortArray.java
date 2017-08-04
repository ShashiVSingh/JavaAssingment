package ArraysProg;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] num = new int[] {4,3,6,5,2,1};
		System.out.print("Original Array : ");
		int i;
		for(i=0; i<num.length; i++)
			System.out.print(" "+ num[i]);
		
		Arrays.sort(num);
		System.out.println("\n sort into array : ");
		for(i=0; i<num.length; i++)
			System.out.print(" "+ num[i]);
		

	}

}
