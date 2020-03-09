package H2017Opg4;

public abstract class Resultat {

	private String navn;
	private char kj�nn;
	
	public Resultat(String navn, char kj�nn) {
		this.navn = navn;
		this.kj�nn = kj�nn;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public char getKj�nn() {
		return kj�nn;
	}
	public void setKj�nn(char kj�nn) {
		this.kj�nn = kj�nn;
	}
	
	public abstract int poeng(); 
	
	public static void main (String[] args) { 
		
		Resultat[] rTab = new Resultat[3];
		rTab[0] = new Spyd(79.40, "Abu", 'M');
		rTab[1] = new HundreMeter(14.56, "Kari", 'K');
		rTab[2] = new Spyd(76.40, "Tallah", 'M');
		
		Resultat best = rTab[0];
		for (Resultat i:rTab) {
			if (i.poeng() > best.poeng()) {
				best = i;
			}
		}
		System.out.println("Beste resultat er " + best);

	}
	
	
}
