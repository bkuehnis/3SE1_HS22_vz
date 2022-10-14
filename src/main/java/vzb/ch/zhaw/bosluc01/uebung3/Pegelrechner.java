package vzb.ch.zhaw.bosluc01.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
import java.util.Arrays;

public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double stollenoeffnung = 55000;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double[] wasserImSee = new double[120];
		double[] mitStollen = new double[120];

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);
		
		wasserImSee[0] = startWert;
		mitStollen[0] = startWert;
		
		for(int i = 0; i < zufluss1.length; i++) {
			wasserImSee[i + 1] = wasserImSee[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			mitStollen [i + 1] = mitStollen [i] + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60;
			if (mitStollen[i] > stollenoeffnung)
				mitStollen[i + 1] -= 4 * 60;
		}
		
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		
		System.out.println("Maximaler Füllstand: " + Arrays.stream(wasserImSee).max().orElse(Double.NaN) + " m3");
		
		System.out.println("Zeit über Schadensgrenze: " + Arrays.stream(wasserImSee).filter(d -> d > schadensgrenze).count() + " h");
		
		System.out.println("Maximaler Füllstand mit Stollen: " + Arrays.stream(mitStollen).max().orElse(Double.NaN) + " m3");
		
		System.out.println("Zeit über Schadensgrenze: " + Arrays.stream(mitStollen).filter(d -> d > schadensgrenze).count() + " h");
		
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", mitStollen);
		
	}
}