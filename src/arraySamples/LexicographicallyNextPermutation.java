package arraySamples;

public class LexicographicallyNextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5,9,7,6 };
		int[] perm = nextPermutation(arr);

		for (int i : perm) {
			System.out.print(i + " ");
		}
	}

	private static int[] nextPermutation(int[] a) {
		// TODO Auto-generated method stub
		int i = a.length - 1;
		int smallest = i;
		while (i > 0 && a[i] <= a[i - 1]) {
			smallest = smallest >= a[i] ? i : smallest;
			i--;
		}
		if (i == 0) {
			a = sortArray(0, a.length - 1, a);
		} else {
			int temp = a[i - 1];
			a[i - 1] = a[smallest];
			a[smallest] = temp;
			a = sortArray(i, a.length - 1, a);
		}

		return a;
	}

	private static int[] sortArray(int i, int j, int[] arr) {
		// TODO Auto-generated method stub
		for (int x = i; x <= j; x++) {
			for (int y = x + 1; y <= j; y++) {
				if (arr[y] < arr[x]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}

			}
		}
		return arr;
	}

}
