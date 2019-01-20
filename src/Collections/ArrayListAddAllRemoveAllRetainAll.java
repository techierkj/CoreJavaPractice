package CollectionRavi;

import java.util.ArrayList;

public class ArrayListAddAllRemoveAllRetainAll {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<>();// Creating array list A
		ArrayList<Integer> listB = new ArrayList<>();// Creating array list B
		ArrayList<Integer> listC = new ArrayList<>();// Creating array list C
		ArrayList<String> listD = new ArrayList<>();// Creating array list D
		listA.add("A-1");
		listA.add("A-2");
		listA.add("A-3");
		listB.add(1);
		listB.add(2);
		listB.add(3);
		listD.add("D-1");
		listD.add("D-2");
		
		System.out.println("ListD content:- "+listD);
		//Add content of ListA to ListD
		listD.addAll(listA);
		System.out.println("ListD Content after adding collection of ListA: "+listD);
		listD.add("D-3");
		listD.add("D-4");
		System.out.println("ListD Content after adding ADDITIONAL values: "+listD);
		
		//Add content of ListA to ListC
		//listC.addAll(listA); // It will give compilation error, due to type mismatch
		//listD.addAll(listB); // Cannot add integer collection to string
		
		System.out.println("Values to be reomved:-"+listA);
		//RemoveAll
		listD.removeAll(listA);
		System.out.println("ListD Content after removeall: "+listD);
		
	}
}
