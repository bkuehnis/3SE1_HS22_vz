package vza.ch.zhaw.schnymat.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);
		
		double [] pNeu = new double[120];
		pNeu[0] = startWert;
		boolean stollenAuf = false;
		int grenzWert = 55000;
		double abflussStollen = 4.0;

		double [] pNeuMitStollen = pNeuRechner(zufluss1, zufluss2, abfluss1, pNeu, stollenAuf, grenzWert, abflussStollen, true);
		double [] pNeuOhneStollen = pNeuRechner(zufluss1, zufluss2, abfluss1, pNeu, stollenAuf, grenzWert, abflussStollen, false);

		ZhawCsvLib.writeDoubleArray("mitStollen.csv", pNeuMitStollen);
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", pNeuOhneStollen);

		// Max Height berechnen
		double maxHeight = 0.0;
		int zeitUeberSchadensgrenze = 0;
		for(int i = 0; i < pNeuMitStollen.length; i++) {
			if(maxHeight < pNeuMitStollen[i]) {
				maxHeight = pNeuMitStollen[i];
			}
			if (pNeu[i] > schadensgrenze) {
				zeitUeberSchadensgrenze++;
			}
		}
		
		System.out.println("Maximaler Füllstand: " + maxHeight + " m3");
		System.out.println("Zeit über Schadensgrenze: " + zeitUeberSchadensgrenze + " h");
		
	}

	private static double[] pNeuRechner(double[] zufluss1, double[] zufluss2, double[] abfluss1, double[] pNeu, boolean stollenAuf, int grenzWert, double abflussStollen, boolean mitStollen) {
		for(int i = 1; i < zufluss1.length; i++) {

			if (mitStollen){
				pNeu[i] = pNeu[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1])*60;
			} else {
				if (stollenAuf) {
					pNeu[i] = pNeu[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1] - abflussStollen)*60;
				} else {
					pNeu[i] = pNeu[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1])*60;
				}

				if (pNeu[i] > grenzWert) {
					stollenAuf = true;
				} else {
					stollenAuf = false;
				}
			}

		}

		return pNeu;
	}
}
