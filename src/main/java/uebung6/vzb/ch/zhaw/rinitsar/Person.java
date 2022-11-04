package uebung6.vzb.ch.zhaw.rinitsar;

public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;

//Aufgabe b) Konstruktor setzen
	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}

//Aufgabe d) Ergänzung Methode printPerson()
	public void printPerson() {
		String a = "kurzeHaare?";
		if (kurzeHaare == true) {
			a = "kurze";
		} else {
			a = "lange";
		}
		System.out.println(
				name + " hat " + a + " " + haarfarbe + "e" + " Haare " + "und " + augenfarbe + "e" + " Augen.");
	}

//Aufgabe c) Getter-Methode
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

	// Aufgabe e) Ergänzung Methode stimmtHaarfarbe()
	public void stimmtHaarfarbe(String haarfarbe) {
		System.out.println(
				this.getName() + " hat " + haarfarbe + "e Haare: " + haarfarbe.equalsIgnoreCase(this.getHaarfarbe()));
	}

//Aufgabe f) Ergänzung Methode schneideHaare()
	public void schneideHaare() {
		if (!this.isKurzeHaare()) {
			System.out.println(this.getName() + "s Haare wurden geschnitten.");
			this.kurzeHaare = true;
		} else {
			System.out.println(this.getName() + "s Haare sind bereits kurz.");
		}
	}
}
