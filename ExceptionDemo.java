import java.sql.SQLException;

public class ExceptionDemo {
	
	public static void main(String[] args) throws SQLException {
		computeDivison(10);
	}
	
	public static int computeDivison(int number) throws SQLException{
		try {
			int x = 100/number;
			System.out.println("X = "+x);
			
			if(x==10)
				throw new UserNotFoundException("User Not Found!");
				
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException - "+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			System.out.println("Finally Block!");
		}
		System.out.println("Rest of the Code");
		
		return number;
	}

}
