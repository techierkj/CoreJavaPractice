package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String args[]) {
		HashSet<String> list = new HashSet<String>();// Creating array list
		HashSet<String> list1 = new HashSet<String>();// Creating array list
		list.add("Ravi");// Adding object in array list
		list.add("Vijay");
		list.add("Manoj");
		list.add("Ajay");
		//list.addFirst("Avi"); // Unavailable in HashSet

		list1.add("1");
		list1.add("10");
		list1.add("100");
		//list1.addLast("Deba"); // Unavailable in HashSet

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		// Display elements using for loop
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println(list);

		// Display elements using size()  -Not possible in HashSet (can't access elements by index)
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		// Insertion at Nth position (Not possible in HashSet (can't access elements by index))
//		list.add(2, "Akshay");
//		System.out.println(list);

		// Replace 2nd Element by "Anas" - Not possible in HashSet (can't access elements by index)
//		list.set(1, "Anas");
//		System.out.println(list);
		
//		// Get Second element - Not available in HashSet
//		System.out.println("1st Position value is:- "+list.get(1));
//		System.out.println(list.getFirst());  // Unavailable in ArrayList
//		System.out.println(list.getLast());  // Unavailable in ArrayList

		// Add similar type collection in the list
		list.addAll(list1);
		System.out.println(list);

		// delete HashSet's Elements
		list.clear();
		System.out.println(list);

		// RemoveAll VS RetainAll
		HashSet<String> listA = new HashSet<String>();// Creating array list
		HashSet<String> listB = new HashSet<String>();// Creating array list
		HashSet<String> listC = new HashSet<String>();// Creating array list
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
		HashSet<Object> listE = new HashSet<>();
		Boolean A = listE.isEmpty();
		System.out.println(A);
		Boolean B = listE.add("200");
		System.out.println(B);

		// returns the hash code number for collection.memory address of the object
		System.out.println(listE.hashCode());

		// Matches two collections
		HashSet<Object> listF = new HashSet<>();
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

		// indexOf and lastIndexOf in Linked List - It's unavailable in HashSet
		System.out.println("Additional Checks...");
		HashSet<String> llist=new HashSet<String>();
		llist.add("123");
		llist.add("12");
		llist.add("A");
		llist.add("BC");
		llist.add("1");
		llist.add("123");
//		System.out.println(llist.get(2));
//		int firstOccurence=llist.indexOf("A");
//		int lastOccurence=llist.lastIndexOf("123");
//		System.out.println(firstOccurence);
//		System.out.println(lastOccurence);
		Iterator<String> itr1 = llist.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}
