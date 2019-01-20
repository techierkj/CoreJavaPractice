package stringsCode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method:1
		StringBuffer str = new StringBuffer("Hello World");
		StringBuffer rev = str.reverse();
		System.out.println(rev);

		// method:2
		String str1 = "Hello World";
		int len = str1.length();

		for (int i = 0; i < len; i++) {
			System.out.print(str1.charAt(len - 1 - i));
		}

	}

}
