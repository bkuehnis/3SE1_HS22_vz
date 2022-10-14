package vzb.ch.zhaw.reiflja1.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double fuellstandAnfang = 50000;
		double[] wasserImSee = new double[abfluss1.length];
		double maxWasserImSee = 0;
		int zeitUeberSchadensgrenze = 0;
		double[] wasserImSeeMitStollen = new double[abfluss1.length];
		double maxWasserImSeeMitStollen = 0;
		int zeitUeberSchadensgrenzeMitStollen = 0;

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		// ohne Stollen
		wasserImSee[0] = fuellstandAnfang + (zufluss1[0] + zufluss2[0] - abfluss1[0]) * 60;
		for (int i = 1; i < abfluss1.length; i++) {
			wasserImSee[i] = wasserImSee[i - 1] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			if (wasserImSee[i] > maxWasserImSee) {
				maxWasserImSee = wasserImSee[i];
			}
			if (wasserImSee[i] > schadensgrenze) {
				zeitUeberSchadensgrenze++;
			}

		}
		System.out.println("Maximaler Füllstand: " + maxWasserImSee + " m3");
		System.out.println("Zeit über Schadensgrenze: " + zeitUeberSchadensgrenze + " h");
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		System.out.println();

		// mit Stollen
		wasserImSeeMitStollen[0] = fuellstandAnfang + (zufluss1[0] + zufluss2[0] - abfluss1[0]) * 60;
		for (int i = 1; i < abfluss1.length; i++) {
			wasserImSeeMitStollen[i] = wasserImSeeMitStollen[i - 1] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			if (wasserImSeeMitStollen[i-1] > 55000) {
				wasserImSeeMitStollen[i] -= 4 * 60;
			}
			if (wasserImSeeMitStollen[i] > maxWasserImSeeMitStollen) {
				maxWasserImSeeMitStollen = wasserImSeeMitStollen[i];
			}
			if (wasserImSeeMitStollen[i] > schadensgrenze) {
				zeitUeberSchadensgrenzeMitStollen++;
			}
System.out.println(wasserImSeeMitStollen[i]);
		}
		System.out.println("Maximaler Füllstand mit Stollen: " + maxWasserImSeeMitStollen + " m3");
		System.out.println("Zeit über Schadensgrenze mit Stollen: " + zeitUeberSchadensgrenzeMitStollen + " h");
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeMitStollen);

	}
}