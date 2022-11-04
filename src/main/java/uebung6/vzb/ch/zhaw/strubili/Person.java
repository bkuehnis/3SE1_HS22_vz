package uebung6.vzb.ch.zhaw.strubili;


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
		String laenge = "";
		if (kurzeHaare == true) {
		laenge = "kurze";
		}else {
			laenge = "lange";
		}
		System.out.println(name+ " hat "+laenge+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen");
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
		return haarfarbe.equals(getHaarfarbe());
	} 
	public String schneideHaare(String name, boolean kurzeHaare) {
		if (kurzeHaare != true) {
			kurzeHaare = true;
			System.out.println(name+"s Haare wurden geschnitten");
		}else {
			System.out.println(name+"s Haare sind bereits kurz.");
		}
		return "geschnitten";
	}
}
