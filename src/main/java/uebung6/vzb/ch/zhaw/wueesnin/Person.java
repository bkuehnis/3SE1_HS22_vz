package uebung6.vzb.ch.zhaw.wueesnin;

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
		System.out.print(this.getName() + " hat ");
		if (this.isKurzeHaare())
			System.out.print("kurze ");
		else
			System.out.print("lange ");
		System.out.print(this.getHaarfarbe() + "e Haare und " + this.getAugenfarbe() + "e Augen.\n");
	}

	public void stimmtHaarfarbe(String haarfarbe) {
		System.out.println(
				this.getName() + " hat " + haarfarbe + "e Haare: " + haarfarbe.equalsIgnoreCase(this.getHaarfarbe()));
	}

	public void schneideHaare() {
		if (!this.isKurzeHaare()) {
			System.out.println(this.getName() + "s Haare wurden geschnitten.");
			this.kurzeHaare = true;
		} else {
			System.out.println(this.getName() + "s Haare sind bereits kurz.");
		}
	}
}