package vzb.ch.zhaw.giagilea.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double entlastungsstollenOeffnen = 55000;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		// TODO
		double [] wasserImSee = new double [120];
		double maxFuellstand = wasserImSee[0];
		int zeitUeberSchadensgrenze = 0;
		wasserImSee[0] = startWert;

		for (int i=1; i<wasserImSee.length; i++) {
			wasserImSee[i] = wasserImSee[i-1]+(zufluss1[i-1]+zufluss2[i-1]-abfluss1[i-1])*60;
			
			if (wasserImSee[i] > maxFuellstand) {
				maxFuellstand = wasserImSee[i];
			}
			if (wasserImSee[i] > schadensgrenze) {
				zeitUeberSchadensgrenze++;
			}
			if (wasserImSee[i] >= entlastungsstollenOeffnen) {
				wasserImSee[i] -= 240;
			}
		}
		
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		
	System.out.println("Maximaler Füllstand: " +maxFuellstand+ " m3");
	System.out.println("Zeit über Schadensgrenze: " +zeitUeberSchadensgrenze+ " h");
		
		
		
	}
}