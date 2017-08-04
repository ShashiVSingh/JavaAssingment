package LoopProg;

import java.io.IOException;
import java.util.Scanner;

public class PrintPyramid {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	System.out.println("Enter number of layers for Pyramid");
			
	Scanner S2 = new Scanner (System.in);
	//int l=(int)((char)System.in.read());

	int l = S2.nextInt();
	for(int i= 0; i<l; i++){  // no. of rows
		
		for(int j= i; j<l; j++){
			System.out.print(" ");
		}
		
		for(int k= 0; k<=i; k++){
			System.out.print(k + " ");
			//System.out.print("* ");
		}
		System.out.println( );
	}


		}


}
