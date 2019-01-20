package PatternPrint;

public class Pattern10 {

	public static void main(String[] args) {
		/*
		1 2 3 4
		2 3 4 1
		3 4 1 2
		4 1 2 3
		*/
		for (int i = 1; i < 5; i++) {
			for (int j = i; j < i + 4; j++) {
				if (j > 4) {
					int k = j - 4;
					System.out.print(k + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
