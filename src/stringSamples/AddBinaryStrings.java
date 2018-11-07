package stringSamples;

public class AddBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b1 = "1010";
		String b2 = "1011";

		String sum = binarySum(b1, b2);
		System.out.println(sum);
	}

	private static String binarySum(String b1, String b2) {
		// TODO Auto-generated method stub
		String sum = new String();

		int l1 = b1.length();
		int l2 = b2.length();
		
		int i = l1-1;
		int j = l2-1;
		
		int carry = 0;
		int temp =0;	
		
		int maxLen = Math.max(l1, l2);
		int z = maxLen;
//		for (int z = maxLen; z > 0; z--) {
		while(z> 0 || carry == 1) {
			int p = i >= 0 ? b1.charAt(i) - '0' : 0;
			int q = j >= 0 ? b2.charAt(j) - '0' : 0;
			
			temp = p + q + carry;
			 
			if(temp == 3) {
				sum = 1 + sum;
				carry = 1;
			}else if(temp == 2) {
				sum = 0 + sum;
				carry = 1;
			}else {
				sum = temp + sum;
				carry = 0;
			}
			i--;j--;	
			z--;
		}
		return sum;
	}

}
