package uebung6.vza.ch.zhaw.bauerfel;


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

		String haarlaenge = "lange";
		if (kurzeHaare == true) {
			haarlaenge = "kurze";
		}
		System.out.println(name + " hat " + haarlaenge + " " + haarfarbe + " Haare und " + augenfarbe + " Augen ");
	}

	public boolean stimmtHaarfarbe(String haarfarbe) {
		if (this.haarfarbe == haarfarbe) {
			return true;
		}
		return false;
	}

	public String schneideHaare() {
		if (this.kurzeHaare == false) {
			this.kurzeHaare = true;
			return " Haare wurden geschnitten ";
		} else {
			return " Haare sind bereits kurz ";
		}

	}
}