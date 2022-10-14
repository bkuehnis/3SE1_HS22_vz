package vza.ch.zhaw.gavindom.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
 public static void main(String[] args) {
 // Daten Einlesen
 double startWert = 50000;
 double schadensgrenze = 61500;
 
 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
 
//double pegelstand = startWert + (zufluss1[0] + zufluss2[0] - abfluss1[0]) * 60;
//double pegelstand2 = pegelstand + (zufluss1[1] + zufluss2[1] - abfluss1[1]) * 60;
 
 double [] wasserImSee = new double [120];
 double pegelstand = startWert;
 
 wasserImSee[0] = 50000;

 for (int count = 1; count < 120; count++) {
	 wasserImSee[count]= pegelstand + (zufluss1[count-1] + zufluss2[count-1] - abfluss1[count-1]) * 60;
	 pegelstand = wasserImSee[count];
	 }

 ZhawCsvLib.writeDoubleArray("ohneStollen3.csv", wasserImSee);
 
 // Länge der Datensätze ausgeben
 System.out.println("Werte Zufluss 1: "+zufluss1.length);
 System.out.println("Werte Zufluss 2: "+zufluss2.length);
 System.out.println("Werte Abfluss 1: "+abfluss1.length);
 
 //Aufgabe e
 
 double max = wasserImSee [0];
 for (int i=1; i<wasserImSee.length; i++) {
	 if (wasserImSee[i] > max) {
	 max = wasserImSee[i];
	 }
 	 } System.out.println("Maximaler Füllstand: " + max);
 	 
// Aufgabe f
 	int Stunde = 0;
 	for (int i=1; i<wasserImSee.length; i++) {
 		 if (wasserImSee[i] > 61500) {
 		 Stunde++;
 		 }
 	 	 } System.out.println("Zeit über Schadensgrenze " + Stunde);

// Aufgabe g
	double[] wasserImSeeStollen = new double[120];
	double pegelstandStollen = startWert;

	wasserImSeeStollen[0] = 50000;
	double Schleuse = 240; // Wasserabfluss pro Stunde

	for (int count = 1; count < 120; count++) {
		wasserImSeeStollen[count] = pegelstandStollen + (zufluss1[count - 1] + zufluss2[count - 1] - abfluss1[count - 1]) * 60;
		
		if (wasserImSeeStollen[count]> 55000) {
			pegelstandStollen = wasserImSeeStollen[count] - Schleuse;
		} else {
			pegelstandStollen = wasserImSeeStollen[count];
		}
		}
	
	//Berechnung des Max's
	 max = wasserImSeeStollen [0];
	 for (int i=1; i<wasserImSeeStollen.length; i++) {
		 if (wasserImSeeStollen[i] > max) {
		 max = wasserImSeeStollen[i];
		 }
	 	 } System.out.println("Maximaler Füllstand mit Stollen: " + max);
	 	 
	 //Berechnung Schadensgrenze
	  	Stunde = 0;
	 	for (int i=1; i<wasserImSeeStollen.length; i++) {
	 		 if (wasserImSeeStollen[i] > 61500) {
	 		 Stunde++;
	 		 }
	 	 	 } System.out.println("Zeit über Schadensgrenze " + Stunde);
	 	 	 
	 	 	ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeStollen);
 
 
 //TODO
}
}
 
 
 

