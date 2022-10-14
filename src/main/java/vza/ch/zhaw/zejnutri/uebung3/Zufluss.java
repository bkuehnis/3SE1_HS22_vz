package vza.ch.zhaw.zejnutri.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Zufluss {

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

		double pAnfang = 50000; // Startwert definiert

		double [] wasserImSee = new double [120]; // Array von 120 Länge definiert]

		wasserImSee [0] = 50000; //startwert als ersten wert in array gespeichert

		for (int i= 0; i<zufluss1.length; i++) {
			double pNeu = pAnfang + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;
			pAnfang = pNeu;
			wasserImSee[i+1] = pAnfang;
			System.out.println(wasserImSee[i]);
		} 
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);

		double max = wasserImSee[0];

		for (int i=1; i < wasserImSee.length; i++) {
			if (wasserImSee[i] > max) {
				max = wasserImSee[i];
			}
		}	System.out.println("Maximaler Füllstand: "+max);

		int count = 0;

		for (int i = 0; i < wasserImSee.length; i++) {
			if (wasserImSee[i] >= schadensgrenze) {
				count++;
			}
		} System.out.println(count+" h");

		double [] wasserImSeeNeu = new double[wasserImSee.length];
		wasserImSeeNeu[0] = 50000.0;
		

		for (int i = 0; i < 119; i++) {
			if (wasserImSeeNeu[i] > 55000.0) {
				wasserImSeeNeu[i+1] = wasserImSeeNeu[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i] - 4.0)*60;
			}	else {
				wasserImSeeNeu[i+1] = wasserImSeeNeu[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;

			}
			System.out.println(wasserImSee[i]);
		}

		double maxNeu = wasserImSeeNeu[0];

		for (int i = 0; i < wasserImSeeNeu.length; i++) {
			if (wasserImSeeNeu[i] > maxNeu) {
				maxNeu = wasserImSeeNeu[i];
			}
		}
		System.out.println("Maximaler Füllstand mit Stollen: "+maxNeu+" m3");

		int zeitüberschreitung = 0;

		for (int t = 0; t < wasserImSeeNeu.length; t++) {
			if (wasserImSeeNeu[t] > schadensgrenze) {
				zeitüberschreitung++;
			}
		}
		System.out.println("Zeit über Schadensgrenze: "+zeitüberschreitung+" h");


	}



}

