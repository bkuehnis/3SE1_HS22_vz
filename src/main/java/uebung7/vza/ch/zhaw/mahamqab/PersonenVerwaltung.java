package uebung7.vza.ch.zhaw.mahamqab;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	public int getAnzahl() {
		return anzahl;
	}
	

	public void addPerson(Person nächstePerson){
		personen[anzahl] = nächstePerson;
		anzahl+=1;
	}
	
	public void printPersonen() {
			
		for (int i = 0; i < anzahl; i++) {
			String haare = "lange ";
			if (personen[i].isKurzeHaare() == true) {
				haare = "kurze ";
			}
			System.out.println(personen[i].getName() + " hat " + haare +personen[i].getHaarfarbe() + "e Haare und " + personen[i].getAugenfarbe() + "e Augen." );
		}
		
	}
	
	public Person getPerson (int index) {
		return personen[index];
	}
	
	
	
	public Person getPerson (String name) {
		int i = 0;
		while (i < anzahl-1) {
			personen[i].getName().equals(name);
			i++;
		}	if (i < anzahl) {
				return personen[i];
			}
			else{
				return null;
			}
		}
	
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

