package uebung7.vza.ch.zhaw.kernpas1;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	// Getter-Methode
	public int getAnzahl() {
		return anzahl;
	}
	// b)
	public void addPerson(Person p) {
		personen[anzahl] = p;
		anzahl++;
	}
	// c)
	public void printPersonen() {
		for(int i=0; i<anzahl; i++) {
			personen[i].printPerson();
		}
	}
	// d)
	public Person getPerson(int index) {
		if(index<anzahl) {
			return personen[index];
		} else {
			return null;
		}
	}
	// e)
	public Person getPerson(String name) {
		for(int i=0; i<anzahl; i++) {
			if(personen[i].getName().equals(name)) {
				return personen[i];
			}
		} 
		return null;
	}
	// g)
	public int getAnzahlMitMerkmal(String merkmal) {
		int zähler = 0;
		for(int i=0; i<anzahl; i++) {
			if(personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				zähler++;
			} 
		}
		return zähler;
	}
	// h)
	public Person[] getAlleMitMerkmal(String merkmal) {
		Person [] Alle = new Person[getAnzahlMitMerkmal(merkmal)];
		int posArray = 0;
		for(int i=0; i<anzahl; i++) {
			if(personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				Alle[posArray] = personen[i];
				posArray++;
			}
		}
		return Alle;
	}
}
