package no.hvl.dat100;

public class uke38b {

	public static void main(String[] args) {
		
		int [] tabell = {2,7,5,8};
		
		System.out.println(summer3(tabell));
	}

	public static int summer(int[] tabellA) {
		int sum = 0;
		for (int i = 0; i < tabellA.length; i++) {
		sum += tabellA[i];
		}
		return sum;
	}
	public static int summer2(int[] tabellA) {
		int sum = 0;
		for (int tab : tabellA) {
			sum += tab;
		}
		return sum;
	}
	public static int summer3(int[] tabellA) {
	int i = 0;
	int sum = 0;
	while(i < tabellA.length) {
		sum += tabellA[i];
		i++;
	}
		return sum;
	}
	
	
}
