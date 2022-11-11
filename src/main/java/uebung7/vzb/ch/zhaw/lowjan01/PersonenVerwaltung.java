package uebung7.vzb.ch.zhaw.lowjan01;


public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	//// wurde auf öffentlich umgestellt, da ich nicht wusste wie man weiter vorgeht
	Person[] personen = new Person[30];
	int zaehler = 0;

	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return anzahl;
	}

	// Konstruktor
//	public void Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
//		this.name = name;
//		this.haarfarbe = haarfarbe;
//		this.kurzeHaare = kurzeHaare;
//		this.augenfarbe = augenfarbe;
//	}

//////********* Gehört zur Aufgabe b) mit private
//	public Person[] getPerson() {
//		return personen;
//	}
//
//	public Person[] setPerson() {
//		return personen;
//	}

	public void addPerson(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		personen[zaehler] = new Person(name, haarfarbe, kurzeHaare, augenfarbe);
		zaehler++;
		anzahl++;
	}

//	public void printPersonen() {
//		int count = 0;
//		String haare = "lange ";
//		while (count > anzahl) {
//
//			if (personen[count].isKurzeHaare()) {
//				haare = "kurze ";
//				System.out.println(personen[count].getName() + " hat " + haare + personen[count].getHaarfarbe()
//						+ "e Haare und " + personen[count].getAugenfarbe() + "e Augen.");
//
//			} else {
//				System.out.println(personen[count].getName() + " hat " + haare + personen[count].getHaarfarbe()
//						+ "e Haare und " + personen[count].getAugenfarbe() + "e Augen.");
//			}
//			count++;
//
//		}
//
//	}
///// Aufgabe c)
	public void printPersonen() {
		int count = 0;
		String haare = "lange ";
//		String haare = "lange ";
//		while (personen[count].isKurzeHaare() && (count > anzahl)) {
//			String haare1 = "kurze ";
//			System.out.println(personen[count].getName() + " hat " + haare1 + personen[count].getHaarfarbe()
//					+ "e Haare und " + personen[count].getAugenfarbe() + "e Augen.");
//			count++;
//		}
//		while (!(false == personen[count].isKurzeHaare()) && (count > anzahl)) {
//			System.out.println(personen[count].getName() + " hat " + haare + personen[count].getHaarfarbe()
//					+ "e Haare und " + personen[count].getAugenfarbe() + "e Augen.");
//			count++;
//		}
	//////********* mit logischen Operatoren (oben) funktionierte nicht

		while (count < anzahl) {
			if (personen[count].isKurzeHaare()) {
				String haare1 = "kurze ";
				System.out.println(personen[count].getName() + " hat " + haare1 + personen[count].getHaarfarbe()
						+ "e Haare und " + personen[count].getAugenfarbe() + "e Augen.");
			} else {
				System.out.println(personen[count].getName() + " hat " + haare + personen[count].getHaarfarbe()
						+ "e Haare und " + personen[count].getAugenfarbe() + "e Augen.");
			}
			count++;

		}

		//////********* nicht ganz klar was + getPerson(name: String): Person gemeint ist
//public int getPerson(int index) {
//	System.out.println(personen[index].getName(index)
//	
//}

// 

	}

}
