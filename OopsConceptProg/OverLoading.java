package OopsConceptProg;

public class OverLoading {
	
	void find (int l, int b){
		System.out.println("Area of rectangle : " + (l*b));
	}
	
	void find (int l, int b, int h){
	System.out.println("Area of rectangular prism : " + (l*b*h));
	}
	
public static void main (String[]args) {
	
	OverLoading ar = new OverLoading();
	
	ar.find(3, 7);  // find(int l, int b) is method is called.
	ar.find(5,3, 6);  //// find(int l, int b,int h) is called.
	
}
}
