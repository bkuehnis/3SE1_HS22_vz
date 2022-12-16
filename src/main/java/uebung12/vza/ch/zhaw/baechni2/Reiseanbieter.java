package uebung12.vza.ch.zhaw.baechni2;

import java.util.HashMap;
import java.util.Scanner;
//Arbeit mit Hilfe von anderem Student entstanden
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
				printVerbindungen(von, stops, 0, "");
			}
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}

	static void printStatistik() {
		System.out.println("Anzahl Flughäfen: " + flughaefen.size());

		var count = flughaefen.values().stream().mapToInt(x -> {
			return x.getVerbindungen().size();
		}).sum();
		System.out.println("Anzahl Verbindungen: " + count);
	}

	static void printFluege(String von) {
		if (!flughaefen.containsKey(von)) {
			return;
		}

		System.out.println("Alle Flüge ab " + flughaefen.get(von).getName());
		for (Verbindung verbindung : flughaefen.get(von).getVerbindungen()) {
			System.out.println(" -> " + verbindung.getZiel().getName() + ": " + verbindung.getPreis());
		}
	}

	static void printDirektflug(String von, String nach) {
		if (!flughaefen.containsKey(von) || !flughaefen.containsKey(nach)) {
			return;
		}
		Verbindung v = (Verbindung) flughaefen.get(von).getVerbindungen().stream()
				.filter(x -> x.getZiel().getKuerzel().equals(nach)).findFirst().orElse(null);
		System.out.print(
				"Direktflug von " + flughaefen.get(von).getName() + " nach " + flughaefen.get(nach).getName() + ": ");
		if (v != null) {
			System.out.println(v.getPreis());
		}
	}
	
	static void printVerbindungen(String von, int stops, double gesamtKosten, String route) {
		if (!flughaefen.containsKey(von)) {
			return;
		}
		for (Verbindung v : flughaefen.get(von).getVerbindungen()) {
			double neueKosten = gesamtKosten + v.getPreis();
			String neueRoute = route + " " + flughaefen.get(von).getName();
			if(stops == 0) {
			System.out.println(v.getZiel().getName() + ": " + neueKosten + " Route:" + neueRoute + " " + v.getZiel().getName());
			}
			if (stops > 0) {
				printVerbindungen(v.getZiel().getKuerzel(), stops - 1, neueKosten, neueRoute); //Wieso muss ich stops - 1 eingeben und bei stops-- spinnt es?
			}
		}
	}
}
