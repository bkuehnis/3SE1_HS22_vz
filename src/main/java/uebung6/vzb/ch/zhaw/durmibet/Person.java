package uebung6.vzb.ch.zhaw.durmibet;

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
	public void schneideHaare() {
		String g;
		if (kurzeHaare == true) {
			g = " sind bereits kurz";
		}else {
			g = " wurden geschnitten";
		}
		System.out.println(name+ "s Haare"+g);
	}
	public boolean stimmtHaarfarbe(String haarfarbe) {
		if (haarfarbe.equals(getHaarfarbe())){
			System.out.println(name+" hat "+haarfarbe+"e Haare: true");
			return true;
		}
		System.out.println(name+" hat "+haarfarbe+"e Haare: false");
		return false;
		
	}
	public void printPerson() {
		String h;
		if (kurzeHaare == true) {
			h = "kurze";
		} else {
			h = "lange";
		}
		System.out.println(name+ " hat "+h+" " +haarfarbe+ "e Haare und "+augenfarbe+"e Augen");

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
	
}
