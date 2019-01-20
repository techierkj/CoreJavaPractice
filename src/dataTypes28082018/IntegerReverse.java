package dataTypes28082018;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1231344;
		int rev = 0;
		while (num / 10 != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse Number" + rev);
	}
}
