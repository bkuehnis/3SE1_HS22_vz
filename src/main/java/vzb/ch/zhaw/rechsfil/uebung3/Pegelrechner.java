package vzb.ch.zhaw.rechsfil.uebung3;

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
		
		double [] wasserImSee = new double[120];
		wasserImSee[0]= startWert;
		
		for(int i= 1; i<=wasserImSee.length-1; i++) {
			wasserImSee[i]= wasserImSee[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1]) *60;
		}
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		
		double max= wasserImSee[0];
		for(int i= 1; i<wasserImSee.length; i++) {
			if (wasserImSee[i] > max) {
				max= wasserImSee[i];
			}
		}
		System.out.println("Maximaler Füllstand ohne Stollen: "+ max +"m3");
		
		int countZeitUeberGrenze= 0;
		
		for (int i=0; i<wasserImSee.length; i++) {
			if (wasserImSee[i]> schadensgrenze) {
				countZeitUeberGrenze++;
			}	
		}
		System.out.println("Zeit über Schadensgrenze: "+ countZeitUeberGrenze);
		
		
		//(aufgabe g):
		double maxMitStollenFuellstand= startWert;
		double max2= 0;
		double stollenOeffnungsWert= 55000;
		double stollenAbfluss= 4.0;
		
		double [] wasserImSeeSchleuse = new double[120];
		wasserImSeeSchleuse[0]= startWert;		
		
		for(int i= 1; i<=wasserImSeeSchleuse.length-1; i++) {	
			if(wasserImSeeSchleuse[i-1]> stollenOeffnungsWert) {
				wasserImSeeSchleuse[i]= wasserImSeeSchleuse[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1] - stollenAbfluss) *60;
			}
			else{
				wasserImSeeSchleuse[i]= wasserImSeeSchleuse[i-1] + (zufluss1[i-1] + zufluss2[i-1] - abfluss1[i-1]) *60;
			}
			
			if (wasserImSeeSchleuse[i]>maxMitStollenFuellstand) {
				maxMitStollenFuellstand= wasserImSeeSchleuse[i];
			}
			if (wasserImSeeSchleuse[i]>schadensgrenze){
				max2++;
			}

		}
				

		
		System.out.println("Maximaler Füllstand mit Stollen: "+ maxMitStollenFuellstand +"m3");
		System.out.println("Zeit über Schadensgrenze: "+max2);
		
		

		

		
	}
}