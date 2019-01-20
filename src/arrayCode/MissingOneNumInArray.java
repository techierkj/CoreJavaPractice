package arrayCode;

public class MissingOneNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 4, 5, 6, 7 };
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			a = a + arr[i];
		}
		System.out.println(a);
		// sum for first nth number
		for (int j = 0; j <= 7; j++) {
			b += j;
		}
		int missingnum = b - a;
		System.out.println(missingnum);
	}
}
