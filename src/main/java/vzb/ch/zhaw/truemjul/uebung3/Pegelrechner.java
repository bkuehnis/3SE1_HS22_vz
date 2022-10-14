package vzb.ch.zhaw.truemjul.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
import java.util.ArrayList;
import java.util.List;

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

		
		double[] wasserImSee = new double[120];
		
		wasserImSee[0] = startWert;

		
		double max = wasserImSee[0];
		
		double sumTime = 0;
		int count = 0;
		


		for (int i = 1; i < wasserImSee.length; i++) {
			wasserImSee[i] = wasserImSee[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;
			

			if (wasserImSee[i] > max) {
				max = wasserImSee[i];
			}

			
			if (wasserImSee[i] > schadensgrenze) {
				sumTime++;
			}

			if (wasserImSee[i] > 55000) {
			
				wasserImSee[i] = wasserImSee[i] - 4 * 60;
			}	
		}

		System.out.println("Maximaler Füllstand: " + max + " m3");

		System.out.println("Zeit über Schadensgrenze: " + sumTime + " h");

		System.out.println(count);

		
		boolean file = ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);

		System.out.println("Status of File: " + file);
	}
}