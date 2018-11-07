package stringSamples;

public class Anagrams {

	public static void main(String[] args) {
		String s = checkIfAnagram("Maryr","Arrmy");
		System.out.println(s);
	}

	private static String checkIfAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(s1.length() != s2.length())
			return "Its not an anagram";
		else {
			for (char ch1 : s1.toLowerCase().toCharArray()) {
				for (char ch2 : s2.toLowerCase().toCharArray()) {
					if(ch1 == ch2) {
						flag = true;
					}					
				}
				if(flag == true)
					return "Its an anagram";
				else 
					return "Its not an anagram 1";
			}
		}
		return "Its not an anagram";
		
	}
}
