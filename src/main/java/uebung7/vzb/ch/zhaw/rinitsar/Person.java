package uebung7.vzb.ch.zhaw.rinitsar;

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
		System.out.print(getName() + " hat ");
		if (isKurzeHaare())
			System.out.print("kurze ");
		else
			System.out.print("lange ");
		System.out.print(getHaarfarbe() + "e Haare und " + getAugenfarbe() + "e Augen.\n");
	}

	public void stimmtHaarfarbe(String haarfarbe) {
		System.out.println(getName() + " hat " + haarfarbe + "e Haare: " + haarfarbe.equalsIgnoreCase(getHaarfarbe()));
	}

	public void schneideHaare() {
		if (!isKurzeHaare()) {
			System.out.println(getName() + "s Haare wurden geschnitten.");
			kurzeHaare = true;
		} else {
			System.out.println(getName() + "s Haare sind bereits kurz.");
		}
	}

	public String getMerkmaleAlsCsv() {
		return (isKurzeHaare() ? "kurze" : "lange") + " Haare," + getHaarfarbe() + "e Haare," + getAugenfarbe()
				+ "e Augen";
	}
}