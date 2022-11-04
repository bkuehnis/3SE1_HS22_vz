package uebung6.vza.ch.zhaw.loretyan;


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
		if (kurzeHaare == true) {
			System.out.println(name + " hat kurze " + haarfarbe + "e" + " Haare und " + augenfarbe + "e Augen.");
		}
		if (kurzeHaare == false) {
			System.out.println(name + " hat lange " + haarfarbe + "e" + " Haare und " + augenfarbe + "e Augen.");
		}

	}

	public boolean stimmtHaarfarbe(String haarfarbe) {
		if (this.haarfarbe.equals(haarfarbe)) {
			return true;
		} else {
			return false;
		}
	}

	public String schneideHaare() {
		if (kurzeHaare) {
			return name + "s Haare sind bereits kurz.";
		} else {
			kurzeHaare = true;
			return name + "s Haare wurden geschnitten.";
		}

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
}
