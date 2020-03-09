package H2017Opg4;

public class Spyd extends Resultat {
	
	private double lengde;
	
	public Spyd(double lengde, String navn, char kjønn) {
		super(navn,kjønn);
	}
	public int poeng() {
		int p = 0;
		switch (getKjønn()) {
		case 'M':
			p = (int) (1000 + (lengde - 77.20) * 15);
			break;
		case'K':
			p = (int) (1000 + (lengde - 60) * 15);
			break;
		}
		return p;
	}
	

}
