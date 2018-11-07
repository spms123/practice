package stringSamples;

import java.util.ArrayList;
import java.util.Iterator;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abccdfee");
		arr.add("abcue");
//		arr.add("abckcdfee");
//		arr.add("abcbkcdfee");	
//		arr.add("abbckcdfee");	
//		arr.add("abckcndfee");	
		
		int j =1;	
		Iterator<String> i = arr.iterator();
		while(i.hasNext()) {
			System.out.println("String "+ j + " is: "+i.next());
			j++;
		}
		System.out.println("The longest common prefix is: "+ findPrefix(arr));
	}

	private static String findPrefix(ArrayList<String> arr) {
		// TODO Auto-generated method stub
		String commonPre = "none";
		if(arr.size() == 0)
			return commonPre;
		else if(arr.size() == 1)
			return arr.get(0);
		else if(arr.size() >= 2){
			commonPre = findCommon(arr.get(0),arr.get(1));
			for(int j = 2;j<arr.size();j++) {
				commonPre = findCommon(commonPre,arr.get(j));
			}
		}
		return commonPre;
		
	}

	private static String findCommon(String string, String string2) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int minLen = Math.min(string.length(), string2.length());
		for(int i=0;i<minLen;i++) {
			if(string.charAt(i) == string2.charAt(i))
				sb.append(string.charAt(i));				
		}
		return sb.toString();
	}
	
	

}
