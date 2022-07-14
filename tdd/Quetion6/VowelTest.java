package Quetion6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VowelTest {

	@Test
	void test() {
		assertEquals(5,VowelCount.countVowel("My name is Bhupesh"));
	}

}
