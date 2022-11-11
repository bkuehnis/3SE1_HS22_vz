package uebung7.vza.ch.zhaw.vuchl001;

public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person [] personen = new Person[30];  
	
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;
	
	public int getAnzahl() {
		return anzahl;
	}
	
	
	public void addPerson(Person p) {
		for (int i = 0; i < personen.length; i++) {
			if (personen[i] == null) {
				personen[i] = p;
				anzahl += 1;
				break;
			
			}
		}
	}
	
	
	public void printPersonen() {
		
		for (int j = 0; j < personen.length; j++) {
			if (personen[j] != null) {
				String laenge = "kurze ";
				boolean kurz = true;
				if (personen[j].isKurzeHaare() != kurz) {	
					laenge = "lange ";
				}
				System.out.println(personen[j].getName() + " hat " + laenge + personen[j].getHaarfarbe() + "e und " + personen[j].getAugenfarbe() + "e Augen.") ;
			}
		}
	}
	
	
	public Person getPerson(int a) {		
		return personen[a];
	}
	
	
	public Person getPerson(String name) {
		int pos = 0;
		while (name != personen[pos].getName() && pos < anzahl-1) {
			pos ++;
		}
		if (pos < anzahl-1) {
			return personen[pos];
			}else {
				return null;
			}
		}
	
	/*public int  getAnzahlMitMerkmal(String merkmal) {
		
	}*/
	
}
	

