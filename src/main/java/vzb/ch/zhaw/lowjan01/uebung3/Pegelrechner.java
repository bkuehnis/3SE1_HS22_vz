package vzb.ch.zhaw.lowjan01.uebung3;

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

		// Aufgabe c - Datensatz aufbereiten + Excelsheet erstellen
		double[] wasserImSee = new double[119];

		int i = 0;
		double w2 = 0;

		while (i < 119) {
			if (w2 == 0) {
				double wert1 = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
				w2 = wert1;
				i++;
			}
			if (w2 != 0) {
				double wert1 = w2 + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
				w2 = wert1;
				wasserImSee[i] = wert1;
				i++;
			}

		}

		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);

		// Aufgabe e) Max. Prüfstand überprüfen
		double max = wasserImSee[0];

		for (int s = 1; s < wasserImSee.length; s++) {
			if (wasserImSee[s] > max) {
				max = wasserImSee[s];

			}
		}

		System.out.println("Maximaler Füllstand: " + max + " m3");

		// Aufgabe f) Dauer der Schadensgrenze

		int count = 0;

		for (int e = 1; e < wasserImSee.length; e++) {
			if (wasserImSee[e] > schadensgrenze) {
				count++;

			}
		}

		System.out.println("Zeiüber Schadengrenze: " + count + " h");

// Aufgabe g) Entlastungsstollen berechnen

		/// Nicht ganz klar wie vorgehen ///

		double ueberschreitung = 55000;

		for (int t = 1; t < wasserImSee.length; t++) {
			if (wasserImSee[t] > ueberschreitung) {
				double wert2 = wasserImSee[t] - 4 * 60 * 2;
				wasserImSee[t] = wert2;

			}
		}

		//// Wieso Index 119 out of bounds for length 119 ////

		double max2 = wasserImSee[0];

		for (int b = 1; b < wasserImSee.length; b++) {
			if (wasserImSee[b] > max2) {
				max2 = wasserImSee[b] - 240;

			}
		}

		System.out.println("Maximaler Füllstand mit Stollen: " + max2 + " m3");

		System.out.println(wasserImSee[60] - 240);
		System.out.println(wasserImSee[61]);

	}
}