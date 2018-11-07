package stringSamples;

//This is for getting the reverse of a word and reversing the string word wise
public class ReverseString {
	public static void main(String[] args) {
		String s1 = "the word is nothing";
		ReverseString r = new ReverseString();
//		System.out.println("Actual : " + s1);
//		System.out.print("Reverse whole string : ");
//		r.reverseThis(s1);
//		System.out.println();
//		System.out.print("Reverse word wise : ");
//		r.reverseWord(s1);
		
		System.out.println();
		System.out.print("Reverse String word by word : ");
		System.out.print(r.reverseWords(s1));
		System.out.println();
	}
	
	public String reverseWords(String s) {
		String reversed_word = reverseThis(s);
		System.out.println("reversed : " + reversed_word);
		char[] c = reversed_word.toCharArray();
 		int start =0;
		int end=0;
		System.out.println("length"+c.length);
		for(int i = start;i<c.length;i++) {
			if(c[i] == ' ' || i == c.length-1) {
				end = (i==c.length-1) ? end : end -1;
				while(start < end) {
					char temp = c[start];
					c[start] = c[end];
					c[end] = temp;
					
					start ++;
					end --;
				}
				
				
				start = end = i+1;
			}
			else {
				end ++;
			}
		}
		
		return new String(c);
	}
	
	
	
	public String reverseWord(String s) {
		char[] c = s.toCharArray();
		int len = c.length;
		int start = 0;
		int end = -1;
		for(int i =0;i<len;i++) {
			if(c[i] != ' ' && i != len-1) {
				end++;
				continue;
			}
			if( i == len-1)
				end++;
			
			while(start < end) {
				char temp = c[start];
				c[start] = c[end];
				c[end] = temp;
				
				start ++;
				end --;
			}
			if( start == end || start > end) {
				i++;
			}
			
			start = end = i;
		}
		for(int x=0;x<c.length;x++) {
			System.out.print(c[x]);
		}
		return new String(c);
	}
	
	public String reverseThis(String s) {
		char[] c = s.toCharArray();
		int start = 0;
		int end = c.length - 1;
		while(start < end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			
			start++;
			end--;
		}
//		for(int x=0;x<c.length;x++) {
//			System.out.print(c[x]);
//		}
		return new String(c);
		
	}

}
