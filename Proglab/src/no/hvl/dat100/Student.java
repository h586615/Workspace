package no.hvl.dat100;

public class Student {
	private static final int GUT = 1;
	private static final int JENTE = 2;
	
	private int snr;
	private String navn;
	private int kjonn;
	
	public Student(int snr, String navn, int kjonn) {
		this.snr = snr;
		this.navn = navn;
		this.kjonn = kjonn;
	}
	//@Override
	public String toString() {
		return snr + " " + navn;
	}
	
	@Override
	public boolean equals(Object annet) {
		if (this == annet) {
			return true;
		}
		if (annet == null || !(annet instanceof Student)) {
			return false;
		}
		Student s = (Student) annet;
		return this.snr == s.snr && this.kjonn == s.kjonn;
	}
	
	public static void main (String[] args) {
		
	}
}
