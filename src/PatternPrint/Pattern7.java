
package PatternPrint;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12

		for (int a = 1; a < 13; a++) {
			if (a % 4 == 0) {
				System.out.print(a + " ");
				System.out.println();
			} else
				System.out.print(a + " ");
		}
	}
}
