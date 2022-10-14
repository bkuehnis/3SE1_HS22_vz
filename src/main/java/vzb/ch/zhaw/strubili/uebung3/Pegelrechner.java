package vzb.ch.zhaw.strubili.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {

    public static void main(String[] args) {
         // Daten Einlesen
         double startWert = 50000;
         double schadensgrenze = 61500;
         double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
         double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
         double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
         double [] WasserImSee = new double [zufluss1.length];
         double [] WasserImSeeMitStollen = new double [zufluss1.length];
         double WasserMitStollen = startWert;
         double Schadenszeit2 = 0;
         double max = WasserImSee [0];
         double Schadenszeit = 0;
         int count = 1;

         //Berrechnung


         for (int i = 0; i<zufluss1.length; i++) {

             if (i ==0) {
                 WasserImSee [i] = startWert + ((zufluss1[i]+zufluss2[i]-abfluss1[i]) *60); 
             }
             else {

            WasserImSee [i] = WasserImSee [i-1] + ((zufluss1[i]+zufluss2[i]-abfluss1[i])*60);

             }
         }
             for (int f = 0; f<zufluss1.length; f++) {

             if (WasserImSee [f]> max) {
                 max = WasserImSee [f];
             } 
             if (WasserImSee [f]>61500) {
                 Schadenszeit++;
             }

         }

             WasserImSeeMitStollen = WasserImSee;

             for (int g = 0; WasserImSee.length>g; g++) {
                 if (WasserImSeeMitStollen[g]>55000) {

                    if (WasserImSeeMitStollen.length>g+1) {

                         WasserImSeeMitStollen [g] = WasserImSeeMitStollen[g+1] - 240 * count;
                         count++;
                    }

                 }
                 if (WasserImSeeMitStollen [g]>WasserMitStollen) {

                     WasserMitStollen = WasserImSeeMitStollen [g];
                 }
                 if (WasserImSeeMitStollen [g]>61500) {
                     Schadenszeit2++;
                 }

         }

         ZhawCsvLib.writeDoubleArray("MitStollen.csv", WasserImSee);
         System.out.println("Maximaler Füllstand: "+max+ " m3"); 
         System.out.println("Zeit über Schadensgrenze: "+Schadenszeit+" h");
         System.out.println("");
         System.out.println("Maximaler Füllstand mit Stollen: "+WasserMitStollen+" m3");
         System.out.println("Zeit über Schadensgrenze "+Schadenszeit2+" h");

    }

}