package uebung8.vzb.ch.zhaw.landsfre;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	
	public int getAnzahl() {
		return personen.size();
	}
	public void addPerson(Person p) {
		personen.add(personen.size(),p);
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
		if(index > personen.size()) {
			return null;
		}else {
			return personen.get(index);
		}
	}
	
	public Person getPerson(String name) {
		for (int i = 0; i < personen.size(); i++) {
			if (personen.get(i).getName().equals(name)) {
				return personen.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> personenMitMerkmal = new ArrayList<Person>();
		for (Person x: personen) {
			if (x.getMerkmaleAlsCsv().contains(merkmal)){
				personenMitMerkmal.add(personenMitMerkmal.size(),x);
			}
		}
		return personenMitMerkmal;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		ArrayList<Person> toRemove = new ArrayList<Person>();
		for (int i = 0; i < personen.size(); i++) {
			if (notToRemove.contains(personen.get(i))) {
				
			}else {
				toRemove.add(toRemove.size(),personen.get(i));
			}
		}
		personen.removeAll(toRemove);
	}
}
