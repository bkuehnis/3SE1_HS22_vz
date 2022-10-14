package vza.ch.zhaw.stettjoe.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {
		// Daten Einlesen
		 double startWert = 50000;
		 double schadensgrenze = 61500;
		 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		 double [] wasserImSee = new double[120];
		 double [] wasserImSee2 = new double[120];
		 wasserImSee[0] = startWert;
		 wasserImSee2[0] = startWert;
		 double maxFuellStand = startWert;
		 double maxFuellStand2 = startWert;
		 int zeitUeberSchadensgrenze = 0;
		 int zeitUeberSchadensgrenze2 = 0;
		 
		 for (int i = 0; i < zufluss1.length; i++) {
			 
			 wasserImSee[i+1] = wasserImSee[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			 wasserImSee2[i+1] = wasserImSee2[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			 if (maxFuellStand < wasserImSee[i + 1]) {
				 maxFuellStand = wasserImSee[i + 1];
			 }
			 if (wasserImSee[i + 1] > schadensgrenze) {
				 zeitUeberSchadensgrenze ++;
			 }
			 if (wasserImSee2[i] > 55000) {
				 wasserImSee2[i + 1] = wasserImSee2[i +1] - 4 * 60;
			 }
			 if (maxFuellStand2 < wasserImSee2[i + 1]) {
				 maxFuellStand2 = wasserImSee2[i + 1];
			 }
			 if (wasserImSee2[i + 1] > schadensgrenze) {
				 zeitUeberSchadensgrenze2 ++;
			 }
		 }
		 
		 ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		 ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSee2);
		 
		 System.out.println("Maximaler Fuellstand ohne Stollen: " + maxFuellStand);
		 System.out.println("Zeit Ueber Schadensgrenze ohne Stollen: " + zeitUeberSchadensgrenze + "h");
		 System.out.println("Maximaler Fuellstand mit Stollen: " + maxFuellStand2);
		 System.out.println("Zeit Ueber Schadensgrenze ohne Stollen: " + zeitUeberSchadensgrenze2 + "h");
		 
		 // Länge der Datensätze ausgeben
		 System.out.println("Werte Zufluss 1: "+zufluss1.length);
		 System.out.println("Werte Zufluss 2: "+zufluss2.length);
		 System.out.println("Werte Abfluss 1: "+abfluss1.length);

		 // TODO

	}

}
