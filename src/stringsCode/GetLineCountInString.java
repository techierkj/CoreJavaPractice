package stringsCode;

public class GetLineCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Line1\nLine2\nLine3\nLine4\nLine5";
		System.out.println(str);
		int lineCount=str.split("[\n]").length;
		System.out.println(lineCount);

	}

}
