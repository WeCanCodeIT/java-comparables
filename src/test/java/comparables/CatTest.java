package comparables;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CatTest {
	
	@Test
	public void speakShouldReturnNameAndSound() {
		Animal wallace = new Cat("Wallace", 5);

		String underTest = wallace.speak();
		
		assertThat(underTest, is(equalTo("I'm Wallace! Meow!")));
	}
	
	@Test
	public void speakShouldReturnNameAndSoundUniquely() {
		Animal momo = new Cat("Momo", 3);
		
		String underTest = momo.speak();
		
		assertThat(underTest, is(equalTo("I'm Momo! Meow!")));
	}
}
