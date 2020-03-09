package no.hvl.dat100;

public class proglab_25_09_19 {

	public static void main(String[] args) {

		boolean[][] audp;

		int ANTALL = 8;
		int RADER = 6;

		boolean[][] d111 = new boolean[RADER][ANTALL];

		boolean[][] aud = { { false, false, false, false }, { true, false, false, false }, { true, false, true, true },
				{ true, true, true, true }, };
		boolean ledig = false;
		int antallLedig = 0;
		for (int r = 0; r < aud.length; r++) {
			for (int p = 0; p < aud[r].length; p++) {
				if (aud[r][p] == false) {
					antallLedig++;
				}
			}

		} System.out.print(antallLedig);
	}
}