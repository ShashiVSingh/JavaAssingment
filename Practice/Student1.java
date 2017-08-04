package Practice;

///Example of parameterized constructor
//Example of Constructor Overloading

public class Student1 {
	
	int id;
	String name;
	int age;
	
	 Student1(int i, String n) {
		 id = i;
		 name = n;
	 }
	 
	  Student1(int i, String n,int a) {
		  id = i;
		  name = n;
		  age = a;
		
	}
	 
	 
		 
	public void displayDetails(){
		System.out.println(id + " "+ name+" "+ age);
	}
	
	

	public static void main(String[] args) {
		
		Student1 s1 = new Student1(34,"shashi");
		Student1 s2 = new Student1(45,"kimaya",3);
		
		s1.displayDetails();
		s2.displayDetails();
		
		//Student1 s2 = new Student1(45,"kimaya");
		//s2.id= 2;
		//s2.name= "shashi";
		

	}

}
