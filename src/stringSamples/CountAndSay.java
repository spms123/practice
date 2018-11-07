package stringSamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//Given an integer n, generate the nth sequence. like n = 5 sequence is 1,11,21,1211,111221...
public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		countNumber(n);
		Iterator<String> i = countNumber(n).iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

	}

	private static ArrayList<String> countNumber(int n) {
		// TODO Auto-generated method stub
		ArrayList<String> numSequence = new ArrayList<String>();

		if (n == 1) {
			numSequence.add("1");
			return numSequence;
		}
		String s = "1";
		for (int i = 0; i <= n; i++) {
			numSequence.add(s);
			s = func(s);
		}

		// numSequence.add(func("11111122222"));
		return numSequence;
	}

	private static String func(String number) {
		StringBuilder result = new StringBuilder();
		char repeat = number.charAt(0);
		number = number.substring(1) + " ";
		int times = 1;
		for (char actual : number.toCharArray()) {
			if (actual != repeat) {
				result.append(times + "" + repeat);
				times = 1;
				repeat = actual;
			} else {
				times++;
			}
		}

		return result.toString();

	}

}
