package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class GivenTest {

	@Test
	public void testGiven() {
		String a = "MCCXVII";
		String b = "DCCCCLXI";
		
		Romertal r = new Romertal();
		
		assertEquals("MMCLXXVIII", r.calculate(a,b));
		
	}

}
