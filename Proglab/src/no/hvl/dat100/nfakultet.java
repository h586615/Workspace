package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class nfakultet {
public static void main (String[] args ) {
	int tall = parseInt(showInputDialog("Oppgi et heltall"));
	
	
	
	int out = tall;
	while (tall > 1) {
		out *= (tall-1);
		tall--;
	}
	showMessageDialog(null, out);
	
}
}