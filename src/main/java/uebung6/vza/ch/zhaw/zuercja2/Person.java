package uebung6.vza.ch.zhaw.zuercja2;


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
	public void print() {
		if(kurzeHaare) {System.out.println(name+" hat kurze "+haarfarbe+"e Haare und "+augenfarbe+"e Augen");}
		
		else {System.out.println(name+" hat lange "+haarfarbe+"e Haare und "+augenfarbe+"e Augen");}
	}
	public String getName() {
		return name;
	}
	public String getHaarfarbe() {
		return haarfarbe;
	}
	public boolean getKurzeHaare() {
		return kurzeHaare;
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}
	
	public boolean stimmtHaarfarbe(String haarfarbe) { 
			return this.haarfarbe.equals(haarfarbe);
		
	}
	
	
	public void schneideHaare() {
		if(kurzeHaare) {System.out.println(name+"s Haare sind bereits kurz.");}
		
		else {System.out.println(name+"s Haare wurden geschnitten");}
		
	}

	

}
