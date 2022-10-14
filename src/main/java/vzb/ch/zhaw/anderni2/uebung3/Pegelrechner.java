package vzb.ch.zhaw.anderni2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
    public static void main(String[] args) {
//Daten Einlesen
        double startWert = 50000;
        double schadensgrenze = 61500;
        double[] zufluss1 = ZhawCsvLib.readDoubleArray("src/main/zufluss1.csv");
        double[] zufluss2 = ZhawCsvLib.readDoubleArray("src/main/zufluss2.csv");
        double[] abfluss1 = ZhawCsvLib.readDoubleArray("src/main/abfluss1.csv");

//Länge der Datensätze ausgeben

        //  System.out.println("WerteZufluss1:" + zufluss1.length);
        //  System.out.println("WerteZufluss2:" + zufluss2.length);
        //  System.out.println("WerteAbfluss1:" + abfluss1.length);

//TODO
        double[] wasserImSee = new double[zufluss1.length + 1];
        wasserImSee[0] = startWert;
        double wasserImSeeMax = wasserImSee[0]; // Maximaler Füllstand bis Schadensgrenze erreicht ist
        int anzahlStunden = 0;

        for (int i = 0; i < zufluss1.length; i++) {
            wasserImSee[i + 1] = wasserImSee[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
            System.out.println("Wasserstand ohne Stollen zur Minute " + i + ": " + wasserImSee[i]); //Test
            if (wasserImSee[i] > wasserImSeeMax) {
                wasserImSeeMax = wasserImSee[i];
            }
            if (wasserImSee[i] >= schadensgrenze) {
                anzahlStunden += 1;
            }
        }


        //mit Wasser-Stollen
        double[] wasserImSeeStollen = new double[wasserImSee.length];
        wasserImSeeStollen[0] = startWert;
        double wasserImSeeStollenMax = wasserImSeeStollen[0]; // Maximaler Füllstand
        int anzahlStundenStollen = 0;

        for (int i = 0; i < zufluss1.length; i++) {
            if (wasserImSeeStollen[i] > 55000) {
                wasserImSeeStollen[i + 1] = wasserImSeeStollen[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i] - 4) * 60;
            } else wasserImSeeStollen[i + 1] = wasserImSeeStollen[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
            if (wasserImSeeStollen[i] > wasserImSeeStollenMax) {
                wasserImSeeStollenMax = wasserImSeeStollen[i];
            }
            if (wasserImSeeStollen[i] >= schadensgrenze) {
                anzahlStundenStollen += 1;
            }

        }

        // Daten in csv
        ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
        ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeStollen);

        //Resultat
        System.out.println("Maximaler Füllstand: " + wasserImSeeMax);
        System.out.println("Zeit über Schadensgrenze: " + anzahlStunden + "h");
        System.out.println("Maximaler Füllstand mit Stollen: " + wasserImSeeStollenMax);
        System.out.println("Zeit über Schadensgrenze mit Stollen: " + anzahlStundenStollen + "h");


    }
}