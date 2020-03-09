package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class pt2 {

	public static void main(String[] args) {

		String input = showInputDialog("Oppgi en nedre grense");
		String innput = showInputDialog("Oppgi en ovre grense");
		
		
		int nedre = parseInt(input);
		int ovre = parseInt(innput);
		
		
		String s = "";
		for (int i = nedre; i<=ovre; i++) {	
		if (i % 2==1) {
			s = s + " " + i;
		
			}
		
		} 
		showMessageDialog (null, "Oddetallene mellom grensene er: " s);
		
	}
}
