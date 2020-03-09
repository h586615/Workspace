package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Proglab_opg_3 {
	
	public static void main (String[] args) {
		
		/*String xTxt = showInputDialog("Oppgi et reelt tall");
		double x = parseDouble(xTxt);
		
		String nTxt = showInputDialog("Oppgi hva det skal opphøgdes i");
		double n = parseDouble(nTxt);
		
		
		double ut = Math.pow(x,n);
		showMessageDialog(null, ut);
		*/
		//double blabla = whilelokke();
		whilelokke();
	}
	
	public static double whilelokke() {
		
		double x = parseDouble(showInputDialog("Oppgi et reelt tall"));
		int n = Integer.parseInt(showInputDialog("Hva skal tallet opphøyes i?"));
		
		int antall = 0;
		double output = 1;
		while (antall <= n) {
			output = output * x;
			antall++;
		}
		System.out.println("Tallet er: " + output);
		return output;
	}

}
