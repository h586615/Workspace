package no.hvl.dat100;

public class Eks_Switch {

	public static int dagnr (String navn) { // S�ndag
		int svar;
		switch (navn) {
		case "s�ndag":
		case "S�ndag": svar = 1;
			break;
		case "Mandag":
			svar =2;
			break;
		default:
			svar = -1;
		}
		return svar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dagnr("s�ndag"));
// Static metode kan kun bruke parametere og 
	}

}
