package uebung8.vzb.ch.zhaw.durmibet;


public class Person {
	private String name;
	private String augenfarbe;
	private String haarfarbe;
	private boolean kurzeHaare;

	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) { // Auf Source - Generate
																							// Constructor using Fields
		this.name = name;
		this.augenfarbe = augenfarbe;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
	}

	// public int getAlter() { // Source - Generate Getters and Setters
	// return alter;

	// public void setAlter(int alter) {
	// this.alter = alter;

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
		if (haarfarbe.equals(getHaarfarbe())) {
			System.out.println(name + " hat " + haarfarbe + "e Haare: true");
			return true;
		}
		System.out.println(name + " hat " + haarfarbe + "e Haare: false");
		return false;

	}

	public void schneideHaare() {
		String g;
		if (kurzeHaare == true) {
			g = " sind bereits kurz";
		} else {
			g = " wurden geschnitten";
		}
		System.out.println(name + "s Haare" + g);
	}

	public void printPerson() {
		String h;
		if (kurzeHaare == true) {
			h = "kurze";
		} else {
			h = "lange";
		}
		System.out.println(name + " hat " + h + " " + haarfarbe + "e Haare und " + augenfarbe + "e Augen");

	}

	public String getMerkmaleAlsCsv() {  //Zeile 69-77 mithilfe von Schulkameraden gelöst//
		String merkmale = "";
		if(kurzeHaare) {
			merkmale += "kurze";
		}else {
			merkmale +="lange";
		}
		merkmale += "Haare," +haarfarbe+ "e Haare," + augenfarbe + "e Augen";
		return merkmale;
	}

}
