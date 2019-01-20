package arrayCode;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 4, 9, 0, 5, 1, -6, 7 };
		int len = arr.length;
		int temp;

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// print sorted elements
		System.out.println("Ascending Order:");
		for (int a = 0; a < len; a++) {
			System.out.println(arr[a]);
		}
		// print sorted elements
		System.out.println(Arrays.toString(arr));

	}

}
