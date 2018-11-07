package arraySamples;

public class MaxSumcontigiousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(findSubArray(arr));
	}

	private static int findSubArray(int[] arr) {

		int maxTillHere = 0;
		int max = 0;

		int start = 0;
		int end = 0;
		int s = 0;

		for (int i = 0; i < arr.length; i++) {
			maxTillHere = maxTillHere + arr[i];
			if (maxTillHere > max) {
				max = maxTillHere;
				start = s;
				end = i;
			}
			if (maxTillHere < 0) {
				maxTillHere = 0;
				s = i + 1;
			}
		}

		System.out.println("Start Index : " + start + " End Index : " + end);
		return max;

		// TODO Auto-generated method stub

	}

}
