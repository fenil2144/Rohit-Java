
public class ExceptionDemo {
	
	public static void main(String[] args) {
		computeDivison(10);
	}
	
	public static int computeDivison(int number) {
		try {
			int x = 100/number;
			System.out.println("X = "+x);

		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException - "+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Parent Exception Class "+e.getMessage());
		}finally {
			System.out.println("Finally Block!");
		}
		System.out.println("Rest of the Code");
		
		return number;
	}

}
