package LoopProg;

public class LargeSmallArray {

	public static void main(String[] args) {
		
		int arr[] = {56,43,21,89,69};
		int max = arr[0];
		int min = arr[0];
		for(int i= 1;i<arr.length; i++){
			
			if (max<arr[i])
				max = arr[i];
				
			else if (min>arr[i]){
				min = arr[i];
			}
		}
		
		System.out.println("The maximum no. is " +max);
		System.out.println("The maximum no. is " +min);
		

	}

}
