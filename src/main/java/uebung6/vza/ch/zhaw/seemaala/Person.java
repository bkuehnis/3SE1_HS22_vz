package uebung6.vza.ch.zhaw.seemaala;


public class Person {
	private	String name;
	private	String haarfarbe;
	private	boolean kurzeHaare;
	private	String augenfarbe;


	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}
	static void printPerson(String name, boolean kurzeHaare, String haarfarbe, String augenfarbe) {
		System.out.println(name+" hat "+kurzeHaare+haarfarbe+" Haare und "+augenfarbe+"e Augen");
	}

	public String getName(){
		return name;
	}
	public String getHaarfarbe(){
		return haarfarbe;
	}
	public boolean isKurzeHaare() {
		return kurzeHaare;
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}
	
		
	}


