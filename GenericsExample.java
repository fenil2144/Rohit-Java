class Test<T>{
	
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
	
}

class TestObject{
	Object obj;
	public TestObject(Object obj) {
		this.obj = obj;
	}
	
	public Object getObject() {
		return this.obj;
	}
	
}

public class GenericsExample {
	
	public static void main(String[] args) {
		Test<Integer> iObj = new Test<Integer>(45);
		System.out.println(iObj.getObject()+10);
		
		Test<String> sObj = new Test<String>("Java");
		System.out.println(sObj.getObject());
		
//		System.out.println(iObj==sObj);
		
//		TestObject testObject = new TestObject(10);
//		System.out.println(testObject.getObject()+10);
//		
//		TestObject testObjectStr = new TestObject("Java");
//		System.out.println(testObjectStr.getObject());
		
	}

}
