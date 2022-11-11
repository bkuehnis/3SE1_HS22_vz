package uebung7.vzb.ch.zhaw.osmanmin;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	public int getAnzahl() {
		return anzahl;
	}
	
	int y = 0;
	int x = 0;
	
	//Aufgabe b)
	public void addPerson(Person p) {
		int count = y;
		personen[count] = p;
		anzahl++;
		y++;
	}
	
	//Aufgabe c)
	public void printPersonen() {
		for(int i = 0;i<personen.length;i++) {
		}
		int count = x;
		personen[count].printPerson();
		x++;
	}
	
	//Aufgabe d)
	//Hier komme ich ebenfalls nicht mehr weiter...
	public Person getPerson(int index) {
		
		return null;
	}
}