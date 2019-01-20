package CollectionRavi;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDataTraverse {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Index 0");
		list.add("Index 2");
		list.add("Index 3");
		list.add("Index 4");

		// Print arraylist content
		System.out.println(list);

		// Method 1 (Using Iterator Interface)
		System.out.println("ArrayList content using Iterator:--");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Method 2 (Using Index value- for loop)
		System.out.println("ArrayList content using size:--");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Method 3 (Using Index value- forEach loop)
		System.out.println("ArrayList content using size:--");
		for (String str : list) {
			System.out.println(str);
		}

	}

}
