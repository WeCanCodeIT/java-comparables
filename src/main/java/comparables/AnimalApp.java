package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalApp {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Cat("Wallace", 5));
		animals.add(new Dog("Momo", 3));
		animals.add(new Cat("Sartre", 2));
		animals.add(new Dog("Mendelev", 6));
		animals.add(new Dog("Scooby", 10));
		
		Collections.sort(animals);

		for (Animal animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
		
		Collections.sort(animals, new Cat("cat", 0));
		for (Animal animal : animals) {
			System.out.println(animal.getName() + ": " + animal.getAge());
		}
	}
}
