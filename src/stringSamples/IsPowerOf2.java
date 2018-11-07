package stringSamples;

public class IsPowerOf2 {

//	or another approach is 2 power anything will be in the series of 1,10,100,1000,10000...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 33;
		System.out.println(isPowerOf(num));
	}

	private static int isPowerOf(int num) {
		// TODO Auto-generated method stub
		while(true) {
			if(num == 1)
				return 1;
			
			if(num%2 != 0)
				return 0;
			else {
				num = num/2;
				return 1;
			}
		}
	}

}
