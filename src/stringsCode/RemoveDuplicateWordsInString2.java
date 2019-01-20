package stringsCode;

public class RemoveDuplicateWordsInString2 {

	public static void main(String[] args) {
		String input = "Welcome to Java Session Java Session Session Java"; // Input
		String[] words = input.split(" "); // Split the word from String
		String output = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					words[j] = "";
				}
			}
		}
		for (int k = 0; k < words.length; k++) // Displaying the String without
												// duplicate words
		{
			System.out.println(words[k]);
			output=output+words[k]+" ";
		}
		System.out.println(output);
	}
}
