package stringsCode;

public class RegularExpressionExample2 {

	public static void main(String[] args) {

		// Set definition, can match a or b or c followed by either v or y.
		String a = "av br cy sss azz ay by ";
		a = a.replaceAll("[abc][vy]", "X");
		System.out.println(a); // X br X sss azz X X

		// Set definition, can match the letter a or b or c.
		String b = "av br cy sss azz ay by ";
		b = b.replaceAll("[abc]", "X");
		System.out.println(b); // Xv Xr Xy sss Xzz Xy Xy

		// pattern matches any character except a or b or c.
		String c = "av br cy sss azz ay by ";
		c = c.replaceAll("[^abc]", "X");
		System.out.println(c); // aXXbXXcXXXXXXaXXXaXXbXX

		// Finds X or Z.
		String d = "XZabcXDZhsZX";
		d = d.replaceAll("X|Z", "Y");
		System.out.println(d); // YYabcYDYhsYY

		// Finds X directly followed by Z.
		String e = "XZabcXDZhsZXXZ";
		e = e.replaceAll("XZ", "Y");
		System.out.println(e); // YabcXDZhsZXY

	}
}
