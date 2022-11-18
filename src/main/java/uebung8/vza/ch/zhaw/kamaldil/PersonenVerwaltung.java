package uebung8.vza.ch.zhaw.kamaldil;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	public int getAnzahl() {
		int Anzahl =personen.size();
		return Anzahl;
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
		String Haare = "";
		for (Person p : personen) {
			if (p.isKurzeHaare() == true) {
				Haare = "kurze";
			} else {
				Haare = "lange";
			}

			System.out.println(p.getName() + " hat " + Haare +" "+ p.getHaarfarbe() + "e Haare und "  + p.getAugenfarbe() + "e Augen.");
		}
	}

	public Person getPerson(int index) {
		if (index < personen.size()) {
			return personen.get(index);
		}	else {
			return null;
		}
	}
	public Person getPerson(String name) {
		int i = 0;
		while (i < personen.size()-1){
			personen.get(i).getName().equals(name);
			i++;
		}
		if (i < personen.size()) {
			return personen.get(i);
		} else {
			return null;
		}
	}


	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> mit = new ArrayList<Person>();

		for (Person p: personen) {	
			//String [] suchWort = merkmal.split(" ");
			if (p.getMerkmaleAlsCsv().contains(merkmal)) {
				mit.add(p);
			}
		} 
		return mit;


	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen = notToRemove;



}
}
