package vzb.ch.zhaw.schulfa2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {

	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		// L√§nge der Datens√§tze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		double[] wasserImSeeOhneStollen = new double[120];
		wasserImSeeOhneStollen[0] = startWert;

		double[] wasserImSeeMitStollen = new double[120];
		wasserImSeeMitStollen[0] = startWert;

		double maxFuelstandOhneStollen = 0;
		double maxFuelstandMitStollen = 0;

		int maxStandOhneStollen = 0;
		int maxStandMitStollen = 0;

		for (int i = 1; i < 120; i++) {

			double zuflussTot = (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;

			wasserImSeeOhneStollen[i] = wasserImSeeOhneStollen[i - 1] + zuflussTot;

			wasserImSeeMitStollen[i] = wasserImSeeMitStollen[i - 1] < 55000 ? wasserImSeeMitStollen[i - 1] + zuflussTot
					: wasserImSeeMitStollen[i - 1] + zuflussTot - 240;

			if (wasserImSeeOhneStollen[i] > maxFuelstandOhneStollen) {
				maxFuelstandOhneStollen = wasserImSeeOhneStollen[i];
			} 
			
			if (wasserImSeeMitStollen[i] > maxFuelstandMitStollen) {
				maxFuelstandMitStollen = wasserImSeeMitStollen[i];
			}

			if (wasserImSeeOhneStollen[i] >= schadensgrenze) {
				maxStandOhneStollen++;
			} 
			
			if (wasserImSeeMitStollen[i] >= schadensgrenze) {
				maxStandMitStollen++;
			}
		}

		ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeMitStollen);
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSeeOhneStollen);

		System.out.println("Maximaler FŁllstand: " + maxFuelstandOhneStollen + " m3");
		System.out.println("Zeit ueber Schadensgrenze: " + maxStandOhneStollen + " h");
		System.out.println(" ");
		System.out.println("Maximaler FŁllstand mit Stollen: " + maxFuelstandMitStollen + " m3");
		System.out.println("Zeit ueber Schadensgrenze: " + maxStandMitStollen + " h");
	}
}