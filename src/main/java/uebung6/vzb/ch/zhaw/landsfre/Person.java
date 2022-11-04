package uebung6.vzb.ch.zhaw.landsfre;


public class Person{
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
	public void printPerson() {
		String länge;
		if(kurzeHaare == true) {
			länge = "kurze";
		}else {
			länge = "lange";
		}
		System.out.println(name+" hat "+länge+" "+haarfarbe+" Haare und "+augenfarbe+"e Augen.");
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
	public boolean stimmtHaarfarbe(String haarfarbe) {
		if(this.haarfarbe == haarfarbe) {
			return true;
		}else {
			return false;
		}
		
	}
	public String schneideHaare() {
		
		if(this.kurzeHaare == true) {
			return name+"s Haare sind bereits kurz.";
		}else {
			kurzeHaare = true;
			return name+"s Haare wurden geschnitten.";
		}
	}
}
