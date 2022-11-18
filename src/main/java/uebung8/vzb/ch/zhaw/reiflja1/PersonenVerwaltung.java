package uebung8.vzb.ch.zhaw.reiflja1;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
		return personen.size();
	}

	public void addPerson(Person p) {
		personen.add(p);
	}

	public void printNamen() {
		for (Person person : personen) {
			System.out.println(person.getName());
		}
	}

	public void printPersonen() {
		for (Person person : personen) {
			person.printPerson();
		}
	}

	public Person getPerson(int index) {
		if (index >= personen.size()) {
			return null;
		}
		return personen.get(index);
	}

	public Person getPerson(String name) {
		for (Person person : personen) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}

	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		var alleMitMerkmal = new ArrayList<Person>();
		for (Person person : personen) {
			if (person.getMerkmaleAlsCsv().contains(merkmal)) {
				alleMitMerkmal.add(person);
			}
		}
		return alleMitMerkmal;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen = notToRemove;
	}
}
