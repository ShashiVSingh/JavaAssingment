package Practice;

public class WrapperExample2 {
	static int i = 12;
	static double d = 6.6;
	static String str = "hai";
	
	public static void main (String[]args){
		display (false);
	}
	
	public static Object display (boolean b){
		if (b){
			return str;
		}
		else if (i==12){
			return d;
		}
		else{
			return i;
		}
	}

}
