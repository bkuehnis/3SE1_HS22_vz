package uebung6.vza.ch.zhaw.kamaldil;

import java.util.Scanner;
public class Person {


	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;


	public Person (String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;

	}

	public void printPerson() {
		String Haarlänge = "";
		if (this.kurzeHaare == true) {
			Haarlänge = "kurze";
		} else {
			Haarlänge = "lange";
		}
		System.out.println(this.name + " hat " + Haarlänge + " "+ this.haarfarbe + "e" + " Haare und " + this.augenfarbe + "e" + " Augen.");
	}

	public String getName() {
		return name;
	}
	public String getHaarfarbe() {
		return haarfarbe;
	}
	public boolean getKurzehaare() {
		return kurzeHaare;
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}

	public boolean stimmtHaarfarbe(String haarfarbeRat) {
		System.out.println(this.name + " hat "+  haarfarbeRat+"e" + " Haare: " + haarfarbe.equals(haarfarbeRat));
		return haarfarbe.equals(haarfarbeRat);
	}
	
	public void schneideHaare(String kurzeHaareRat) {
		String Haarlänge = "";
		if (this.kurzeHaare == true) {
			Haarlänge = "kurz";
		} else {
			Haarlänge = "lang";
		}
		if (kurzeHaareRat.equals("Haarlänge")) {
			System.out.println(this.name +"s" + " Haare wurden geschnitten.");
		} else {
			kurzeHaare = false;
			System.out.println(this.name +"s" + " Haare sind bereits kurz.");
		}
		
	
	}
		
}	


