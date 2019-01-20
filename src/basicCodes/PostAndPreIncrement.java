package basicCodes;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;int b=10;
		int c=(b++) + (a++);
		int d=(++b) + (++a); // b=12, a=7
		int e=(++b) + (a++); // b=13, a=7
		int f=(b++) + (++a); // b=13, a=9
		System.out.println(a); //9
		System.out.println(b); //14
		System.out.println(c); //15
		System.out.println(d); //19
		System.out.println(e); //20
		System.out.println(f); //22
	}

}
