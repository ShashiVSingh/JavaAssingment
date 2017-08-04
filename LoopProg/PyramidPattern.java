package LoopProg;

public class PyramidPattern {
	/*	public static void main(String[] args) {
	
	int i, j;
	
	for(i=0; i<5; i++){
		
		for(j=0; j<5; j++){
			if(j<=i){
				System.out.println("*");
			}else
				System.out.println("");
		}
		
		System.out.println();
	}

}*/

public static void PyramidPattern() {

	for (int i = 0; i < 5; i++) {

		for (int j = 0; j < 5; j++) {

			if (j <= i) {

				System.out.print("*");

			} else
				System.out.print("");

		}

		System.out.println();
	}

}

public static void main(String[] args) {

	PyramidPattern.PyramidPattern();
}

}
