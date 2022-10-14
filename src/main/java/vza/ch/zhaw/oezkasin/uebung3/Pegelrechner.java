package vza.ch.zhaw.oezkasin.uebung3;

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
		 
		 double neuWert = 0;
		 double [] fuellstaende = new double[120];
		 fuellstaende[0] = 50000.0;
		 
		 for (int i = 0; i < zufluss1.length; i++) {
			 neuWert = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			 startWert = neuWert;
			 fuellstaende[i+1] = startWert;
			 
			 System.out.println(neuWert + fuellstaende[i]);
		 }
		 
		 double max = fuellstaende[0];
		 
		 for (int i = 0; i < fuellstaende.length; i++) {
			 if (fuellstaende[i] > max) {
				 max = fuellstaende[i];
				 
				 System.out.println("Maximaler Füllstand: "+max+ " m3");
			 }
		 }
		 
		 double ueberschreitung = 0;
		 
		 for (int i = 0; i < fuellstaende.length; i++) {
			 if (fuellstaende[i] > schadensgrenze) {
				 ueberschreitung++;
			 }
		 }
		 
		 	System.out.println("Zeit über Schadensgrenze: "+ueberschreitung+" h");
		 	
		 	double [] fuellstaendeNeu = new double[fuellstaende.length];
		 	fuellstaendeNeu[0] = 50000.0;
		 	
		 	for (int count = 0; count < 119; count++) {
		 		// count < 119, 119 weil insgesamt 120 Messwerte
		 		if (fuellstaendeNeu[count] > 55000.0) {
		 			fuellstaendeNeu[count+1] = fuellstaendeNeu[count] + (zufluss1[count] + zufluss2[count] - abfluss1[count] - 4.00) *60.0;
		 		} else {
		 			fuellstaendeNeu[count+1] = fuellstaendeNeu[count] + (zufluss1[count] + zufluss2[count] - abfluss1[count]) *60.0;
		 		}
		 		System.out.println(fuellstaendeNeu[count]);
		 	}
		 		
		 		double maxNeu = fuellstaendeNeu[0];
		 		
		 		for (int count = 0; count < fuellstaendeNeu.length; count++) {
		 			if (fuellstaendeNeu[count] > maxNeu) {
		 				maxNeu = fuellstaendeNeu[count];
		 				
		 				System.out.println("Maximaler Füllstand mit Stollen: "+fuellstaendeNeu+" m3");
		 			}
		 		}
		 		
		 		double ueberschreitungNeu = 0;
		 		
		 		for (int sch = 0; sch < fuellstaendeNeu.length; sch++) {
		 			if (fuellstaendeNeu[sch] > schadensgrenze) {
		 				ueberschreitungNeu++;
		 			}
		 		}
		 		
		 		System.out.println("Zeit über Schadensgrenze: "+ueberschreitungNeu+" h");
		 		
		 		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", fuellstaendeNeu);
		 	}
		 }
