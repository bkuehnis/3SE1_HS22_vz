package uebung7.vza.ch.zhaw.baechni2;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	//getter a)
	public int getAnzahl() {
		return anzahl;
	}

	// addPerson
	public void addPerson(Person nächstePerson) {
		personen [anzahl] = nächstePerson;
		anzahl++;
	}

	// printPersonen
	public void printPersonen() {
		for (int i=0; i< anzahl; i++) {
			String haare = "kurze ";
			if (personen[i].isKurzeHaare() == false) {
				haare = "lange ";
			}
			System.out.println(personen[i].getName() + " hat "+ haare + personen[i].getHaarfarbe() + "e Haare und " + personen[i].getAugenfarbe() + "e Augen." );
		}	
	}

	// getPerson index
	public Person getPerson (int index) {
		return personen[index];
	}

	//getPerson name / irgendetwas stimmt nicht bei der ausgabe
	public Person getPerson (String name) {
		int i=0;
		while (i < anzahl-1) {
			personen[i].getName().equals(name);
			i++;
		}if (i < anzahl) {
			return personen[i];
		}else{
			return null;
		}
	}

	// getMerkmaleundAnzahl -- brauchte ich etwas hilfe
	public int getAnzahlMitMerkmal(String merkmal) {
		int counter = 0;
		for (int i = 0; i < anzahl ; i++) {
		String alleDaten = getPerson(i).getMerkmaleAlsCsv();
		alleDaten.split(",");
		if (alleDaten.contains(merkmal)) {
			counter++;
		}
		}return counter;
		
	}

}
