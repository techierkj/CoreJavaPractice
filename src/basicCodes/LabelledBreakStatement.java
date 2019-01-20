package basicCodes;

public class LabelledBreakStatement {
	public static void main(String[] args) {

		ravi: for (int x = 1; x < 6; x++) {

			for (int y = 1; y < 6; y++) {
				if (x == 4) {
					break ravi; // it will break outer loop
				}
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
