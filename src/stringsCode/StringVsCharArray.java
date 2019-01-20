package stringsCode;

public class StringVsCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String array
		// stored in String pool 
		// String array is immutable
		// Size/Length of Array is fixed (not possible to append)
		String str1=new String("Ravi Kumar");
		String str2="Ajay Kumar";
		
		// Char array
		// ch1 holds copy of String's underlying array and stored in heap space
		// Char array is mutable
		// Size/Length of Array is fixed (not possible to append)
		char ch1[]="RAVI KUMAR".toCharArray(); 
		char ch2[]={'A','J','A','Y',' ','K','U','M','A','R'};
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(ch1);
		System.out.println(ch2);

	}

}
