package uebung7.vzb.ch.zhaw.strubili;


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
		String haare = "lange ";
		if (kurzeHaare) {
			haare = "kurze ";
		}
		System.out.println(name+" hat "+haare+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");
	}
	
	public boolean stimmtHaarfarbe(String haarfarbe) {
		return this.haarfarbe.equals(haarfarbe);
	}
	
	public String schneideHaare() {
		if (kurzeHaare) {
			return name+"s Haare sind bereits kurz.";
		} else {
			kurzeHaare = true;
			return name+"s Haare wurden geschnitten.";
		}
	}
	public String getMerkmaleAlsCsv() {
		return (kurzeHaare == true ? "kurze" : "lange")+" Haare"+","+haarfarbe.toString()+"e Haare"+","
				+augenfarbe.toString()+"e Augen";
	}
}
