package uebung8.vzb.ch.zhaw.martilu5;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	public int getAnzahl() {
		int anz = 0;
		anz = personen.size();
		return anz;
	}

	public void addPerson(Person p) {
		personen.add(p);
	}
	
	public void printNamen() {
		for (Person x: personen) {
			System.out.println(x.getName());
		}
		
		
	}
	
	public void printPersonen() {
		for (Person x: personen) {
			x.printPerson();
		}
	}
	
	public Person getPerson(int index) {
		Person r = null;
		if (index < personen.size()) {
			r = personen.get(index);
		}
		return r;
	}
	
	public Person getPerson(String name) {
		Person r = null;
		for (Person x: personen) {
			if (x.getName().equals(name)) {
				r = x;
			}
		}
		
		return r;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> m = new ArrayList<Person>(); //gefordeter return typ ist eine Array-List
		
		for (Person x: personen) {
			if (x.getMerkmaleAlsCsv().contains(merkmal)){
				m.add(x); //bei übereinstimmung der Merkmale Personendaten in neuen Array schreiben
			}
		}
		return m;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		//alle übergebenen Personen (mit dem Merkmal) aus der Array-Liste entfernen
		personen.removeAll(toRemove);
		
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		//alle übergebenen Personen (ohne dem Merkmal) aus der Array-Liste entfernen
		personen.retainAll(notToRemove);
		
	}
}
