package vza.ch.zhaw.weberth6.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
import java.util.Arrays;

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
		
		// {startWert, startWert +(zufluss1[i]+zufluss2[i]-abfluss1[i])*60};
		
					// for (i=0;i<=zufluss1.length-1;i++) {
					// double pNeu = startWert +(zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
					// System.out.println(pNeu); }
				
			int i = 0;
		
			double [] wasserImSee = new double [120];
			wasserImSee[0]=startWert;
			//wasserImSee[1]=startWert +(zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
			
			
			while (i<wasserImSee.length-1){ //119
				wasserImSee[i+1] = wasserImSee[i] + (zufluss1[i]+zufluss2[i]-abfluss1[i])*60;
				i++;
			}
			
// Darstellung Füllstände etc.
				
				System.out.println("Zufluss1: "+Arrays.toString(zufluss1));
				System.out.println("Zufluss2: "+Arrays.toString(zufluss2));
				System.out.println("Abfluss1: "+Arrays.toString(abfluss1));
				System.out.println("Wasserstand: "+Arrays.toString(wasserImSee));
				
				ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
				
			
// Maximaler Füllstand
			double max = wasserImSee[0];
				for (int k=1; k<wasserImSee.length; k++) {
					if (wasserImSee[k] > max) {
						max = wasserImSee[k];
					}
					
					}
				
				
				
					System.out.println("Maximaler Füllstand: "+max+" m3");
					
					
					
// Stunden über Schadensgrenze		
			int j=0;
			int zaehlerUeberfluss = 0;
			
			
			while (j<=wasserImSee.length-1) {
				if (61500<wasserImSee[j]) {	
					zaehlerUeberfluss++;
				}
				j++;
			}
			
			System.out.println("Zeit über Schadensgrenze: " +zaehlerUeberfluss);
			
			
			
			
			
			
// Berechnung mit Stollen			
			int d = 0;
			
			double [] wasserImSeeStollen = new double [120];
			wasserImSeeStollen[0]=startWert;
			// wasserImSeeStollen[1]=startWert +(zufluss1[d]+zufluss2[d]-abfluss1[d])*60;
			
			while (d<wasserImSeeStollen.length-1){ //119
				wasserImSeeStollen[d+1] = wasserImSeeStollen[d] + (zufluss1[d]+zufluss2[d]-abfluss1[d])*60;
				
				if (wasserImSeeStollen[d]>55000) {
					wasserImSeeStollen[d+1]-=(4*60);
				}
				d++;
			}
		
		
			
			
			
			
			
			System.out.println("Wasserstand: "+Arrays.toString(wasserImSeeStollen));
			ZhawCsvLib.writeDoubleArray("mitStollen.csv", wasserImSeeStollen);
			
// Maximaler Füllstand mit Stollen
			double max2 = wasserImSeeStollen[0];
			for (int l=1; l<wasserImSeeStollen.length; l++) {
				if (wasserImSeeStollen[l] > max2) {
					max2 = wasserImSeeStollen[l];
				}
				
				}
			
			
			
				System.out.println("Maximaler Füllstand: "+max2+" m3");	
				
				
// Stunden über Schadensgrenze			
					int m=0;
					int zaehlerUeberfluss2 = 0;
					
					
					while (m<=wasserImSeeStollen.length-1) {
						if (61500<wasserImSeeStollen[m]) {	
							zaehlerUeberfluss2++;
						}
						m++;
					}
					
					System.out.println("Zeit über Schadensgrenze: " +zaehlerUeberfluss2);
				
				
				
	}	
}
