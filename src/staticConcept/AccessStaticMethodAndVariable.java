package staticConcept;

public class AccessStaticMethodAndVariable {
	//Class level static variable/global variable
	static int varStatic;
	public static void main(String[] args) {
		// static int a=0; -> Static variables not permitted in any method

		nonMain(); // Access Static Method directly by name, if in same class
		// AccessStaticMethod.main(args); //will generate
		// java.lang.StackOverflowError

		AccessStaticMethodAndVariable.nonMain(); // Access static method by using clasname

		// Access Static method using object
		AccessStaticMethodAndVariable asm = new AccessStaticMethodAndVariable();
		// Warning will be displayed , as it's not good practice
		asm.nonMain(); // Warning
		asm.nonMain2(); // Warning

	}

	public static void nonMain() {
		System.out.println("Static Non Method");
		nonMain2();
	}

	public static void nonMain2() {
		System.out.println("Static Non Method2");
	}

}
