package Practice;

//Example of default constructor that displays the default values

public class Student {
	
	int id;
	String name;
	
	public void displayDetails(){
		System.out.println(id+" "+ name);
	}
	
	public static void main (String[] args){
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.displayDetails();
		s2.displayDetails();
	}

}


// in this didnot creat any constructor so compiler provides a default constructor 
//here 0 n null value provided by compiler