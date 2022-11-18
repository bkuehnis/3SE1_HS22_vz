package uebung8.vza.ch.zhaw.kernpas1;

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
		for (Person a: personen) {
			System.out.println(a.getName());
		}
	}

	public void printPersonen() {
		for (Person a: personen) {
			a.printPerson();
		}
	}

	public Person getPerson(int index) {
		if (index <= personen.size()) { // if (personen.get(index) != null) warum geht das nicht?
			return personen.get(index);
		} return null;
	}

	public Person getPerson(String name) {
		for (int i=0; i<personen.size(); i++) {  // for (Person a: personen) / if (a.getName().contains(name) / return personen.get(a) !Fehler beim return, weshalb genau?
			if (personen.get(i).getName().contains(name)) {
				return personen.get(i);
			}
		} return null; // sollte es ein treffer geben, wird die Methode beim 1. return beendet.
	}				// gibt es keinen treffer läuft die Schleife durch und geht weiter zu return null
			

	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		var merkmalList = new ArrayList<Person>(); // neue ArrayList erstellen
		for (int i=0; i<personen.size(); i++) {
			if (personen.get(i).getMerkmaleAlsCsv().contains(merkmal)) { // personenList nach merkmalen filtern
				merkmalList.add(personen.get(i)); // treffer in neue ArrayList speichern				
			}
		} return merkmalList; // neue ArrayList zurückgeben.
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) { // in der Main wurde eine ArrayList anhand der Methode getAlleMitMerkmal (rote Haare) erstellt und an diese Methode übergeben
		personen.removeAll(toRemove); // Hier werden alle mit roten Haaren aus der personen ArrayList gelöscht.
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen.retainAll(notToRemove); // Hier werden alle aus ArrayList personen gelöscht bis auf die welche zuvor übergeben wurden (schwarzes Haar)
	}
}
