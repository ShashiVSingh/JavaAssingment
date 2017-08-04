package Practice;

public class WrapperExample {
	
	public void display() {
		System.out.println("Hello World");  // this not a static method so need to creat instance of abject
		
	}

	public static void main(String[] args) {
		
		WrapperExample we = new WrapperExample();
		we.display();

		String s = "12.3"; //it is a type of String // String is itself a class... its not Primitive data class
		//int i = Integer.parseInt(s);
		
		Double d = Double.parseDouble(s);
		System.out.println(d+8);
		
		
		s= s+8;
		//System.out.println("the value of s and i are ::" +s+"::"+i);
		System.out.println("the value of s and i are ::" +s+"::"+d);
		boolean b = Boolean.parseBoolean(s); // Boolean has bydefault a false value, so its printing false value
		System.out.println(b);
		
		long l = Long.parseLong(s) 
	}

}
