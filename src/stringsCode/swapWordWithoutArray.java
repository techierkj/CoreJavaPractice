package stringsCode;

public class swapWordWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ravi Kumar Jha";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {
				System.out.println(i + "th occurence");
			}
		}
	}
}
