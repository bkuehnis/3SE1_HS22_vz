package uebung8.vza.ch.zhaw.bauerfel;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
		int i = 0;
		for (Person p : personen) {
			if (p != null) {
				i++;
			}
		}
		return i;
	}

	public void addPerson(Person p) {
		personen.add(p);
	}

	public void printNamen() {
		for (Person p : personen) {
			if (p != null) {
				System.out.println(p.getName());
			}
		}
	}

	public void printPersonen() {
		for (Person p : personen) {
			if (p != null) {
				p.printPerson();
			}
		}
	}

	public Person getPerson(int index) {
		
		if (personen.get(index).equals(null))
			return null;

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
		ArrayList<Person> hatMerkmal= new ArrayList<Person>();
		for (Person p : personen) {
			String kh = "Haare";
			String lh = "Haare";
	    if (p.isKurzeHaare()) {
	    	kh = "kurze Haare";
	    }else {
	    	lh = "lange Haare";
	    }
		if(p.getName().contains(merkmal) || p.getHaarfarbe().contains(merkmal) || p.getAugenfarbe().contains(merkmal) || lh.contains(merkmal) || kh.contains(merkmal)) {
			
			hatMerkmal.add( p);
			
		}
		}
		return hatMerkmal;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		for (Person p : personen) {
		personen.remove(toRemove);
	}
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		
	}
}
