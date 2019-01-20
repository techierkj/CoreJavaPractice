package staticVsFinal;

public class StaticVSFinalVariable {
		
		// Difference-1 :- Final class variable need to be initialized
		static int c;
	//	final int d; //error-The blank final field d may not have been initialized
		final int e=10;
		static int f=10;
	public static void main(String[] args) {
		//  Difference-2 :- can't declare a static variable inside a method, static
	//	static int a; // error- illegal modifier
		final int b;

		// Difference-3 :- can't reassign final variable value
		StaticVSFinalVariable obj=new StaticVSFinalVariable();
		obj.f=11;
	//	obj.e=11; // error -The final field StaticVSFinal.e cannot be assigned
		
		// Difference-4 :- Final variable (non-static) can be assessed using object only
		System.out.println(f);
		System.out.println(obj.f);
	//	System.out.println(e); // error- Cannot make a static reference to the non-static field e
		System.out.println(obj.e); 
	}

}
