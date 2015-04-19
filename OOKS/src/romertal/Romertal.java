package romertal;

public class Romertal {


	public String calculate(String a, String b) {
		String s = new String();
		s = cleanUp(a,b);
		return s;
	}

	private String cleanUp(String a, String b) {
		String s = format(a+b);
		s = DTilM(s);
		s = CTilD(s);
		s = LTilC(s);
		s = XTilL(s);
		s = VTilX(s);
		s = ITilV(s);
		return s;
	}
	
	public String format(String s){
		int antalI = 0, antalV = 0, antalX = 0, antalL = 0, antalC = 0, antalD = 0, antalM = 0;
		for(int i = 0; i < s.length(); i++){
			switch(s.charAt(i)){
			case 'I':
				antalI++;
				break;
			case 'V':
				antalV++;
				break;
			case 'X':
				antalX++;
				break;
			case 'L':
				antalL++;
				break;
			case 'C':
				antalC++;
				break;
			case 'D':
				antalD++;
				break;
			case 'M':
				antalM++;
				break;
			default:
				System.out.println("Fejl i switch");
				break;
			}
		}
		StringBuffer r = new StringBuffer();
		for(int i = 0; i<antalM; i++){
			r.append('M');
		}
		for(int i = 0; i<antalD; i++){
			r.append('D');
		}
		for(int i = 0; i<antalC; i++){
			r.append('C');
		}
		for(int i = 0; i<antalL; i++){
			r.append('L');
		}
		for(int i = 0; i<antalX; i++){
			r.append('X');
		}
		for(int i = 0; i<antalV; i++){
			r.append('V');
		}
		for(int i = 0; i<antalI; i++){
			r.append('I');
		}
		return r.toString();
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
		s = s.replace("I","");
		StringBuffer r = new StringBuffer(s);
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
		s = s.replace("V","");
		StringBuffer r = new StringBuffer(s);
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
		s = s.replace("X","");
		StringBuffer r = new StringBuffer(s);
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
		s = s.replace("L","");
		StringBuffer r = new StringBuffer(s);
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
		s = s.replace("C","");
		StringBuffer r = new StringBuffer(s);
		for(int i = 0; i< antalD; i++){
			r.append("D");
		}
		for(int i = 0; i< antalC; i++){
			r.append("C");
		}
		return r.toString();
	}

	public String DTilM(String s) {
		int antalD = 0;
		int antalM = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'D'){
				antalD++;				
			}
		}
		antalM += antalD/2;
		antalD = antalD%2;
		s = s.replace("D","");
		StringBuffer r = new StringBuffer(s);
		for(int i = 0; i< antalM; i++){
			r.append("M");
		}
		for(int i = 0; i< antalD; i++){
			r.append("D");
		}
		return r.toString();
	}

}
