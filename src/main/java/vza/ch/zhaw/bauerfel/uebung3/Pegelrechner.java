package vza.ch.zhaw.bauerfel.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {

	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte abfluss 1: " + abfluss1.length);

		double pNeu;
		pNeu = startWert;
		int i = 0;
		double pegelMax = startWert;
		int count = 0;
		double[] wasserImSee = new double[zufluss1.length];
		while (i < zufluss1.length) {
			if (pNeu < 55000) {
				System.out.println(pNeu);

				pNeu = pNeu + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;

			} else if (pNeu >= 55000) {
				pNeu = pNeu + (zufluss1[i] + zufluss2[i] - abfluss1[i] - 4) * 60;
				if (pNeu >= schadensgrenze) {
					count++;
				}
			}
			wasserImSee[i] = pNeu;
			if (pNeu > pegelMax) {
				pegelMax = pNeu;
			}
			i++;
		}
		System.out.println("Maximaler Fuellstand: " + pegelMax);
		System.out.println("Zeit ueber Schadensgrenze: " + count + " h");

//		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
	}
}
