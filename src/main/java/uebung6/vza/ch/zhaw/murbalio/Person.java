package uebung6.vza.ch.zhaw.murbalio;


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
		System.out.println(name+" hat "+kurzeHaare+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");
	}
	public boolean stimmtHaarfarbe(String haarfarbe) {
		return getHaarfarbe() == haarfarbe;
		}
	public String schneideHaare() {
		if (isKurzeHaare()) {
			return (this.name+"s Haare sind bereits kurz.");
		}
		else {
			this.kurzeHaare = true;
			return (this.name+"s Haare wurden geschnitten.");
		}
		
	}
}

