package comparables;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, "Bark", age);
	}

	public String speak() {
		return "I'm " + name + "! " + sound + "!";
	}

}
