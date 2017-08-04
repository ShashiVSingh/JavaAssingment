package ArraysProg;

public class CommonNo {
public static void main(String[] args) {
		
		int a [] = {4,6,7,3,9};
		int b [] = {7,2,6,1,5};
		
		for (int i=0; i< a.length; i++){
			
			for (int j=0; j< b.length; j++){
				
				if (a[i]==b[j]){
					
					System.out.println("Common number is " + a[i]);
				}
			}
		}
	}

}
