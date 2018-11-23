package sortingAlgos;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 2, 5, 3, 8, 1, 4 };
		int[] sorted = sort(a);
		for (int i : sorted) {
			System.out.print(i + " ");
		}
	}

	private static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		int key, j;
		for (int i = 1; i < a.length; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		return a;
	}

}
