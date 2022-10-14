package vzb.ch.zhaw.sprinala.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {

    public static void main(String[] args) {
        // Daten Einlesen
        double startWert = 50000;
        double schadensgrenze = 61500;
        double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
        double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
        double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

        // Länge der Datensätze ausgeben
        System.out.println("Werte Zufluss 1: "+zufluss1.length);
        System.out.println("Werte Zufluss 2: "+zufluss2.length);
        System.out.println("Werte Abfluss 1: "+abfluss1.length);

        double [] wasserImSee = new double[zufluss1.length+1];
        wasserImSee[0] = startWert;
        double wasserImSeeMax = wasserImSee[0]; // Maximaler Füllstand

        //Anz. Stunden über Schadensgrenze
        int anzStunden = 0;

        for (int i=0; i<zufluss1.length; i++){
            wasserImSee[i+1]= wasserImSee[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;

            if (wasserImSee[i] > wasserImSeeMax){
                wasserImSeeMax=wasserImSee[i];
            }

            if (wasserImSee[i] >= schadensgrenze){
                anzStunden += 1;
            }
        }
        //mit Stollen
        double [] wasserImSeeStollen = new double[wasserImSee.length];
        wasserImSeeStollen[0] = startWert;
        double wasserImSeeStollenMax = wasserImSeeStollen[0]; // Maximaler Füllstand
        int anzStundenStollen = 0;

        for (int i=0; i<zufluss1.length; i++){


            if (wasserImSeeStollen[i] > 55000){
                wasserImSeeStollen[i+1] = wasserImSeeStollen[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]-4)*60;
            } else
                wasserImSeeStollen[i+1]= wasserImSeeStollen[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;

            if (wasserImSeeStollen[i] > wasserImSeeStollenMax){
                wasserImSeeStollenMax=wasserImSeeStollen[i];
            }

            if (wasserImSeeStollen[i] >= schadensgrenze){
                anzStundenStollen += 1;
            }

        }


        ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
        ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeStollen);

        System.out.println("Maximaler Füllstand: "+wasserImSeeMax);
        System.out.println("Zeit über Schadensgrenze: "+anzStunden+"h");

        System.out.println("Maximaler Füllstand mit Stollen: "+wasserImSeeStollenMax);
        System.out.println("Zeit über Schadensgrenze mit Stollen: "+anzStundenStollen+"h");
// TODO
    }
}