package basicCodes;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 12; i++) {
			if(i%4!=0) {
				System.out.print(i+"\t");
			}
			else {
				System.out.print(i+"\t");
				System.out.println("");
			}
		}
	}
}
