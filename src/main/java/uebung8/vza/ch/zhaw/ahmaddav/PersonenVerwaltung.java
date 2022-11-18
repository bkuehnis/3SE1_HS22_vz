package uebung8.vza.ch.zhaw.ahmaddav;

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
		for (Person p: personen) {
			System.out.println(p.getName());
		}
	}

	public void printPersonen() {
		for (Person p: personen) {
			p.printPerson();
		}
	}

	public Person getPerson(int index) {
		if (index<personen.size()) {
			return personen.get(index);
		} else {
			return null;
		}
	}

	public Person getPerson(String name) {
		for (Person p: personen) {
			if (p.getName().equals(name)) {
				return p;
			} 

		} return null;
	}

	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> merkmale = new ArrayList<>();
		for (Person p: personen) {
			if (p.getMerkmaleAlsCsv().contains(merkmal)) {
				merkmale.add(p);
			}
		}  return merkmale;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		 personen = notToRemove;
	}
}
