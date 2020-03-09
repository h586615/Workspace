package H18;

public class Spiller {

	private String dato;
	private String navn;
	private int antallFerdige;
	private int[] resTab;

	public Spiller(String dato, String navn, int antall) {
		this.dato = dato;
		this.navn = navn;
		this.resTab = new int[antall];
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getAntallFerdige() {
		return antallFerdige;
	}

	public void leggTil(int r) {
		for (int i = 0; i < resTab.length; i++) {
			if (resTab[i] == 0) {
				resTab[i] = r;
			}
			this.antallFerdige++;
			i = resTab.length;
		}
	}

	public int sumSlag() {
		int sum = 0;
		for (int i = 0; i < resTab.length; i++) {
			sum += resTab[i];
		}
		return sum;
	}

	public boolean erFerdig() {
		boolean ferdig = false;
		if (getAntallFerdige() == this.resTab.length) {
			ferdig = true;
		}
		return ferdig;
	}

	public String toString() {
		String output = navn + ", " + dato + ", Sumslag: " + sumSlag() + " etter " + antallFerdige + " av "
				+ resTab.length + " hull\n";
		return output;
	}

	public int antallOverPar(int[] parTab) {
		int antallOverPar = 0;
		for (int i = 0; i < antallFerdige; i++) {
			if (resTab[i] > parTab[i]) {
				antallOverPar++;

			}
		}
		return antallOverPar;
	}

	public void visScore(int[] parTab) {
		System.out.println(toString());
		String resultat = null;
		for (int i = 0; i < parTab.length; i++) {
			int forskjell = (resTab[i] - parTab[i]);
			if (resTab[i] == -1) {
				resultat = "hole in one";
			} else if (forskjell == -1) {
				resultat = "birdie";
			} else if (forskjell == -2) {
				resultat = "eagle";
			} else if (forskjell == -3) {
				resultat = "albatross";
			} else if (forskjell == -4) {
				resultat = "kondor";
			} else if (forskjell > 0) {
				resultat = "";
			} else if (resTab[i] - parTab[i] == 0) {
				resultat = "par";
			}
			System.out.println("Hull" + " " + (i+1) + ": " + resTab[i] + "  (" + parTab[i] + ") - " + resultat);
		}
	}
	public static void main (String[] args) {
		Spiller spiller1 = new Spiller("08.12.19", "Abu", 3);
		Spiller spiller2 = new Spiller("08.12.19", "Tallah", 3);
		
		spiller1.leggTil(2);
		spiller1.leggTil(1);
		spiller1.leggTil(4);

		
		spiller2.leggTil(3);
		spiller2.leggTil(2);
		spiller2.leggTil(1);
		
		int[] parSpill = {2,3,2};
		spiller1.visScore(parSpill);
		if (spiller1.sumSlag() > spiller2.sumSlag()) {
			System.out.println("Spiller 2 vant!");
		} if (spiller2.sumSlag() > spiller1.sumSlag()) {
			System.out.println("Spiller 1 vant!");
		} else {
			System.out.println("Det er uavgjort!");
		}
	}

}
