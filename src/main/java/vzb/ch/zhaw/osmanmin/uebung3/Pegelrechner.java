package vzb.ch.zhaw.osmanmin.uebung3;

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
		
// TODO
		
// Messwerte pro Stunde
		double [] pNeu = new double [zufluss1.length];
		double max = 0;
		int schadensanzahl = 0;
		int y = 55000;
		
//Erster Messwert mit Start Wert
		pNeu[0] = startWert + (zufluss1[0] + zufluss2[0] - abfluss1[0])*60;
		
//Weitere Messwerte fortlaufed auf den letzen Füllstand berechnen
		for (int x = 1; x<zufluss1.length;x++) {
			pNeu[x] = pNeu[x-1] + (zufluss1[x] + zufluss2[x] - abfluss1 [x])*60;
			
//Maximaler Füllstand mit Schadengrenze
			if (pNeu[x]>max) {
				max = pNeu [x];
			}
		
			if (pNeu[x]>schadensgrenze) {
				schadensanzahl++;
			}

// Stolleneinsatz mit Maximaler Füllstand mit Stollen
			if (pNeu[x]>y) {
				pNeu[x] = pNeu[x] - 4*60;
			}
				
				System.out.println("Messwert " + x + ": " + pNeu[x]);

		}
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", pNeu);
		
		System.out.println("Maximaler Füllstand: " + max + " m3");
		System.out.println("Zeit über Schadensgrenze: " + schadensanzahl + " h");
		}
}