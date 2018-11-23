package sortingAlgos;
//select first smallest element and place it in 1st index, 2nd smallest in 2nd index ...

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,7,2,1,8,4,5};
		SelectionSorting(arr);
	}

	private static void SelectionSorting(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=arr.length-1;i++) {
			int min_ele = i;		
			
			for(int j = i+1 ;j<= arr.length-1;j++) {
				if(arr[j]<arr[min_ele]) {
					min_ele = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_ele];
			arr[min_ele] = temp;
		}
		
		for(int z = 0;z<=arr.length-1;z++) {
			System.out.print(arr[z]);
		}
	}

}
