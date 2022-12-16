package uebung12.vza.ch.zhaw.stettjoe;

import java.util.HashMap;
import java.util.Scanner;

public class Reiseanbieter {
	static HashMap<String,Flughafen> flughaefen;

	public static void main(String[] args) {
		flughaefen = new HashMap<String,Flughafen>();

		flughaefen.put("HAM",new Flughafen("Hamburg","HAM"));
		flughaefen.put("AMS",new Flughafen("Amsterdam","AMS"));
		flughaefen.put("ZRH",new Flughafen("Zuerich","ZRH"));
		flughaefen.put("CDG",new Flughafen("Paris","CDG"));
		flughaefen.put("BER",new Flughafen("Berlin","BER"));
		flughaefen.put("MUC",new Flughafen("Muenchen","MUC"));
		flughaefen.put("FCO",new Flughafen("Rom","FCO"));

		flughaefen.get("HAM").addVerbindung(new  Verbindung(flughaefen.get("AMS"), 152));
		flughaefen.get("AMS").addVerbindung(new  Verbindung(flughaefen.get("HAM"), 301));
		flughaefen.get("AMS").addVerbindung(new  Verbindung(flughaefen.get("CDG"), 203));
		flughaefen.get("AMS").addVerbindung(new  Verbindung(flughaefen.get("ZRH"), 85));
		flughaefen.get("ZRH").addVerbindung(new  Verbindung(flughaefen.get("FCO"), 234));
		flughaefen.get("BER").addVerbindung(new  Verbindung(flughaefen.get("AMS"), 166));
		flughaefen.get("BER").addVerbindung(new  Verbindung(flughaefen.get("MUC"), 186));
		flughaefen.get("BER").addVerbindung(new  Verbindung(flughaefen.get("FCO"), 251));
		flughaefen.get("MUC").addVerbindung(new  Verbindung(flughaefen.get("BER"), 220));
		flughaefen.get("MUC").addVerbindung(new  Verbindung(flughaefen.get("CDG"), 186));
		flughaefen.get("FCO").addVerbindung(new  Verbindung(flughaefen.get("CDG"), 310));

		String auswahl = "";
		Scanner keyScan = new Scanner(System.in);
		while (!auswahl.equals("e")) {
			System.out.println("\nStatistik (s), Fl�ge (f), Direktflug (d), Verbindungen (v), Ende (e)");
			System.out.print("> ");
			auswahl = keyScan.nextLine();
			if (auswahl.equals("s")) {
				printStatistik();
			} else if (auswahl.equals("f")) {
				System.out.print("Von: ");
				String von = keyScan.nextLine();
				printFluege(von);
			} else if (auswahl.equals("d")) {
				System.out.print("Von: ");
				String von = keyScan.nextLine();
				System.out.print("Nach: ");
				String nach = keyScan.nextLine();
				printDirektflug(von,nach);
			} else if (auswahl.equals("v")) {
				System.out.print("Von: ");
				String von = keyScan.nextLine();
				System.out.print("Stops: ");
				int stops = Integer.valueOf(keyScan.nextLine());
				printVerbindungen(von, stops, 0);
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}
	
	static void printStatistik() {
		// TODO
		int countFlughaefen = 0;
		int countVerbindungen = 0;
		for (Flughafen f: flughaefen.values()) {
			countFlughaefen++;
			for (Verbindung v: f.getVerbindungen()) {
				countVerbindungen++;
			}
		}
		System.out.println("Anzahl Flughaefen: "+countFlughaefen);
		System.out.println("Anzahl Verbindungen: "+countVerbindungen);
	}
	
	static void printFluege(String von) {
		// TODO
		Flughafen f = flughaefen.get(von);
		System.out.println("Von: "+f.getKuerzel());
		System.out.println("Alle Fluege ab: "+f.getName());
		for (Verbindung v: f.getVerbindungen()) {
			System.out.println(" -> "+v.getZiel().getName()+": "+v.getPreis());
		}
	}
	
	static void printDirektflug(String von, String nach) {
		// TODO
		System.out.println("Von: "+von);
		System.out.println("Nach: "+nach);
		Flughafen fAbflug = flughaefen.get(von);
		Flughafen fAnkunft = flughaefen.get(nach);
		
		System.out.print("Direktflug von "+fAbflug.getName()+" nach "+fAnkunft.getName()+":");
		for (Verbindung v: fAbflug.getVerbindungen()) {
			if (v.getZiel().getKuerzel().equals(nach)) {
				System.out.println(" "+v.getPreis());
			}
		}
	}
	
	static void printVerbindungen(String von, int stops, double preis) {
		// TODO
		int count = stops;
		HashMap<String, Flughafen> erreichbareZiele = new HashMap<String, Flughafen>();
		Flughafen f = flughaefen.get(von);
		
		if (count > -1) {
			count--;
			for (Verbindung v: f.getVerbindungen()) {
				erreichbareZiele.put(v.getZiel().getKuerzel(),v.getZiel());
			}
			for (Flughafen fZ: erreichbareZiele.values()) {
				printVerbindungen(fZ.getKuerzel(),count, preis);
			}
		} else {
			System.out.println(f.getName()+": "+preis);
		}
	}
} 
