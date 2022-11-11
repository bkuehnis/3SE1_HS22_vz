package uebung7.vza.ch.zhaw.heinini2;

public class PersonenVerwaltung {
	
	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	private int i = 0;
	
	public int getAnzahl() {
		return anzahl;		
	}
	
	public void addPerson(Person p) {
		
		personen[i] = p;
		i++;
		anzahl++;
	}
	
	public void printPersonen() {
		for (int i = 0; i < anzahl; i++) {
			personen[i].printPerson();
		}
	}
	
	public Person getPerson(int index) {
		if (index < anzahl && index >= 0) {
			return personen[index];
		} else {
			return null;
		}
	}
	
	public Person getPerson(String name) {
		
		for (int i = 0; i < anzahl; i++) {
			if (name.equals(personen[i].getName())) {
				return personen[i];
			}
		}
		return null;
		
	}
	
	public int getAnzahlMitMerkmal(String merkmal) {
		int matches = 0;
		for (int i = 0; i < anzahl; i++) {
			if(personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				matches++;
			}
			
		}
		
		return matches;
	}
}
