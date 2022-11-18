package uebung8.vzb.ch.zhaw.bosluc01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SpielWerIstEs {

	public static void main(String[] args) {
		PersonenVerwaltung pv = new PersonenVerwaltung();
		Random rn = new Random();
		Scanner keyScan = new Scanner(System.in);

		pv.addPerson(new Person("Tom","schwarz",true,"blau"));
		pv.addPerson(new Person("Alex","schwarz",true,"braun"));
		pv.addPerson(new Person("Maria","braun",false,"braun"));
		pv.addPerson(new Person("Robert","braun",true,"blau"));
		pv.addPerson(new Person("Bernard","braun",true,"braun"));
		pv.addPerson(new Person("Anita","blond",false,"blau"));
		pv.addPerson(new Person("David","blond",true,"blau"));
		pv.addPerson(new Person("Charles","blond",true,"braun"));
		pv.addPerson(new Person("Alfred","rot",false,"blau"));
		pv.addPerson(new Person("Frans","rot",true,"blau"));
		pv.addPerson(new Person("Bill","rot",true,"braun"));
		
		HashMap<String, ArrayList<String>> merkmalTypen = new HashMap<String, ArrayList<String>>(Map.of(
		    "haarlaenge", new ArrayList<>(Arrays.asList("kurze Haare", "lange Haare")),
		    "haarfarbe", new ArrayList<>(Arrays.asList("schwarze Haare", "braune Haare", "blonde Haare", "rote Haare")),
		    "augenfarbe", new ArrayList<>(Arrays.asList("blaue Augen", "braune Augen"))
		));

		System.out.println("Wähle eine Person:");

		while (pv.getAnzahl() > 1) {
			int randomMerkmalTyp = rn.nextInt(merkmalTypen.size());
			String merkmalTyp = (String) merkmalTypen.keySet().toArray()[randomMerkmalTyp];
			List<String> merkmale = merkmalTypen.get(merkmalTyp);
			int randomMerkmal = rn.nextInt(merkmalTypen.get(merkmalTyp).size());
			String merkmal = merkmale.get(randomMerkmal);
			ArrayList<Person> personenMitMerkmal = pv.getAlleMitMerkmal(merkmal);
			System.out.println("Hast du " + merkmal + "?");
			if (keyScan.nextLine().equals("ja")) {
				pv.removePersonenNichtInListe(personenMitMerkmal);
				merkmalTypen.remove(merkmalTyp);
			} else {
				pv.removePersonenInListe(personenMitMerkmal);
				merkmale.remove(randomMerkmal);
			}
		}

		System.out.println("Du bist "+pv.getPerson(0).getName());
		keyScan.close();
	}
}
