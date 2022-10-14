package vzb.ch.zhaw.delvelor.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {

		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		double[] WasserImSee = new double[120];

		double MaxFüllStand = WasserImSee[0];

		int ZeitÜberSchadensgrenze = 0;

		WasserImSee[0] = startWert;

		for (int i = 1; i < WasserImSee.length; i++) {

			WasserImSee[i] = WasserImSee[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;

			if (WasserImSee[i] > MaxFüllStand) {

				MaxFüllStand = WasserImSee[i];
			}
			if (WasserImSee[i] > schadensgrenze) {

				ZeitÜberSchadensgrenze++;
			}

		}
		/*
		 * Ich habe diese Aufgabe mit Hilfe eines Klassenkameraden erarbeitet. Ich
		 * konnte jedoch nicht die ganze Aufgabe lösen, da ich ab Punkt d) nicht mehr
		 * weiterkam.
		 */

		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", WasserImSee);

		System.out.println("Maximaler Füllstand: " + MaxFüllStand + " m3");

		System.out.println("Zeit über Schadensgrenze: " + ZeitÜberSchadensgrenze + " h");

	}
}