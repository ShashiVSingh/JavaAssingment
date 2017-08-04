package ArraysProg;

public class MissingNum {
	
public static void main(String[] args) {
		
		int n = 8;
		int a []= {2,9,3,5,6,1,4};
		
		int SumOfNumbers = n*(n+1)/2;
		
		int i = 0, sum = 0;
		
		for (i=0; i<a.length; i++) {
			
			sum = sum + a[i];
		}
		
		int MissingNum = SumOfNumbers - sum;
		
		System.out.println("Missing Number is " + MissingNum);
	}

}
