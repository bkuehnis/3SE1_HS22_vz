package uebung7.vza.ch.zhaw.kuralsar;


public class WerIstEs {

	public static void main(String[] args) {

		PersonenVerwaltung pv = new PersonenVerwaltung();

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
	}
}
