package uebung7.vzb.ch.zhaw.osmanmin;


public class WerIstEs {

	public static void main(String[] args) {
		PersonenVerwaltung pv = new PersonenVerwaltung();
		
		Person p1 = new Person("Alex","schwarz",true,"braun");
		Person p2 = new Person("Alfred","rot",false,"blau");
		Person p3 = new Person("Anita","blond",false,"blau");
		Person p4 = new Person("Anne","schwarz",true,"braun");
		Person p5 = new Person("Maria","braun",false,"braun");
		Person p6 = new Person("Robert","braun",true,"blau");
		
		System.out.println("Teilaufgaben b) und c)");
		System.out.println(p1.getName()+" Augen: "+p1.getAugenfarbe());
		System.out.println(p2.getName()+" Haarfarbe: "+p2.getHaarfarbe());
		System.out.println(p3.getName()+" kurze Haare: "+p3.isKurzeHaare());
		
		System.out.println("\nTeilaufgabe d)");
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
		
		System.out.println("\nTeilaufgabe e)");
		System.out.println(p1.getName()+" hat schwarze Haare: "+p1.stimmtHaarfarbe("schwarz")); // true
		System.out.println(p1.getName()+" hat rote Haare: "+p1.stimmtHaarfarbe("rot")); // false
		
		System.out.println("\nTeilaufgabe f)");
		
		// Test Alex
		System.out.println(p1.getName()+" hat kurze Haare: "+p1.isKurzeHaare());
		System.out.println(p1.schneideHaare());
		System.out.println(p1.getName()+" hat kurze Haare: "+p1.isKurzeHaare());
		
		// Test Alfred
		System.out.println(p2.getName()+" hat kurze Haare: "+p2.isKurzeHaare());
		System.out.println(p2.schneideHaare());
		System.out.println(p2.getName()+" hat kurze Haare: "+p2.isKurzeHaare());
		
		System.out.println("a)");
		System.out.println("Anzahl: "+pv.getAnzahl());
		
		System.out.println("b)");
		pv.addPerson(new Person("Tom","schwarz",true,"blau"));
		pv.addPerson(new Person("Alex","schwarz",true,"braun"));
		pv.addPerson(new Person("Maria","braun",false,"braun"));
		pv.addPerson(new Person("Robert","braun",true,"blau"));
		pv.addPerson(new Person("Bernard","braun",true,"braun"));
		pv.addPerson(new Person("Anita","blond",false,"blau"));
		pv.addPerson(new Person("David","blond",true,"blau"));
		pv.addPerson(new Person("Charles","blond",true,"braun"));
		pv.addPerson(new Person("Alfred","rot",false,"blau"));
		pv.addPerson(new Person("Frans","rot",true,"blau"));
		pv.addPerson(new Person("Bill","rot",true,"braun"));
		System.out.println("Anzahl: "+pv.getAnzahl());
		
		System.out.println("c)");
		pv.printPersonen();
		
		System.out.println("d)");
		
	}
}
