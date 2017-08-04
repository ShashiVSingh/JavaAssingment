package LoopProg;

public class Fibbonaci {
	
		public static void main(String[] args) {
			
			int n1 = 0;
			int n2 = 1;
			int i , n3;
			int count = 7;
			 System.out.print( n1+" "+n2); // print 0 1
			 for(i=2; i<count; i++){
				 
				 n3 = n1+n2;
				 
				 System.out.print(" "+ n3);
				 
				 n1=n2;
				 n2=n3;
				 
			 }
		}
}




//while loop

/* public static void main(String[] args) {

int i = 1;
int j = 0;
int num = 10;
while(i<num)  // i = 1  2  3
{
System.out.println(i + " ");
int temp = i;   //1  1  2
i +=j;  //  i = i+j
j=temp;   // j+ 1  1   2
}
}*/