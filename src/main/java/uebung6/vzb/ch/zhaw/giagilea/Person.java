package uebung6.vzb.ch.zhaw.giagilea;


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
	
	public boolean isKurzeHaare() {
		return kurzeHaare;
	}
	
	public String getAugenfarbe() {
		return augenfarbe;
	}
	
	public void printPerson() {
		String h;
		if (kurzeHaare == true) {
			h = "kurze";
		} else {
			h = "lange";
		}
		System.out.println(name + " hat "+h+" "+ haarfarbe +"e Haare und "+ augenfarbe+"e Augen");
	}
	
	public boolean stimmtHaarfarbe(String haarfarbe) {
		if (haarfarbe.equals(getHaarfarbe())) {
			System.out.println(name+" hat "+haarfarbe+"e Haare: true");
			return true;
		}
		System.out.println(name+" hat "+haarfarbe+"e Haare: false");
		return false;
		
	}
	
	public void schneideHaare() {
		if (kurzeHaare == false) {
			kurzeHaare = true;
			System.out.println(name+"s Haare wurden geschnitten");
		} else {
			System.out.println(name+"s Haare sind bereits kurz");
		}
	}
}
