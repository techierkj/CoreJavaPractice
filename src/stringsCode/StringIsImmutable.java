package stringsCode;

public class StringIsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Ravi";
		String str2 = "Ravi"; // Note:- str1,str2 both references point to the
								// same value "Ravi" which is created under
								// String Constant Pool(Present in Heap)
		str1 = "Jha";
		System.out.println(str1); // OP- Jha
		System.out.println(str2); // OP- Ravi
		System.out.println(str1.hashCode()); // OP- 74435
		System.out.println(str2.hashCode()); // OP- 2539842

		// String Literal
		String stra = "Sachin";
		stra.concat("Tend"); // this will create new object, as string stra is
								// immutable.
		System.out.println(stra); // op: Sachin

		// String object/constructor
		String a = new String("Sachin");
		a.concat("abcfh"); // this will create new object, as string stra is
							// immutable.
		System.out.println(a); // op: Sachin

	}

}
