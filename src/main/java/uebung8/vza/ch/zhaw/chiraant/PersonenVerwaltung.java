package uebung8.vza.ch.zhaw.chiraant;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	public int getAnzahl() {
		int i =0;
		i = personen.size();
		return i;
	}
	public void addPerson(Person p) {
		personen.add(p);
	}
	
	public void printNamen() {
		for (Person p: personen) {
			System.out.println(p.getName());
		}
	}
	
	public void printPersonen() {
		for (Person p:personen) {
			if (p.isKurzeHaare()== true) {
			System.out.println(p.getName()+" hat "+ "kurze "+ p.getHaarfarbe()+"e Haare "+p.getAugenfarbe()+"e Augen.");
			} else {
				System.out.println(p.getName()+" hat "+ "lange "+ p.getHaarfarbe()+"e Haare "+p.getAugenfarbe()+"e Augen.");
			}
		}
	}
	
	public Person getPerson(int index) {
		if (index < personen.size()) {
			return personen.get(index);
		}
		return null;
	}
	
	public Person getPerson(String name) {
		/*for(Person p:personen) {
			if (name.equals(p.getName())) {
			return p.getName();
			
			}
			
		}*/ 
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
