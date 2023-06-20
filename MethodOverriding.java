class Parent{
	protected void method1() {
		System.out.println("From Parent Class");
	}
	
	int a = 5;
}

class Child extends Parent{
	
	public void method1() {
		super.method1();
		System.out.println("From Child Class");
	}
	
	int a = 10;
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.method1();
		System.out.println(parent.a);
		
		Child child = new Child();
		child.method1();
		System.out.println(child.a);
		
		Parent parentRef = new Child();
		parentRef.method1();
		System.out.println(parentRef.a);
		
//		Child childRef = new Parent();


	}

}
