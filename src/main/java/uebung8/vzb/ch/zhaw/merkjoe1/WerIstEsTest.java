package uebung8.vzb.ch.zhaw.merkjoe1;

import java.util.ArrayList;

public class WerIstEsTest {

	public static void main(String[] args) {
		PersonenVerwaltung pv = new PersonenVerwaltung();		

		System.out.println("Test 1");
		System.out.println("Anzahl: "+pv.getAnzahl());
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

		System.out.println("\nTest 2");
		pv.printNamen();
		
		System.out.println("\nTest 3");
		pv.printPersonen();

		System.out.println("\nTest 4");
		Person p2 = pv.getPerson(2);
		if (p2 != null) {
			System.out.println(p2.getName());
			System.out.println(p2.getAugenfarbe());
		} else {
			System.out.println("Fehler. Person 2 konnte nicht gelesen werden");
		}
		System.out.println("Rueckgabe bei ungueltigem Index: "+pv.getPerson(12));
		
		System.out.println("\nTest 5");
		Person p3 = pv.getPerson("Frans");
		if (p3 != null) {
			System.out.println(p3.getName());
			System.out.println(p3.getAugenfarbe());
		} else {
			System.out.println("Fehler. Frans konnte nicht gelesen werden");
		}
		System.out.println("Rueckgabe bei ungueltigem Namen: "+pv.getPerson("Ulf"));

		System.out.println("\nTest 6");
		System.out.println("- alle mit langen Haaren:");
		ArrayList<Person> langeHaare = pv.getAlleMitMerkmal("lange Haare"); 
		if (langeHaare != null) {
			for (Person l: langeHaare) {
				System.out.println(l.getName());
			}
		} else {
			System.out.println("Fehler bei getAlleMitMerkmal lange Haare");
		}
		System.out.println("- alle mit braunen Augen:");
		ArrayList<Person> brauneAugen = pv.getAlleMitMerkmal("braune Augen"); 
		if (brauneAugen != null) {
			for (Person l: brauneAugen) {
				System.out.println(l.getName());
			}
		} else {
			System.out.println("Fehler bei getAlleMitMerkmal braune Augen");
		}

		System.out.println("\nTest 7");
		System.out.println("- alle mit roten Haaren wurden entfernt:");
		ArrayList<Person> roteHaare = pv.getAlleMitMerkmal("rote Haare");
		pv.removePersonenInListe(roteHaare);
		pv.printNamen();
		ArrayList<Person> schwarzeHaare = pv.getAlleMitMerkmal("schwarze Haare");
		System.out.println("- alle mit nicht schwarzen Haaren wurden entfernt:");
		pv.removePersonenNichtInListe(schwarzeHaare);
		pv.printNamen();

	}
}
