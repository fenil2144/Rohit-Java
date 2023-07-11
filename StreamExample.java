import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
			
		int[] integers = {1,2,3,4,5};
		
		//Primitive Stream
		IntStream intStream = Arrays.stream(integers);
		System.out.println("IntStream Sum Result: "+intStream.sum());
		
		
		List<String> list = Arrays.asList("J","A","V","A","B","A","C","K","E","N","D");
		//Parallel Stream
		
		list.stream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEach(System.out::print);
		
		//JAVABACKEND JAVABACKEND
		//EJADKAABNVC CKAEAJDVNAB
		

	}

}
