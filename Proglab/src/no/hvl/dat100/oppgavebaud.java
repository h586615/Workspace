package no.hvl.dat100;

public class oppgavebaud {

	public static void main (String[] args) {
		
		
		boolean a [][] = {
				{false, false, false, false},
				{true, false, false, false},
				{true, true, false, false},
				{true, true, true, false},
				{true, true, true, true},
		};
				System.out.println(prosentOpptatt(a));
		}
	
	public static double prosentOpptatt (boolean [][] aud) {
		
		int antOpptatt = 0;
		int ant = 0;
		double prosentDel = 0;
		for (int i = 0; i < aud.length; i++) {
			for (int j = 0; j < aud[i].length; j++) {
				ant = ant+1;
				if (aud[i][j] == false) {
					antOpptatt = antOpptatt+1;
				}
			}
		} 
		prosentDel = ((double ) antOpptatt / ant)*100; 
		
		return prosentDel;
	}
	
	public static void ledigPlass (boolean [][] aud) {
		
		
		for (int i = 0; i < aud.length; i++) {
			for (int j = 0; j < aud[i].length; j++) {
				
			}
		}
	}
}
