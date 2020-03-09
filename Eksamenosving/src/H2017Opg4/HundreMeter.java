package H2017Opg4;

public class HundreMeter extends Resultat {

	private double tid;
	
	public HundreMeter(double tid, String navn, char kjønn) {
	super(navn, kjønn);
	}

	public int poeng() {
		int p = 0;
		switch (getKjønn()) {
		case 'M':
			p = (int) (1000 + ( 10.40 - tid ) * 240);
			break;
		case 'K':
			p = (int) (1000 + ( 11.70 - tid ) * 240);
			break;
		}
		return p;
	}
	
}
