package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;

		try {
			int b = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception thrown  :" + e);
		}

		int arr[] = { 1, 2, 3, 4 };

		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		}
	}

}
