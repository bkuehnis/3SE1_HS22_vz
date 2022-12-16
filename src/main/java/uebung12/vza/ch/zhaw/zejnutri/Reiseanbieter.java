package uebung12.vza.ch.zhaw.zejnutri;

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
			System.out.println("\nStatistik (s), Fluege (f), Direktflug (d), Verbindungen (v), Ende (e)");
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
				printVerbindungen(von, stops, 0, "");
			} 
		}
		System.out.println("Applikation beendet");
		keyScan.close();
	}
	
	static void printStatistik() {
		int count = 0;
		for(Flughafen f: flughaefen.values()) {
			count += f.getVerbindungen().size();
		}
		System.out.println("Anzahl Flughaefen: "+flughaefen.size());
		System.out.println("Anzahl Verbindungen: "+count);
	}
	
	static void printFluege(String von) {
		System.out.println("Von: " + von);
        System.out.println("Alle Flüge ab Berlin:");
        for (Verbindung item: flughaefen.get(von).getVerbindungen()){
            System.out.println(" -> " + item.getZiel().getName() + ": " + item.getPreis());
        }
    }
	
    static void printDirektflug(String von, String nach) {
        String preis = "";
        for(Verbindung item: flughaefen.get(von).getVerbindungen()){
            if (item.getZiel().getKuerzel().equalsIgnoreCase(nach)){
                preis = Double.toString(item.getPreis());
            }
        }
        System.out.println("Direktflug von " + flughaefen.get(von).getName() + " nach " + flughaefen.get(nach).getName() + ": " + preis);
    }
	
    static void printVerbindungen(String von, int stops, double kosten, String route) {
        route += flughaefen.get(von).getName() + " ";
        if (stops >= 0){
            stops--;
            for (Verbindung item: flughaefen.get(von).getVerbindungen()){
                printVerbindungen(item.getZiel().getKuerzel(), stops, kosten + item.getPreis(), route);
            }
        } else {
            System.out.println(flughaefen.get(von).getName() + ": " + kosten + " Route: " + route);

        }
    }
}
