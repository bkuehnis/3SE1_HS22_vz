package uebung7.vzb.ch.zhaw.rechsfil;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person[] personen = new Person[30];

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	// getter-Methode für Attribut anzahl
	public int getAnzahl() {
		return anzahl;
	}

	// b

	public void addPerson(Person p) {

		personen[anzahl] = p;
		anzahl++;
	}

//c

	public void printPersonen() {

		for (int i = 0; i < anzahl; i++) {
			if (personen[i].isKurzeHaare() == true) {
				System.out.println(personen[i].getName() + " hat " + "kurze " + personen[i].getHaarfarbe()
						+ "e Haare und " + personen[i].getAugenfarbe() + "e Augen.");
			} else {
				System.out.println(personen[i].getName() + " hat " + "lange " + personen[i].getHaarfarbe()
						+ "e Haare und " + personen[i].getAugenfarbe() + "e Augen.");
			}
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

//g
		int count = 0;
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				count++;
			}
			
		}
		return count;
	}

}

