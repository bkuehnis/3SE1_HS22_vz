package vza.ch.zhaw.heinini2.uebung3;

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

		//
		double [] pegel = new double [120];
		pegel[0]=startWert;
		int j =0;
		pegel[j]= pegel[j]+(zufluss1[j]+zufluss2[j]-abfluss1[j])*60;
		
		double max = pegel[0];
		int schadenzeit=0;
		
		for (int i = 1; i < abfluss1.length; i++) {
			
			if(pegel[i-1] > 55000.0) {
				pegel[i]= pegel[i-1]+(zufluss1[i]+zufluss2[i]-abfluss1[i]-4.0)*60;
			} else {
				pegel[i]= pegel[i-1]+(zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
			}
			
			
			if (pegel[i]>max) {
				max = pegel[i];
			}
			if (pegel[i]> schadensgrenze) {
				schadenzeit++;
			}
		}
		
		System.out.println("Maximaler Füllstand: "+max+" m3");
		System.out.println("Zeit über Schadensgrenze : "+schadenzeit+" h");
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", pegel);
	}
}