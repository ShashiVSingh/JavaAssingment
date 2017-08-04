package Practice;

public class StringExample {

	public static void main(String[] args) {
		
		String s1 = "java"; //creating String by java string literal
		char ch[] = {'S','T','R','I','N','G','S'};
		String s2 = new String(ch); //converting char array to string  
		String s3 = new String ("Example"); // //creating java string by new keyword  
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		String s = "Sachin";
		s.concat("Tendulakar");
		System.out.println(s);
		

	}

}
