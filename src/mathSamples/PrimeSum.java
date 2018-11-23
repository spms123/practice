package mathSamples;

//Given an even number ( greater than 2 ), return two prime numbers whose sum will be 
//equal to given number.
public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9990;
		// System.out.println("Is " + n + " Prime? " + isPrime(n));
		System.out.println(getPrimeSum(n));
	}

	private static String getPrimeSum(int n) {
		// TODO Auto-generated method stub
		for (int j = 2; j <= n / 2; j++) {
			if (isPrime(j) && isPrime(n - j))
				return j + "," + (n - j);
		}
		return "Not Possible";
	}

	private static Boolean isPrime(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
