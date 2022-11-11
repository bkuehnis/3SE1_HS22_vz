package uebung7.vzb.ch.zhaw.martilu5;


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
	

	public void printPerson() {
		String a = "glatze";
		if (kurzeHaare == true) {
			a = "kurze";
		}
		else {
			a = "lange";
			}
		System.out.println(name+" hat "+a+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getHaarfarbe() {
		return this.haarfarbe;
	}
	
	public boolean isKurzeHaare() {
		return this.kurzeHaare;
	}
	
	public String getAugenfarbe() {
		return this.augenfarbe;
	}
	
	public boolean stimmtHaarfarbe() {
		return haarfarbe.equals("braun");		
	}
	
	public String schneideHaare() {
		if (kurzeHaare == true) {
			return "sind bereits kurz.";
		}
		else {
			return "wurden geschnitten.";
		}
	
			
	}
	
	public String getMerkmaleAlsCsv() {
		String laenge;
		if (isKurzeHaare() == true) {
			laenge = "kurz";
		} else {
			laenge = "lang";
		}
		return laenge+"e Haare,"+getHaarfarbe()+"e Haare,"+getAugenfarbe()+"e Augen";
		
	}
}
