package uebung7.vza.ch.zhaw.ahmaddav;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	// Aufgabe a)
	public int getAnzahl() {
		return anzahl;
	}
	//Aufgabe b)
	public void addPerson(Person p) {
		personen[anzahl] = p;
		anzahl++;
	}
	//Aufgabe c)
	public void printPersonen() {
		for (int i = 0; i<anzahl; i++) {
			personen[i].printPerson();
		}
	}
	
	public Person getPerson(int index) {
		return personen[index];
	}
	
	public Person getPerson(String name) {
		Person correctPerson = null;
		for (int i = 0; i<anzahl; i++) {
			if (personen[i].getName().equals(name)) {
				correctPerson = personen[i];
				break;
			} 
		}
		return correctPerson;
	}
	
	public int getAnzahlMitMerkmal(String merkmal){
        String [] splitMerkmal = merkmal.split(" ");
        int counter = 0;
        if (merkmal.contains("Augen")){
            splitMerkmal[0] = splitMerkmal[0].replaceFirst(".$", "");
            for (int i = 0; i < anzahl; i++){
                if (personen[i].getAugenfarbe().equals(splitMerkmal[0])) counter++;
            }
        } else if (merkmal.contains("Haare")) {
            splitMerkmal[0] = splitMerkmal[0].replaceFirst(".$", "");
                if (splitMerkmal[0].contains("kurz") || splitMerkmal[0].contains("lang")) {
                    for (int i = 0; i < anzahl; i++){
                        if (personen[i].isKurzeHaare()) {
                            if (splitMerkmal[0].contains("kurz")) counter++;
                        } else {
                            if (splitMerkmal[0].contains("lang")) counter++;
                        }
                    }
                } else {
                    for (int i = 0; i < anzahl; i++){
                        if (personen[i].getHaarfarbe().equals(splitMerkmal[0])) counter++;
                    }
                }
        }

        return counter;





}
}

	
	
	
	
	

