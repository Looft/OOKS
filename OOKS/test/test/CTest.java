package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class CTest {

	@Test
	public void testLTilC() {
		Romertal r = new Romertal();
		String a = "L";
		String b = "L";
		String s = a+b;
		
		assertEquals("C", r.LTilC(s));
	}
	
	@Test
	public void test() {
		Romertal r = new Romertal();
		
		assertEquals("CL", r.calculate("LL", "L"));
	}

}
