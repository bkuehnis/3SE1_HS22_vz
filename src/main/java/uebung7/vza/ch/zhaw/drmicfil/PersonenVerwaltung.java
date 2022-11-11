package uebung7.vza.ch.zhaw.drmicfil;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	public int getAnzahl() {  //ufgab a
	return anzahl;
	
	}
	
	public void addPerson (Person p) {				//ufgab b for (int i = 0; i<personen.length; i++)   + anzahl++; david fragen wieso das nicht geht?
		personen[anzahl] = p; 
		anzahl++;
			
			
		}
		
	
	
	public void printPersonen() {				//ufgab c	
		for (int i = 0; i<anzahl; i++) {
			personen[i].printPerson();
			
			
		}
		
	}
	
	public Person getPerson(int index) { //ufgab d
		if (index >=0 && index < anzahl) {
			return personen[index];
		}
		return null;
	}
	
	public Person getPerson(String name) { // ufgab e
		for (int i=0; i<anzahl; i++) {
			if (personen[i].getName().equals(name)) {
				return personen[i];
			}
		}
		return null;
	}
	
	public int getAnzahlMitMerkmal(String merkmal) {
		int u = 0;
		for (int i = 0; i<anzahl; i++) {
			String[] atribute = personen[i].getMerkmaleAlsCsv().split(",");
			for (int r = 0; r<atribute.length; r++) {
				if (atribute[r].contains(merkmal)) {
					u++;
				}
			}
		}
		return u;
	}
}
	
