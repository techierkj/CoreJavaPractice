package arrayCode;

import java.util.ArrayList;

public class ArrayListPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RAW ARRAY EXAMPLE
		ArrayList al = new ArrayList();
		al.add(1.2345);
		al.add("Ravi Jha");
		al.add('M');
		al.add(12);

		System.out.println("Array Length:- " + al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// GENERIC ARRAY EXAMPLE
		ArrayList<String> alStr = new ArrayList<String>(5);
		ArrayList<Integer> alInt = new ArrayList<Integer>(4);
		ArrayList<Double> alDouble = new ArrayList<Double>(5);
		ArrayList<Character> alChar = new ArrayList<Character>(5);
		// alStr.add(12.33); - Compilation error
		alStr.add("Ravi");
		// alInt.add("Raja"); - Compilation error
		alDouble.add(13.432);
		alInt.add((int) 11.43);
		alChar.add('D');
		for (int a = 0; a < alStr.size(); a++) {
			System.out.println(alStr.get(a));
		}

		// Object Array Type
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add("Aman");
		obj.add('X');
		obj.add(12.54);
		obj.add(11);
		for (int x = 0; x < obj.size(); x++) {
			System.out.println(obj.get(x));
		}
	}

}
