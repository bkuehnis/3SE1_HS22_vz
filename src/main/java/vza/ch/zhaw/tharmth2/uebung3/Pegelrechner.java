package vza.ch.zhaw.tharmth2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;


public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double [] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double [] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double [] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double neuerWert = 0; 
		double max = 0; 




		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: "+zufluss1.length);
		System.out.println("Werte Zufluss 2: "+zufluss2.length);
		System.out.println("Werte Abfluss 1: "+abfluss1.length);


		double [] wasserImSee = new double[120];
		wasserImSee[0]=50000;


		for (int i=0; i < zufluss1.length; i++) {
			neuerWert = startWert + (zufluss1[i] + zufluss2[i] - abfluss1[i])*60;
			startWert = neuerWert;

			wasserImSee[i+1] = startWert;


			if(wasserImSee[i]>max) {
				max = wasserImSee[i];

			}
		}
		System.out.println("Maximum: "+max);



		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
	}

//Der Rest konnte ich nicht machen, da ich Mühe hatte

}
