package uebung7.vza.ch.zhaw.reichraf;

public class PersonenVerwaltung {
	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30]; 
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return anzahl;
	}

	public void addPerson(Person nächstePerson) {
		personen[anzahl] = nächstePerson;
		anzahl++;
		return;
	}

	public void printPersonen() {
		for (int i=0; i<anzahl;i++) {
			if (personen[i].isKurzeHaare()) {
				System.out.println( personen[i].getName() + " hat kurze " + personen[i].getHaarfarbe() + "e Haare und " + personen[i].getAugenfarbe() + "e Augen.");
			} 
			else {
				System.out.println( personen[i].getName() + " hat lange " + personen[i].getHaarfarbe() + "e Haare und " + personen[i].getAugenfarbe() + "e Augen.");
			}
		}
	}

	public Person getPerson (int a) {

		return personen[a];
	}

	public Person getPerson (String b) {
		int i=0;
		while (b!=personen[i].getName() && i<anzahl-1) {
			i++;
		}
		if (i<anzahl-1) {
			return personen[i];
		} else {
			return null;
		}
	}

	public int getAnzahlMitMerkmal(String a) {
		int b=0;
		for (int i=0;i<anzahl;i++) {
			if(a.equals(getPerson(i).getMerkmaleHFarbe())) {
				b++;
			} else if(a.equals(getPerson(i).getMerkmaleAFarbe())) {
				b++;
			} else if(a.equals(getPerson(i).getMerkmaleHLänge())) {
				b++;
			}
		}

		return b;
	}

}