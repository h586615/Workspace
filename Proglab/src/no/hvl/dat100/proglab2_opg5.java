package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class proglab2_opg5 {

	public static void main(String[] args) {
		String karTxt = showInputDialog("Tallkarakter: ");
		int tallKarakter = parseInt(karTxt);
		String karakter = null;
		
		switch (tallKarakter) {
		case 5: karakter = "A - Fremragende"; break;
		case 4: karakter = "B - Meget god"; break;
		case 3: karakter = "C - God"; break;
		case 2: karakter = "D - Nokså god"; break;
		case 1: karakter = "E - Tilstrekkelig"; break;
		case 0: karakter = "Ugyldig karakter";
		
		}
		showMessageDialog(null, karakter);
	}

}
