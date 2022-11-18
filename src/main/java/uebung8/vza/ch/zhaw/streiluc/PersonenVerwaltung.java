package uebung8.vza.ch.zhaw.streiluc;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  
	private int anzahl=0;
	int j=0;
	int i =0;
	
	public int getAnzahl() {
		return personen.size();
	}
		
	

	public void addPerson(Person p) {
		personen.add(p);
	}

	
	public void printNamen() {
		for (int i=0; i<personen.size(); i++) {
			System.out.println(personen.get(i).getName());
			}
		
		}
	
	public void printPersonen() {
		for(Person p: personen) {
			personen.get(i).printPerson();
			i++;
		
		}
	}
	
	public Person getPerson(int index) {
		if (index < personen.size()) {
		return personen.get(index);
	}else {
		return null;
	}
	}
	
	public Person getPerson(String name) {
		int x=0;
		for(Person p:personen) {
			if(p.getName().equals(name)) {
				return personen.get(x);
			}
			x++;
		}
		return null;
	}
	
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> alleMit=new ArrayList<Person>();
		for (Person p: personen) {
			if (p.getMerkmaleAlsCsv().contains(merkmal)) {
				alleMit.add(p);
				}
			
	
		}
		return alleMit;
	}

	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen= notToRemove;
	}
}
