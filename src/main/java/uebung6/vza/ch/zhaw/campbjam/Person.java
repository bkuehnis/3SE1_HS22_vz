package uebung6.vza.ch.zhaw.campbjam;


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

	public void PrintPerson() {
		if (kurzeHaare) {
			System.out.println(name + " hat kurze " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
		} else {
			System.out.println(name + " hat lange " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
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

	public boolean stimmtHaarfarbe(String haarfarbe) {
		return (haarfarbe.equals(this.haarfarbe));
	}

	public String schneideHaare() {
		String answer = "";
		if (!kurzeHaare) {
			kurzeHaare = true;
			answer = name + "s Haare wurden geschnitten.";
			return answer;
		} else {
			answer = name + "s Haare sind bereits kurz.";
			return answer;
		}
	}

}
