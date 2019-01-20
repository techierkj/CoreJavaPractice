package basicCodes;

public class BitwiseAndOrOperator {

	public static void main(String[] args) {

		int a=10; // 1 0 1 0
		int b=15; // 1 1 1 1
		int c= a & b; // 1 0 1 0 =10 [1 & 1=1, 1 & 0=0]
		int d= a | b; // 1 1 1 1 =15 [ 1 | 1=1, 1 | 0 =1]
		System.out.println(c);
		System.out.println(d);
	}
}
