package ArraysProg;

public class LargestNum {
	
public static void main(String[] args) {
		
		//array of 10 number
		
		int numbers[] = { 32,43,53,54,32,65,63,98,43,23 };
		
		// assign first element of array to largest 
		
		int largest = numbers[0];
		
		for (int i=1; i<numbers.length; i++) {
			
			if (numbers[i] > largest)
				largest = numbers[i];	
		}
		
		System.out.println("Largest number is "+ largest);

	}


}
