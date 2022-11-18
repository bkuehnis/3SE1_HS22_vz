package uebung8.vzb.ch.zhaw.weberm08;

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
		for (int i = 0; i < getAnzahl(); i++) {
			System.out.println(personen.get(i).getName());
		}
		
	}
	
	public void printPersonen() {
		for (int i = 0; i < getAnzahl(); i++) {
			String converterLaenge = personen.get(i).laenge == true ? "kurze" : "lange";
			System.out.println(personen.get(i).name + " hat " + converterLaenge + " " + personen.get(i).haarFarbe + " Haare und " + personen.get(i).augenfarbe + " Augen.");
		}
	}
	
	public Person getPerson(int index) {
		if (index < getAnzahl()) {
			return personen.get(index);
		}
		return null;
	}
	
	public Person getPerson(String name) {
		for (int i = 0; i < getAnzahl(); i++) {
			if (personen.get(i).getName() == name) {
				return personen.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> personenNamenListe =  new ArrayList<Person>(); 
		for (int i = 0; i < getAnzahl(); i++) {
			if (personen.get(i).getMerkmaleAlsCvs().contains(merkmal)) {
				personenNamenListe.add(personen.get(i));
			}
		}
		return personenNamenListe;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		for (Person p : toRemove) {
			personen.remove(p);
		}
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		ArrayList<Person> personenToBeRemoved = new ArrayList<Person>(); 
		for (Person p : personen) {
			if (!notToRemove.contains(p)) {
				personenToBeRemoved.add(p);
			}
		}
		personen.removeAll(personenToBeRemoved);
	}
}
