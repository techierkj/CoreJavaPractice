package staticConcept;

public class StaticBlock {
	
	static int var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static Main method"); //Executed Second
	}
	
	static{
		var=4; // Static variable are initialized in static block
		System.out.println("welcome to static block"); // Executed first
	}
	
	public static void staticMethod(){
		System.out.println("Static Non-Main Method"); // Not executed
	}

}
