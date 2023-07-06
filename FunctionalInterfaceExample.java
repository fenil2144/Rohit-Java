interface FunctionalInterface{
	public int getSum(int a, int b);
//	public int getSum(double a, double b);
}

public class FunctionalInterfaceExample {
	
	public static void main(String[] args) {
		
		//Annonymous Class
		FunctionalInterface annonymousClassRef = new FunctionalInterface() {
			
			@Override
			public int getSum(int a, int b) {
				return a+b;
			}

		};
		System.out.println(annonymousClassRef.getSum(10, 20));
		
		//Lambda Expression
		//(Arguments List) -> {Body}
		FunctionalInterface lambdaRef = (a,b) -> {return a+b;};
		System.out.println(lambdaRef.getSum(20, 20));
	}

}

class FunctionalInterfaceImplementingClass implements FunctionalInterface{

	@Override
	public int getSum(int a, int b) {
		return a+b;
	}
	
}

class FunctionalInterfaceImplementingClass2 implements FunctionalInterface{

	@Override
	public int getSum(int a, int b) {
		return a+b+1;
	}
	
}
