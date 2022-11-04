package uebung6.vzb.ch.zhaw.delvelor;


public class Person {

	private String name;
	private String haarfarbe;
	private String augenfarbe;
	private boolean kurzeHaare;

	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {

		this.name = name;
		this.haarfarbe = haarfarbe;
		this.augenfarbe = augenfarbe;
		this.kurzeHaare = kurzeHaare;
	
	}
	
	public void schneideHaare() {
		String NoSir;
		if (kurzeHaare == true) {
			NoSir = " Haare sind bereits kurz";
		} else { 
			NoSir = " Haare wurden geschnitten";
		}
		
		System.out.println(name + "s " + NoSir); 
	}
		
	
	
	public boolean stimmtHaarfarbe(String haarfarbe) {
		if (haarfarbe.equals(gethaarfarbe())) {
			System.out.println(name+ " hat " +haarfarbe+ "e Haare: true");
			return true;
		}
		
			System.out.println(name+ " hat " + haarfarbe + "e Haare: false");
			return false;
	}
	
	public void printPerson() {
		String Yessir;
		if (kurzeHaare == true) {
			Yessir = "kurze";
		} else {
			Yessir = "lange";
		}
		
		System.out.println(name + " hat " +Yessir+ " " + haarfarbe + "e " + "Haare und " +augenfarbe+ "e " + "Augen.");

	}
	
	public String getName() {
		return name;
	}
	
	public String gethaarfarbe() {
		return haarfarbe;
		
	}
	
	public String getaugenfarbe() {
		return augenfarbe;
		
	}
	
	public boolean iskurzeHaare() {
		return kurzeHaare;
	}

	
}
