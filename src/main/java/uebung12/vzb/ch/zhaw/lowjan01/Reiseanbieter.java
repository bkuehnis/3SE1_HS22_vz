package uebung12.vzb.ch.zhaw.lowjan01;

import java.util.ArrayList;
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
		int fl = 0;

		for (String fs : flughaefen.keySet()) {
			fl++;

		}
		System.out.println("Anzahl Flughäfen: " + fl);
//		System.out.println("Anzahl Flughäfen: " + flughaefen.verbindungen.size());

//		for (Verbindung fs : Verbindung.size()) {
//			ver++;
//		
//		}
//		
//		
//		System.out.println("Anzahl Flughäfen: " + verbindungen.size());
	}

	static void printFluege(String von) {
		Flughafen g = flughaefen.get(von);
		System.out.println("Alle Flüge ab " + g.getName() + ":");
		System.out.println(flughaefen.get(von).getVerbindungen());

		g.getVerbindungen().stream().filter(x -> x.getZiel().getKuerzel().equals(von))
				.forEach(x -> System.out.println(x.getZiel().getName() + ": " + x.getPreis()));
		/// wird nur die Adresse ausgegeben

	}

	static void printDirektflug(String von, String nach) {
		Flughafen g = flughaefen.get(von);
		Flughafen g1 = flughaefen.get(nach);
		System.out.print("Direktflug von " + g.getName() + " nach " + g1.getName() + ": ");
		g.getVerbindungen().stream()
		.filter(x -> x.getZiel().getKuerzel().equals(nach))
		.forEach(x -> System.out.print(x.getPreis()+" "));

	}

	static void printVerbindungen(String von, int stops) {
		Flughafen g = flughaefen.get(von);
		
		if (stops >= 0) {
			for (Verbindung v: g.getVerbindungen()) {
				printVerbindungen(v.getZiel().getKuerzel(),stops-1);
			}
		} else {
			System.out.println(g.getName());
		}
}
}
