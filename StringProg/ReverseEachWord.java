package StringProg;

public class ReverseEachWord {
	
	public static void revWords(){
		/*String input = "Java is easy";
        StringBuilder sb = new StringBuilder();
        String words[] = input.split(" ");//empty string
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
              sb.append(" ");//when we reverse we need another empty loop
        }
        System.out.println (sb.toString());
	}


	public static void main(String[] args){
		
		ReverseEachWord.revWords();*/
		
		
		String s1 = "Hello World";
		String[] str = s1.split(" ");
		String revStr = "";
		for (int i = 0; i<str.length; i++){
			String word = str[i];
			String revWord = "";
			for (int j = word.length()-1;j>=0;j--){
				revWord = revWord+word.charAt(j);
			}
			//System.out.println(revWord);
			revStr = revStr + revWord + " ";
		}
		System.out.println(revStr);
	}

}
