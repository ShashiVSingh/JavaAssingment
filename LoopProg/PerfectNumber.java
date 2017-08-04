package LoopProg;


// A perfect number is a positive integer that is euqal to the sum of the perfect divisors excluding that number.
// 6 = 1+2+3 =6
// 6 = 1+2+3+6= 12/2 = 6

public class PerfectNumber {

	public static void main(String[] args) {
		
		System.out.println(checkPerfect(6));
	}
	
	public static boolean checkPerfect(int num){
		int sum = 0;
		if(num<0){
			return false;	
		}
		else{
			for(int i = 1; i<= num; i++){    //6 ---> 1+2+3 = 6
				if (num%i == 0){
					sum +=i;
				}		
		}
			if (num == sum/2){
				return true;
			}
	}
		return false;

}
	
}
