package uebung6.vza.ch.zhaw.reichraf;


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
	
	//Haarfabe herausfinden
	public void stimmtHaarfarbe(String eingabe) {
		if (haarfarbe.equals(eingabe)) {
			System.out.println(getName() + " hat " + eingabe + "e Haare: true" );
		} else {
			System.out.println(getName() + " hat " + eingabe + "e Haare: false" );
		}
		
	}
	//Haarlänge verändern
	public void schneideHaare() {
		if (kurzeHaare) {
			System.out.println(getName() + "s Haare sind bereits kurz.");
		} else {
			System.out.println(getName() + "s Haare wurden geschnitten.");
			this.kurzeHaare = true;
		}
		return;
	}
	
	//Ausgabe der beschreibung der Person
	public void printPerson() {
		System.out.println(getName() + " hat " + isKurzeHaare() + " " + getHaarfarbe() + " Haare und " + getAugenfarbe() + " " + "Augen.");
	}
	
	public String getName() {
		return name;
	}
	public String getHaarfarbe() {
		return haarfarbe;
	}
	public String isKurzeHaare() {
		if (kurzeHaare) {
			return "kurze";
		} else {
			return "lange";
		}
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}
	
	
	
	
}
