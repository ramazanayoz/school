package midterm;


	
	
	import java.util.ArrayList;
	public class TestAnimals {
	public static void main(String[] args) {
	ArrayList<Animal> animals = new ArrayList<>();
	Cat cat = new Cat("Tom");
	animals.add(cat);
	Dog dog = new Dog("Scooby Doo");
	animals.add(dog);
	Duck duck = new Duck("Donald");
	animals.add(duck);
	//print names of animals
	for(Animal animal: animals){
	System.out.print(animal.getName() + ", ");
	}// Output: Tom, Scooby Doo, Donald,
	//print sounds of animals
	for(Animal animal: animals){
	System.out.print(animal.speak() + ", ");
	}// Output: Meow, Woof, Quack,
	}
	}
