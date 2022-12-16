package uebung12.vza.ch.zhaw.gavindom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

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
//				printVerbindungen(von, stops);
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}
//b)
	static void printStatistik() {
		
		System.out.println("Anzahl Flughaefen = "+ flughaefen.size());
			
		int total=0;
		for(Flughafen f: flughaefen.values()) {
		total = total + (f.getVerbindungen().size());
		System.out.println(total);
		}
		}
//c)	
	static void printFluege(String von) {
		
		Flughafen f = flughaefen.get(von);
	
		ArrayList<Verbindung>verb = new ArrayList<Verbindung>();
		verb = f.getVerbindungen();		
		for(Verbindung v: verb){ 
			System.out.println("-> " + v.getZiel().getName()+ " -> " + v.getPreis());
		}
	}
//d)	
	static void printDirektflug(String von, String nach) {
		
		Flughafen f = flughaefen.get(von);	//berlin
		Flughafen g = flughaefen.get(nach);
		ArrayList<Verbindung> verb = new ArrayList<Verbindung>();
		verb = f.getVerbindungen(); //Berlin fliegt nach Amsterdam und Rom und München
		
		for (Verbindung v : verb) {
	
			if (v.getZiel().getName() == g.getName() ) {

				System.out.println(v.getZiel().getName() + " " + v.getPreis());
			} 
			
		}
	}
		
//efg) kann die Aufgabe ohne Hilfe von einem Ansatz nicht lösen
	static void printVerbindungen(String von, int stops, String path) {

	/*	path += b.getName(von)+"";
		if (stops > 0) {
			stops--;
			for (von b : p.getVerbindungen()) {
			findReceivers(von, stops, b, path);
			}
			} else {
			System.out.println(p.getName(von)+ ": " + p.getPreis() + "Route: " + path );
			}*/
			}
	
	
} 

