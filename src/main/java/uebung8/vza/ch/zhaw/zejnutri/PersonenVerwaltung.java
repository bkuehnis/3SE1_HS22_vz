package uebung8.vza.ch.zhaw.zejnutri;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
//		int count=0;
//		for (int i = 0; i < personen.size(); i++) {
//			count++;
//		}
//		return count;
		return personen.size();
	}

	public void addPerson(Person p) {
		personen.add(p);
	}
	
	public void printNamen() {
		for (Person x: personen) {
			System.out.println(x.getName());
		}
	}
	
	public void printPersonen() {
//		String lange = "lange";
//		for (Person p: personen) {
//			if (p.isKurzeHaare() == true)
//				lange = "kurze";
//		}
//		for (Person i : personen) {
//			System.out.println(i.getName()+" hat "+lange+" "+i.getHaarfarbe()+"e Haare und "+i.getAugenfarbe()+"e Augen.");
//		}
		for (Person p: personen) {
			p.printPerson();
		}
	}
	
	public Person getPerson(int index) {
		if (index < personen.size()) {
			return personen.get(index);
		} else {
		} return null;
	}
	
	public Person getPerson(String name) {
		for (Person p: personen) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		var personenMitMerkmal = new ArrayList<Person>();
		for (Person p: personenMitMerkmal) {
			if(p.getMerkmaleAlsCsv().contains(merkmal)) {
				personenMitMerkmal.add(p);
			}
		}
		if (personenMitMerkmal.size() > 0) {
			return personenMitMerkmal;
		}
		return null;
	}
	
    public void removePersonenInListe(ArrayList<Person> toRemove) {
        personen.removeAll(toRemove);
    }

    public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
        personen.retainAll(notToRemove);
    }

}