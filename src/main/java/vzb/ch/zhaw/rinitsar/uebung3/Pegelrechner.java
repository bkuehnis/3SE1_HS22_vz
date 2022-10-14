package vzb.ch.zhaw.rinitsar.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
		
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double[] pNeu = new double [119];
		double[] pNeu1 = new double [119];
		
		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);
		
		for (int i = 0; i < zufluss1.length; i++) {
			pNeu[i]= (startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60 );
			ZhawCsvLib.writeDoubleArray("ohneStollen.csv", pNeu);
			startWert = (startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i]) * 60 );
		}
		
		// Aufgabe e: Maximaler Füllstand berechnen
		double max = pNeu[0];
		for (int i=0; i<pNeu.length; i++) {
			if(pNeu[i]>max) {
				max = pNeu[i];
			}
		}
		System.out.println("Maximaler Fuellstand: " + max + " m3");
		
		
		// Aufgabe f: Überschreitung Schadensgrenze in h
		int zeit = 0;
		for(int j=0; j<pNeu.length; j++) {
			if(pNeu[j] > schadensgrenze) {
				zeit++;
			}
		}
		
		System.out.println("Zeit ueber Schadensgrenze: " + zeit + " h");
		
		
		// Aufgabe g: Entwicklung Füllstand mit Entlastungsstollen
		startWert = 50000;
		for (int y = 0; y < pNeu1.length; y++) {
			if(startWert < 55000) {
			pNeu1[y]= (startWert + (zufluss1[y] + zufluss2[y] - abfluss1[y]) * 60 );
			startWert=pNeu1[y];}
			
			else {
			pNeu1[y] = (startWert + (zufluss1[y] + zufluss2[y] - abfluss1[y]-4) * 60 );
			startWert = pNeu1[y];}
			
			ZhawCsvLib.writeDoubleArray("ohneStollen.csv", pNeu1);
			}
			
			double maxmit = 0; 
			for(int x = 0; x < pNeu1.length; x++) {
				if(pNeu1[x] > maxmit) {
					maxmit = pNeu1[x];
				}
			}
				
			int zeit1 = 0;
			for(int z = 0; z < pNeu1.length; z++) {
			if(pNeu1[z]> schadensgrenze) {
				zeit1++;
			}
			
			}
			
			System.out.println("Maximaler Fuellstand mit Stollen: "+ maxmit + " h" );
			System.out.println("Zeit ueber Schadensgrenze: " + zeit1 +" h" );
			
			}		
	}
