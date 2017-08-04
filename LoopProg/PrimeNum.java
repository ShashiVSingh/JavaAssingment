package LoopProg;

public class PrimeNum {
	
	public static void main(String[] args) {
		 int n = 1;
		 int i = 8;
		 int count = 0;
		 
		 for(n=1;n<=i; n++){
			 
			 if (i % n == 0)
				 count++;
		 }
		 if(count==2){
			 
			 System.out.println("i is prime number");
		 } else
			 
			 System.out.println("i is not prime number");

	}

}
