package uebung7.vza.ch.zhaw.weberth6;


public class WerIstEs {

	public static void main(String[] args) {
		
		PersonenVerwaltung pv = new PersonenVerwaltung();
		
		//a
		System.out.println("a)");
		System.out.println("Anzahl: "+ pv.getAnzahl());
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
		
		
		
		
		
		
		//b
		System.out.println("b)");
		System.out.println("Anzahl: "+ pv.getAnzahl());
		
		//c
		System.out.println("c)");
		pv.printPersonen();
		
		
		//d
		System.out.println("d)");
		Person p2 = pv.getPerson(2);
		System.out.println(p2.getName());
		System.out.println(p2.getAugenfarbe());
		System.out.println(pv.getPerson(15));
		
		//e
		System.out.println("e)");
		Person alfred = pv.getPerson("Alfred");
		System.out.println(alfred.getAugenfarbe());
		System.out.println(alfred.getHaarfarbe());
		System.out.println(pv.getPerson("Hans"));
		
		
		//f
		System.out.println("f)");
		System.out.println(pv.getPerson(1).getMerkmaleAlsCsv());
		System.out.println(pv.getPerson(3).getMerkmaleAlsCsv());
		System.out.println(pv.getPerson(5).getMerkmaleAlsCsv());
		
		
		
	}
}
