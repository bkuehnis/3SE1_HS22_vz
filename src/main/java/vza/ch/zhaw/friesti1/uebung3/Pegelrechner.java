package vza.ch.zhaw.friesti1.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double stollenLimit = 55000;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		double[] wasserImSee = new double[zufluss1.length];
		double highestValue = 0;
		int time = 0;
		boolean isStollenActive = false;

		for (int i = 0; i < wasserImSee.length; i++) {

			wasserImSee[i] = (i == 0 ? startWert : wasserImSee[i - 1])
					+ (zufluss1[i] + zufluss2[i] - abfluss1[i] - (isStollenActive ? 4 : 0)) * 60;

			isStollenActive = wasserImSee[i] > stollenLimit ? true : false;

			if (wasserImSee[i] > highestValue) {
				highestValue = wasserImSee[i];
			}

			if (schadensgrenze < wasserImSee[i]) {
				time++;
			}
		}

		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		System.out.println("Maximaler Füllstand mit Stollen: " + highestValue + " m3");
		System.out.println("Zeit über Schadensgrenze: " + time + " h");
	}
}