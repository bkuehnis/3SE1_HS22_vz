package uebung12.vza.ch.zhaw.reichraf;

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
				printVerbindungen(von, 0,stops,"");
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}

	static void printStatistik() {
		// TODO
		int count = 0;
		for(Flughafen x: flughaefen.values()) {
			count += x.getVerbindungen().size();
		}

		System.out.println("Anzahl Flughäfen: " + flughaefen.size());
		System.out.println("Anzahl Verbindungen: " + count);
	}

	static void printFluege(String von) {
		// TODO
		if (!flughaefen.containsKey(von)) {
			return;
		}

		//String a = flughaefen.get(von).getName();
		System.out.println("Alle Flüge ab " + flughaefen.get(von).getName() + ":");
		for(Verbindung x: flughaefen.get(von).getVerbindungen()) {
			System.out.println("-> " + x.getZiel().getName() + ": " + x.getPreis());

		}

	}

	static void printDirektflug(String von, String nach) {
		// TODO
		if (!flughaefen.containsKey(von)) {
			return;
		}
		int count = 0;
		for(Verbindung x: flughaefen.get(von).getVerbindungen()) {
			if(x.getZiel().getName().equals(flughaefen.get(nach).getName())) {
				System.out.println("Direktflug von " + flughaefen.get(von).getName() +" nach " + x.getZiel().getName() + " : " + x.getPreis());
				count ++;
			} 
		}
		if (count == 0) {
			System.out.println("Direktflug von " + flughaefen.get(von).getName() +" nach " + flughaefen.get(nach).getName());
		}

	}

	static void printVerbindungen(String von, double gesamtkosten, int stops, String zweischenlandung) {
		// TODO
		if (!flughaefen.containsKey(von)) {
			return;
		}
		for (Verbindung x: flughaefen.get(von).getVerbindungen()) {
			double neueKosten = gesamtkosten + x.getPreis();
			String Landungen =zweischenlandung + " " + flughaefen.get(von).getName() ;
			if (0 < stops) {
				printVerbindungen(x.getZiel().getKuerzel(),neueKosten,stops-1 , flughaefen.get(von).getName());
								
			}else {
			System.out.println(x.getZiel().getName() + ": " + neueKosten + " Route: "+ Landungen + " " + x.getZiel().getName());
			}
		}
	}
} 
