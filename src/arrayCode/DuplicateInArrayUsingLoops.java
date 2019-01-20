package arrayCode;

public class DuplicateInArrayUsingLoops {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 8, 0, 1, 5, 6, 7, 8, 5 };
		int len = arr.length;
		int count = 0;

		for (int a = 0; a < len - 1; a++) {

			for (int b = a + 1; b < len; b++) {
				if (arr[a] == arr[b]) {
					count += 1;
				}
			}
			if (count == 1) {
				System.out.println(arr[a] + " :is duplicate");
				count = 0;
			} else
				count = 0;
		}
	}
}
