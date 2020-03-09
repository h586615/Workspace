package no.hvl.dat100;

public class Parameteroverforing {

	public static void f(int a, int[] t) {
		a = 7;
		t[0] = 7;
	}
	public static void main(String[] args) {
		int b =4;
		int tab[] = {4, 3, 1};
		f(b, tab);
		System.out.println(b);
		System.out.println(tab[0]);
	}
}
