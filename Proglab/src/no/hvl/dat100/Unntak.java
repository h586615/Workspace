package no.hvl.dat100;

public class Unntak {
public static int f(int a, int b) {
	int svar = 0;
	try {
		svar = a/b;
	}
	catch(ArithmeticException e) {
		throw e;
	}
	return svar;
}
	public static void main(String[] args) {

		int[] a = { 0, 1, 2 };
		for (int i = 0; i <= a.length; i++) {
			try {
			System.out.println(a[i]);
		}
			catch (ArithmeticException e) {
				System.out.println("Feil med tabellgrenser");
			}
			finally {
				System.out.println("Blir gjort uansett");
			}
		}
		try {
			int svar = f(2,0);
		}
		catch (ArithmeticException e) {
			System.out.println("Ulovlig aritmetisk operasjon");
		}
	}
}
