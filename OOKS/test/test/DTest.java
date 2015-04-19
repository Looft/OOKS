package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class DTest {
	
	@Test
	public void testCTilD() {
		Romertal r = new Romertal();
		String a = "CCCC";
		String b = "C";
		String s = a+b;
		
		assertEquals("D", r.CTilD(s));
	}
	
	@Test
	public void test() {
		Romertal r = new Romertal();
		
		assertEquals("D", r.calculate("CCCC", "C"));
	}

}
