package H2017;

public class Oppgave5 {

	public static boolean erPositiv(int[][] mat, int r, int k) {
		boolean positiv = false;
		if (mat[r][k] > 0) {
			positiv = true;
		}
		return positiv;
	}

	public static boolean erPositivRekke(int[][] mat, int r) {
		boolean positiv = true;
		int k = 0;
		while (positiv && k < mat.length) {
			if (mat[r][k] <= 0) {
				positiv = false;
			}
			k++;
		}
		return positiv;
	}
	public static int antallNuller(int[][] mat) {
		int antallNuller = 0;
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				
				if (mat[i][j] == 0) {
					antallNuller ++;
				}
			}
		}
		return antallNuller;
	}
	public static boolean erKvadratisk(int[][] mat) {
		boolean kvadratisk = false;
		if (mat.length == mat[0].length) {
			kvadratisk = true;
		}
		return kvadratisk;
	}
	public static int spor (int[][] mat) {
		int sum = 0;
		for(int i = 0; i <mat.length; i++) {
			sum += mat[i][i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] mat = {{1,2,3}, {4,-5,6}, {-7,8,0}};
		System.out.println(erPositivRekke(mat, 1));		
	
	}
}
