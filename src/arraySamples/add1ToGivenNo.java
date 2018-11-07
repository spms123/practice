package arraySamples;

//Given a non-negative number represented as an array of digits, 
//add 1 to the number ( increment the number represented by the digits ). 
//The digits are stored such that the most significant digit is first element of array.

public class add1ToGivenNo {

	public static void main(String[] args) {
		int[] arr = {9,9,9};
		
		int[] arr2 = addOneToNo(arr);
		for (int i : arr2) {
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

	private static int[] addOneToNo(int[] arr) {
		
		int carry = 0;
		int temp = arr[arr.length-1]+1;
		if(temp < 9) {
			arr[arr.length-1] = temp;
		}else {
			arr[arr.length-1] = temp%10; 
			carry = 1;
			
			for(int i = arr.length-2;i>=0;i--) {
				temp = arr[i] + carry;				
				arr[i] = temp%10;				
				carry = temp /10;
			}
			
			if(carry == 1) {
				arr = new int[arr.length + 1];
		        arr[0] = 1;
			}
				
			
		}
		return arr;
		// TODO Auto-generated method stub
		
	}

}
