package Quetion8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		assertEquals(6, EvenCount.countEven(new int[] {1,2,33,44,234,100,102,150}));
	}

}
