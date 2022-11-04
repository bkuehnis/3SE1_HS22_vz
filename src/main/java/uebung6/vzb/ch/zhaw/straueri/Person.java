package uebung6.vzb.ch.zhaw.straueri;


public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	
	public  Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name ;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}
	public void printPerson() {
		System.out.println(name+" hat kurze "+haarfarbe+"e und "+augenfarbe+"e Augen.");
	}
	public String getname() {
		return name;
	
	}
	public String gethaarFarbe() {
		return haarfarbe;
	}
	public String getaugenfarbe() {
		return augenfarbe;
	}
	public boolean getkurzeHaare() {
		return kurzeHaare;
	}
	public boolean stimmtHaarfarbe() {
		return haarfarbe == haarfarbe;
	}
}


