class Animal{
	String name;
	int age;
	
	public void eat() {
		System.out.println("I am Eating!");
	}
	
	public void walk() {
		System.out.println("I am Walking");
	}
}
class DogAnimal extends Animal{
	public void bark() {
		System.out.println("I am Barking!");
	}
	
}
class CatAnimal extends Animal{
	public void Meow() {
		System.out.println("I am Meowing!");
	}
	
}
public class InheritanceExample {
	public static void main(String[] args) {
		DogAnimal dogAnimalObj = new DogAnimal();
		dogAnimalObj.name = "Max";
		dogAnimalObj.eat();
		dogAnimalObj.walk();
		dogAnimalObj.bark();
		System.out.println("Name: "+dogAnimalObj.name);
	}
	


}
