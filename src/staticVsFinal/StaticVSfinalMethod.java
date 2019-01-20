package staticVsFinal;

public class StaticVSfinalMethod {

	public static void main(String[] args) {
		System.out.println("Main method");
	}

	public static void staticMethod() {
		System.out.println("static method");
	}

	public final void finalMethod() {
		System.out.println("final method");
	}
}

// Static method can be overridden where as final class not allowed
class InnerClass extends StaticVSfinalMethod {
	public static void staticMethod() {
		System.out.println("Override static method1");
	}

//	public final void finalMethod() { // Cannot override the final method from
//										// StaticVSfinalMethod
//		System.out.println("Override Final Method");
//	}
}
