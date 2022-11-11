package uebung7.vza.ch.zhaw.loretyan;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person[] personen = new Person[30];

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return anzahl;
	}

	public void addPerson(Person p) {
		personen[anzahl] = p;
		anzahl++;
	}

	public void printPersonen() {
		for (int i = 0; i < anzahl; i++) {
			personen[i].printPerson();
		}
	}

	public Person getPerson(int index) {
		if (index <= anzahl) {
			return personen[index];
		}
		return null;
	}

	public Person getPerson(String name) {
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getName().equals(name)) {
				return personen[i];
			}
		}
		return null;
	}
	
	public int getAnzahlMitMerkmal(String merkmal) {
		int anzahlMitMerkmal = 0;
		
		for(int i = 0; i < anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				anzahlMitMerkmal++;
			}
		}
		return anzahlMitMerkmal; 
	}

}
