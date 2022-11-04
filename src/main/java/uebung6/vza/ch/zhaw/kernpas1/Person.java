package uebung6.vza.ch.zhaw.kernpas1;


public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;

	public Person (String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}
	// Aussgabe Satz
	public void printPerson() {
		String laenge = "lange";
		if (kurzeHaare) {
			laenge = "kurze";
		} 
		System.out.println(name+" hat "+laenge+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");
	}
	// Getter-Methoden
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
	// Stimmt Haarfarbe
	public boolean stimmtHaarfarbe(String haarfarbe) {
		return (haarfarbe.equals(this.haarfarbe));
	}
	// Haare schneiden
	public String schneideHaare() {
		if (kurzeHaare) {
			return name+"s Haare sind bereits kurz";
		} else {
			kurzeHaare = true;
			return name+"s Haare wurden geschnitten";
		}
	}
		
	
}
