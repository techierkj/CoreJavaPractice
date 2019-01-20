package stringsCode;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
//		StringBuffer str= new StringBuffer("Anas Ravi");
//		StringBuffer rev=str.reverse();
//		System.out.println(rev);
		
		String str1= "Anas Siddiquee";
		int len=str1.length();
		String rev1="";
		for(int i=len-1; i>=0 ;i--) {

			rev1=rev1+str1.charAt(i);
		}
		System.out.println(rev1);
	}

}
