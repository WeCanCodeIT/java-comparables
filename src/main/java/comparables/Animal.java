package comparables;

import java.util.Comparator;

public class Animal implements Comparable<Animal>, Comparator<Animal> {

	protected String name;
	protected String sound;
	protected int age;

	public String speak() {
		return "I'm " + name + "! " + sound + "!";
	}

	public Animal(String name, String sound, int age) {
		super();
		this.name = name;
		this.sound = sound;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.age - o2.age;
	}

	@Override
	public int compareTo(Animal o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return name + " is " + age + " years old.";
	}

}
