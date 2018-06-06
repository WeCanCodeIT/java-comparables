package comparables;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DogTest {
	
	@Test
	public void speakShouldReturnNameAndSound() {
		Dog sartre = new Dog("Sartre", 3);

		String underTest = sartre.speak();
		
		assertThat(underTest, is(equalTo("I'm Sartre! Bark!")));
	}
	
	@Test
	public void speakShouldReturnNameAndSoundUniquely() {
		Dog mendelev = new Dog("Mendelev", 4);
		
		String underTest = mendelev.speak();
		
		assertThat(underTest, is(equalTo("I'm Mendelev! Bark!")));
	}
}
