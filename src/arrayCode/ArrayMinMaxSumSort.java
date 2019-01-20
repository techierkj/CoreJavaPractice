package arrayCode;

import java.util.Arrays;

public class ArrayMinMaxSumSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 4, 9, 0, 5, 10, -6, 7 };
		int len = arr.length;
		int arrSum = 0;
		// Print Array
		//System.out.println("Given array: " + arr);  will give random no
		System.out.println("Actual Array"+Arrays.toString(arr));
		// Sort Array
		Arrays.sort(arr);
		System.out.println("Sorted Array"+Arrays.toString(arr));
		// Min Value
		System.out.println("Min value:" + arr[0]);
		// Max Value
		System.out.println("Max value:" + arr[len - 1]);
		// Array Sum
		for (int i = 0; i < len; i++) {
			arrSum += arr[i];
		}
		System.out.println("Sum is: " + arrSum);
	}

}
