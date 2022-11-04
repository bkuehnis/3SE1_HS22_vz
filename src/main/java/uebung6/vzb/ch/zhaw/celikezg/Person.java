package uebung6.vzb.ch.zhaw.celikezg;

public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	public String input1;

	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe, String input1) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
		this.input1 = input1;

	}

	public String getName() {
		return name;
	}

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public boolean isKurzeHaare() {
		return kurzeHaare;
	}

	public void printPerson() {
		if (isKurzeHaare() == true) {
			System.out.println(getName() + " hat kurze " + getHaarfarbe() + "e und " + getAugenfarbe() + "e Augen");
		}
		if (isKurzeHaare() == false) {
			System.out.println(getName() + " hat lange " + getHaarfarbe() + "e und " + getAugenfarbe() + "e Augen");

		}
	}

	public boolean stimmtHaarfarbe(String haarfarbe) {
		if (input1.equals(getHaarfarbe())) {
			return true;
		} else
			return false;
	}

// funktioniert nicht und weiss nicht warum?
	public void schneideHaare() {
		if (isKurzeHaare() == false) {

			System.out.println(getName() + "s Haare wurden geschnitten.");
		} else {

			System.out.println(getName() + "s Haare sind bereits kurz.");
		}

	}
}