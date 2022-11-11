package uebung7.vzb.ch.zhaw.rinitsar;

public class PersonenVerwaltung {

	
	private Person[] personen = new Person[30];

	private int anzahl = 0;

	public int getAnzahl() {
		return anzahl;
	}

	public void addPerson(Person person) {
		personen[anzahl] = person;
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
			if (personen[i].getName().equalsIgnoreCase(name)) {
				return personen[i];
			}
		}
		return null;
	}

	public int getAnzahlMitMerkmal(String merkmal) {
		int anzPers = 0;
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal))
				anzPers++;
		}
		return anzPers;
	}

	public Person[] getAlleMitMerkmal(String merkmal) {
		int index = 0;
		Person[] allePers = new Person[getAnzahlMitMerkmal(merkmal)];
		for (int i = 0; i < anzahl; i++) {
			Person temp = personen[i];
			if (temp.getMerkmaleAlsCsv().contains(merkmal)) {
				allePers[index] = temp;
				index++;
			}
		}
		return allePers;
	}
}