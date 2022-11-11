package uebung7.vzb.ch.zhaw.truemjul;


public class PersonenVerwaltung {

	// 30 Personen anlegen
	private Person[] personen = new Person[30];
	// Anzahl Personen
	private int anzahl = 0;
	
	public int getAnzahl() {
		return anzahl;
	}

	public void addPerson(Person p) {
		Person [] tempPerson = new Person[30];
		for (int i = 0; i < tempPerson.length; i++) {
			tempPerson[i] = p;
		}
		anzahl++;
		personen[anzahl-1] = tempPerson[anzahl-1];
	}

	public void printPersonen() {
		for (int i = 0; i < anzahl; i++) {
			personen[i].printPerson();
		}
	}
	
	public Person getPerson(int index) {
		if(index > anzahl-1) {
			return null;
		} else return personen[index];
	}
	
	public Person getPerson(String name) {
		Person match = null;
		Person noMatch = null;
			
		
		for (int i = 0; i < anzahl; i++) {
			if(personen[i].getName().equals(name)) {
				match = personen[i];
			}
		}
	
		if(match != null) {
		return match;
		} else return noMatch;
	}
	
	public int getAnzahlMitMerkmal(String merkmal) {
		int sum = 0;
		for(int i = 0; i < anzahl; i++) {
			if (personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
					String[] parts = personen[i].getMerkmaleAlsCsv().split(",");
					String haare = parts[0]; 
					String haarfarbe = parts[1];
					String augen = parts[2];
					
					if(haare.equals(merkmal)) {
						sum += 1;
					}
					else if(haarfarbe.equals(merkmal)) {
						sum +=1;
					}
					else if(augen.equals(merkmal)) {
						sum +=1;
					} 
			}
			
		}
		return sum;
	}
	
	
	public Person[] getAlleMitMerkmal(String merkmal) {
		int index = getAnzahlMitMerkmal(merkmal);
		Person[] personNamen = new Person[index];
		
		for (int i = 0; i < personNamen.length; i++) {
			for(int j = 0; j < anzahl; j++) {
				if(personen[j].getMerkmaleAlsCsv().contains(merkmal)) {
					personNamen[i] = personen[j];
				}
			}
		}
		
		
		return personNamen;
	}
}