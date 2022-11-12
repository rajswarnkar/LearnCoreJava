package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] intArr = {22,12,-12,49,76,12,9};
		System.out.println("Array prior to sorting: "+Arrays.toString(intArr));
		
		for (int lstIndex=intArr.length -1; lstIndex > 0; lstIndex--) {
			
			int largest = 0;

			for (int i = 1; i<=lstIndex;i++) {
				
				if(intArr[i] > intArr[largest]) {
					largest = i;
					
					System.out.println("largest index:"+largest);
				}
			}
			
			swap(intArr,largest, lstIndex);
			System.out.println("Array after each iteration: " +Arrays.toString(intArr));
			
		}
		System.out.println("Array after sorting: "+Arrays.toString(intArr));
	}

	public static void swap(int [] intArr, int i, int j) {
		
		if (intArr[i]==intArr[j]) {return;}
		
		if(intArr[i]>intArr[j]) {
			int temp= intArr[i];
			intArr[i] = intArr[j];
			intArr[j] = temp;
		}
		
	}
}
