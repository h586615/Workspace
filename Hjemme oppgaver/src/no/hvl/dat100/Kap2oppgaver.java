package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Kap2oppgaver {

	public static void main(String[] args) {

		System.out.println("Hei");
		String s = "hei";
		int a = 1;
		if (a > 1) {
			System.out.println("a større 1");
		} else {
			System.out.println("a ikke større 1");
		}

		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;

		}
		for (int e = 20; e > 1; e -= 2) {
			System.out.println(e);
		}
		boolean lovligMnd = false;
		int mnd = 0;
		do {

			mnd = Integer.parseInt(showInputDialog("Oppgi mnd nr"));
			lovligMnd = mnd >= 1 && mnd <= 12;
		} while (!lovligMnd);

		int x = 8;
	}
}
