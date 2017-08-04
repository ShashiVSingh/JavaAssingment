package Practice;

public class StringBufferExp {

	public static void main(String[] args) {
		 
		 //append() method
		
		StringBuffer sb = new StringBuffer ("Hello");
		sb.append("  java");// now original string is changed
		System.out.println(sb); // print Hello Java
		
        // insert() method
		
		sb.insert(1,"Java");
		System.out.println(sb);
	}

}
