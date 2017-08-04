package LoopProg;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r = sc.nextInt();
		
		for(int i=0; i<r; i++){
			
			for(int j= r; j>i;j--){
				System.out.print(" ");
			}
			
			int num = 1;
			for(int k=0;k<=i;k++){
				System.out.print(num+" ");
				num = num*(i-k)/(k+1);
			}
			System.out.println();
		}

	}

}
