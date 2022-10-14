package vzb.ch.zhaw.landsfre.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class Pegelrechner {
	 public static void main(String[] args) {
		 // Daten Einlesen
		 double startWert = 50000;
		 double schadensgrenze = 61500;
		 double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		 double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		 double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		 
		 // Länge der Datensätze ausgeben
		 System.out.println("Werte Zufluss 1: "+zufluss1.length);
		 System.out.println("Werte Zufluss 2: "+zufluss2.length);
		 System.out.println("Werte Abfluss 1: "+abfluss1.length);
		 
		 // TODO
		 
		 double [] wasserImSee = new double [119];
		 wasserImSee [0] = startWert;
		 double [] wasserImSee2 = new double [119];
		 wasserImSee2 [0] = startWert;
		 double max = wasserImSee[0];
		 double max2 = wasserImSee2[0];
		 int h = 0;
		 int h2 = 0;
		
				 
		for (int i = 0; i < 118; i++) {
			wasserImSee[i+1] = wasserImSee[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;
			wasserImSee2[i+1] = wasserImSee2[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;
			if (wasserImSee[i] > max) {
				max = wasserImSee[i];
				}
			if (wasserImSee[i] > 61500) {
				h++;
			}
			if (wasserImSee[i] > 55000) {
				wasserImSee2[i] = wasserImSee2[i+1] = wasserImSee2[i] + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60 - 240;
			}
			if (wasserImSee2[i] > max2) {
				max2 = wasserImSee2[i];
				}
			if (wasserImSee2[i] > 61500) {
				h2++;
			}
		}
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSee2);
		System.out.println("Maximaler Füllstand: "+max+" m3");
		System.out.println("Zeit über Schadensgrenze: "+h+" h");
		System.out.println("Maximaler Füllstand: "+max2+" m3");
		System.out.println("Zeit über Schadensgrenze: "+h2+" h");
		
	 }
}

