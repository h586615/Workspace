package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.util.Arrays.*;

public class testmod {

	public static void main(String[] args) {

		int[] tabell = { 1, 4, 2, 6, 9, 3 };

		// String tallTxt = showInputDialog("Oppgi et heltall");
		// int tall = parseInt(tallTxt);

		
		skrivUt(reverser(tabell));
	}

	
	
		

	

	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;

		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public static int[] reverser(int[] tabell) {
		int[] nytab = new int[tabell.length];
		int length = tabell.length;
		for (int i = 0; i < tabell.length; i++) {
			
			nytab[length -1] = tabell[i];
			//tabell[length] = nytab[i];
			length--;
		}
		return nytab;
	}
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++)
		System.out.print(tabell[i] + " ");
	}
}
