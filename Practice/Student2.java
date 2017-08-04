package Practice;

public class Student2 {
	int rollNo;
	String name;
	static String collegeName = "ITU";
	
    Student2(int r, String n) {
		
		rollNo = r;
		name = n;
		
	}
	
	 void displayDetails(){
		
		System.out.println(rollNo+" "+name+" "+ collageName);
	}
	

	public static void main(String[] args) {
		
		Student2 s = new Student2 (4,"shashi");
		Student2 s1 = new Student2 (1,"kimaya");
		
		s.displayDetails();
		s1.displayDetails();
		

	}

}
