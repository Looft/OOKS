package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class VTest {
	
	@Test
	public void testVTilX() {
		Romertal r = new Romertal();
		String a = "V";
		String b = "V";
		String s = a+b;
		
		assertEquals("X", r.VTilX(s));
	}
	
	@Test
	public void testVTilX2() {
		Romertal r = new Romertal();
		String a = "VV";
		String b = "V";
		String s = a+b;
		assertEquals("XV", r.VTilX(s));
	}
	
	@Test
	public void test() {
		Romertal r = new Romertal();
		
		assertEquals("XV", r.calculate("VV", "V"));
	}
}
