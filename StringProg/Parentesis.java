package StringProg;

public class Parentesis {

	public static void main(String[] args) {
		String str =  "(()))";
		char[] strArray = str.toCharArray();
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
