package uebung8.vzb.ch.zhaw.toddara1;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
		// int anzahl = 0;

//		for (int i = 1; i <= personen.size(); i++) {
//			anzahl = i;
//
//		}

		return personen.size();
	}

	public void addPerson(Person p) {
		personen.add(p);

	}

	public void printNamen() {
		for (Person p : personen) {
			System.out.println(p.getName());
		}

	}

	public void printPersonen() {
		for (Person p : personen) {
			p.printPerson();
		}
		
		// Alte Variante
//		for (int i = 0; i < personen.size(); i++) {
//			personen.get(i).printPerson();
//			
//		}

	}

	public Person getPerson(int index) {
		if (index > personen.size() || index < 0) {
			return null;
		} else {
//			Person p = personen.get(index);
//			return p;
			
			return personen.get(index);
		}
	}

	public Person getPerson(String name) {
		for (Person p: personen) {
			if (p.getName().equals(name)) {
				return p;
			} 
		}
		
		return null;
		//int index = personen.
		//return personen.get(index);
		
	}

	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> resultat = new ArrayList<Person>();
		
		
		for (Person p: personen) {
			if (p.getMerkmaleAlsCsv().contains(merkmal)) {
				resultat.add(p);
			} 
		}
		
		return resultat;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);

	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen = notToRemove;
	}
}
