package uebung12.vzb.ch.zhaw.delvelor;

import java.util.HashMap;
import java.util.Scanner;

public class Reiseanbieter {
	static HashMap<String, Flughafen> flughaefen;

	public static void main(String[] args) {
		flughaefen = new HashMap<String, Flughafen>();
		int kosten = 0;

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
				String start = flughaefen.get(von).getName();
				printVerbindungen(von, stops, kosten, start);
			}
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}

	static void printStatistik() {
		System.out.println("Anzahl Flughäfen: " + flughaefen.size());
		int counter = 0;

		for (Flughafen f : flughaefen.values()) {
			counter += f.getVerbindungen().size();
		}
		System.out.println("Anzahl Verbindungen: " + counter);
	}

	static void printFluege(String von) {
		if (flughaefen.containsKey(von)) {
			System.out.println("Alle Flüge von " + flughaefen.get(von).getName() + " :\t");
			for (Verbindung v : flughaefen.get(von).getVerbindungen()) {
				System.out.println(" -> " + v.getZiel().getName() + ": " + v.getPreis());
			}
		}
	}

	static void printDirektflug(String von, String nach) {
		System.out.print("Direktflug von " + flughaefen.get(von).getName() + " nach " + flughaefen.get(nach).getName());
		for (Verbindung v : flughaefen.get(von).getVerbindungen()) {
			if (v.getZiel().getKuerzel().equals(nach)) {
				System.out.println(" " + v.getPreis());
			}
		}

	}

	static void printVerbindungen(String von, int stops, int kosten, String start) {
		if (stops > 0) {
			stops--;
			for (Verbindung v : flughaefen.get(von).getVerbindungen()) {
				kosten += v.getPreis();
				printVerbindungen(v.getZiel().getKuerzel(), stops, (int)v.getPreis(), start);
			}
		} else {
			for (Verbindung v : flughaefen.get(von).getVerbindungen()) {
				System.out.println(v.getZiel().getName()+" "+(kosten+v.getPreis())+" "+start+" "+flughaefen.get(von).getName()+" "+v.getZiel().getName());
		}
		}
	}

}
