package arraySamples;

//a1>=a2<=a3>=a4<=a5..........
//It can be done in 2 ways
//1) sort the array then swap the next elem with current
//2) start from i =1 ; if i-1< i swap then i+1< i swap then increment by 2

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 6, 5, 10, 7, 20};
		int[] ret = getWavePattern(arr);
		for (int i : ret) {
			System.out.print(i+ " ");
		}
	}

	private static int[] getWavePattern(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 1; i < a.length; i= i+2) {
			if (a[i - 1] < a[i]) {
				int temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
			}
			if (i+1 < a.length && a[i + 1] < a[i]) {
				int temp = a[i + 1];
				a[i + 1] = a[i];
				a[i] = temp;
			}			
		}
		return a;
	}

}
