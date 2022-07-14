package Quetion13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		assertEquals(10, Calculator.addition(5, 5));
		assertEquals(15, Calculator.substraction(20, 5));
		assertEquals(25, Calculator.multiplication(5, 5));
		assertEquals(10, Calculator.squareRoot(100));
		assertEquals(5, Calculator.cubeRoot(125));
	}
	@Test
	void divide()
	{
		try {
			assertEquals(5,Calculator.division(15, 0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can not divide by zero:"+e);
		}
	}
	
	@Test
	void modulus()
	{
		try {
			assertEquals(3,Calculator.modulus(15, 0));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	void power()
	{
		try {
			assertEquals(25,Calculator.power(5,0));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
