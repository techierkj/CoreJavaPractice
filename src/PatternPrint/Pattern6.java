package PatternPrint;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
		 */
		int row=7;
		for (int i = 1; i <= row; i++) {
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = row-1; i >=1; i--) {
			for (int k =1; k <i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
