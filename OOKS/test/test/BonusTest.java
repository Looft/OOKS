package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class BonusTest {

	@Test
	public void testTomStreng() {
		Romertal r = new Romertal();
		String a = "";
		String b = "";
		
		assertEquals("Fejl", r.calculate(a, b));
	}
	
	@Test
	public void testForkertInput() {
		Romertal r = new Romertal();
		String a = "A";
		String b = "B";
		
		assertEquals("Fejl", r.calculate(a, b));
	}
}
