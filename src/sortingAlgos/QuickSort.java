package sortingAlgos;

public class QuickSort {
	private int[] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};	
		QuickSort quickSort = new QuickSort();
		quickSort.sorting(input);
	}	

	private void sorting(int[] input) {
		// TODO Auto-generated method stub
		this.arr = input;
		quickSorting(0, input.length-1);
		
		for(int i:this.arr){
            System.out.print(i);
            System.out.print(" ");
        }
	}

	private void quickSorting(int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[low + (high -  low)/2];
		int i = low;
		int j = high;
	
		while(i<= j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}			
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++; j--;
			}
						
		}
		
		if(low < j)
			quickSorting(low, j);
		if(i < high)
			quickSorting(i, high);
	}

}
