package uebung6.vza.ch.zhaw.heinini2;


public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	
	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name= name;
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
	public boolean isKurzeHaare() {
		return kurzeHaare;
		
	}
	public String getAugenfarbe() {
		return augenfarbe;
		
	}
	public void printPerson() {
		if (kurzeHaare) {
			System.out.println(name+" hat kurze "+haarfarbe+" Haare und "+augenfarbe+" Augen.");
		} else {
			System.out.println(name+" hat lange "+haarfarbe+" Haare und "+augenfarbe+" Augen.");
		}
		
	}
	public boolean stimmtHaarfarbe(String farbe) {
		
		return farbe==haarfarbe;
	}
	
	public String schneideHaare() {
		
		if(kurzeHaare) {
			return (name + "s Haare sind bereits kurz.");
		} else {
			kurzeHaare = true;
			return (name + "s Haare wurden geschnitten.");
		}
		
	}
}
