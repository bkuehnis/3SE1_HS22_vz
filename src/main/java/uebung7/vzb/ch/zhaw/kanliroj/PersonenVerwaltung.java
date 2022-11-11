package uebung7.vzb.ch.zhaw.kanliroj;


public class PersonenVerwaltung {

	private Person [] personen = new Person[30]; 
	private int anzahl = 0;
	
	public int getAnzahl() {
		return anzahl;
	}

	public void addPerson(Person p) {
		personen[anzahl] = p;
		anzahl++;
	}

	public void printPersonen() {
		for (int i=0; i<anzahl; i++) {
			personen[i].printPerson();
		}
	}
	
	public Person getPerson (int index) {
		if (index > anzahl) {
			return null;
		} else {
			return personen[index];
		}
	}
	
	public Person getPerson(String name) {
		for (int i=0; i<anzahl; i++)
			if (name.equals(personen[i].getName())) {
				return personen[i];
			}

		return null;	
	}

	public int getAnzahlMitMerkmal (String merkmal) {
		int counter = 0;
		for (int i=0; i<anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				counter++;
			}
		}
		return counter;
	}

	public Person[] getAlleMitMerkmal(String merkmal) {
		int counter = 0;
		Person [] alleMitMerkmal = new Person [8];
		for (int i=0; i<anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				alleMitMerkmal[counter] = personen [i];
				counter++;
			}
		}
		return alleMitMerkmal;
	}}


	
	
	
	
	
	
	
	
	
	
	
	
	