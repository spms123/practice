package arraySamples;

public class NobleInteger {
	public static int[] arr = { -1, -9, -2, -78, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The noble integer is : " + nobleInteger(arr));
	}

	private static int nobleInteger(int[] a) {
		// TODO Auto-generated method stub
		for (int i1 : a) {
			if (findNobleInteger(a, i1) == 1)
				return i1;
		}
		return 0;
	}

	private static int findNobleInteger(int[] a, int findMe) {
		// TODO Auto-generated method stub
		boolean foundMe = false;
		int ret = 0;
		int count = 0;
		for (int i : a) {
			if (i == findMe) 
				foundMe = true;
			 else if (i > findMe) 
				count++;
			
		}
		return ret = foundMe && count == findMe ? 1 : -1;		
	}

}
