package uebung7.vzb.ch.zhaw.martilu5;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return anzahl;
	}
	
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	public void addPerson (Person p) {
			getPersonen() [anzahl] =  p;
			anzahl++;
	}
	public void printPersonen () {
		for (int i=0; i<anzahl; i++) {
			Person person = getPersonen()[i];
			person.printPerson();
		}
	}
	
	public Person getPerson(int index) {
		return getPersonen()[index];
	}
	
	public Person getPerson(String name) {
		int a = anzahl;
		for (int i = 0; i < anzahl; i++) {
			Person namen = getPersonen()[i];
			if (name.equals(namen.getName())) {
				a = i;
			}
			}
		return getPersonen()[a];
	}

	public Person [] getPersonen() {
		 return personen;
	}

	public void setPersonen(Person [] personen) {
		this.personen = personen;
	}
	
	public int getAnzahlMitMerkmal(String merkmal) {
		int anz = 0;
		for (int i = 0; i < anzahl; i++) {
			Person merkmale = getPersonen()[i];
			if ( merkmale.getMerkmaleAlsCsv().contains(merkmal)) {
				anz++;
			}
			
		}
		return anz;
	}

	
}