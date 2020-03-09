package no.hvl.dat100;

public class HvlStudent extends Student {
	private String fag;
	private String campus;
	private boolean aktiv;
	
	public HvlStudent(int nr, String navn, int kjonn, String fag,
			String campus, boolean aktiv) {
		super(nr, navn, kjonn);
		this.fag = fag;
		this.campus = campus;
		this.aktiv = aktiv;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Fag: " + fag + " , Campus: " + campus + ", Aktiv: " + 
	aktiv;
	}

}
