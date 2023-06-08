import AnotherPackage.Cat;

public class Dog extends Cat{
	
	//Identity
	private String name;
	
	//State
	private String breed;
	String color;
	static int a=20;
	
	private void bark() {
		System.out.println("I am barking");
		int a = 10;
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println(dog);
		
		dog.name = "Kay";
		dog.breed = "Labra";
		dog.color = "Grey";
		dog.bark();

		
		System.out.println("dog's Name: "+dog.name+ " "+dog.breed+ " "+dog.a);
		dog.a=30;
		
		Dog dog2 = new Dog();
		dog2.name="tom";
		dog2.breed="German";
		System.out.println(dog2.a);
		System.out.println(Dog.a);
		
	}

}
