package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class uke38_1_c {

	public static void main(String[] args) {
		
	int [] tabell = {7, 3, 8, 2, 6};
	String talltxt = "Oppgi et heltall";
	int tall = parseInt(showInputDialog(talltxt));
	finnesTall(tabell,tall);
	}

	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			} else {
				i++;
			}
		}
		showMessageDialog(null, funnet);
		return funnet;
	}
}