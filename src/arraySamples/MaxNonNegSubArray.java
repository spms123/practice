package arraySamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxNonNegSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 2, 5, -7, 2, 3 };
		nonNegSubArray(A);
	}

	private static void nonNegSubArray(int[] a) {
		// TODO Auto-generated method stub
		ArrayList<Integer> currList = new ArrayList<>();
		ArrayList<Integer> maxList = new ArrayList<>();
		
		int curSum = 0;
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				curSum +=  a[i];
				currList.add(a[i]);				
			} else {
				
			}
			
			if(curSum > maxSum) {
				maxSum = curSum;
			}
				

		}

		

	}

	private static int getSum(ArrayList<Integer> singleList) {
		// TODO Auto-generated method stub
		int sum = 0;
		Iterator<Integer> i = singleList.iterator();
		while (i.hasNext())
			sum += i.next();
		return sum;
	}

}
