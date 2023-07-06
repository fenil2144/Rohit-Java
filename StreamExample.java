import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		System.out.println(
				numbers.stream().filter(t -> {return t%2==0;})
				.map(x -> {return x*x;}).collect(Collectors.toList()));
		
		 System.out.println(numbers);
		 
		 List<String> names = Arrays.asList("Java","Inheritance","Polymorphism","Abstraction");
		 System.out.println( names.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList()));
		 
		 System.out.println( names.stream().sorted().collect(Collectors.toList()));
		 
			System.out.println(
					numbers.stream().filter(t -> {return t%2==0;})
					.reduce(0,(ans,i)  -> ans+i));

	}

}
