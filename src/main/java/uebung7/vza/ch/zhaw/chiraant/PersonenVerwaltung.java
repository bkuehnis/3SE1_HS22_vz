package uebung7.vza.ch.zhaw.chiraant;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person[] personen = new Person[30];

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
		int i =0;
		while(i< anzahl) {
			personen[i].printPerson();
			i++;
		}
		
	}
	public Person getPerson(int Index) {
		if (Index <= anzahl) {
			return personen[Index];
		} 
		return null;
	}
	
	public Person getPerson(String name) {
		for (int i=0;i<personen.length;i++) {
			if (personen[i] == null) {
				return null;
			} else if (name.equals(personen[i].getName())) {
				return personen[i];
			}
			
		}
		return null;
		
	}
	
}
