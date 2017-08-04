package StringProg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringReplace {

	public static void main(String[] args) {
		
		String str = "My name is Shashi Singh, Shashi, Shashi";
		String replacedStr=str.replace("Shashi", "Kimaya");
		/*Pattern p = Pattern.compile("Shashi");
		Matcher m = p.matcher(str);
		StringBuffer sb = new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb, "Kimaya");
		}
		
		m.appendTail(sb);*/
		System.out.println("Original text\t"+str + "\nReplaced text\t"+replacedStr);
	}
}
