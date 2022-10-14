package vza.ch.zhaw.loretyan.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double[] ohneStollen = new double[120];
		double[] mitStollen = new double[120];

		double maxFuellstand = startWert;
		double maxFuellstandmitStollen = startWert;

		double tOhneStollenSchadensgrenze = 0;
		double tMitStollenSchadensgrenze = 0;
		
		double stollenOffen = 55000;
		double abfluss2 = 4;

		ohneStollen[0] = startWert;
		mitStollen[0] = startWert;

		// TODO
		for (int i = 1; i <= zufluss1.length; i++) {
			ohneStollen[i] = ohneStollen[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;

			if (ohneStollen[i] > maxFuellstand) {
				maxFuellstand = ohneStollen[i];
			}

			if (ohneStollen[i] > schadensgrenze) {
				tOhneStollenSchadensgrenze++;
			}
		}

		for (int i = 1; i <= zufluss2.length; i++) {
			if (mitStollen[i-1] > stollenOffen) {
				mitStollen[i] = mitStollen[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1] - abfluss2) * 60;
			} else {
				mitStollen[i] = mitStollen[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;

			}

			if (mitStollen[i] > maxFuellstandmitStollen) {
				maxFuellstandmitStollen = mitStollen[i];
			}

			if (mitStollen[i] > schadensgrenze) {
				tMitStollenSchadensgrenze++;
			}
		}

		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", ohneStollen);

		System.out.println("Maximaler Füllstand: " + maxFuellstand + " m3");
		System.out.println("Zeit über Schadensgrenze: " + tOhneStollenSchadensgrenze + " h");

		System.out.println("Maximaler Füllstand mit Stollen: " + maxFuellstandmitStollen + " m3");
		System.out.println("Zeit über Schadengrenze: " + tMitStollenSchadensgrenze + " h");

	}
}