package uebung8.vzb.ch.zhaw.landsfre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SpielWerIstEs {

	public static void main(String[] args) {
		PersonenVerwaltung pv = new PersonenVerwaltung();
		Random rn = new Random();
		Scanner keyScan = new Scanner(System.in);

		pv.addPerson(new Person("Tom", "schwarz", true, "blau"));
		pv.addPerson(new Person("Alex", "schwarz", true, "braun"));
		pv.addPerson(new Person("Maria", "braun", false, "braun"));
		pv.addPerson(new Person("Robert", "braun", true, "blau"));
		pv.addPerson(new Person("Bernard", "braun", true, "braun"));
		pv.addPerson(new Person("Anita", "blond", false, "blau"));
		pv.addPerson(new Person("David", "blond", true, "blau"));
		pv.addPerson(new Person("Charles", "blond", true, "braun"));
		pv.addPerson(new Person("Alfred", "rot", false, "blau"));
		pv.addPerson(new Person("Frans", "rot", true, "blau"));
		pv.addPerson(new Person("Bill", "rot", true, "braun"));

		ArrayList<String> merkmale = new ArrayList<>(Arrays.asList("kurze Haare", "schwarze Haare", "blaue Augen",
				"braune Augen", "lange Haare", "braune Haare", "blonde Haare", "rote Haare"));

		ArrayList<String> haarfarbe = new ArrayList<>(Arrays.asList("schwarze Haare","braune Haare", "blonde Haare", "rote Haare"));
		System.out.println("W�hle eine Person:");

		while (pv.getAnzahl() > 1) {
			int randomMerkmal = rn.nextInt(merkmale.size());
			String merkmal = merkmale.get(randomMerkmal);
			ArrayList<Person> personenMitMerkmal = pv.getAlleMitMerkmal(merkmal);
			System.out.println("Hast du " + merkmal + "?");
			if (keyScan.nextLine().equals("ja")) {
				pv.removePersonenNichtInListe(personenMitMerkmal);
				if (merkmal.equals("schwarze Haare")) {
						merkmale.remove("braune Haare");
						merkmale.remove("blonde Haare");
						merkmale.remove("rote Haare");
				}
				if (merkmal.equals("braune Haare")) {
					merkmale.remove("schwarze Haare");
					merkmale.remove("blonde Haare");
					merkmale.remove("rote Haare");
				}
				if (merkmal.equals("blonde Haare")) {
						merkmale.remove("braune Haare");
						merkmale.remove("schwarze Haare");
						merkmale.remove("rote Haare");
				}
				if (merkmal.equals("rote Haare")) {
					merkmale.remove("braune Haare");
					merkmale.remove("blonde Haare");
					merkmale.remove("schwarze Haare");
				}
			} else {
				pv.removePersonenInListe(personenMitMerkmal);
			}
			merkmale.remove(merkmal);
			haarfarbe.remove(merkmal);
			if (haarfarbe.size() == 1) {
				merkmale.removeAll(haarfarbe);
			}
			if (merkmal.equals("kurze Haare")) {
				merkmale.remove("lange Haare");
			}
			if (merkmal.equals("lange Haare")) {
				merkmale.remove("kurze Haare");
			}
			if (merkmal.equals("blaue Augen")) {
				merkmale.remove("braune Augen");
			}
			if (merkmal.equals("braune Augen")) {
				merkmale.remove("blaue Augen");
			}
			
		}

		System.out.println("Du bist " + pv.getPerson(0).getName());
		keyScan.close();
	}
}
