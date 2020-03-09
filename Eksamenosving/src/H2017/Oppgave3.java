package H2017;

import java.util.*;
import static javax.swing.JOptionPane.*;
import java.io.*;

public class Oppgave3 {
	public static void les(String filnavn) throws FileNotFoundException {
		File fil = new File(filnavn);
		Scanner sc = new Scanner(fil);

		String line;

		while (sc.hasNext()) {

			line = sc.nextLine();
			if (!(line.contains("//"))) {
				System.out.println(line);
			}
		}
		sc.close();

	}
	public static boolean lesCatch(String filnavn) {
		boolean lestinn = true;
		try {
			les(filnavn);
		} catch (FileNotFoundException e) {
			lestinn = false;
		}
		return lestinn;
	}
	public static boolean lesForsok(int forsok) {
		boolean lestinn = false;
		do {
			String filnavn = showInputDialog("Angi filnavn");
			lestinn = lesCatch(filnavn);
			
			if(!lestinn) {
				showMessageDialog(null,"Feil");
				forsok--;
}
		} while (!lestinn && forsok > 0);
		return lestinn;
	}

	public static void main(String[] args) {

	}

}
