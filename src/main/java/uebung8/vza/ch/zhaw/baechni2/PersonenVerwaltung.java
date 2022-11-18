package uebung8.vza.ch.zhaw.baechni2;

import java.util.ArrayList;
//hilfe wurde benötigt.
public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
		return personen.size();
	}

	public void addPerson(Person p) {
		personen.add(p);
	}

	public void printNamen() {
		for (Person p : personen) {
			System.out.println(p.getName());
		}
	}

	public void printPersonen() {
		for (Person p : personen) {
			String laenge = p.isKurzeHaare() ? "kurze" : "lange";

			System.out.println(p.getName() + " hat " + laenge + " " + p.getHaarfarbe() + "e Haare und "
					+ p.getAugenfarbe() + "e Augen.");
		}
	}

	public Person getPerson(int index) {
		if (personen.size() < index) {
			return null;
		}
		return personen.get(index);
	}

	public Person getPerson(String name) {
		for (Person p : personen) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> newList = new ArrayList<Person>();
		for (Person p : personen) {
			if (p == null) {
				continue;
			}
			String[] merkmalDetails = merkmal.split(" ");
			if (merkmal.contains("Augen")) {
				if (merkmalDetails[0].contains(p.getAugenfarbe())) {
					newList.add(p);
				}
			} else if (merkmal.contains("Haare")) {
				if (merkmalDetails[0].contains(p.getHaarfarbe())) {
					newList.add(p);
				} else if (merkmalDetails[0].equals("kurze") && p.isKurzeHaare()) {
					newList.add(p);
				} else if (merkmalDetails[0].equals("lange") && !p.isKurzeHaare()) {
					newList.add(p);
				}
			}
		}
		return newList;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		ArrayList<Person> newList = new ArrayList<Person>();
		for (Person p : personen) {
			if (!notToRemove.contains(p)) {
				newList.add(p);
			}
		}
		personen.removeAll(newList);
	}
}
