package uebung6.vzb.ch.zhaw.durmibet;

public class WerIstEs {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alex", "schwarz", true, "braun");
		Person p2 = new Person("Alfred", "rot", false, "blau");
		Person p3 = new Person("Anita", "blond", false, "blau");
		Person p4 = new Person("Anne", "schwarz", true, "braun");
		Person p5 = new Person("Maria", "braun", false, "braun");
		Person p6 = new Person("Robert", "braun", true, "blau");
		
	    p4.printPerson();
	    p5.printPerson();
	    p6.printPerson();
	    
	    p1.stimmtHaarfarbe("schwarz");
	    p1.stimmtHaarfarbe("blond");
	    p1.stimmtHaarfarbe("braun");
	    p1.stimmtHaarfarbe("grün");
	    
	    p1.schneideHaare();
	    p2.schneideHaare();
	    p3.schneideHaare();
	    p4.schneideHaare();
	    p5.schneideHaare();
	    p6.schneideHaare();
		
		
		System.out.println(p1.getName() + " Augen: " + p1.getAugenfarbe());
		System.out.println(p2.getName() + " Haarfarbe: " + p2.getHaarfarbe());
		System.out.println(p3.getName() + " kurze Haare: " + p3.isKurzeHaare());
	}
}

