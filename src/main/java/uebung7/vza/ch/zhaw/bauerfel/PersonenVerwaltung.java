package uebung7.vza.ch.zhaw.bauerfel;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person[] personen = new Person[30];
	private int anzahl = 0;

	public void addPerson(Person p) {
		personen[anzahl] = p;
		anzahl++;
	}

	public void printPersonen() {
		for (int i = 0; i <= anzahl - 1; i++) {
			personen[i].printPerson();
		}
	}
	public Person getPerson(int i) {
		return personen[i];
	}
	public Person getPerson(String name) {
		int j = 0;
		while (name != personen[j].getName() && j<anzahl - 1) {
			j++;
		}
			if (j < anzahl - 1) {
				return personen[j];
			}else 
				return null;
		}
	public int getAnzahlMitMerkmal(String merkmal) {
		int i = 0;
		int a = 0;
		while (i > anzahl) {
			i++;
			if( personen[i].getHaarfarbe()+ " Haare" == merkmal ) {
				a++;
			}else if ( personen[i].getAugenfarbe() + " Augen" == merkmal ) {
				a++;
			}
		}
		return a;
		}
		



	// aktuelle Anzahl erfasster Personen

	public int getAnzahl() {
		return anzahl;
	}
}
