package uebung6.vza.ch.zhaw.ahmaddav;


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
	
	public void printPerson() {
		String lange = "lange";
		if (kurzeHaare) {
			lange = "kurze";
		}
		System.out.println(name+" hat " +lange+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");	
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
	
	public boolean haarfarbe(String farbeNeu) {
		if (haarfarbe.equals(farbeNeu)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String schneideHaare() {
		String lange = "Haare sind bereits kurz";
		if (!kurzeHaare) {
			lange = "Haare wurden geschnitten";
			kurzeHaare = true;
		}
		return name+"s "+lange;
	}
	
	
	
}
