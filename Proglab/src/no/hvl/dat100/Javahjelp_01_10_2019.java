package no.hvl.dat100;



public class Javahjelp_01_10_2019 {
	private String romnr;
	private int plasser;
	private boolean ledig;
	private int ledigePlasser;
	
	public Javahjelp_01_10_2019(String rnr, int p, boolean ledig) {
		romnr = rnr;
		plasser = p;
		this.ledig = ledig;
		
	}
	public String getRomnr() {
		return romnr;
	}
	
	public void setRomnr(String nyverdi) {
		romnr = nyverdi;
	}

	
	public void skrivUt () {
		System.out.println(romnr);
		System.out.println(plasser);
		if (ledig) {
			System.out.println("ledig");
		} else {
			System.out.println("opptatt");
		}
	}
	
	public boolean storreEnn(Javahjelp_01_10_2019 j) {
	return this.plasser > j.plasser;
	
	}
	
public static void main (String[] args) {	
	
	
}
	
}
