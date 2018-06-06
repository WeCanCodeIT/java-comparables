package comparables;

public class Animal {
	
	private String name;
	private String sound;

	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String speak() {
		return "I am " + name + "! " + sound + "!";
	}

}
