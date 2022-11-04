package uebung6.vza.ch.zhaw.chiraant;

public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	public String schneideHaare;

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
		return kurzeHaare = true;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void printPerson() {
		if (isKurzeHaare() == true) {
			System.out.println(getName() + " hat kurze Haare" + " und " + getAugenfarbe() + "e Augen");
		} else
			System.out.println(getName() + " hat lange Haare" + " und " + getAugenfarbe() + "e Augen");
	}

	public boolean stimmtHaarfarbe(String farbe) {
		System.out.println(getName() + " hat " + getHaarfarbe() + "e Haare: " + farbe.equals(haarfarbe));
		return farbe.equals(haarfarbe);
	}

	public void schneideHaare(String kurz) {
		String haare = "";
		if (this.kurzeHaare == true) {
			haare = "kurz";
		} else {
			haare = "lang";
		}
		if (kurz.equals(haare)) {
			System.out.println(getName() + "s Haare sind bereits geschnitten");
		} else {
			kurzeHaare = false;
			System.out.println(getName() + "s Haare wurden geschnitten");
			this.kurzeHaare = true;
		}

	}

}
