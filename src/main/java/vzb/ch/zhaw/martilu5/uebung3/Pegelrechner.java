package vzb.ch.zhaw.martilu5.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	 public static void main(String[] args) {
	 // Daten Einlesen
	 double startWert = 50000;
	 double schadensgrenze = 61500;
	 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
	 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
	 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
	 double [] wasserImSee = new double[zufluss1.length];
	 double [] wasserImSee2 = new double[zufluss1.length];
	 double max = wasserImSee [0];
	 double zeit = 0;
	 double stollenwert = 55000;
	 double abfluss2 = 4;
	 double max2 = wasserImSee2 [0];
	 double zeit2 = 0;
	 

	 // Länge der Datensätze ausgeben
	 System.out.println("Werte Zufluss 1: "+zufluss1.length);
	 System.out.println("Werte Zufluss 2: "+zufluss2.length);
	 System.out.println("Werte Abfluss 1: "+abfluss1.length);

	 wasserImSee [0] = startWert;
	 
	 //Pegelstand berechnen
	 for (int i = 1; i < zufluss1.length; i++ ) {
		 wasserImSee [i] = wasserImSee [i-1] + (zufluss1[i-1]+zufluss2[i-1]-abfluss1[i-1])*60;
		 ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
	 }
	 //Maximaler Wert berechnen
	 for (int i = 1; i < wasserImSee.length; i++) {
		 if (wasserImSee[i-1] > max) {
			 max = wasserImSee [i];
		 }
	 }
	 
	
	 //Dauer berechnen
	 for (int i = 1; i < wasserImSee.length; i++) {
		 if (wasserImSee[i-1]> schadensgrenze) {
			zeit++; 
		 }
	 }
	
	 
	 //Mit Stollen
	 wasserImSee2 [0]= startWert;
	 
	 for (int i = 1; i < zufluss1.length; i++) {
		 if (wasserImSee2[i-1] > stollenwert) {
			 wasserImSee2 [i] = wasserImSee2 [i-1] + (zufluss1[i-1]+zufluss2[i-1]-abfluss1[i-1]-abfluss2)*60;
		 }
		 else {
			 wasserImSee2 [i] = wasserImSee2 [i-1] + (zufluss1[i-1]+zufluss2[i-1]-abfluss1[i-1])*60;
		 }
	 }
	 
	 //Maximaler Wert berechnen
	 for (int i = 1; i < wasserImSee2.length; i++) {
		 if (wasserImSee2[i-1] > max2) {
			 max2 = wasserImSee2 [i];
		 }
	 }
	 
	//zeit berechnen
	 for (int i = 1; i < wasserImSee.length; i++) {
		 if (wasserImSee2[i-1]> schadensgrenze) {
			zeit2++; 
		 }
	 }
	 
	 //Ausgaben
	 System.out.println("Maximaler Füllstand "+max+" m^3");
	 System.out.println("Zeit über Schadensgrenze "+zeit+" h");
	 System.out.println("Maximaler Füllstand mit Stollen: "+max2+" m^3");
	 System.out.println("Zeit über Schadensgrenze: "+zeit2+" h");
	 }
	 
}
