package arraySamples;

public class FormLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 34, 3, 98, 9, 76, 45, 4};
		System.out.println("Largest number is from the given array is : " + largestNumber(a));
	}

	private static String largestNumber(int[] a) {
		// TODO Auto-generated method stub
		String num = "";
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (Integer.parseInt(a[i] + "" + a[j]) < Integer.parseInt(a[j] + "" + a[i])) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i : a) {
			num += "" + i;
		}
		return num;
	}

}
