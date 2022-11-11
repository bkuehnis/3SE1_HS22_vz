package uebung7.vza.ch.zhaw.kuralsar;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	//a
	public int getAnzahl() {
		return anzahl;
	}
	//b
	public void addPerson(Person p) {
		personen[anzahl] = p;
		anzahl++;
	}
	//c
	public void printPersonen() {
		for (int i = 0; i<anzahl; i++ ) {
			personen[i]. printPerson();
		
		}
	}
}


