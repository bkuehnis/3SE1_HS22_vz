package uebung7.vza.ch.zhaw.friesti1;


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
		for(Person p : personen) {
			if(p == null) {
				return;
			}
			String laenge = p.getKurzeHaare() ? "kurze" : "lange";
			System.out.println(p.getName() + " hat " + laenge + " " + p.getHaarfarbe() + "e Haare und " + p.getAugenfarbe() + "e Augen.");
		}
	}
	
	public Person getPerson(int index) {
		return personen[index];
	}
	
	public Person getPerson(String name) {
		for(Person p : personen) {
			if(p == null) {
				return null;
			}
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	public int getAnzahlMitMerkmal(String merkmale) {
		int anzahl = 0;
		for(Person p : personen) {
			if(p == null) {
				continue;
			}
			String[] merkmalDetails = merkmale.split(" ");
			if(merkmale.contains("Augen")) {
				if(merkmalDetails[0].contains(p.getAugenfarbe())) {
					anzahl++;
				}
			}
			else if(merkmale.contains("Haare")) {
				if(merkmalDetails[0].contains(p.getHaarfarbe())) {
					anzahl++;
				}
				else if(merkmalDetails[0].equals("kurze") && p.getKurzeHaare()) {
					anzahl++;
				}
			}
		}
		return anzahl;
	}
}
