package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class ITest {

	//@Test
	public void test() {
		Romertal r = new Romertal();
		
		assertEquals("V", r.calculate("IIII", "I"));
	}
	
	@Test
	public void testITilV() {
		Romertal r = new Romertal();
		
		assertEquals("V", r.ITilV("IIII", "I"));
	}
	
	@Test
	public void testITilV2() {
		Romertal r = new Romertal();
		
		assertEquals("VI", r.ITilV("IIII", "II"));
	}

}
