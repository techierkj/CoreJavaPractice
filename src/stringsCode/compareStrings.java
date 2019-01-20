package stringsCode;

public class compareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Ravi";
		String b = "Ravi";
		String c = new String("Ravi");
		if (a == b) {
			System.out.println("Strings are matched by == Sign");
		}

		if (a.equals(b)) {
			System.out.println("STrings are matched by equals");
		}
		if (a == c) {// This will be skipped as both objects point to the
						// different memory location
			System.out.println("Strings are matched by == Sign");
		}

		if (a.equals(c)) { // will get executed as it evaluates to the
							// comparison of values in the objects
			System.out.println("STrings are matched by equals");
		}
	}

}
