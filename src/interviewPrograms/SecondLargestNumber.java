package interviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public SecondLargestNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,11,81,69,1,32,65,41};
		Integer [] arr1 = {10,11,81,69,1,32,65,41};
		int nthlargeNum = 3;
		int num1 = largestNumUsingArrays(arr, nthlargeNum);
		int num2 = largestNumUsingCollections(arr1, nthlargeNum);

		System.out.println(nthlargeNum+"th largest number is: "+num1);
		System.out.println(nthlargeNum+"th largest number is: "+num2);
	}
	
	public static int largestNumUsingArrays(int [] arr, int largestNum) {
		Arrays.sort(arr);
		int result = 0;

		for (int n=arr.length-1; n>=0; n--) {
			
			if (largestNum == 1) {
				result= arr[n];
				break;
			}
			else if(arr[n-largestNum+1] < arr[n]) {
				result= arr[n-largestNum+1];
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		return result;

	}
	
	public static int largestNumUsingCollections(Integer [] arr, int largestNum) {
		int result = 0;
		
		if (largestNum==1) {
			return arr[arr.length-1];
		}
		else {
			List<Integer> list = Arrays.asList(arr);
			Collections.sort(list);
			result = list.get(list.size()-largestNum);
		}
		System.out.println(Arrays.toString(arr));
		return result;
	}
}
