package vzb.ch.zhaw.jermaloi.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Pegelrechner {

    public static void main(String[] args) {

        // Daten Einlesen
        double startWert = 50000;
        double schadensgrenze = 61500;
        double stollenOeffnungsWert = 55000;
        double stollenAbfluss = 4.0;

        double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
        double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
        double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

        double[] ohneStollen = new double[zufluss1.length];
        double[] mitStollen = new double[zufluss1.length];

        for (int i = 0; i < zufluss1.length; i++) {
            if (i == 0){
                ohneStollen[i] = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
            } else {
                int indexMinusEins = i - 1;
                ohneStollen[i] = ohneStollen[indexMinusEins] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
            }
        }

        for(int i = 0; i < zufluss1.length; i++) {
            if (i == 0){
                mitStollen[i] = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
            } else {
                int indexMinusEins = i - 1;
                if (mitStollen[indexMinusEins] > stollenOeffnungsWert) {
                    mitStollen[i] = mitStollen[indexMinusEins] + (zufluss1[i] + zufluss2[i] - abfluss1[i] - stollenAbfluss) * 60;
                } else {
                    mitStollen[i] = mitStollen[indexMinusEins] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
                }

            }
        }

        ZhawCsvLib.writeDoubleArray("ohneStollen.csv", ohneStollen);
        ZhawCsvLib.writeDoubleArray("mitStollen.csv", mitStollen);

        System.out.println("Maximaler Füllstand ohne Stollen: " + getMaxFuellstand(ohneStollen));
        System.out.println("Zeit über Schadensgrenze ohne Stollen: " + getStundenUeberSchadensgrenze(ohneStollen, schadensgrenze) + " h");
        System.out.println("");
        System.out.println("Maximaler Füllstand mit Stollen: " + getMaxFuellstand(mitStollen));
        System.out.println("Zeit über Schadensgrenze mit Stollen: " + getStundenUeberSchadensgrenze(mitStollen, schadensgrenze) + " h");

    }

    public static double getMaxFuellstand(double[] fuellstaende) {
        OptionalDouble max = Arrays.stream(fuellstaende).max();
        return max.isPresent() ? max.getAsDouble() : 0.0;
    }

    public static int getStundenUeberSchadensgrenze(double[] fuellstande, double schadensgrenze){
        return (int) Arrays.stream(fuellstande).filter((fuellstand) -> !(fuellstand < schadensgrenze)).count();
    }

}
