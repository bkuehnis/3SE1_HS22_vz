package uebung12.vzb.ch.zhaw.celikezg;

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
			System.out.println("\nStatistik (s), Flüge (f), Direktflug (d), Verbindungen (v), Ende (e)");
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
				printVerbindungen(von, stops);
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}
	
	static void printStatistik() {
		System.out.println("Anzahl Flughäfen: " + flughaefen.size());
		System.out.println("Anzahl Verbindungen: " + flughaefen.values().stream().mapToInt(f -> f.getVerbindungen().size()).sum());
	}
	
	static void printFluege(String von) {
		Flughafen f = flughaefen.get(von);
		System.out.println("Alle Flüge ab " + f.getName() + ":");
		f.getVerbindungen().forEach(v -> System.out.println(" -> " + v.getZiel().getName() + ": " + v.getPreis()));
	}
	
	static void printDirektflug(String von, String nach) {
		Flughafen fV = flughaefen.get(von);
		Flughafen fN = flughaefen.get(nach);
		System.out.println(
			"Direktflug von " + fV.getName() + " nach " + fN.getName() + ": " + 
			fV.getVerbindungen().stream().filter(v1 -> v1.getZiel().getKuerzel().equals(nach)).map(v -> Double.toString(v.getPreis())).findAny().orElse("")
		);
	}
	
	static void printVerbindungen(String von, int stops) {
		Flughafen fV = flughaefen.get(von);
		printVerbindungen(fV, stops, 0D, fV.getName());
	}

	private static void printVerbindungen(Flughafen fV, int stops, double preis, String route) {
		if (stops < 0)
			System.out.println(fV.getName() + ": " + preis + " Route: " + route);
		else
			fV.getVerbindungen().forEach(v -> printVerbindungen(v.getZiel(), stops - 1, preis + v.getPreis(), route + " " + v.getZiel().getName()));
	}
} 
