package stringsCode;

public class GetWordsCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome     to candid java tutorial. Here you start, with automation";

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;

			}
		}
		System.out.println("Number of words in a string = " + count);

	}

}
