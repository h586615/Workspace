package no.hvl.dat100;

public class javahjelp_22_10_19 {

	public static void main(String[] args) {

		int tabell[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] odde = oddeTall(tabell);
		for (int e : odde) {
			System.out.print(e + " ");
		}
	}

	public static int[] oddeTall(int[] tab) {
		int oddetall = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 1) {
				oddetall++;
			}
		}
		int[] svar = new int[oddetall];
		int p = 0;
		for (int i = 0; i < tab.length; ia++) {
			if (tab[i] % 2 == 1) {
				svar[p] = tab[i];
				p++;
			}

		}
		return svar;
	}
}