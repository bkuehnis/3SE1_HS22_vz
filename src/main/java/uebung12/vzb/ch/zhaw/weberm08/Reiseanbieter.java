package uebung12.vzb.ch.zhaw.weberm08;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Reiseanbieter {
	static HashMap<String,Flughafen> flughaefen;

	public static void main(String[] args) {
		int preis = 0;
		String path = "";
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
				printVerbindungen(von, stops, preis, path);
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}
	
	static void printStatistik() {
		// TODO
		System.out.println("Anzahl Flughäfen: " + flughaefen.size());
		int verbindungen = 0;
		
		for (Flughafen f : flughaefen.values()) {
		    verbindungen += f.getVerbindungen().size();
		}
		
		System.out.println("Anzahl Verbindungen: " + verbindungen);
	}
	
	static void printFluege(String von) {
		for (int i = 0; i < flughaefen.get(von).getVerbindungen().size(); i++) {
			System.out.println(" -> " + flughaefen.get(von).getVerbindungen().get(i).getZiel().getName() + ": " + flughaefen.get(von).getVerbindungen().get(i).getPreis());
		}
	}
	
	static void printDirektflug(String von, String nach) {
		// TODO
		double preis = 0;
		for (int i = 0; i < flughaefen.get(von).getVerbindungen().size(); i++) {
			if (flughaefen.get(von).getVerbindungen().get(i).getZiel().getKuerzel().equals(nach)) {
				preis = flughaefen.get(von).getVerbindungen().get(i).getPreis();
			}
		}
		System.out.println("Direktflug von " + flughaefen.get(von).getName() + " nach " + flughaefen.get(nach).getName() +": " + preis);
		
	}
	
	static void printVerbindungen(String von, int stops, double kosten, String path) {
		// TODO
		double verbindungsKosten;
		String verbindungsNamen;
		if (path == "") {
			path = flughaefen.get(von).getName();
		}
		
		if (stops >= 0) {
			for (int i = 0; i < flughaefen.get(von).getVerbindungen().size(); i++) {
				verbindungsKosten = flughaefen.get(von).getVerbindungen().get(i).getPreis();
				verbindungsNamen = flughaefen.get(von).getVerbindungen().get(i).getZiel().getName();
				if (stops == 0) {
					System.out.println(flughaefen.get(von).getVerbindungen().get(i).getZiel().getName() + ": " + (kosten + verbindungsKosten) + " Route: " +(path+ " "+ verbindungsNamen));
				}
				printVerbindungen(flughaefen.get(von).getVerbindungen().get(i).getZiel().getKuerzel(), stops-1, kosten + verbindungsKosten, (path+ " "+ verbindungsNamen));
			}
		}
	}
} 
