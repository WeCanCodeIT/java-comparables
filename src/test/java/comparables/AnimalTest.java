package comparables;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void speakShouldReturnNameAndSound() {
		Animal animal = new Animal("Jackson", "Rawr!");

		String underTest = animal.speak();

		assertThat(underTest, is(equalTo("I am Jackson! Rawr!!")));
	}
	
	@Test
	public void speakShouldReturnNameAndSoundUniquely() {
		Animal animal2 = new Animal("Mac", "Woof");
		
		String underTest = animal2.speak();
		
		assertThat(underTest, is(equalTo("I am Mac! Woof!")));
	}
}
