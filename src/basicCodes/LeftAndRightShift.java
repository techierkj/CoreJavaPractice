package basicCodes;

public class LeftAndRightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; // 1 0 1 0
		int b=15; // 1 1 1 1
		int c= a << 2; // add two more zeroes - 101000 =40
		int d= b >> 2; // remove last 2 bits- 11=3
		System.out.println(c);
		System.out.println(d);
	}

}
