package mathSamples;

import java.util.ArrayList;
import java.util.Iterator;

//Given a positive integer A, return an array of strings with all the integers from 1 to N. 
//But for multiples of 3 the array should have “Fizz” instead of the number. 
//For the multiples of 5, the array should have “Buzz” instead of the number. 
//For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		ArrayList<String> word = getSentence(A);
		Iterator<String> i = word.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}

	private static ArrayList<String> getSentence(int a) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 1; i <= a; i++) {
			String temp = String.valueOf(i);
			if (i % 3 == 0 && i % 5 == 0)
				temp = "FizzBuzz";
			else if (i % 3 == 0)
				temp = "Fizz";
			else if (i % 5 == 0)
				temp = "Buzz";
			al.add(temp);
		}
		return al;
	}

}
