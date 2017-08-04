package OopsConceptProg;

public abstract class Shape {

	int noOfSides;
	double area;
	double perimeter;
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public void setSides(){
		System.out.println("To set sides of the required shape");
	}
}
