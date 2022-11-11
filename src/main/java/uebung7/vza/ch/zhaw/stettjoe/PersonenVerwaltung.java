package uebung7.vza.ch.zhaw.stettjoe;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	public int getAnzahl() {
		return anzahl;
	}
	
	public void addPerson(Person p) {
		personen[anzahl] = p;
		anzahl++;
	}
	
	public void printPersonen() {
		for (int i = 0; i<anzahl; i++) {
			personen[i].printPerson();
		}
	}
	
	public Person getPerson(int index) {
		return personen[index];
		
	}
	
	public Person getPerson(String name) {
		for (int i = 0; i<anzahl; i++) {
			if (personen[i].getName().equals(name)) {
				return personen[i];
			} 
		}
		return personen[anzahl];
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
