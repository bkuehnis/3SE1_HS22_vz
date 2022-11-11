package uebung7.vzb.ch.zhaw.strubili;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	//getAnzahl
	public int getAnzahl () {
		return anzahl;
	}
	
	//Person zu personen Array hinzufügen
	public void addPerson(Person p) {
			personen [anzahl] = p;
			anzahl++;
	}
	
	public void printPerson() {
		for (int i =0; i<anzahl;i++) {
			System.out.println(personen [i].getName()+" hat "+isHaarLang(personen[i])+" "
		+personen[i].getHaarfarbe()+"e Haare und "+personen[i].getAugenfarbe()+"e Augen.");	
		}
	}
	public String isHaarLang(Person p) {
        return ((p.isKurzeHaare() == true) ? "kurze" : "lange");
    }
	public Person getPerson(int index) {
		return personen [index];
	}
	public Person getPerson (String name) {
		for (int i=0;i<anzahl;i++) {
			if (personen[i].getName()==name) {
				return personen[i];
			}
			
		}
	return null;
	}
	public int getAnzahlMitMerkmal(String merkmal) {
		int counter = 0;
		for (int g=0;g<anzahl;g++) {
			if (personen[g].getMerkmaleAlsCsv().contains(merkmal)==true) {
				counter++;
			}	
		}
	return counter;
	} 
}
	

