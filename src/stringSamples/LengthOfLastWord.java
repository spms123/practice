package stringSamples;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hello world";
		System.out.println(findLength(word));
	}

	private static int findLength(String word) {
		// TODO Auto-generated method stub
		int len = word.length();
		
		while (word.charAt(len-1) != ' ') 
			len--;	

		return word.length() - len;
	}

}
