package no.hvl.dat100;

public class Utvidetforlokka {
	public static void main(String[] args) {

		int[] tabell = { 2, 7, 5, 8 };

		System.out.println(summer(tabell));
	}

	public static int summer(int[] tabellA) {
		int sum = 0;
		for (int e:tabellA) {
			sum += e;
		}
		return sum;
	}

}
