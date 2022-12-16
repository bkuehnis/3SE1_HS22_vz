package uebung12.vzb.ch.zhaw.rinitsar;

import java.util.ArrayList;
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
				printVerbindungen(von, stops,0.0,flughaefen.get(von).getName());
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}	
	static void printStatistik() {
		System.out.println("Anzahl Flughäfen:" + flughaefen.size());
		var x = flughaefen.keySet();
		int anzVerbindungen = 0;
		for (String key : x) {
		Flughafen f = flughaefen.get(key);
		anzVerbindungen += f.getVerbindungen().size();
		}
		System.out.println("Anzahl Verbindungen: " + anzVerbindungen);
		}

		static void printFluege(String von) {	
		try {
		Flughafen f = flughaefen.get(von.toUpperCase());
		ArrayList<Verbindung> verbindungen = f.getVerbindungen();
		System.out.println("Alle Flüge ab " + f.getName() + ":");
		for (Verbindung v : verbindungen) {
		System.out.println("-> " + v.getZiel().getName() + ": " + v.getPreis());
		}
		} catch (Exception e) {
		System.out.println("Dieser Flughafen wurde nicht gefunden.");
		}
		}
		static void printDirektflug(String von, String nach) {		
		try {
		Flughafen fVon = flughaefen.get(von.toUpperCase());
		Flughafen fNach = flughaefen.get(nach.toUpperCase());
		System.out.print("Direktflug von " + fVon.getName() + " nach " + fNach.getName() + ": ");
		fVon.getVerbindungen().stream().forEach(v -> {
		if (v.getZiel() == fNach) {
		System.out.println(v.getPreis());
		}
		});
		} catch (Exception e) {
		System.out.println("Eine der beiden Flughäfen wurde nicht gefunden.");
		}
		}
		
		static void printVerbindungen(String von, int stops, double startKosten, String route) {		
		try {
		if (stops >= 0) {
		var verbindungen = flughaefen.get(von.toUpperCase()).getVerbindungen();
		verbindungen.forEach(v -> {
		printVerbindungen(v.getZiel().getKuerzel(), stops - 1, startKosten + v.getPreis(), route + " " + v.getZiel().getName());
		});
		} else {
		System.out.println(flughaefen.get(von.toUpperCase()).getName() + ": " + startKosten + " Route: " + route);
		}
		} catch (Exception e) {
		System.out.println("Der Flughafen wurde nicht gefunden.");
		}
		}
		}
