package no.hvl.dat100;

public class javahjelp_25_09_19 {

	public static int sumAlle(int[][] tab) {
		int sum = 0;
		for (int r = 0; r < tab.length; r++) {
			for (int i = 0; i < tab[r].length; i++) {
				sum += tab[r][i];
			}
		}
		return sum;
	}

	public static int antallNeg(int[][] tab) {
		int ant = 0;
		for(int r = 0; r <tab.length; r++) {
			for (int i = 0; i < tab[r].length; i++) {
				if(tab[r][i] < 0) {
					ant ++;
				}
			}
		}
		return ant;
	}
	public static int sumTab(int[] tab) {
		int sum = 0;
		for (int e : tab) {
			sum += e;
		}
		return sum;
	}
	public static void sumStorstRekke(int[][] tab) {
		 int storst = sumTab(tab[0]);
		 int rNr = 0;
		 for (int r = 1; r < tab.length; r++) {
			 int sum = sumTab(tab[r]);
			 if (sum > storst) {
				 storst = sum;
				 rNr = r;
			 }
		 }
		 System.out.println("Rekkenr " + rNr + " har størst sum. Summen er " + storst);
			}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 0, 1, 1 } };
		int sum = sumAlle(a);
		System.out.println(sum);
		sumStorstRekke(a);
		
		String[] sTab = new String[5];
		sTab[3] = "Test";
		for (String s : sTab) {
			System.out.println(s);
		}
	}

}
