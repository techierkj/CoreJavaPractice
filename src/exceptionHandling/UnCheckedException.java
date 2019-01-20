package exceptionHandling;

public class UnCheckedException {

	public static void main(String args[]) {
		//An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions
		 int num[] = {1, 2, 3, 4};
	      System.out.println(num[5]); // java.lang.ArrayIndexOutOfBoundsException
	      
			int a=10;
			int b=9/0;
			System.out.println(b); // java.lang.ArithmeticException: / by zero
	}
}