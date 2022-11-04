package uebung6.vza.ch.zhaw.kuralsar;

import java.util.Scanner;

public class Person {

	private String name;
	private String haarfarbe;
	private boolean kurzehaare;
	private String augenfarbe;

	public Person(String name, String haarfarbe, boolean kurzehaare, String augenfarbe) {

		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzehaare = kurzehaare;
		this.augenfarbe = augenfarbe;

	}

	public void printPerson() {
		if (kurzehaare) {
			System.out.println(name+" hat kurze "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");	
		}
		else {
			System.out.println(name+" hat lange "+haarfarbe+"e Haare und "+augenfarbe+"e Augen.");	
		}
	}
	public String getName() {
		return name;
	}

	public String getHaarfarbe() {
		return haarfarbe;
	}
	public boolean getKurzehaare() {
		return kurzehaare;
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}



	public boolean stimmtHaarfarbe() {
		Scanner keyScan = new Scanner(System.in);
		String neuHaarfarbe = keyScan.nextLine();
		if (stimmtHaarfarbe() == true) {
			System.out.println(name+ "hat "+neuHaarfarbe+"e Haare:"+true);

		} else {
			System.out.println(name+ "hat "+neuHaarfarbe+"e Haare:"+false);
		}
		return kurzehaare;



	}
}

