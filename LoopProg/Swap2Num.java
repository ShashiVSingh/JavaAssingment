package LoopProg;

public class Swap2Num {

	public static void main(String[] args) {
		//  swap the numbers using a third variable.
		
		swap (5,7);
		swap1(10,20);
	}
	public static void swap (int a,int b){
		int c; //5,7
		c = a; //c=5
		a = b; //a=7
		b = c; //b=5
		
		System.out.println("value of a is " + a);
		System.err.println("value of b is " + b);
	}
	//swap the numbers without any third new variable.
	
	 public static void swap1 (int x , int y){
		 
		 x = x + y; //x=10+20=30
		 y = x - y; //y=30-20=10
		 x = x - y; //x=30-10=20
		 
		 System.out.println("value of x is "+ x);
		 System.out.println("value of y is " + y);
	 }
	
}
