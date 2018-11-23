package mathSamples;

public class PowerOf2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 81;
		System.out.println("Can " + input + " be a power of two integers? " + isPowerOf(input));
	}

	private static Boolean isPowerOf(int input) {
		// TODO Auto-generated method stub
		
		double temp = Math.sqrt(input);
		for (int n = 1; n <= Math.sqrt(input); n++) {
			int p = 2;
			while (p < input) {
				if (Math.pow(n, p) == input)
					return true;
				p++;
			}

		}

		return false;
	}

}
