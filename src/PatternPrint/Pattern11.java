package PatternPrint;

public class Pattern11 {

	public static void main(String[] args) {
		/*
		1
		01
		101
		0101
		10101
		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				int k=i+j;
				if(k%2==0){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
