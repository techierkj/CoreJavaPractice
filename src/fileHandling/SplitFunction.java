package fileHandling;


public class SplitFunction {

	public static void main(String[] args) {
			
		String str="MY NAME IS KHAN";
		String[] str1=str.split(" ");
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);
		System.out.println(str1[3]);
		
		String st="    MY NAME IS KHAN             ";
		System.out.println(st);
		st.trim();
		System.out.println(st);
		String st1=st.trim();
		System.out.println(st1);
		
	}

}
