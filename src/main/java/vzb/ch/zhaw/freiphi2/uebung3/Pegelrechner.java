package vzb.ch.zhaw.freiphi2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
// Daten Einlesen
		double startWert = 50000.00;
		double schadensgrenze = 61500.00;
		double Fuellstandmarke = 55000.00;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double wasserimSee[] = new double[119];
		double max = wasserimSee[0];
		int Summestunden1 = 0;
		int Summestunden2 = 0;

// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);
// TODO

		for (int i = 0; i < zufluss1.length; i++) {
			wasserimSee[i] = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			double temp = wasserimSee[i];
			startWert = temp;

		}
		System.out.println(java.util.Arrays.toString(wasserimSee));
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserimSee);

		for (int j = 1; j < zufluss1.length; j++) {
			if (wasserimSee[j] > max) {
				max = wasserimSee[j];
			}
		}
		System.out.println("Maximaler Füllstand: " + max + " m3");
		for (int k = 0; k < zufluss1.length; k++) {
			if (wasserimSee[k] > schadensgrenze) {
				Summestunden1 += 1;
			}
		}
		System.out.println("Zeit über Schadensgrenze " + Summestunden1 + " h");
		// Ich verstehe nicht, wie man die letzte Aufgabe löst...Es zeigt bei mir immer die falsche Anzahl Stunden an
		for (int l = 0; l < zufluss1.length; l++) {
			if (wasserimSee[l] > Fuellstandmarke) {
				wasserimSee[l] = startWert + (zufluss1[l] + zufluss2[l] - abfluss1[l]-4) * 60;
				double temp = wasserimSee[l];
				startWert = temp;
				Summestunden2 += 1;
				if (wasserimSee[l] < Fuellstandmarke) {
					wasserimSee[l] = startWert + (zufluss1[l] + zufluss2[l] - abfluss1[l]) * 60;
					temp = wasserimSee[l];
					startWert = temp;
					
				}
			}
		}
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserimSee);
		System.out.println("Zeit über Schadensgrenze " + Summestunden2 + " h");

	}
}