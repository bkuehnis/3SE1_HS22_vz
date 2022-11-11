package uebung7.vzb.ch.zhaw.bauckluc;


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
			if (personen[i].isKurzeHaare() == true) {
				System.out.println(personen[i].getName() + " hat kurze " + personen[i].getHaarfarbe() + "e Haare und "
						+ personen[i].getAugenfarbe() + "e Augen.");
			} else {
				System.out.println(personen[i].getName() + " hat lange " + personen[i].getHaarfarbe() + "e Haare und "
						+ personen[i].getAugenfarbe() + "e Augen.");
			}
		}
	}

	public Person getPerson(int index) {
		if (index < anzahl) {
			return personen[index];
		} else {
			return null;
		}
	}

	public Person getPerson(String name) {
		for (int j = 0; j < anzahl; j++) {
			if (name.equals(personen[j].getName())) {
				return personen[j];
			}
		}
		return null;
	}

	public int getAnzahlMitMerkmal(String merkmal) {
		int anzahlMatches = 0;
		for (int k = 0; k < anzahl; k++) {
			if (personen[k].getMerkmaleAlsCsv().contains(merkmal)) {
				anzahlMatches++;
			}
		}
		return anzahlMatches;
	}

}
