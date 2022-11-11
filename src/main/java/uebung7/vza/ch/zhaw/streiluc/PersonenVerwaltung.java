package uebung7.vza.ch.zhaw.streiluc;


public class PersonenVerwaltung {
	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	int j =0;
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	
	public int getAnzahl() {
		return anzahl;
	}
	public void addPerson(Person p) {
		personen[j]=p;
		j++;
		anzahl++;
	
		
		
	
	}
	public void printPersonen() {
		for(int i=0; i<anzahl;i++) {
			personen[i].printPerson();
		}
		
	}
	public Person getPerson(int index) {
		return personen[index];
	}
	public Person getPerson(String name) {
		Person correctPerson =null;
		for(int i=0; i<anzahl;i++) {
			if(personen[i].getName().equals(name)) {
				correctPerson = personen[i];
				break;
				
			}
		}
		return correctPerson;
}

	
}

