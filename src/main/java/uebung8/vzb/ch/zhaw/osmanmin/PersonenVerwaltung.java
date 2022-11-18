package uebung8.vzb.ch.zhaw.osmanmin;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	
	//Test 1
	private int anzahl = 0;
	public int getAnzahl() {
		return anzahl;
	}

	//Test 1
	public void addPerson(Person p) {
			personen.add(p);
		anzahl++;
	}
	
	//Test 2
	public void printNamen() {
		for(Person x : personen) {
			System.out.println(x.getName());
		}
		
	}
	
	//Test 3
	public void printPersonen() {
		for(Person x : personen) {
			x.printPerson();
		}
	}
	
	//Test 4
	public Person getPerson(int index) {
			if(index <= personen.size()) {
				return personen.get(index);
			}
			return null;
	}
	
	//Test 5
	//Verstehe ich nicht, wie man hier eine for-each schleife benutzen kann
	//Habe  nun die Variante mit der Standard for schleife gewählt
	public Person getPerson(String name) {
		for(int i = 0; i<personen.size();i++ ) {
			if(name == personen.get(i).getName()) {
				return personen.get(i);
			}
		}
		return null;
	}
	
	//Test 6
	//komme nicht auf das richtige return, habe als kompilierung mal (personen) geschrieben
	//jedoch kommen dann alle namen als output
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		for(Person x : personen) {
			if(x.getMerkmaleAlsCsv().contains(merkmal)) {
				return personen;
			}
		}
		return null;
	}
	
	
	//Test 7
	//zieht sich vom Test 6...
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		for(Person x : personen) {
			if(x.getMerkmaleAlsCsv().equals(toRemove)) {
				personen.remove(x);
			}
		}
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		
	}
}
