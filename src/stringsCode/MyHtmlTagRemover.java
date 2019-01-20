package stringsCode;

public class MyHtmlTagRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "<B>I don't want this to be bold<\\B>";
		System.out.println(text);
		text = text.replaceAll("\\<.*?\\>", "");
		System.out.println(text);

		// *? =>This makes the regular expression stop at the first match.
	}
}
