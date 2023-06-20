
public class MethodOverloading {
	
	public int sum(int a, int b) {
		System.out.println("sum1");
		return (a+b);
	}
	
//	public int sum(int a, int b, int c) {
//		System.out.println("sum2");
//		return (a+b+c);
//	}
	
	public Double sum(double a, double b, double c) {
		System.out.println("sum3");
		return (a+b+c);
	}

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		System.out.println(methodOverloading.sum(10, 20));
		System.out.println(methodOverloading.sum(10, 20,30));
		System.out.println(methodOverloading.sum(10.1, 20.2,30.5));
	}
	

	public static void main(int[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		System.out.println(methodOverloading.sum(10, 20));
		System.out.println(methodOverloading.sum(10, 20,30));
		System.out.println(methodOverloading.sum(10.1, 20.2,30.5));

	}

}
