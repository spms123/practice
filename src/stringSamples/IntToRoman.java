package stringSamples;

import java.util.HashMap;

public class IntToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] base = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		int in = 687;	

		String roman = integerToRoman(base, nums, in);
		System.out.println(roman);
	}

	private static String integerToRoman(String[] base, int[] nums, int in) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
		
		String res = new String();
		for (int i : nums) {
			while(in >= i) {
				res += map.get(i);
				in = in - i;
			}
		}
		return res;
	}
}
