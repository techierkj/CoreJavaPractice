package basicCodes;

public class SwitchCase {

	public static void main(String[] args) {
		int a = 100;
		int b = 5;
		switch (2) { // Expression must be constant
		case 1:
			System.out.println(a + b);
		case 2:
			System.out.println(a - b);
		case 3:
			System.out.println(a * b);
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
