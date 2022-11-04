package uebung6.vzb.ch.zhaw.rinitsar;

public class WerIstEs {
	public static void main(String[] args) {
		Person p1 = new Person("Alex", "schwarz", true, "braun");
		Person p2 = new Person("Alfred", "rot", false, "blau");
		Person p3 = new Person("Anita", "blond", false, "blau");
		Person p4 = new Person("Anne", "schwarz", true, "braun");
		Person p5 = new Person("Maria", "braun", false, "braun");
		Person p6 = new Person("Robert", "braun", true, "blau");

		//System.out.println(p1.getName () + " Augen: " + p1.getAugenfarbe());
		//System.out.println(p2.getName () + " Haarfarbe: " + p2.getHaarfarbe());
		//System.out.println(p3.getName () + " kurze Haare: " + p3.isKurzeHaare());
		
		//Ausgabe Aufgabe d) 
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		
		//Ausgabe Aufgabe e)
		p1.stimmtHaarfarbe("blond");
		p1.stimmtHaarfarbe("schwarz");
		p2.stimmtHaarfarbe("rot");
		p2.stimmtHaarfarbe("blond");
		p3.stimmtHaarfarbe("blond");
		p3.stimmtHaarfarbe("braun");
		p4.stimmtHaarfarbe("schwarz");
		p4.stimmtHaarfarbe("rot");
		p5.stimmtHaarfarbe("braun");
		p5.stimmtHaarfarbe("blond");
		p6.stimmtHaarfarbe("braun");
		p6.stimmtHaarfarbe("schwarz");
		
		//Ausgabe Aufgabe f)
		p1.schneideHaare();
		p2.schneideHaare();
		p3.schneideHaare();
		p4.schneideHaare();
		p5.schneideHaare();
		p6.schneideHaare();
	}
}