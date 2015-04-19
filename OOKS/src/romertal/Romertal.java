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
		String X = XTilL(s);
		String C = LTilC(s);
		String D = CTilD(s);
		
		s = D+C+X+V+I;
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

	public String XTilL(String s) {
		int antalX = 0;
		int antalL = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'X'){
				antalX++;				
			}
		}
		antalL += antalX/5;
		antalX = antalX%5;
		StringBuffer r = new StringBuffer();
		for(int i = 0; i< antalL; i++){
			r.append("L");
		}
		for(int i = 0; i< antalX; i++){
			r.append("X");
		}
		return r.toString();
	}

	public String LTilC(String s) {
		int antalL = 0;
		int antalC = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'L'){
				antalL++;				
			}
		}
		antalC += antalL/2;
		antalL = antalL%2;
		StringBuffer r = new StringBuffer();
		for(int i = 0; i< antalC; i++){
			r.append("C");
		}
		for(int i = 0; i< antalL; i++){
			r.append("L");
		}
		return r.toString();
	}

	public String CTilD(String s) {
		int antalC = 0;
		int antalD = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'C'){
				antalC++;				
			}
		}
		antalD += antalC/5;
		antalC = antalC%5;
		StringBuffer r = new StringBuffer();
		for(int i = 0; i< antalD; i++){
			r.append("D");
		}
		for(int i = 0; i< antalC; i++){
			r.append("C");
		}
		return r.toString();
	}

}
