package H18;

public class Reservasjon {

	private Rom rom;
	private Person person; 
	
	public Reservasjon(Rom rom, Person person) {
		this.rom = rom;
		this.person = person;
	}
	
	public String toString() {
		String output = "[ " + rom.getBygg()+ rom.getNummer() + " ]" + person;
	return output;
	}
	Rom rom1 = new rom()
	
}
