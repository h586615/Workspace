package no.hvl.dat100;

public class metodeA {
	
	
	public static void main(String[] args) {
		
		metodeB();
		
	}

	public static void metodeA(int x) {
		if (x<0) {
			throw new ArithmeticException("X er negativ");
		} else {
			System.out.print(x + " ");
		}
	}
	public static void metodeB() {
		int[] tab = { 0, 1, -1, 2, 3 };
		int x = 0;
		try {
			// Når try blokken blir gjennomført, ser du vekk ifra try betingelsen og går videre.
			for (int i = 0; i < tab.length; i++) {
				x = i;
				metodeA(tab[i]);
			}
		} catch (ArithmeticException exception) {
			//System.out.println("nå  ble unntaket kastet");
			System.out.println();
			System.out.println(tab [x]);
		} finally {
			System.out.println("x = " + x);
		}
	}
}
