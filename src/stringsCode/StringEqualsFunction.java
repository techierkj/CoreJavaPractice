package stringsCode;

public class StringEqualsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pooja";
		String s1 = new String("pooja");
		System.out.println(s == s1); // false
		System.out.println(s.equals(s1)); // true
	}
}
