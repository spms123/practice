package stringSamples;

public class Multiply2StringNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "12";
		String s2 = "34";
		Multiply(s1,s2);
	}

	private static String Multiply(String s1, String s2) {
		String total = new String();
		int carry = 0;
		
		if(s1 == "0" || s2 == "0")
			return "0" ;
		int count = 0;
		for(int i = s1.length()-1; i>0;i--) {
			for(int j = s2.length()-1;j>0;j--) {
				int temp = (s1.charAt(i)-'0') * (s2.charAt(j)-'0') + carry;
				total = 
				
				
				
				System.out.println(9%10);
			}
		}
		
		return "0";
	}

}
