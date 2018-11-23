package arraySamples;

public class MinUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 4, 5 };
		String s = unsortedArray(arr);
		System.out.println(s);
	}

	private static String unsortedArray(int[] a) {
		// TODO Auto-generated method stub
		int first = 0;
		int last = a.length - 1;
		while (first + 1 < a.length && a[first] < a[first + 1]) {
			first++;
		}
		while (last - 1 > 0 && a[last] > a[last - 1]) {
			last--;
		}
		if (first == a.length - 1 && last == 1)
			return "-1";
		
		sortElements(first, last, a);

		while (a[first] < a[first - 1]) {
			sortElements(first - 1, last, a);
			first = first - 1;
		}

		while (a[last] > a[last + 1]) {
			sortElements(first, last + 1, a);
			last = last + 1;
		}
		return first + "*" + last;
	}

	private static int[] sortElements(int first, int last, int[] a) {
		for (int i = first; i <= last; i++) {
			for (int j = i + 1; j <= last; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
		// TODO Auto-generated method stub

	}

}
