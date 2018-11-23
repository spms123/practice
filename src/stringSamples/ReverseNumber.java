package stringSamples;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345676;
		System.out.println(reverseGiven(num));

	}

	private static int reverseGiven(int num) {
		int reverse = 0;
				
		while(num > 0) {			
			reverse = reverse * 10 + num %10;
			num = num /10;
		}	
		
		return reverse;
		// TODO Auto-generated method stub
		
	}

}
