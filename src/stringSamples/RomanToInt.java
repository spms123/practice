package stringSamples;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String roman = "DCLXXXVII";
		int in = romanToInteger(roman);
		System.out.println(in);
	}

	private static int romanToInteger(String roman) {
		// TODO Auto-generated method stub
		int num = 0;

		if (roman == null)
			return -1;

		for (int i = 0; i < roman.length(); i++) {

			if (i + 1 < roman.length()) {
				
				if (getValue(roman.charAt(i)) == -1 || getValue(roman.charAt(i + 1)) == -1)
					return -1;

				if (getValue(roman.charAt(i)) >= getValue(roman.charAt(i + 1)))
					num = num + getValue(roman.charAt(i));
				else {
					num = num + getValue(roman.charAt(i + 1)) - getValue(roman.charAt(i));
					i++;
				}
			} else {
				num = num + getValue(roman.charAt(i));
				i++;
			}

		}
		return num;
	}

	static int getValue(char c) {

		char ch = c;
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

}
