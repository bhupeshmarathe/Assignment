package Quetion15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ItemTest {

	@Test
	void test() {
		Item i=new Item(101,"Bhupesh", 200,250,LocalDate.of(2022, 7, 5),LocalDate.of(2024, 7, 5));
		assertEquals(true,i.createObject(i));
	}

}
