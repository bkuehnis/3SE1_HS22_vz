package uebung7.vzb.ch.zhaw.schulfa2;


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

		String haarlaenge = this.isKurzeHaare() ? "kurze" : "lange";

		System.out.println(this.getName() + " hat " + haarlaenge + " " + this.getHaarfarbe() + "e und "
				+ this.getAugenfarbe() + "e Augen.");
	}

	public boolean stimmtHaarfarbe(String haarfarbe) {
		return this.getHaarfarbe().equals(haarfarbe);
	}

	public String schneideHaare() {

		if (!this.isKurzeHaare()) {
			this.kurzeHaare = false;
			return this.name + "s Haare wurden geschnitten.";
		} else {
			return this.name + "s Haare sind bereits kurz.";
		}
	}

	public String getMerkmaleAlsCsv() {

		String haarlaenge = this.isKurzeHaare() ? "kurze" : "lange";
		return haarlaenge + " Haare," + this.getHaarfarbe() + "e Haare," + this.getAugenfarbe() + "e Augen";
	}

	public String getName() {
		return this.name;
	}

	public String getHaarfarbe() {
		return this.haarfarbe;
	}

	public boolean isKurzeHaare() {
		return this.kurzeHaare;
	}

	public String getAugenfarbe() {
		return this.augenfarbe;
	}

}
