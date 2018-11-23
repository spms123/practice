package arraySamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxNonNegSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 0, 4, 0, 1, -1,-1, 0, 0, 1, 0};
//		int[] ret = nonNegSubArray(A);
//		for (int i : ret) {
//			System.out.print(i+ " ");
//		}
		System.out.println(nonNegSubArray(A));
	}

	private static int nonNegSubArray(int[] a) {
		int[] maxArr = new int[a.length];
		int[] temp = new int[a.length];
		int prevSum = 0;
		int count = 0;
		int start = 0;
		for (int i = start; i < a.length; i++) {
			while (i < a.length && a[i] > 0) {
				temp[count] = a[i];
				i++;
				count++;
			}
			int curSum = getSum(temp);
			if (curSum > prevSum) {
				prevSum = curSum;
				maxArr = temp;
			}
			if (i < a.length) {
				temp = new int[a.length];
				start = i;
				count = 0;
			}
		}
		return prevSum;
		// TODO Auto-generated method stub
	}

	private static int getSum(int[] temp) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i : temp) {
			sum += i;
		}
		return sum;
	}

}
