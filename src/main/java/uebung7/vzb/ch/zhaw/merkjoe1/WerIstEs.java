package uebung7.vzb.ch.zhaw.merkjoe1;


public class WerIstEs {
	
	public static void main(String[] args) {
		
		/*Person p1 = new Person("Alex", "schwarz", true, "braun");
		Person p2 = new Person("Alfred", "rot", false, "blau");
		Person p3 = new Person("Anita", "blond", false, "blau");
		Person p4 = new Person("Anne", "schwarz", true, "braun");
		Person p5 = new Person("Maria", "braun", false, "braun");
		Person p6 = new Person("Robert", "braun", true, "blau");

		System.out.println(p1.getName() + " Augen: " + p1.getAugenfarbe());
		System.out.println(p2.getName() + " Haarfarbe: " + p2.getHaarfabe());
		System.out.println(p3.getName() + " kurze Haare: " + p3.iskurzeHaare());
		
		p4.printPerson();
		p5.printPerson();
		p6.printPerson();
	
		System.out.println(p1.getName() + " hat " + p1.getHaarfabe() + "e Haare: " + p1.stimmtHaarfarbe(" schwarz"));
		System.out.println(p2.getName() + " hat " + p2.getHaarfabe() + "e Haare: " + p2.stimmtHaarfarbe(" schwarz"));
		
		System.out.println(p1.schneideHaare());
		System.out.println(p3.schneideHaare()); //Haare sind lang
		System.out.println(p3.schneideHaare()); //Haare sind kurz*/
		
		PersonenVerwaltung persVer = new PersonenVerwaltung();
		
		System.out.println("a)");
		System.out.println("Anzahl: "+persVer.getAnzahl());
		
		System.out.println("b)");
		 persVer.addPerson(new Person("Tom","schwarz",true,"blau"));
		 persVer.addPerson(new Person("Alex","schwarz",true,"braun"));
		 persVer.addPerson(new Person("Maria","braun",false,"braun"));
		 persVer.addPerson(new Person("Robert","braun",true,"blau"));
		 persVer.addPerson(new Person("Bernard","braun",true,"braun"));
		 persVer.addPerson(new Person("Anita","blond",false,"blau"));
		 persVer.addPerson(new Person("David","blond",true,"blau"));
		 persVer.addPerson(new Person("Charles","blond",true,"braun"));
		 persVer.addPerson(new Person("Alfred","rot",false,"blau"));
		 persVer.addPerson(new Person("Frans","rot",true,"blau"));
		 persVer.addPerson(new Person("Bill","rot",true,"braun"));
		 
		 System.out.println("Anzahl: "+persVer.getAnzahl());
		 
		 System.out.println("c)");
		 persVer.printPersonen();
		 
		 System.out.println("d)");
		 Person p2 = persVer.getPerson(2);
		 System.out.println(p2.getName());
		 System.out.println(p2.getAugenfarbe());
		 System.out.println(persVer.getPerson(15));
		 
		 System.out.println("e)");
		 Person p3 = persVer.getPerson("Alfred");
		 System.out.println(p3.getAugenfarbe());
		 System.out.println(p3.getHaarfabe());
		 System.out.println(persVer.getPerson("Hans"));
		 
		 System.out.println("f)");
		 System.out.println(persVer.getPerson(1).getMerkmaleAlsCsv());
		 System.out.println(persVer.getPerson(3).getMerkmaleAlsCsv());
		 System.out.println(persVer.getPerson(5).getMerkmaleAlsCsv());
		 
		 System.out.println("g)");
		 System.out.println("blaue Augen: "+persVer.getAnzahlMitMerkmal("blaue Augen"));
		 System.out.println("braune Augen: "+persVer.getAnzahlMitMerkmal("braune Augen"));
		 System.out.println("rote Haare: "+persVer.getAnzahlMitMerkmal("rote Haare"));
		 System.out.println("kurze Haare: "+persVer.getAnzahlMitMerkmal("kurze Haare"));
	}
}