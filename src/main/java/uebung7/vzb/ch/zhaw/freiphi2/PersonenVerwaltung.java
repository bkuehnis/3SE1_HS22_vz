package uebung7.vzb.ch.zhaw.freiphi2;

import java.util.Arrays;

public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person[] personen = new Person[30];
	int j = 0;
	int k = 0;
	int m = 0;

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return anzahl;
	}

	public void addPerson(Person p) {

		personen[j] = p;
		j++;
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
		return personen[8];
	}

	public int getAnzahlMitMerkmal(String merkmal) {
		int bla = 0;
		for (int i = 0; i < anzahl; i++) {

			if (personen[i].matches(merkmal)) {
				bla++;
			}
		}
		return bla;

	}

}
