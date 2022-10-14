package vza.ch.zhaw.doenmhac.uebung3;

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

		double neuerWert = 0;
		double []wasserImSee = new double [120];
		wasserImSee[0] = 50000;



		for (int i = 0; i < zufluss1.length; i++) {
		neuerWert = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;
		startWert = neuerWert;
		wasserImSee[i+1] = startWert;


		System.out.println("Neuer Wert "+ wasserImSee[i]);


		}

		double max = wasserImSee[0];

		for (int i=0; i< wasserImSee.length; i++)
		if (wasserImSee[i] > max) {
		max = wasserImSee[i];
		}

		System.out.println("Maximaler Füllstand: " + max + " m3");
		
		int überSchreitung = 0;

		for (int i= 0; i < wasserImSee.length ; i++) {
		if (wasserImSee[i] > schadensgrenze) {
		überSchreitung++;
		}

		}

		System.out.println("Zeit über Schadensgrenze: " + überSchreitung + " h");
		
		
		
		double [] wasserImSeeNeu = new double[wasserImSee.length];
		wasserImSeeNeu[0] = 50000.0;

		for (int count = 0; count < 119; count++) 
		if (wasserImSeeNeu[count] > 55000.0) { 
		wasserImSeeNeu[count+1] = wasserImSeeNeu[count] + (zufluss1[count] + zufluss2[count] - abfluss1[count] - 4.0)*60.0;
		} else {
		wasserImSeeNeu[count+1] = wasserImSeeNeu[count] + (zufluss1[count] + zufluss2[count] - abfluss1[count])*60.0;


		//System.out.println(wasserImSeeNeu[count]);
		}

		double maxNeu = wasserImSeeNeu[0];

		for (int count = 0; count < wasserImSeeNeu.length; count++) {
		if (wasserImSeeNeu[count]>maxNeu) {
		maxNeu = wasserImSeeNeu[count];
		}
		}

		int überSchreitung2 = 0;


		for (int s = 0; s < wasserImSeeNeu.length; s++) {
		if (wasserImSeeNeu[s] > schadensgrenze) {
		überSchreitung2++;
		}

		}
		System.out.println("Maximaler Füllstand mit Stollen: " + maxNeu + " m3");
		System.out.println("Zeit über Schadensgrenze: " + überSchreitung2 + " h");



	}
	}

		