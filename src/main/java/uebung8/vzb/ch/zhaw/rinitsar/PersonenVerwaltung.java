package uebung8.vzb.ch.zhaw.rinitsar;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	// Test 1
	public int getAnzahl() {
		return personen.size();
	}

	public void addPerson(Person p) {
		personen.add(p);
	}

	// Test 2
	public void printNamen() {
		for (Person p : personen) {
			System.out.println(p.getName());
		}
	}

	// Test 3
	public void printPersonen() {
		for (Person p : personen) {
			p.printPerson();
		}
	}

	// Test 4
	public Person getPerson(int index) {
		if (index >= 0 && index < personen.size()) {
			return personen.get(index);
		}
		return null;
	}

	// Test 5
	public Person getPerson(String name) {
		for (Person p : personen) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	// Test 6
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> alleMit = new ArrayList<Person>();
		for (Person p : personen) {
			if (p.getMerkmaleAlsCsv().contains(merkmal)) {
				alleMit.add(p);
			}
		}
		return alleMit;

	}

	// Test 7
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen = notToRemove;
	}
}

