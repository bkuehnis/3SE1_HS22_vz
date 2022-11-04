package uebung6.vza.ch.zhaw.vuchl001;

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
		return this.name;
	}

	public String getHaarfarbe() {
		return this.haarfarbe;
	}

	public boolean isKurzeHaare() {
		return kurzeHaare;
	}
	
	public String getAugenfarbe() {
		return this.augenfarbe;
	}
	
	public void printPerson() {
		String laenge = "kurze";
		boolean kurz = true;
		if (isKurzeHaare() != kurz) {	
			laenge = "lange";
		}
					
		System.out.println(name + " hat " + laenge + " " + haarfarbe + "e Haare und "+ augenfarbe + "e " + "Augen.");
	}
	
	public boolean stimmtHaarfarbe(String haareGeraten) {
		boolean stimmt = true;
		if (haarfarbe.equals(haareGeraten)) {
			return stimmt;
		}
		return stimmt = false;	
	}
	
	public String schneideHaare() {
		if (isKurzeHaare() == true) {
			System.out.println(name + "s Haare sind bereits kurz.");
			return name;
		}
		System.out.println(name + "s Haare wurden geschnitten.");
		return name;
	}
	
}
