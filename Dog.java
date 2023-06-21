public class Dog{
	
	//Identity
	private String name;
	
	//State
	private String breed;
	String color;
	static int country=20;
	
	private void bark() {
		System.out.println("I am barking");
		final int a = 10;
//		a = 30; -- Not Allowed
		final int b;
		b = 20;
//		b=30; 
	}
	
	public static void walk() {
		System.out.println("I am Walking!");
	}
	
	static{
		country=0;
	}
	
	
	//Default Constructor
	public Dog() {
	}
	
	//Parameterized Constructor
	public Dog(String name1) {
		this();
		this.name = name1;
	}
	
	public Dog(String name1,String breed) {
		this(name1);
		this.breed = breed;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Pet-"+name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println(dog);
		
		dog.name = "Kay";
		dog.breed = "Labra";
		dog.color = "Grey";
		dog.bark();
		dog.
		
//		bark();
		walk();
		
		Dog dogWithNameObj = new Dog("Max","Labra");
		System.out.println(dogWithNameObj.name+" "+dogWithNameObj.breed);

		
//		System.out.println("dog's Name: "+dog.name+ " "+dog.breed+ " "+dog.a);
//		dog.a=30;
		
		Dog dog2 = new Dog();
		dog2.name="tom";
		dog2.breed="German";
//		System.out.println(dog2.a);
//		System.out.println(Dog.a);
		
		int marks = 65;
		char grade;
		if(marks>=75) {
			System.out.println("First Class");
			grade = 'A';
		}
		else if(marks>60 && marks<75) {
			System.out.println("Second Class");
			grade = 'B';
		}
		else {
			grade = 'C';
			System.out.println("Third Class");

		}
		
		switch (grade) {
		case 'A':
			System.out.println("A Grade");
			break;
		case 'B':
			System.out.println("B Grade");
			break;

		default:
			System.out.println("C Grade");
			break;
			


		}
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("While Loop");
		int i = 11;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Do While Loop");
		i=11;
		do {
			System.out.println(i);
		}while(i<10);
		
		//Nested Class Code
		Dog.NestedClass nestedClassObj = dog.new NestedClass();
		nestedClassObj.display();
		
		//Static Nested Class
		Dog.StaticNestedClass staticNestedObject = new Dog.StaticNestedClass();
		staticNestedObject.display();
		
		
	}
	
	 class NestedClass{
		void display() {
			System.out.println("I am display Method Inside Nested Class");
		}
	}
	 
	 static class StaticNestedClass{
			void display() {
				System.out.println("I am display Method Inside Static Nested Class");
			}	 }

}
