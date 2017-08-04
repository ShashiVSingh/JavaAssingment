package LoopProg;

import java.util.Scanner;

public class FactorialOfNum {
	
	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number whose Factorial is to be found : ");
		
		int n = scanner.nextInt();
		int result = factorial(n);
		
		System.out.println(" the Factorial of "+ n + " is " + result);
	}
	
	public static int factorial (int n){
		
		int result =1;
		
		for(int i = 1; i<=n; i++){
			result = result *i;
		
		}
		 return result; 
		
	}

}
