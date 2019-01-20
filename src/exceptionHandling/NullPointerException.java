package exceptionHandling;

public class NullPointerException {
	public int x = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerException t = initT();
		int i = t.x;
	}
	private static NullPointerException initT() {
		return null;
	}

}
