package uebung6.vza.ch.zhaw.streiluc;


public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	
	public Person (String name, String haarfarbe, boolean kurzeHaare, String augenfarbe){
		this.name= name;
		this.haarfarbe= haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe= augenfarbe;
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
		System.out.println(name + " hat "+ haarfarbe +"e und "+augenfarbe + "e Augen");

	}
	public boolean stimmtHaarfarbe() {
		if (haarfarbe == "schwarz") {
			return true;
		
		}else {
			return false;
		}
		
			
		}
	public String schneideHaare() {
		if (kurzeHaare == true) {
			return "Haare sind bereits kurz";
		} else {
			return "Haare wurden geschnitten";
		}
	}

}
