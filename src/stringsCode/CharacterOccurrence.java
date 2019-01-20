package stringsCode;

import java.util.LinkedHashMap;

public class CharacterOccurrence {

	public static void main(String[] args) {

		LinkedHashMap<Character, Integer> h = new LinkedHashMap<>();

		String s = "Hello World";

		for (char ch : s.toCharArray()) {

			if ((h.containsKey(ch))) {

				h.put(ch, h.get(ch) + 1);

			} else {

				h.put(ch, 1);

			}
		}

		for (char key : h.keySet()) {

			System.out.println(key + "-" + h.get(key));

		}
	}
}
