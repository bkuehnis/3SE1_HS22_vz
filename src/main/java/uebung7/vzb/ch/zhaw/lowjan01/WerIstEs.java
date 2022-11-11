package uebung7.vzb.ch.zhaw.lowjan01;


public class WerIstEs {

	public static void main(String[] args) {

		PersonenVerwaltung pv = new PersonenVerwaltung();
//		Person ps = new Person();

		System.out.println("a)");
		System.out.println("Anzahl: " + pv.getAnzahl());

		System.out.println("b)");
		pv.addPerson("Tom", "schwarz", true, "blau");
		pv.addPerson("Alex", "schwarz", true, "braun");
		pv.addPerson("Maria", "braun", false, "braun");
		pv.addPerson("Robert", "braun", true, "blau");
		pv.addPerson("Bernard", "braun", true, "braun");
		pv.addPerson("Anita", "blond", false, "blau");
		pv.addPerson("David", "blond", true, "blau");
		pv.addPerson("Charles", "blond", true, "braun");
		pv.addPerson("Alfred", "rot", false, "blau");
		pv.addPerson("Frans", "rot", true, "blau");
		pv.addPerson("Bill", "rot", true, "braun");
		System.out.println("Anzahl: " + pv.getAnzahl());

		System.out.println("c)");
		pv.printPersonen();

//		System.out.println("d)");
//		Person p2 = pv.getPerson(2);
//		System.out.println(p2.getName());
//		System.out.println(p2.getAugenfarbe());
//		System.out.println(pv.getPerson(15));

	//////********* Zeigt mir einen Fehler an,resp. die Methode wird nicht erkannt
//		System.out.println("f)");
//		System.out.println(getMerkmaleAlsCsv(1));
//		System.out.println(getMerkmaleAlsCsv(2));
//		System.out.println(getMerkmaleAlsCsv(3));
	}

}
