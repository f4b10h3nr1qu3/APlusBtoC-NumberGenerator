package com.f4b10h3nr1qu3.numbergenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/**
 * jUnit test for GenerateNumber class.
 * @author fhv4it@gmail.com<Fabio Henrique>
 */
public class GenerateNumberTest {

	@Test
	public void testSuccessOne() {
		GenerateNumber g = new GenerateNumber();
		int actual = g.generate(135, 246);
		assertEquals(123456, actual);
	}

	@Test
	public void testSuccessTwo() {
		GenerateNumber g = new GenerateNumber();
		int actual = g.generate(10256, 512);
		assertEquals(15012256, actual);
	}

	@Test
	public void testNegative1_OverDigits() {
		GenerateNumber g = new GenerateNumber();
		int actual = g.generate(10256, 51286);
		assertEquals(-1, actual);
	}

	@Test
	public void testNegative2_OverDigits() {//retuns -1 because of the over digits, in this case 9 digits.
		GenerateNumber g = new GenerateNumber();
		int actual = g.generate(100000000, 0);
		assertEquals(-1, actual);
	}

	@Test
	public void testNegative3_OverDigits() {
		GenerateNumber g = new GenerateNumber();
		int actual = g.generate(0, 100000000);
		assertEquals(-1, actual);
	}
}
