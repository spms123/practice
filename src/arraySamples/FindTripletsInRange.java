package arraySamples;

public class FindTripletsInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = { 8, 3, 5, 2 };
		int start = findTriplets(a, 7, 11);
		if (start == -1)
			System.out.println("No triplets present");
		else {
			int end = start + 2;
			System.out.println("The triplets are in the range : " + start + " to : " + end);
		}

	}

	private static int findTriplets(double[] a, double start, double end) {
		for (int i = 0; i < a.length - 2; i++) {
			double sum = a[i] + a[i + 1] + a[i + 2];
			if (start < sum && sum < end)
				return i;
		}
		return -1;
		// TODO Auto-generated method stub

	}

}
