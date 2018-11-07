package arraySamples;

//Given array is Read only
//array elements are in range 1-n

public class RepeatAndMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 2, 1, 5, 4, 2 };
		findRepeatMissing(arr);
	}

	private static void findRepeatMissing(int[] arr) {
		// TODO Auto-generated method stub

		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[arr[i] - 1] == 0)
				temp[arr[i] - 1] = 1;
			else if (temp[arr[i] - 1] == 1)
				System.out.println("Repeated element is : " + arr[i]);
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 0)
				System.out.println("Missing element is : " + ++i);
		}

	}

}
