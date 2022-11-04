package uebung6.vzb.ch.zhaw.steinol3;


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

	public boolean IsKurzeHaare() {

		return kurzeHaare;

	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void printPerson() {

		String kurze = "kurze";
		String lange = "lange";

		if (kurzeHaare == true) {
			System.out.println(name + " hat " + kurze + " " + haarfarbe + " Haare und " + augenfarbe + " Augen.");

		} else {
			System.out.println(name + " hat " + lange + " " + haarfarbe + " Haare und " + augenfarbe + " Augen.");

		}

	}

	public boolean stimmtHaarfarbe(String test) {
		return test.equals(haarfarbe);

	}
	
	public void schneideHaare() {
		
		if (kurzeHaare == true) {
			System.out.println(name + " hat die Haare bereits kurz.");
		}else {
			kurzeHaare = true;
			System.out.println(name + "s Haare wurden geschnitten.");
		}
		
		
	}

	
		
		}
	
	
	
	
