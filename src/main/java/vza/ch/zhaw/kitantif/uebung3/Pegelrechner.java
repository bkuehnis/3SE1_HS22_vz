package vza.ch.zhaw.kitantif.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startWert = 50000;
		 double schadensgrenze = 61500;
		 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		 
		 // Länge der Datensätze ausgeben
		 System.out.println("Werte Zufluss 1: "+zufluss1.length);
		 System.out.println("Werte Zufluss 2: "+zufluss2.length);
		 System.out.println("Werte Abfluss 1: "+abfluss1.length);
		 
		 //Aufgabe c
		 double neuerWert = 0;
		 double [] wasserImSee = new double [120];
		 wasserImSee [0] = 50000;
		 
		 for (int i = 0; i < zufluss1.length; i++) {
			 neuerWert = startWert + (zufluss1 [i] + zufluss2 [i] - abfluss1 [i]) * 60;
			 startWert = neuerWert;
			 wasserImSee [i+1] = startWert;
		 } System.out.println("Wasser Im See: "+ neuerWert);
		 
		 //Aufgabe e
		 double max = wasserImSee [0];
		 for (int i=0; i<wasserImSee.length; i++)
			 if (wasserImSee [i] > max) {
				 max = wasserImSee [i];
			 }
		 System.out.println("Maximaler Füllstand: "+ max + "m3");
		 
		 //Aufgabe f
		 int überSchreitung = 0;
		 for (int i = 0; i < wasserImSee.length; i++) {
			 if (wasserImSee [i] > schadensgrenze) {
				 überSchreitung++;
			 }
		 }
		 
		 System.out.println("Zeit über Schadensgrenze: " + überSchreitung + "h");
			
			
		

		 
		 
		 
		 
	}

  }
