package sortingAlgos;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,7,4};
		bubbleSorting(arr);
	}

	private static void bubbleSorting(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int z = 0; z <= arr.length - 1; z++) {
			System.out.print(arr[z]);
		}

	}

}
