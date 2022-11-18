package uebung8.vza.ch.zhaw.gavindom;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	public int getAnzahl() {
		int Kuchen = 0;
		for (int i=0; i<personen.size(); i++) {
			Kuchen++; 
			}
			return Kuchen;
	}

	public void addPerson(Person p) {
		personen.add(p);
		}
	
	public void printNamen() {
		for (Person a: personen) {
		System.out.println(a.getName());
		}
	}
	
	public void printPersonen() {
		for (Person a: personen) {
			a.printPerson();
			}
	}
	
	public Person getPerson(int index) {
		if (index > personen.size()) {
		return null;
		} else {
			return personen.get(index);
		}
	}
	
	public Person getPerson(String name) {
			for (Person b: personen) {
			String Test = b.getName();
			
				if (Test.equals(name)){
				return b;
				} 
			}
		return null;
	}
	
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		
		ArrayList<Person> PEX = new ArrayList<Person>();
		
		for (Person c: personen) {
			String Test2 = c.getAugenfarbe();
			Test2 = Test2+ "e Augen";
			
			if (Test2.equals(merkmal)) {
				PEX.add(c);
			}
		}	
		for (Person c: personen) {
			String haare = "lange ";
			
			if (c.isKurzeHaare()) {
				haare = "kurze ";
			}
						
			String Test2 = haare+ "Haare";
			if (Test2.equals(merkmal)) {
				PEX.add(c);
			}
		}	
		
		return PEX;
	}
		
	
/*	public void removePersonenInListe(ArrayList<Person> toRemove) { schaffe den Zugriff auf die Haarfarbe nicht
		ArrayList<Person> REX = new ArrayList<Person>();
		
		for (Person d: personen) {
			String Test5 = d.getHaarfarbe();
			Test5 = Test5+ "en Haare";
			
			if (Test5.equals("roten Haare")){
				REX.remove(d);
				

	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		for (Person f: personen) {
			String Test6 = f.getHaarfarbe();
			Test5 = Test5+ "en Haare";
			
			if (Test5.equals("schwarze Haare")){
				REX.add(f);
	}*/

}


