package arraySamples;

public class MaxDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 5, 4, 2 };
		System.out.println(findMax(arr));
	}

	private static int findMax(int[] a) {
		// TODO Auto-generated method stub
		int maxDist = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					maxDist = maxDist < j - i ? j - i : maxDist;
				}
			}
		}
		return maxDist;
	}

}
