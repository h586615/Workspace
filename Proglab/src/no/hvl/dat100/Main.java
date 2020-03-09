package no.hvl.dat100;

public class Main {

	public static void main(String[] args) {
		Student s = new Student(1, "Ole", 1);
		System.out.println(s.toString());
		Student t = new HvlStudent(2, "Kari , ", 2, " Data", "Bergen", true);
		System.out.println(t);
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		String s3 = s1;
		
		
		Student u = new Student(1, "Anne", 2);
		
		System.out.println(s.equals(u));
		System.out.println(s.equals(null));
		System.out.println(s.equals("Ole"));
		//System.out.println(s1 == s2);
		//System.out.println(s1.contentEquals(s2));
		//System.out.println(s1 == s3);
	}
}
