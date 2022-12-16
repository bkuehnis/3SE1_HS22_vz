package uebung12.vzb.ch.zhaw.sprinala;

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
				double kosten = 0;
				String path = "";
				printVerbindungen(von, stops, kosten, path);

			} 
		}
		System.out.println("Applikation beendet");

	}

	static void printStatistik() {
		int countAirports = flughaefen.size();

		int countFlights = 0;
		for (Flughafen f: flughaefen.values()) {
			countFlights += f.getVerbindungen().size() ;
		}

		System.out.println("Anzahl Flughäfen: "+countAirports);
		System.out.println("Anzahl Verbindungen: "+countFlights);
	}
	
	static void printFluege(String von) {
		if (flughaefen.containsKey(von)){
			System.out.println("Alle Flüge ab "+flughaefen.get(von).getName());
			for (Verbindung f: flughaefen.get(von).getVerbindungen()){
				System.out.println(" -> "+f.getZiel().getName()+": "+f.getPreis());
			}
		}
	}
	
	static void printDirektflug(String von, String nach) {
		System.out.println("Direktflug von "+flughaefen.get(von).getName()+" nach "+flughaefen.get(nach).getName()+": ");

		for (Verbindung f: flughaefen.get(von).getVerbindungen()){
			if(f.getZiel().getKuerzel().equalsIgnoreCase(nach)){
				System.out.print(f.getPreis());
			}
		}
	}
	
	static void printVerbindungen(String von, int stops, double kosten, String path) {
			path += flughaefen.get(von).getName() + " ";
			for(Verbindung v : flughaefen.get(von).getVerbindungen()) {
				if(stops > 0){
					printVerbindungen(v.getZiel().getKuerzel(), (stops - 1), kosten + v.getPreis(), path);
				} else if (stops == 0) {
					System.out.println(v.getZiel().getName() + ": " + (kosten + v.getPreis()) + " Route: " + path + v.getZiel().getName());
				}
			}
		}
} 
