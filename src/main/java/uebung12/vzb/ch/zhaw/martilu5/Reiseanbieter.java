package uebung12.vzb.ch.zhaw.martilu5;

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
				printVerbindungen(von, stops, 0, "");//gemäss Vorlesung ergänzt um preis und route
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}
	
	static void printStatistik() {
		System.out.println("Anzahl Flughäfen: "+flughaefen.size());
		int anzVerbindungen = 0;
		for (Flughafen f : flughaefen.values()) { //for each Schleife, geht ganze HashMap für jeden Flughafen durch
			anzVerbindungen += f.getVerbindungen().size(); //gibt ANzahl Verbindungen aus
		}
		System.out.println("Anzahl Verbindungen: "+anzVerbindungen);
	}
	
	static void printFluege(String von) {
		System.out.println("Alle Flüge ab "+flughaefen.get(von).getName()); //gibt den Name des FLughafens mit de Kürzel aus
		for (Verbindung v : flughaefen.get(von).getVerbindungen()) {	//geht alle Verbindungen des Flughafen mit dem Kürzel durch
			System.out.println(" -> "+v.getZiel().getName()+" "+v.getPreis()); //gibt den NAmen des Ziels und den Preis der Verbindung aus
		}
	}
	
	static void printDirektflug(String von, String nach) {
		//System.out.println("Direktflug von "+flughaefen.get(von).getName()+" nach "+flughaefen.get(nach).getName());
		
		double dPreis = 0;
		//Preis für Verbindung berechnen
		for (Verbindung v : flughaefen.get(von).getVerbindungen()) { //Verbindungen von Abflugort auslesen for each schleife
			if (v.getZiel().getKuerzel().equals(nach)) { //überprüfen ob eine Direktverbindung besteht
				dPreis = v.getPreis(); //PReis in Variabel überschreiben
			}
		}
		
		if (dPreis != 0) { //wenn ein Preis ermittelt wurde gibt es auch eine Direktverbindung --> Preis ausgeben
			System.out.println("Direktflug von " + flughaefen.get(von).getName() + " nach "
					+ flughaefen.get(nach).getName() + ": " + dPreis);
		} else { //wenn kein Preis vorhanden, kein Direktflug, kein Preis ausgeben
			System.out.println("Direktflug von " + flughaefen.get(von).getName() + " nach "
					+ flughaefen.get(nach).getName() + ": ");
		}		
	}
	
	static void printVerbindungen(String von, int stops, double preis, String route) {
		
		if (route.equals("")) {
			route = flughaefen.get(von).getName()+" ";
		}
		
		if (stops > 0) {
			for (Verbindung v : flughaefen.get(von).getVerbindungen()) { //Verbindungen durchgehen
				//Rekursion
				stops--;
				printVerbindungen(v.getZiel().getKuerzel(), stops, preis+v.getPreis(), route+v.getZiel().getName()+" "); //geht Verbindungen durch mit gewpnschter Anzahl stops
			}
		}
		else {
			for (Verbindung v : flughaefen.get(von).getVerbindungen()) { 
				System.out.println(v.getZiel().getName()+": "+(preis+v.getPreis())+" Route: "+route+v.getZiel().getName()+" ");
			}
				
			
		}
	}
	
}
