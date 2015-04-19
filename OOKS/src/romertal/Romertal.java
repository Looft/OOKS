package romertal;

public class Romertal {
	private int antalI;
	private int antalV;

	public String calculate(String a, String b) {
		String s = new String();
		s = ITilV(a,b);
		return s;
	}

	public String ITilV(String a, String b) {
		String s = a+b;
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

	public String VTilX(String a, String b) {
		return "X";
	}

}
