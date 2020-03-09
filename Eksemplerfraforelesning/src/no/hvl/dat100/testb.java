package no.hvl.dat100;

public class testb {
	public static int antallNeg(double[] tabell) {
		int antall = 0;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] < 0) {
				antall++;
			}
		}
		return antall;
	}

	public static void main(String[] args) {
		double[] dt = { 1.3, 2.4, -1.9, 0, -2 };
		double[] dt2 = new double[10];

		String s = "false";

		int an = antallNeg(dt2);
		System.out.println(an);
		String[] sTab = new String[15];
		int a = 7;

		boolean[] bTab = new boolean[a];
		boolean[] bTab2 = { true, false, false };
		int[] b = new int[10];
		b[7] = 5;

		int antall = antallNull(b);
		System.out.println(antall);


		int[] c = {1, 10, 11, 13};
		boolean sortert = erSortert(c);
		System.out.println(sortert);
	}

	public static boolean erSortert(int[] a) {
		boolean sortert = true;
		int i = 0;

		while (sortert && i < a.length - 1) {
			if (a[i] > a[i + 1]) {
				sortert = false;
			}
			i++;
		}
		return sortert;
	}

	public static int antallNull(int[] tabellC) {
		int antall = 0;
		for (int g = 0; g < tabellC.length; g++) {
			if (tabellC[g] == 0) {
				antall++;
			}
		}
		return antall;
	}
}
