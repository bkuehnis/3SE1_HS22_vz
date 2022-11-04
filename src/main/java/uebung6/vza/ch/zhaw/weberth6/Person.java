package uebung6.vza.ch.zhaw.weberth6;


public class Person {
	private String name;
	private String haarfarbe;
	//PUBlIC BOOLEAN
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

	
//d	
	
	//Alex hat kurze schwarze Haare und braune Augen.
	public void printPerson() {
		
	String i = "kurze";
	
	if (kurzeHaare == false) {
		i = "lange";
		
	}
	
	System.out.println(name+" hat "+i+" "+haarfarbe+"e Haare und "+augenfarbe+"e Augen");

	}
	
	
//e	
	public boolean stimmtHaarfarbe (String haare) {
		boolean m = false;
		
		if (haarfarbe==haare) {
			m = true;
		}
		System.out.println(name+" hat "+haare+"e haare: "+m);
		return m;
	}





//f


public String schneideHaare () {
	if (kurzeHaare == true) {
	System.out.println(name+"s Haare sind bereits kurz.");
	} 
	else {
		kurzeHaare = true;
		System.out.println(name+"s Haare wurden geschnitten.");
	}
	
	return "gugus";
	
}




}