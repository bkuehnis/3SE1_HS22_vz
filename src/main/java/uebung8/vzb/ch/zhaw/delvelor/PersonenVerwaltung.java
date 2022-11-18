package uebung8.vzb.ch.zhaw.delvelor;

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
		if (index > personen.size()) {
			return null;
		}
		return personen.get(index);
	}
	
	public Person getPerson(String name) {
		for (Person p: personen) {
			if (p.getName().equals(name)) {
				return p;
			} 
		}
		return null;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> x = new ArrayList<Person>();
		for (Person p: personen) {
			if (p.getMerkmaleAlsCsv().contains(merkmal)) {
				x.add(p);
			}
		}
		return x;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		for (Person p: toRemove) {
			personen.remove(p);
		}
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen.removeAll(personen);
		for (Person p: notToRemove) {
			personen.add(p);
		}
	}
	
}
