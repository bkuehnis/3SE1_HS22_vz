package vza.ch.zhaw.vuchl001.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		// Lõnge der Datensõtze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);
		
		int i = 0;
		double [] pneu = new double [zufluss1.length];
		pneu[0]= startWert;
		System.out.println(pneu.length);
		
		for (i = 1;i < pneu.length;i++) {
			pneu[i] = pneu[i-1] + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;
			System.out.println(pneu[i]);
		}
		
		
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", pneu);
		
		
		double max = 0.0;
		for (int j = 0; j < pneu.length; j++) {
			if (pneu[j] > max) {
				max = pneu[j];
			}
		}
		
		System.out.println("Maximaler F³llstand: " + max + " m3");
		
		int ueberschritten = 0;
		for (int k = 0;k < pneu.length;k++) {
			if (pneu[k]>schadensgrenze) {
				ueberschritten += 1;
			}
		}
		
		System.out.println("Zeit ³ber Schadensgrenze: " + ueberschritten + " h");
		 
		System.out.println("Maximaler F³llstand mit Stollen: " + (max + 4*60) + " m3");
		int ueberschrittenNeu = 0;
		
		for (int h = 0;h < pneu.length;h++) {
			if (pneu[h] > schadensgrenze + 4 * 60) {
				pneu[h] += 4*60;
				if (pneu[h] > schadensgrenze) {
					ueberschrittenNeu += 1;
				}
			}
		}
		
		System.out.println("Zeit ³ber Schadensgrenze: " + ueberschrittenNeu + " h");
		
	}
	

}
