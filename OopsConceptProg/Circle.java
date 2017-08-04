package OopsConceptProg;

public class Circle extends Shape implements ShapeConstants {
	
	
	public double radius;
	//private int noOfSides = 3;
	   
	
	public Circle (double radius){
		this.radius = radius; // refering parent class
		//this.noOfSides = noOfSides // 
	}
	
	@Override
	public double calculateArea(){
		
		area = pi*radius*radius;
		return area;
	}
	 @Override
	 public double calculatePerimeter(){
		 perimeter = 2*pi*radius;
		 return perimeter;
	 }

	 public static void main (String[] args){
		 
		 Shape c = new Circle(3);
		 c.setSides();
		 c .calculateArea();
		 System.out.println("Area is ::" + c.area);
		 c.calculatePerimeter();
		 System.out.println("Perimeter is ::" + c.perimeter);
	 }
}

