package uebung7.vza.ch.zhaw.baechni2;


public class Person {
	//klassenattribute
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;

	//konstruktor
	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}

	//methode print person
	public void printPerson() {
		if (kurzeHaare==true) {
			System.out.println(name+" hat "+"kurze "+haarfarbe+"e Haare und "+ augenfarbe+ "e Augen.");
		}else {
			System.out.println(name+" hat "+"lange "+haarfarbe+"e Haare und "+ augenfarbe+ "e Augen.");
		}
	}

	//getter methoden für alle attribute		
	public String getName() {
		return name;
	}
	public String getHaarfarbe() {
		return haarfarbe;
	}
	public boolean isKurzeHaare() {
		return kurzeHaare;
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}

	// stimmt Haarfarbe?

	public boolean stimmtHaarfarbe(String farbe) {
		if (haarfarbe.equals(farbe)) {
			return true;

		}else {
			return false;
		}
	}
	//schneiden

	public String schneideHaare() {
		if (kurzeHaare) {
			return name+"s Haare sind bereits kurz.";
		}else {
			kurzeHaare=true;
			return name+"s Haare wurden geschnitten";
		}
	}
	
	public String getMerkmaleAlsCsv() {
		String haare = "lange ";
		if (isKurzeHaare()) {
			haare = "kurze ";
		}
			
		return haare + "Haare," + getHaarfarbe() + "e Haare," + getAugenfarbe() + "e Augen";
	}
}

