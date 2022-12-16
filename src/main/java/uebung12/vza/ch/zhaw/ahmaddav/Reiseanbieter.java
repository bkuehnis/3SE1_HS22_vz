package uebung12.vza.ch.zhaw.ahmaddav;

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
				printVerbindungen(von, stops);
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}
	
	static void printStatistik() {
		int flughafAnz = flughaefen.size();
		int verbindungAnz = 0;
		
		for (Flughafen flughafen : flughaefen.values()) {
			verbindungAnz += flughafen.getVerbindungen().size();
		}
		System.out.println("Anzahl Flughäfen: "+flughafAnz);
		System.out.println("Anzahl Verbindungen: "+verbindungAnz);
	}
	
	static void printFluege(String von) {
		Flughafen flughafen = flughaefen.get(von);
		
		if (flughafen != null) {
			System.out.println("Alle Flüge ab "+flughafen.getName()+":");
			
			for (Verbindung verbindung : flughafen.getVerbindungen()) {
				System.out.println(" -> "+ verbindung.getZiel().getName()+":"+verbindung.getPreis());
			}
			
		} else {
			System.out.println("Flughafen mit dem Kürzel:"+von+" nicht gefunden");
		}
	}
	
	static void printDirektflug(String von, String nach) {
		Flughafen vflughafen = flughaefen.get(von);
		Flughafen nflughafen = flughaefen.get(nach);
		
		if (vflughafen != null && nflughafen != null) {
			System.out.print("Direktflug von"+vflughafen.getName()+" nach "+nflughafen.getName()+":");
			
			Verbindung direktverbindung = vflughafen.getVerbindungen(nflughafen);
			if (direktverbindung != null) {
				System.out.println(direktverbindung.getPreis());
			} else {
				System.out.println();
			}
			
		}
		
		
		
	}
	
	
	static void printVerbindungen(String von, int stops) {
		Flughafen f = flughaefen.get(von);
        if (stops >= 0) {
            for (Verbindung v: f.getVerbindungen()) {
                printVerbindungen(v.getZiel().getKuerzel(),stops-1);
            }
        } else {
            System.out.println(f.getName());
        }
    }

	static void printVerbindungen2(String von, int stops, double kosten) {
        Flughafen f = flughaefen.get(von);
        if (stops >= 0) {
            for (Verbindung v: f.getVerbindungen()) {
                printVerbindungen2(v.getZiel().getKuerzel(),stops-1,kosten+v.getPreis());
            }
        } else {
            System.out.println(f.getName()+": "+kosten);
        }
    }
	 static void printVerbindungen3(String von, int stops, double kosten, String strecke) {
	        Flughafen f = flughaefen.get(von);
	        strecke += f.getName()+" ";
	        if (stops >= 0) {
	            for (Verbindung v: f.getVerbindungen()) {
	                printVerbindungen3(v.getZiel().getKuerzel(),stops-1,kosten+v.getPreis(),strecke);
	            }
	        } else {
	            System.out.println(f.getName()+": "+kosten+" Route: "+strecke);
	        }
	    }
	}


