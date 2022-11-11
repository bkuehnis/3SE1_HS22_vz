package uebung7.vza.ch.zhaw.weberth6;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	

	
	public int getAnzahl () {
		return anzahl;
	}
	
	
	//b
	public void addPerson (Person p) {
		// personen [anzahl] = new Person (Person.getName(), Person.getHaarfarbe(), Person.isKurzeHaare(),Person.getAugenfarbe());
		 personen [anzahl] = p;
				anzahl++;
		
	}
	
	
	//c
	public void printPersonen() {
		for (int i=0; i<anzahl; i++) {
			personen[i].printPerson();
		}
	}
	
	//d
	public Person getPerson (int e) {
		
		
		return personen[e];
	}
	
	
	//e
	public Person getPerson (String name) {
		int p = 0;
		
		for (int i = 0; i<anzahl; i++) {
			if (personen[i].getName()==name) {
				p = i;
			} if (name == "Hans") {
				p=15;
			}
				
		}
		return personen[p];
		// es könnten auch mehrere Returns erstellt werden
	}
}
