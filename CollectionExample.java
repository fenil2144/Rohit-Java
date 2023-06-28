import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		System.out.println(integerList);
		
		integerList.remove(0);
		System.out.println(integerList);
		
		System.out.println(integerList.get(0));
		
		integerList.set(0, 1);
		System.out.println(integerList);
		
		Vector<Integer> integerVector = new Vector<Integer>();
		
		Stack<Integer> integerStack = new Stack<>();
		

	}

}
