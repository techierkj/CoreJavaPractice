package stringsCode;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbf = new StringBuffer("Ajay");
		sbf.append("Kumar");
		System.out.println(sbf); // AjayKumar
		
		
		StringBuilder sbl = new StringBuilder("Anil");
		sbl.append("Kumar");
		System.out.println(sbl); // AnilKumar

		/*
		 * StringBuffer methods are synchronized(eans two threads can't call the
		 * methods of StringBuffer simultaneously.) while StringBuilder are not.
		 * StringBuilder faster than StringBuffer. StringBuffer is less
		 * efficient than StringBuilder.
		 */
	}

}
