package uebung8.vza.ch.zhaw.oezkasin;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
		int anzahl = personen.size();
		return anzahl;
	}

	public void addPerson(Person p) {
		for (Person pv : personen) {
			System.out.println(pv);
		}
	}

	public void printNamen() {
		for (Person p : personen) {
			System.out.println(p.getName());
		}
	}

	public void printPersonen() {
		for (Person pr : personen) {
			if (pr.isKurzeHaare()) {
			System.out.println(pr.getName()+" hat kurze "+pr.getHaarfarbe()+"e Haare und "+pr.getAugenfarbe()+"e Augen.");
		} else {
			System.out.println(pr.getName()+" hat lange "+pr.getHaarfarbe()+"e Haare und "+pr.getAugenfarbe()+"e Augen.");
		}
		}
	}

	public Person getPerson(int index) {
		for (Person pe : personen) {
			personen.add(0, pe);
		}
		return null;
	}

	public Person getPerson(String name) {
		for (Person na : personen) {
			personen.add(0, na);
		}
		return null;
	}

	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		return null;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {

	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {

	}
}
