package StringProg;

import java.util.Scanner;


public class ParenthesisValid {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		System.out.println("Enter Expression");
		String exp = scan.next();
		
		char[] strArray = exp.toCharArray();
		int openParenthesis = 0;
		int closeParenthesis = 0;
		for (int i = 0; i<strArray.length;i++){
			if (strArray[i]=='(')
				openParenthesis+=1;
			else if(strArray[i]==')')
				closeParenthesis+=1;
			
		}
if (openParenthesis!=0 && closeParenthesis!=0 && openParenthesis==closeParenthesis)
	System.out.println("Parenthesis are Valid");
else
	System.out.println("Parenthesis are Invalid");
		

	}

}
