package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class XTest {

	@Test
	public void testVTilX() {
		Romertal r = new Romertal();
		String a = "XXXX";
		String b = "X";
		String s = a+b;
		
		assertEquals("L", r.XTilL(s));
	}
	
	@Test
	public void test() {
		Romertal r = new Romertal();
		
		assertEquals("L", r.calculate("XXXX", "X"));
	}

}
