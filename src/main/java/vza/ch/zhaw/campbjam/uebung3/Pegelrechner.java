package vza.ch.zhaw.campbjam.uebung3;

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

		// TODO

		double neuerWert = 0;
		double[] wasserImSee = new double[120];
		wasserImSee[0] = 50000;

		double maxWater = 0;

		for (int i = 0; i < zufluss1.length; i++) {
			neuerWert = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			startWert = neuerWert;
			wasserImSee[i + 1] = startWert;

			if (wasserImSee[i] > maxWater) {
				maxWater = wasserImSee[i];
			}
		}

		int excess = 0;
		for (int i = 0; i < zufluss1.length; i++) {
			if (wasserImSee[i] > schadensgrenze) {
				excess += 1;
			}
		}

//		mit Stollen

		double[] newWasserImSee = new double[wasserImSee.length];
		newWasserImSee[0] = 50000;

		for (int i = 0; i < zufluss1.length; i++) {
			if (wasserImSee[i] > 55000) {
				newWasserImSee[i + 1] = newWasserImSee[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i] - 4) * 60;
			} else {
				newWasserImSee[i + 1] = newWasserImSee[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			}

		}

		double newMaxWater = newWasserImSee[0];

		for (int i = 0; i < newWasserImSee.length; i++) {
			if (newMaxWater < newWasserImSee[i]) {
				newMaxWater = newWasserImSee[i];
			}
		}

		int excess2 = 0;

		for (int i = 0; i < newWasserImSee.length; i++) {
			if (newWasserImSee[i] > schadensgrenze) {
				excess2++;
			}

		}

		System.out.println("\nMaximaler Füllstand: " + maxWater + " m3");
		System.out.println("Zeit über Schadensgrenze: " + excess + " h");

		System.out.println("\nMaximaler Füllstand mit Stollen: " + newMaxWater + " m3");
		System.out.println("Zeit über Schadensgrenze 2: " + excess2 + " h");

		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSee);
	}
}