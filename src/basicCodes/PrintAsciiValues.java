package basicCodes;

public class PrintAsciiValues {
	public static void main(String[] args) {
		for(int i=0;i<128;i++){
			System.out.printf("%d : %c \n",i,i);
		}
	}
}
