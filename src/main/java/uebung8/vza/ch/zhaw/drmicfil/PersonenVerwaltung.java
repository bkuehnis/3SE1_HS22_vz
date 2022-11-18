package uebung8.vza.ch.zhaw.drmicfil;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	public int getAnzahl() {
		return personen.size(); // ArrayList auselesen + addPerson muss auch gemacht werden ansonsten gehts nicht
	}

	public void addPerson(Person p) {
		
		
			personen.add(p);
		
		
	}
	
	public void printNamen() {		//namen auf die Konsole auslesen  //wegen void Sysout verwenden!     //das gaht ned //for (int i = 0; i<personen.size(); i++) {
																																	//personen.get(printNamen(i));
		for (Person x: personen){
			
			System.out.println(x.getName());  //ACHTUNG void gibt kein return!! 
			
		}
			
	}
		
	
	public void printPersonen() {			//Ebenfalls void = kein return!!!
		
		
		for (Person x: personen) {
			x.printPerson();
		
	  }
		
	}
	
	
	public Person getPerson(int index) {
		
		if (index >= 0 && index < personen.size()) { //wenn index grösser als 0 und!! chliner als arraylist!!
			return personen.get(index);					
			
			// Fehlermeldig bim spiel wer ist es kei ahnig wiso
			
		}
		return null; // existiert sie nicht = null
		}
		
	
	
	public Person getPerson(String name) {
		
		for (Person p: personen) {
			if (p.getName().equals(name)) { // wenn de jweilige name am name entspricht, gib de name use sust null
				return p;
			}
		}
		
		return null;
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {    //Gibt eine ArrayList mit allen Personen zurück,
		ArrayList<Person> alleMit = new ArrayList<Person>();		//welche das angegebene Merkmal haben.
		for (Person p: personen) {									//Diese Methode verändert den Inhalt der ArrayList personen nicht.
			if (p.getMerkmaleAlsCsv().contains(merkmal)) {			// methode gaht alli persone durre
				alleMit.add(p);
			}
		}
		return alleMit;
	}
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		personen.removeAll(toRemove);
		
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen = notToRemove;
		
	}
}
