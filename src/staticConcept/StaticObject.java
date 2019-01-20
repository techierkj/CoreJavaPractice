package staticConcept;

public class StaticObject {

	static int var1 = 10;
	int var2 = 20;
	static StaticObject obj1 = new StaticObject();
	//	StaticObject obj2 = new StaticObject(); // it will give runtime error- stack overflow

	public static void main(String[] args) {
		// static object calling static method, so warning
		obj1.method1();
		// static method calling non-static method 
		obj1.method2();
		// static method called using non-static class object -not allowed
	//	obj2.method1();
		// non-static method called using  non-static class object -not allowed
	//	obj2.method1();
		// access static class variable directly
		System.out.println(var1);
		// access non static class variable directly- it will give error
	//	System.out.println(var2); // Cannot make a static reference to the non-static field var2
		StaticObject obj3 = new StaticObject();
		obj3.method1();
		obj3.method2();
	//	obj3.var1; // will give compilation error
	//	obj3.var2;
	}

	public static void method1() {
		System.out.println("Static Method");
	}

	public void method2() {
		System.out.println("Static Method2");
	}
}
