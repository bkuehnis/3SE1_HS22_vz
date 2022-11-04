package uebung6.vzb.ch.zhaw.osmanmin;

public class Person {

	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	
	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}
	
	public void haarlaenge() {
		if (kurzeHaare = true) {
			System.out.println("kurze");
		} else {
			System.out.println("lange");
		}
	}
	
	
	//Ich kann die Methode haarlaenge(), um kurze oder lange Haare herauszufinden
	//nicht unten einbauen, wieso?? (event. Gültiskeitsbereich?)
	public void printPerson() {
		System.out.println(name + " hat " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
	}
	
	public String getName() {
		return name;
	}
	public String getHaarfarbe() {
		return haarfarbe;
	}
	public boolean iskurzeHaare() {
		return kurzeHaare;
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}
	
//Komme hier nicht mehr weiter
	public boolean stimmtHaarfarbe(String haarfarbe) {
		haarfarbe = "schwarz";
		if(this.haarfarbe == haarfarbe) {
			return true;
		}
		return false;
	}
	
	public String schneideHaare() {
		if (kurzeHaare = true) {
			System.out.println(name + " Haare wurden geschnitten");
		} else if (kurzeHaare = false ) {
			System.out.println(name + " Haare sind bereits kurz");
		}
		return name;
	}
	
}