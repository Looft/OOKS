package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class MTest {

	@Test
	public void testDTilM() {
		Romertal r = new Romertal();
		String a = "D";
		String b = "DD";
		String s = a+b;
		
		assertEquals("MD", r.DTilM(s));
	}
	
	@Test
	public void testDTilM2() {
		Romertal r = new Romertal();
		String a = "D";
		String b = "DD";
		String s = a+b;
		
		assertEquals("MD", r.DTilM(s));
	}
	
	@Test
	public void test() {
		Romertal r = new Romertal();
		
		assertEquals("MD", r.calculate("DD", "D"));
	}

}
