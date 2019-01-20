package staticConcept;

public class OverrideStaticMethodChild1 extends OverrideStaticMethodParent{
	public static void eat(){
		System.out.println("Child1 Method");
	}
	public static void main(String args[]){
		OverrideStaticMethodParent.eat();	//Parent Method
		eat();								//Child1 Method
		OverrideStaticMethodChild1.eat();	//Child1 Method
		
		
//		Syntactically , we can write same static method in child class ,without any exception.
//		Since static method is common for all the objects, if we try to override then it will not be common. 
//		So it's recommended to update parent static method only if required.
	}
}


