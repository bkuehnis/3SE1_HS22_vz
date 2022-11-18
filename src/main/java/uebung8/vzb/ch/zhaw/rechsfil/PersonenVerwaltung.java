package uebung8.vzb.ch.zhaw.rechsfil;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
		return personen.size();
	}

	public void addPerson(Person p) {
		personen.add(p);

	}

	public void printNamen() {
		for (Person anzahl : personen) {
			System.out.println(anzahl.getName());
		}

	}

	public void printPersonen() {
		for (Person anzahl : personen) {
			if (anzahl.isKurzeHaare()) {
				System.out.println(anzahl.getName() + " hat kurze " + anzahl.getHaarfarbe() + "e Haare und "
						+ anzahl.getAugenfarbe() + "e Augen");
			}

			else {
				System.out.println(anzahl.getName() + " hat lange " + anzahl.getHaarfarbe() + "e Haare und "
						+ anzahl.getAugenfarbe() + "e Augen");
			}
		}
	}

	public Person getPerson(int index) {
		if (this.personen.size() > index) {
			return this.personen.get(index);
		}
		return null;
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
		ArrayList<Person> personen2 = new ArrayList<Person>();
		for (Person p : personen) {
			if(p.getMerkmaleAlsCsv().contains(merkmal)) {
				personen2.add(p);
			}
		}
		
		return personen2;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		
		personen.removeAll(toRemove);
		
		
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {

		personen = notToRemove;
		
		
	}
}
