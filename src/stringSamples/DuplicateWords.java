package stringSamples;

import java.util.HashMap;
import java.util.Map;

//find the duplicate words and their number of occurrences in a string

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the duplicate word is duplicate word hello same is the hello";
		findDuplicate(s);

	}
	
	public static void findDuplicate(String s) {
		Map<String,Integer> word = new HashMap<String,Integer>();
		
		String[] words = s.split(" ");
		 for (String s1 : words) {
			if(word.containsKey(s1)) {
				word.put(s1, word.get(s1)+1);
			}else {
				word.put(s1, 1);
			}
		}
		 
		 for (String key : word.keySet()) {
			if(word.get(key) > 1) {
				System.out.println("the duplicate value is \"" + key + "\" which occurs " + word.get(key) +" times.");
			}
				
		}
		
	}

}
