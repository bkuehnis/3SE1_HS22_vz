package uebung7.vzb.ch.zhaw.reiflja1;


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
		return personen[index];
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
		int treffer = 0;
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				treffer++;
			}

		}
		return treffer;
	}

	public Person[] getAlleMitMerkmal(String merkmal) {
		Person[] alleMitMerkmale = new Person[getAnzahlMitMerkmal(merkmal)];
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				for (int j = 0; j < alleMitMerkmale.length; j++) {
					if (alleMitMerkmale[j] == null) {
						alleMitMerkmale[j] = personen[i];
						break;
					}
				}
			}
		}
		return alleMitMerkmale;
	}
}
