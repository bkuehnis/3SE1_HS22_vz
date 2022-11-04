package uebung6.vza.ch.zhaw.zejnutri;


public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	public boolean stimmtHaarfarbe;
	

	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}
	
	public void printPerson() {
		String lange = "lange";
		if (kurzeHaare) {
			lange = "kurze";
		}
		System.out.println(name+" hat "+lange+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");
	}

	public String getName() {
		return name;
	}
	
	public String getHaarfarbe () {
		return haarfarbe;
	}
	
	public boolean isKurzeHaare () {
		return kurzeHaare;
	}
	
	public String getAugenfarbe () {
		return augenfarbe;
	}
	
	public boolean haarfarbe (String farbeneu) {
		if (haarfarbe.equals(farbeneu)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String schneideHaare () {
		String laenge = "Haare sind bereits kurz.";
		if (!kurzeHaare) {
			laenge = "Haare wurden geschnitten.";
			kurzeHaare = true;
		}
		return name+"s "+laenge;
	}

}

