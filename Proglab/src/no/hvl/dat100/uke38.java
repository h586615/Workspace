package no.hvl.dat100;

public class uke38 {

	public static void main(String[] args) {
		
		int [] tabell = {2,7,5,8};
		
		skrivUt(tabell);
	}

	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++)
		System.out.print(tabell[i] + " ");
	}
	
}
