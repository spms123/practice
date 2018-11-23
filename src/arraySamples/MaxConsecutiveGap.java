package arraySamples;

public class MaxConsecutiveGap {
	private final  int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 10, 5 };
		System.out.println(findMaxGap(arr));
		MaxConsecutiveGap max = new MaxConsecutiveGap();
		System.out.println(max.a);
		

	}
	public MaxConsecutiveGap() {
		// TODO Auto-generated constructor stub
		this.a = 10;
	}

	private static int findMaxGap(int[] a) {
		// TODO Auto-generated method stub
		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
			else if (a[i] > max)
				max = a[i];
		}
		int range = max - min + 1;
		int[] newArr = new int[range];

		for (int j = 0; j < a.length; j++) {
			newArr[a[j] - min] = a[j];
		}

		int count = 0;
		for (int h = 0; h < newArr.length; h++) {
			if (newArr[h] != 0) {
				a[count] = newArr[h];
				count++;
			}
		}
		int maxGap = 0;

		for (int i = 1; i < a.length; i++) {
			maxGap = maxGap > (a[i] - a[i - 1]) ? maxGap : (a[i] - a[i - 1]);
		}

		return maxGap;
	}

}
