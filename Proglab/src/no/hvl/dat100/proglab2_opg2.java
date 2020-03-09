package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class proglab2_opg2 {

	
	public static void main (String[] args) {
		int a = parseInt(showInputDialog("Give a number A"));
		int b = parseInt(showInputDialog("Give a number B"));
		int c = parseInt(showInputDialog("Give a number C"));
		
		if (a > b && b > c) {
			System.out.println(a + "," +  b + "," + c);
		} else if (a > b && c > a) {
			System.out.println(a + "," + c + "," + b);
		}
		if (b > a && a > c) {
			System.out.println(b + "," + a + "," + c);
		} else if (b > a && c > a) {
			System.out.println(b + "," + c + "," + a);
		}
		if (c > a && a > b) {
			System.out.println(c + "," + a + "," + b);
		} else if (c > a && b > a) {
			System.out.println(c + "," + b + "," + a);
		}
	}
}
