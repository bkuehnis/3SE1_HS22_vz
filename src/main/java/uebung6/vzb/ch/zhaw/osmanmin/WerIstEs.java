package uebung6.vzb.ch.zhaw.osmanmin;

public class WerIstEs {
	
	public static void main(String[] args) {
		Person p1 = new Person("Alex", "schwarz", true, "braun");
		Person p2 = new Person("Alfred", "rot", false, "blau");
		Person p3 = new Person("Anita", "blond", false, "blau");
		Person p4 = new Person("Anne", "schwarz", true, "braun");
		Person p5 = new Person("Maria", "braun", false, "braun");
		Person p6 = new Person("Robert", "braun", true, "blau");
		
		System.out.println(p1.getName() + " Augen: " + p1.getAugenfarbe());
		System.out.println(p2.getName() + " Haarfarbe: " + p2.getHaarfarbe());
		System.out.println(p3.getName() + " kurze Haare: " + p3.iskurzeHaare());
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		System.out.println(p1.getName() + " hat " + p1.getHaarfarbe() + "e Haare: " + p1.stimmtHaarfarbe(null));
		System.out.println(p1.getName() + " hat " + p3.getHaarfarbe() + "e Haare: " + p1.stimmtHaarfarbe(null));
		p1.schneideHaare();
		p2.schneideHaare();
	}
}