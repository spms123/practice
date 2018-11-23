package mathSamples;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		System.out.println(dec2Bin(n));
	}

	private static String dec2Bin(int n) {
		// TODO Auto-generated method stub
		String s = "";
		while (n > 1) {
			s = n % 2 + s;
			n = n / 2;
		}
		return 1 + s;
	}

}
