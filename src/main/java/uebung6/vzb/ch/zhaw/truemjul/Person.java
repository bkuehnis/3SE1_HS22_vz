package uebung6.vzb.ch.zhaw.truemjul;


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
	
	public String getHaarfarbe () {
		return haarfarbe;
	}
	
	public boolean isKurzeHaare() {
		return kurzeHaare;
	}
	
	public String getAugenfarbe() {
		return augenfarbe;
	}
	
	public boolean stimmtHaarfarbe(String haarfarbe) {
		if(this.haarfarbe == haarfarbe) {
			return true;
		} else return false;
	}
	
	public void printPerson() {
		System.out.print(name+" hat ");
		if (kurzeHaare == true) {
			System.out.print("kurze ");
		} else System.out.print("lange ");
		System.out.println(haarfarbe +"e Haare und "+augenfarbe+"e Augen.");
	}
	
	public String schneideHaare() {
		if(kurzeHaare == false) {
			kurzeHaare = true;
			return name+"s Haare wurden geschnitten.";
		} else return name+"s Haare sind bereits kurz.";
	}	
}