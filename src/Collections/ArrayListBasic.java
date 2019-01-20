package CollectionRavi;

import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		
		// default size-0
		System.out.println("default arraylist size: "+list.size());

		// insertion- mehod1
		list.add("Ravi");
		list.add("Raja");
		list.add("Ankush");
		list.add("Pawan");
		System.out.println("arraylist size of list: "+list.size()); //4
		
		// replace "Raja" by "Raaja"
		list.set(1, "Raaja");
		
		// retrieve data
		String str=list.get(1);
		System.out.println("Data present at index 1: "+str);
		
		// remove "Ravi"
		list.remove(0);
		
		// clear all content of Arraylist
		ArrayList<String> list1=new ArrayList<>();
		list1.add("I am");
		list1.addAll(list);
		list1.clear();
		System.out.println("Size of arraylist after using clear function: "+list1.size());
	}

}
