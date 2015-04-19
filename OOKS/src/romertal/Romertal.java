package romertal;

public class Romertal {


	public String calculate(String a, String b) {
		String s = new String();
		s = cleanUp(a,b);
		return s;
	}

	private String cleanUp(String a, String b) {
		String s = a+b;
		String I = ITilV(s);
		String V = VTilX(s);
		
		s = I+V;
		return s;
	}

	public String ITilV(String s) {
		int antalI = 0;
		int antalV = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'I'){
				antalI++;				
			}
		}
		antalV += antalI/5;
		antalI = antalI%5;
		StringBuffer r = new StringBuffer();
		for(int i = 0; i< antalV; i++){
			r.append("V");
		}
		for(int i = 0; i< antalI; i++){
			r.append("I");
		}
		return r.toString();
	}

	public String VTilX(String s) {
		int antalV = 0;
		int antalX = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'V'){
				antalV++;				
			}
		}
		antalX += antalV/2;
		antalV = antalV%2;
		StringBuffer r = new StringBuffer();
		for(int i = 0; i< antalX; i++){
			r.append("X");
		}
		for(int i = 0; i< antalV; i++){
			r.append("V");
		}
		return r.toString();
	}

}
