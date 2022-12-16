package uebung12.vzb.ch.zhaw.wueesnin;

import java.util.HashMap;
import java.util.Scanner;

public class Reiseanbieter {
	static HashMap<String, Flughafen> flughaefen;

	public static void main(String[] args) {
		flughaefen = new HashMap<String, Flughafen>();

		flughaefen.put("HAM", new Flughafen("Hamburg", "HAM"));
		flughaefen.put("AMS", new Flughafen("Amsterdam", "AMS"));
		flughaefen.put("ZRH", new Flughafen("Zuerich", "ZRH"));
		flughaefen.put("CDG", new Flughafen("Paris", "CDG"));
		flughaefen.put("BER", new Flughafen("Berlin", "BER"));
		flughaefen.put("MUC", new Flughafen("Muenchen", "MUC"));
		flughaefen.put("FCO", new Flughafen("Rom", "FCO"));

		flughaefen.get("HAM").addVerbindung(new Verbindung(flughaefen.get("AMS"), 152));
		flughaefen.get("AMS").addVerbindung(new Verbindung(flughaefen.get("HAM"), 301));
		flughaefen.get("AMS").addVerbindung(new Verbindung(flughaefen.get("CDG"), 203));
		flughaefen.get("AMS").addVerbindung(new Verbindung(flughaefen.get("ZRH"), 85));
		flughaefen.get("ZRH").addVerbindung(new Verbindung(flughaefen.get("FCO"), 234));
		flughaefen.get("BER").addVerbindung(new Verbindung(flughaefen.get("AMS"), 166));
		flughaefen.get("BER").addVerbindung(new Verbindung(flughaefen.get("MUC"), 186));
		flughaefen.get("BER").addVerbindung(new Verbindung(flughaefen.get("FCO"), 251));
		flughaefen.get("MUC").addVerbindung(new Verbindung(flughaefen.get("BER"), 220));
		flughaefen.get("MUC").addVerbindung(new Verbindung(flughaefen.get("CDG"), 186));
		flughaefen.get("FCO").addVerbindung(new Verbindung(flughaefen.get("CDG"), 310));

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
				printDirektflug(von, nach);
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

		int anzVerbindungen = 0;
		for (String key : flughaefen.keySet()) {
			anzVerbindungen += flughaefen.get(key).getVerbindungen().size();
		}
		System.out.println("Anzahl Verbindungen: " + anzVerbindungen);
	}

	static void printFluege(String von) {
		try {
			Flughafen flughafen = flughaefen.get(von);
			System.out.println("Alle Flüge ab " + flughafen.getName() + ":");
			for (Verbindung verbindung : flughafen.getVerbindungen()) {
				System.out.println("-> " + verbindung.getZiel().getName() + ": " + verbindung.getPreis());
			}
		} catch (Exception e) {
			System.out.println("Kürzel '" + von + "' ist unbekannt.");
		}
	}

	static void printDirektflug(String von, String nach) {
		try {
			Flughafen fVon = flughaefen.get(von);
			Flughafen fNach = flughaefen.get(nach);
			double preis = 0;

			for (Verbindung verbindung : fVon.getVerbindungen()) {
				if (verbindung.getZiel().equals(fNach)) {
					preis = verbindung.getPreis();
					return;
				}
			}
			System.out.println("Direktflug von " + fVon.getName() + " nach " + fNach.getName() + ": " + preis);
		} catch (Exception e) {
			System.out.println("Kürzel '" + von + "' oder '" + nach + "' ist unbekannt.");
		}
	}

	static void printVerbindungen(String von, int stops) {
		Flughafen fVon = flughaefen.get(von);
	}
}
