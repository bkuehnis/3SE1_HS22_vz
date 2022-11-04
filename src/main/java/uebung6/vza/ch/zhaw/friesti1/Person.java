package uebung6.vza.ch.zhaw.friesti1;


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
	
	public String getName() {
		return name;
	}
	
	public String getHaarfarbe() {
		return haarfarbe;
	}
	
	public boolean getKurzeHaare() {
		return kurzeHaare;
	}
	
	public String getAugenfarbe() {
		return augenfarbe;
	}
	
	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}
	
	public void setKurzeHaare(boolean kurzeHaare) {
		this.kurzeHaare = kurzeHaare;
	}
	
	public void printPerson() {
		String laenge = kurzeHaare ? "kurze" : "lange";
		System.out.println(this.name + " hat " + laenge + " " + this.haarfarbe + "e Haare und " + this.augenfarbe + "e Augen.");
	}
	
	public boolean stimmtHaarfarbe(String haarfarbe) {
		if(this.haarfarbe.equals(haarfarbe)) {
			return true;
		}
		return false;
	}
	
	public String schneideHaare() {
		if(kurzeHaare) {
			return this.name + " Haare sind bereits kurz.";
		}
		this.kurzeHaare = true;
		return this.name + "s Haare wurden geschnitten.";
	}
}
