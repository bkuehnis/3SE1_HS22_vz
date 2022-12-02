package uebung10.vzb.ch.zhaw.anderni2;

import java.util.ArrayList;

public class Liefertour {
    private final ArrayList<Lieferung> lieferungen = new ArrayList<Lieferung>();

    public void addBrief(int plz, String empfaenger, boolean mitUnterschrift) {
        lieferungen.add(new Brief(plz, empfaenger, mitUnterschrift));
    }

    public void addPaket(int plz, String empfaenger, double gewicht) {
        lieferungen.add(new Paket(plz, empfaenger, gewicht));

    }

    public void print(int plz) {
        for (Lieferung l : lieferungen) {
            if (l.getPlz() == plz) {
                if (l instanceof Brief) {
                    //if (super.isMitUnterschrift()) {

                    System.out.println("Brief");
                    System.out.println("- PLZ: " + plz);
                    System.out.println("- Empfänger: " + l.getEmpfaenger());
                    if (((Brief) l).isMitUnterschrift()) {
                        System.out.println("Unterschrift: ja  \n");
                        //    System.out.println("- Gewicht: " + ;
                    } else {
                        System.out.println("Unterschrift: nein  \n");
                    }
                } else if (l instanceof Paket) {

                    //if (super.isMitUnterschrift()) {
                    System.out.println("Paket");
                    System.out.println("- PLZ: " + plz);
                    System.out.println("- Empfänger: " + l.getEmpfaenger());
                    System.out.println(((Paket) l).getGewicht() + " \n");
                    //    System.out.println("- Gewicht: " + ;


                }
            }
        }

    }

    public void printAll() {
        for (Lieferung l : lieferungen) {
            if (l instanceof Brief) {
                //if (super.isMitUnterschrift()) {
                System.out.println("Brief");
                System.out.println("- PLZ: " + l.getPlz());
                System.out.println("- Empfänger: " + l.getEmpfaenger());
                if (((Brief) l).isMitUnterschrift()) {
                    System.out.println("- Unterschrift: ja  \n");
                    //    System.out.println("- Gewicht: " + ;
                } else {
                    System.out.println("- Unterschrift: nein  \n");
                }
            } else if (l instanceof Paket) {

                //if (super.isMitUnterschrift()) {
                System.out.println("Paket");
                System.out.println("- PLZ: " + l.getPlz());
                System.out.println("- Empfänger: " + l.getEmpfaenger());
                System.out.println(((Paket) l).getGewicht() + " \n");
                //    System.out.println("- Gewicht: " + ;


            }
        }
    }


}

