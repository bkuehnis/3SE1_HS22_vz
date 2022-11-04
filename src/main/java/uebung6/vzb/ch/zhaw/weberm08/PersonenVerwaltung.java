package uebung6.vzb.ch.zhaw.weberm08;


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
		for (int i = 0; i < anzahl; i++) {
			System.out.println(personen[i].getName() + " hat " + booleanHaarLaenge(personen[i]) + " " +personen[i].getHaarfarbe() + " Haare und " + personen[i].getAugenfarbe() + " Augen.");
		}
	}
	
	public String booleanHaarLaenge(Person p) {
		return ((p.isLaenge() == true) ? "kurze" : "lange");
	}
	
	public Person getPerson(int index) {
		return personen[index];
	}
	
	public Person getPerson(String name) {
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getName() == name) {
				return personen[i];
			}
		}
		return null;
	}
	
	public int getAnzahlMitMerkmal(String merkmal) {
		int merkmalCounter = 0;
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getMerkmaleAlsCvs().contains(merkmal)) {
				merkmalCounter++;
			}
		}
		return merkmalCounter;
	}
		
	public Person[] getAlleMitMerkmal(String merkmal) {
		Person[] personenNamenListe = new Person[getAnzahlMitMerkmal(merkmal)]; 
		for (int i = 0; i < getAnzahlMitMerkmal(merkmal); i++) {
			if (personen[i].getMerkmaleAlsCvs().contains(merkmal)) {
				personenNamenListe[i] = personen[i];
			}
		}
		return personenNamenListe;	
	}
}
