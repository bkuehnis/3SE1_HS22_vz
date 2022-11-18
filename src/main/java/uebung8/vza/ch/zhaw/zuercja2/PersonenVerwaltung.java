package uebung8.vza.ch.zhaw.zuercja2;

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
		for(Person p: personen) {
			p.printPerson();
		}
	}
	
	public Person getPerson(int index) {
		if(index>personen.size()) {
			return null;
		}
		return personen.get(index);
	}
	
	public Person getPerson(String name) {
		for (Person p: personen) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> getAlleMitMerkmal = new ArrayList<Person>();
		for(Person p: personen) {
			if(p.getMerkmaleAlsCsv().contains(merkmal)) {
				getAlleMitMerkmal.add(p);
			}
		}
		return getAlleMitMerkmal;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
		
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen = notToRemove;
	}
}
