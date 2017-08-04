package Practice;

public class StringEx1 {

	public static void main(String[] args) {
		
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "  SACHIN  ";
		String s4 = new String ("Sachin");
		String s5 ="Saurav";
		String s6 = s1.concat(s5);
		String s = 30+40+"Sachin"+30+30;
		String s7 = "Java is programing language. Java is Platform.";
		String replaceString = s7.replace("Java", "Kava"); ////replaces all occurrences of "Java" to "Kava"    
		
		System.out.println(replaceString);
		System.out.println(s1.length());//6   The string length() method returns length of the string.
		System.out.println(s.charAt(0));//S //The string charAt() method returns a character at specified index.
		System.out.println(s3.trim()); //The string trim() method eliminates white spaces before and after string.
		System.out.println(s ); //After a string literal, all the + will be treated as string concatenation operator.
		System.out.println(s6);
		System.out.println(s1.equals(s2)); // compares the value of string
		System.out.println(s1.equalsIgnoreCase(s3));  // compares the value of string ignore the Case
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		

	}

}
