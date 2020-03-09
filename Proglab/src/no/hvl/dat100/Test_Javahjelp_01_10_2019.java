package no.hvl.dat100;

public class Test_Javahjelp_01_10_2019 {

	public static void main(String[] args) {
		Javahjelp_01_10_2019 j = new Javahjelp_01_10_2019("B333", 30, false);
		Javahjelp_01_10_2019 kontor = new Javahjelp_01_10_2019("E405", 100, true);

		/*System.out.println(kontor.getRomnr());
		j.setRomnr("B313");
		System.out.println(j.getRomnr());
		*/
		j.skrivUt();
		

	if (j.storreEnn(kontor)) {
		System.out.println(j.getRomnr() + " er størst");
	} else {
		System.out.println(kontor.getRomnr() + " er størst");
	}
	
	String [] t = {"alle", "aldri", "alltid", "test", "ball"};
	int antall = 0;
	for (String s : t) {
		if (s.contains("all")) { 
			antall++;
		}
	}
	System.out.println(antall);
}
}
	