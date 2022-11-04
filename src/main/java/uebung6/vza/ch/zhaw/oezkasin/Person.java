package uebung6.vza.ch.zhaw.oezkasin;

import java.util.Scanner;

public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;
	private Scanner keyScan;

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

	public void printPerson() {
		if (kurzeHaare) {
			System.out.println(name + " hat kurze " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
		} else {
			System.out.println(name + " hat lange " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");

		}
	}

	public boolean stimmtHaarfarbe() {
		keyScan = new Scanner(System.in);
		String neuHaarfarbe = keyScan.nextLine();
		System.out.println(name + " hat " + neuHaarfarbe + "e Haare: ");
		if (neuHaarfarbe.equals(haarfarbe) == true) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}

	public String schneideHaare() {
		if (kurzeHaare == false) {
			return name+"s Haare wurden geschnitten.";
		} else {
			return name+"s Haare sind bereits kurz.";

		}
	}
}
