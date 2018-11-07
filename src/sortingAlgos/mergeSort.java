package sortingAlgos;

public class mergeSort {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        mergeSort mms = new mergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
        
        

    }
 
    private void mergeParts(int low, int mid, int high) {
		// TODO Auto-generated method stub	
		
		for (int i = low; i <= high; i++) {
			tempMergArr[i] = array[i];
        }
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i<=mid && j<=high) {
			if(tempMergArr[i]<tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			}else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			array[k]= tempMergArr[i];
			i++;
			k++;
		}
		
		while(j<=high) {
			array[k]= tempMergArr[j];
			j++;
			k++;
		}
		
	}
    
}