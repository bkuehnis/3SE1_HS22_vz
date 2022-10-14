package vzb.ch.zhaw.wueesnin.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
import java.lang.reflect.Array;

public class Pegelrechner {

	public static void main(String[] args) {
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double[] wasserImSee = new double[zufluss1.length];
		double max = wasserImSee[0];
		int ueberschritteneStunden = 0;

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		// Array mit Wasserstand im See befüllen
		for (int i = 0; i < wasserImSee.length; i++) {
			// Prüfung ob Werte in den jeweiligen Arrays mit Index i vorhanden sind, um
			// einen Error zu vermeiden
			try {
				Array.get(zufluss1, i);
				Array.get(zufluss2, i);
				Array.get(abfluss1, i);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index '" + i + "' ist in einer der csv-Dateien nicht enthalten.");
				System.out.println("Siehe Fehlermeldung: " + e.getMessage());
			}

			if (i == 0) {
				wasserImSee[i] = startWert;
			} else {
				if (wasserImSee[i - 1] > 55000)
					wasserImSee[i - 1] += -4 * 60;
				wasserImSee[i] = wasserImSee[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;
			}

			// Höchstwert des Arrays (maximaler Füllstand) prüfen und in Variable max
			// schreiben
			if (max < wasserImSee[i])
				max = wasserImSee[i];

			// Aufg f - Anzahl überschrittene Stunden über Schadensgrenze berechnen
			if (wasserImSee[i] > schadensgrenze) {
				// Anz Stunden berechnen, während die Schadensgrenze überschritten wurde
				ueberschritteneStunden++;
			}
		}

		// Aufg e - Mit Variable max den maximalen Füllstand
		System.out.println("Maximaler Füllstand: " + max + " m3");

		if (max > schadensgrenze)
			System.out.println("Zeit über Schadensgrenze: " + ueberschritteneStunden + " h");

		// Werte des Arrays in csv Datei schreiben
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
	}
}
