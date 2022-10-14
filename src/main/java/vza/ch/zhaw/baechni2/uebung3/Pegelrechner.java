package vza.ch.zhaw.baechni2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {

	public static void main(String[] args) {
		// Daten einlesen
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

		//d
		System.out.println("Aufgabe d)");
		
		double pAnfang = 50000; // startwert definiert

		double [] wasserImSee = new double [120]; //Array von 120 länge definiert


		wasserImSee [0]=50000; // startwert als erster wert in array abgespeichert

		System.out.println("Startwert: "+ wasserImSee[0]); // print startwert

		for (int i=0; i<zufluss1.length; i++) {
			double pNeu = pAnfang + (zufluss1 [i] + zufluss2 [i]- abfluss1[i])*60;
			pAnfang = pNeu;
			wasserImSee[i+1]=pAnfang;
			System.out.println(wasserImSee[i]);


		}
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);

		// e)	
		System.out.println("Aufgabe e)");

		double max = wasserImSee[0];

		for (int i=0;i<wasserImSee.length;i++) {
			if (wasserImSee[i]>max) {
				max = wasserImSee[i];
			}
		}
		System.out.println("Max: "+ max);

		// f)
		System.out.println("Aufgabe f)");

		int count = 0;

		for (int i=0; i<wasserImSee.length;i++) {
			if (wasserImSee[i]>schadensgrenze) {
				count++;
			}

		}
		System.out.println(count);

		// g) mit ein wenig hilfe, ich hatte ständig ein out of bounds problem
		System.out.println("Aufgabe g)");

		double [] wasserImSeeNeu = new double[wasserImSee.length];
		wasserImSeeNeu[0] = 50000.0;

		for (int counter = 0; counter < 119; counter++) 
			if (wasserImSeeNeu[counter] > 55000.0) { 
				wasserImSeeNeu[counter+1] = wasserImSeeNeu[counter] + (zufluss1[counter] + zufluss2[counter] - abfluss1[counter] - 4.0)*60.0;
			} else {
				wasserImSeeNeu[counter+1] = wasserImSeeNeu[counter] + (zufluss1[counter] + zufluss2[counter] - abfluss1[counter])*60.0;

			}

		double maxNeu = wasserImSeeNeu[0];

		for (int counter = 0; counter < wasserImSeeNeu.length; counter++) {
			if (wasserImSeeNeu[counter]>maxNeu) {
				maxNeu = wasserImSeeNeu[count];
			}
		}	

		int ueberschreitung2 = 0;


		for (int s = 0; s < wasserImSeeNeu.length; s++) {
			if (wasserImSeeNeu [s] > schadensgrenze) {
				ueberschreitung2++;
			}

		}

		System.out.println("Max. Fuellstand mit zusaetzlichem Stollenauslauf: " + maxNeu + " m3");
		System.out.println("Zeit ueber Schadensgrenze: " + ueberschreitung2 + " h");

		
	}
}
