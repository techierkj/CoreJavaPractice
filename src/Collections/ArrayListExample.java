package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating array list
		ArrayList<String> list1 = new ArrayList<>();// Creating array list
		list.add("Ravi");// Adding object in array list
		list.add("Vijay");
		list.add("Manoj");
		list.add("Ajay");

		list1.add("1");
		list1.add("10");
		list1.add("100");

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Display elements using for loop
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println(list);

		// Display elements using size()
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Insertion at Nth position
		list.add(2, "Akshay");
		System.out.println(list);

		// Replace 2nd Element by "Anas"
		list.set(1, "Anas");
		System.out.println(list);

		// Get Second element
		System.out.println("1st Position value is:- " + list.get(1));

		// Add similar type collection in the list
		list.addAll(list1);
		System.out.println(list);

		// delete Arraylist's Elements
		list.clear();
		System.out.println(list);

		// RemoveAll vs RetailAll
		ArrayList<String> listA = new ArrayList<String>();// Creating array list
		ArrayList<String> listB = new ArrayList<String>();// Creating array list
		ArrayList<String> listC = new ArrayList<String>();// Creating array list
		listA.add("1");
		listA.add("2");
		listA.add("3");
		listA.add("4");

		listB.add("5");
		listB.add("6");
		listB.add("7");
		listB.add("8");

		listC.add("3");
		listC.add("4");
		listC.add("5");
		listC.add("6");

		listA.removeAll(listC);
		System.out.println(listA);
		listB.retainAll(listC);
		System.out.println(listB);

		// Search and element
		System.out.println(listC.contains("5")); // It will return True

		// Search any Collection
		System.out.println(listB.containsAll(listC));

		// Check if any collection is Empty
		ArrayList<Object> listE = new ArrayList<>();
		Boolean A = listE.isEmpty();
		System.out.println(A);
		Boolean B = listE.add("200");
		System.out.println(B);

		// returns the hash code number for collection.memory address of the
		// object
		System.out.println(listE.hashCode());

		// Matches two collections
		ArrayList<Object> listF = new ArrayList<>();
		listF.add("200");
		Boolean check = listE.equals(listF);
		System.out.println(listE);
		System.out.println(listF);
		System.out.println(check);

		// Convert Collection into String
		System.out.println(listA.toString());

		// Convert Collection into Array
		String[] s1 = listA.toArray(new String[0]);
		for (int i = 0; i < s1.length; i++) {
			String contents = s1[i];
			System.out.print(contents);
		}

	}
}
