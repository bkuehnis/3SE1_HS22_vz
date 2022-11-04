package uebung6.vzb.ch.zhaw.reiflja1;


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
		System.out.print(name + " hat ");

		if (kurzeHaare) {
			System.out.print("kurze ");
		} else {
			System.out.print("lange ");
		}

		System.out.println(haarfarbe + "e Haare und " + augenfarbe + "e Augen");
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

	public boolean stimmtHaarfarbe(String haarfarbe) {
		if (haarfarbe.equals(this.haarfarbe)) {
			return true;
		}
		return false;
	}

	public String schneideHaare() {
		if (this.kurzeHaare) {
			return this.name + "s Haare sind bereits kurz.";
		}

		this.kurzeHaare = false;
		return this.name + "s Haare wurden geschnitten.";

	}

}
