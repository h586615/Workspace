package skoleeksamen;

public class ToDoListe {
	
	private ToDoElement[] todoTab;
	private int antall;
	
	public ToDoListe(int maksAntall) {
		todoTab = new ToDoElement[maksAntall];
		antall = 0;
	}
	
	public void leggTil(ToDoElement tde) {
		if (antall >= todoTab.length) {
			System.out.println("Kan ikke legge til, tabellen er full");
		} else {
			todoTab[antall] = tde;
			antall ++;
		}
	}
	public ToDoElement finnViktig() {
		ToDoElement viktigest = todoTab[0];
		for (int i = 0; i < antall; i++) {
			if (todoTab[i].getPrioritet() < viktigest.getPrioritet() ) {
				todoTab[i] = viktigest;
			}
		}
		return viktigest;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoListe liste1 = new ToDoListe(10);
		ToDoElement obj1 = new ToDoElement("Java forelesing", 1, 7);
		ToDoElement obj2 = new ToDoElement("Bestille ferie", 2, 5);
		liste1.leggTil(obj1);
		liste1.leggTil(obj2);
		System.out.println(liste1.finnViktig());
	}

}
