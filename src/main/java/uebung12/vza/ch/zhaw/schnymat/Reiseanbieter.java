package uebung12.vza.ch.zhaw.schnymat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class


Reiseanbieter {
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
                printVerbindungen(von, stops, 0.0, "");
            }
        }
        System.out.println("Applikation beendet");
        keyScan.close();
    }

    static void printStatistik() {
        // TODO
        int countVerbindungen = 0;
        for (Flughafen flughafen : flughaefen.values()
        ) {
            countVerbindungen += flughafen.getVerbindungen().size();
        }
        System.out.println("Anzahl Flughäfen: " + flughaefen.size());
        System.out.println("Anzahl Verbindungen: " + countVerbindungen);
    }

    static void printFluege(String von) {
        // TODO
        Flughafen wantedFlughafen = null;
        for (String flughafenKey : flughaefen.keySet()
        ) {
            if (flughafenKey.equals(von)) {
                wantedFlughafen = flughaefen.get(flughafenKey);
                break;
            }
        }

        if (wantedFlughafen != null) {
            System.out.println("Alle Flüge ab " + wantedFlughafen.getName() + " :");
            wantedFlughafen.getVerbindungen().forEach(fl -> System.out.println("-> " + fl.getZiel().getName() + ": " + fl.getPreis()));
        }

    }

    static void printDirektflug(String von, String nach) {
        // TODO
        Flughafen vonFlughafen = null;
        Flughafen nachFlughafen = null;

        for (String flughafenKey : flughaefen.keySet()
        ) {
            if (flughafenKey.equals(von)) {
                vonFlughafen = flughaefen.get(flughafenKey);
            }

            if (flughafenKey.equals(nach)) {
                nachFlughafen = flughaefen.get(flughafenKey);
            }
        }

        if (vonFlughafen != null && nachFlughafen != null) {
            double price = 0.0;
            for (Verbindung verbindung : vonFlughafen.getVerbindungen()) {
                if (verbindung.getZiel() == nachFlughafen) {
                    price = verbindung.getPreis();
                }
            }

            System.out.println("Direktflug von " + vonFlughafen.getName() + " nach " + nachFlughafen.getName() + ": " + ((price > 0.0) ? price : " "));


        }
    }

    // Schaue an wie du die Rekursion aufrufst
    static void printVerbindungen(String von, int stops, double price, String route) {
        // TODO
        for (String flughafenKey : flughaefen.keySet()
        ) {
            if (flughafenKey.equals(von)) {
                if (stops >= 0) {
                    flughaefen.get(flughafenKey).getVerbindungen().forEach(vr -> printVerbindungen(vr.getZiel().getKuerzel(), stops-1, price + vr.getPreis(), route + " " + flughaefen.get(flughafenKey).getName()));
                } else {
                    System.out.println(flughaefen.get(flughafenKey).getName() + ": " + price + " Route: " + route + " " + flughaefen.get(flughafenKey).getName());
                }
            }
        }
    }

}
