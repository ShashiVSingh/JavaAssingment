package LoopProg;

public class FactorialUsingRecursion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		int result = factorial(n);
		System.out.println("The Factorial of 8 is " + result);	
	}
	
	public static int factorial (int n){
		
		if (n==1){
			
			return 1;
		}else{
			return n * factorial (n-1);
		}
			
	}

}
