package uebung8.vzb.ch.zhaw.strubili;

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
		for (Person x: personen) {
			System.out.println(x.getName());
		}
	}
	
	public void printPersonen() {
		
		for (int i = 0;i<personen.size();i++) {
			String haare = "lange ";
			if (personen.get(i).isKurzeHaare()) {
				haare = "kurze ";}
			System.out.println(personen.get(i).getName()+" hat "+haare+"Haare und "
					+personen.get(i).getAugenfarbe()+"e Augen.");	
		}
	}
	
	public Person getPerson(int index) {
		if (index<personen.size()) {
			return personen.get(index);	
		} else {
			return null;
		}
		
	}
	
	public Person getPerson(String name) {
		for (Person x: personen) {
			if (x.getName().contains(name)) {
				return x;
			}
		}
		return null;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		var Personenmitmerkmal = new ArrayList<Person>();
		for(Person x:personen) {
			if (x.getMerkmaleAlsCsv().contains(merkmal)) {
				Personenmitmerkmal.add(x);
			}
		}
		return Personenmitmerkmal;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		var personentoberemoved = new ArrayList<Person>();
		for (Person x: personen) {
			if (toRemove.contains(x)) {
				personentoberemoved.add(x);
			}
		}
		personen.removeAll(personentoberemoved);
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		var personennottoberemoved = new ArrayList<Person>();
		for (Person x: personen) {
			if (!notToRemove.contains(x)) {
				personennottoberemoved.add(x);
			}
		}
		personen.removeAll(personennottoberemoved);
	}
}
