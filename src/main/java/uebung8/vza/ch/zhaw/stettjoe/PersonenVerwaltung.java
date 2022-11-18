package uebung8.vza.ch.zhaw.stettjoe;

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
		for (Person x: personen) {
			System.out.println(x.getName());
		}
	}
	
	public void printPersonen() {
		for (Person x: personen) {
			System.out.println(x.getName() +" hat "+ x.getMerkmaleAlsCsv());
		}
	}
	
	public Person getPerson(int index) {
		if (index > personen.size()-1) {
			return null;
		} else {
			return personen.get(index);
		}
	}
	
	public Person getPerson(String name) {
		Person p = null;
		for (Person x: personen) {
			if (x.getName().equals(name)) {
				p = x;
			}
		}
		return p;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> merkmale = new ArrayList<Person>();
		for (Person x: personen) {
			if (x.getMerkmaleAlsCsv().contains(merkmal)) {
				merkmale.add(x);
			}
		}
		return merkmale;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen.clear();
		for (Person x: notToRemove) {
			personen.add(x);
		}
	}
}
