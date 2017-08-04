package ArraysProg;

public class Merge2Arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {1,2,3,4,5};
		int b [] = {6,7,8,9};
		
		int c [] = new int [a.length + b.length];
		
		int i,j, index = 0;
		
		for (i=0; i< a.length; i++){
			
			c[i] = a[i];
			
			index ++;
		}
		
		for( j=0; j< b.length; j++){
			
			c[index++] = b[j];
		}
		
		for(i=0; i<c.length; i++){
			System.out.print(c[i]+ " ");
		}
	}

}
