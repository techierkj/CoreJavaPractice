package Collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArrayUsingHashSet {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 1, 5, 6, 7, 8, 5 };
		Set<Integer> num = new HashSet<Integer>();

		for (int arrs : arr) {

			Boolean check = num.add(arrs);

			if (check == true) {

			} else {
				System.out.println(arrs + " is duplicate");
			}

		}
	}
}
