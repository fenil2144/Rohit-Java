
public class Dog {
	
	//Identity
	private String name;
	
	//State
	private String breed;
	private String color;
	
	private void bark() {
		System.out.println("I am barking");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println(dog);
		
		dog.name = "Kay";
		dog.breed = "Labra";
		dog.color = "Grey";
		dog.bark();
		
		System.out.println("dog's Name: "+dog.name);
		
	}

}
