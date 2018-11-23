package arraySamples;

public class FindPermutationWithID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "DDIDDIID";
		int[] arr = findPermutation(s, s.length() + 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static int[] findPermutation(String s, int n) {
		// TODO Auto-generated method stub
		int Icount = 0;
		int Dcount = 0;
		int[] ret = new int[n];
		for (int j = 0; j < ret.length; j++) {
			ret[j] = j + 1;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'D') {
				Dcount++;
			} else if (s.charAt(i) == 'I') {
				reverse(i - Dcount, i, ret);
				Dcount = 0;
			}
			if (i == s.length() - 1 && Dcount > 0)
				reverse(i + 1 - Dcount, i+1, ret);

		}

		return ret;
	}

	private static int[] reverse(int i, int j, int[] a) {
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}

		return a;
	}

}
