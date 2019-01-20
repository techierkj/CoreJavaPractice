package PatternPrint;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * BAAAA 
		 * BBAAA 
		 * BBBAA 
		 * BBBBA
		 */
		
		int row=5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("B");

			}
			for (int k = row-1; k >= i; k--) {
				System.out.print("A");

			}
			System.out.println();
		}

	}

}
