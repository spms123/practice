package stringSamples;

import java.util.LinkedHashMap;

//longest substring without repeating characters in the given string

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "reminderoptions";
		longestString(s);
	}
	
	private static void longestString(String s) {
		// TODO Auto-generated method stub
		int longestStringLen = 0;	
		
		String longestString = "";
		
		char[] charArray = s.toCharArray();
		LinkedHashMap<Character,Integer> list = new LinkedHashMap<>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(!list.containsKey(charArray[i])){
				list.put(charArray[i], i);
			}else {
				i = list.get(charArray[i]);
				list.clear();
			}
			
			if(longestStringLen < list.size()) {
				longestStringLen = list.size();
				longestString = list.keySet().toString();
			}
			
			
		}
		
		System.out.println("String is :"+ longestString);
	}

	
}
