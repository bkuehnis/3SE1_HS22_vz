package vza.ch.zhaw.murbalio.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {
		 // Daten Einlesen
		 double startWert = 50000;
		 double schadensgrenze = 61500;
		 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		 // Länge der Datensätze ausgeben
		 System.out.println("Werte Zufluss 1: "+zufluss1.length);
		 System.out.println("Werte Zufluss 2: "+zufluss2.length);
		 System.out.println("Werte Abfluss 1: "+abfluss1.length);
		 
		 double [] wasserImSee = new double[119];
		 double [] wasserImSeeStollen = new double[119];
		 double zuflussalt = 0;
		 double abflussStollen = 240;
		 double max = wasserImSee[0];
		 double zeitSchadensgrenze = 0;
		 double zeitSchadensgrenzeStollen = 0;
		 double maxStollen =wasserImSee[0];
		 
		 
		 for (int i = 0; i < zufluss1.length; i++) {
			 wasserImSee[i] = startWert+(zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
			 zuflussalt = (zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
			 startWert += zuflussalt;
			 
			 if(wasserImSee[i]>max ) {
				 max = wasserImSee[i];
			 }
			 if(wasserImSee[i]>=schadensgrenze) {
				 zeitSchadensgrenze++;
			 }
			 if(wasserImSee[i]<=55000) {
			 }
			 }
		 
		 ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		 
		 System.out.println("Maximaler Füllstand: "+max+" m3");
		 
		 System.out.println("Zeit über Schadensgrenze: "+zeitSchadensgrenze+" h");
		 
		 System.out.println("Maximaler Füllstand mit Stollen: "+maxStollen+" m3");
		 System.out.println("Zeit über Schadensgrenze mit Stollen: "+zeitSchadensgrenzeStollen+" h");
		
		 }
}

