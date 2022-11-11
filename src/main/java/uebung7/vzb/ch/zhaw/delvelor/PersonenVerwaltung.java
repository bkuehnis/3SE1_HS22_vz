package uebung7.vzb.ch.zhaw.delvelor;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person[] personen = new Person[30];

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return this.anzahl;
	}

	public void addPerson(Person p) {
		for(int i = 0; i<personen.length-1;i++) {
			if(personen[i] == null) {
				personen[i]= p;
				break;
			}
		}
		anzahl+=1;
	}
	
	public void printPersonen() {
		for(int i = 0; i<personen.length-1;i++) {
			if(personen[i]!=null) {
				personen[i].printPerson();
			}
		}
	}
	public Person getPerson(int index) {
		if(personen[index]==null) {
			return null;
		}else {
			return personen[index];
		}
	}
	public Person getPerson(String name) {
		int index = 0;
		for(int i = 0; i<personen.length;i++) {
			if(personen[i] == null) {
				return null;
			}else if(personen[i].getName() == name) {
				index = i;
				break;
			}
			}
		return personen[index];
		}

	// Aufgabe g) habe ich nicht geschafft.
}
