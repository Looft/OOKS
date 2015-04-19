package test;

import static org.junit.Assert.*;

import org.junit.Test;

import romertal.Romertal;

public class VTest {
	
	@Test
	public void testVTilX() {
		Romertal r = new Romertal();
		
		assertEquals("X", r.VTilX("V", "V"));
	}
}
