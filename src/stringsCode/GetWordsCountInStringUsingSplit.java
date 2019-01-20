package stringsCode;

public class GetWordsCountInStringUsingSplit {

	public static void main(String[] args) {
		String sampleSentence = "welcome  $##@   to candid java tutorial. Here you start, with automation";
		// First replace all non-words character with space
		sampleSentence=sampleSentence.replaceAll("\\W", " ");
		// Now split words
		String[] words = sampleSentence.split("\\s+");
		
		int itemCount = words.length;
		System.out.println("The number of words is: " + itemCount);
		for (int i = 0; i < itemCount; i++) {
			String word = words[i];
			System.out.println(word);
		}

	}

}
