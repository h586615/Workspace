package H2017;

public class Flyavganger {
	private Flyavgang[] tab;

	public Flyavganger(int antall) {
		tab = new Flyavgang[antall];
	}

	public boolean erNull(int p) {
		if (tab[p] == null) {
			return true;
		}
		return false;
	}

	public int antall() {
		int antall = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null) {
				antall++;
			}
		}
		return antall;
	}

	public void visinfo() {
		for (int i = 0; i < tab.length; i++) {
			if (!erNull(i)) {
				System.out.println(tab[i].toString());
			}
		}
	}

	public boolean setStatus(int nummer, char status) {
		boolean funnet = false;
		for (int i = 0; i < tab.length; i++) {
			if (!erNull(i) && tab[i].getNummer() == nummer) {
				tab[i].setStatus(status);
				funnet = true;
				i = tab.length;
			}
		}
		return funnet;
	}

	public boolean settInn(Flyavgang flyavgang) {
		boolean sattinn = false;
		for (int i = 0; i < tab.length; i++) {
			if (erNull(i) && !sattinn) {
				tab[i] = flyavgang;
				sattinn = true;
				i = tab.length;
			}
		}
		return sattinn;
	}

	public boolean slett(int nummer) {
		boolean slettet = false;
		for (int i = 0; i<tab.length; i++) {
			if (tab[i].getNummer() == nummer && !slettet) {
				tab[i] = null;
				slettet = true;
				i = tab.length;
			}
		}
		return slettet;
	}
}
