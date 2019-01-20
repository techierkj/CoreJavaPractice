package stringsCode;

public class changeStringFromatUpperCaseAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q:- elephant => ElEpHaNt
		String str = new String("elephant");
		String rev = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (i % 2 == 0) {
				ch = Character.toUpperCase(ch);
			} else {
				ch =Character.toLowerCase(ch);
			}
			rev+=ch;
		}
		System.out.println("Final Output String:-"+rev);
	}

}
