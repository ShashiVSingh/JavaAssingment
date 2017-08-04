package LoopProg;

public class ArmstrongNumber {
	
public static void main(String[] args) {
		
		int n = 153, a , result= 0;
		int temp = n;
		
		while (n>0){
			a = n%10; // a=3, a=5
			result = result + (a*a*a); // 3^3=27 + 125+1
			n = n/10; // n=15, n=1
		}
		if (temp ==result){
			System.out.println("n is an Armstrong Number");
		}
		
		else
			
			System.out.println("n is not an Armstong Number");
	}

}
