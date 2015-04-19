package romertal;

public class Romertal {
	private int antalI;

	public String calculate(String a, String b) {
		String s = new String();
		s = a+b;
		return s;
	}

	public String ITilV(String a, String b) {
		String s = a+b;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == 'I'){
				antalI++;				
			}
		}
		if(antalI >= 5){
			s = "V";
		}
			
		return s;
	}

}
