package stringsCode;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dup = "Welcome to Java Session Session Session";
		String arr[] = dup.split(" ");
		int count = 1;

		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x].equals(arr[y])) {
					count = count + 1;
					arr[y] = "";
				}
			}
			if (arr[x] != "")
			System.out.println(arr[x] + "--" + count); // Printing the word along with count
			count = 1;
		}
	}
}
