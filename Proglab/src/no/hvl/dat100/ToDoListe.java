package no.hvl.dat100;

public class ToDoListe {

	private ToDoElement[] todoTab;
	private int antall;
	
	public ToDoListe(int maksAntall) { 
		todoTab = new ToDoElement[maksAntall];
		antall = 0;
	}
	
	public void leggTil(ToDoElement tde) {
		// 
		if (antall < todoTab.length) {
			todoTab[antall] = tde;
			antall++;
		}
	}
	public ToDoElement finnViktig() {
		// Holde rede på det viktigste elemente så langt, derfor må vi ha en løkke.
		ToDoElement viktigest = todoTab[0];
		for (int i = 1; i < antall; i++) {
			if (todoTab[i].getPrioritet() < viktigest.getPrioritet()) {
				viktigest = todoTab[i];
			}
		}
		return viktigest;
	}
	public static void main(String[] args) {
		
	}
}

