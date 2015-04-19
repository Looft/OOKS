package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class ITest {

	@Test
	public void test() {
		Romertal r = new Romertal();
		
		assertEquals("V", r.calculate("IIII", "I"));
	}
	
	@Test
	public void testITilV() {
		Romertal r = new Romertal();
		String a = "IIII";
		String b = "I";
		String s = a+b;
		assertEquals("V", r.ITilV(s));
	}
	
	@Test
	public void testITilV2() {
		Romertal r = new Romertal();
		String a = "IIII";
		String b = "II";
		String s = a+b;
		
		assertEquals("VI", r.ITilV(s));
	}

}
