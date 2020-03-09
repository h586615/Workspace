package H2017Opg4;

public abstract class Resultat {

	private String navn;
	private char kjønn;
	
	public Resultat(String navn, char kjønn) {
		this.navn = navn;
		this.kjønn = kjønn;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public char getKjønn() {
		return kjønn;
	}
	public void setKjønn(char kjønn) {
		this.kjønn = kjønn;
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
